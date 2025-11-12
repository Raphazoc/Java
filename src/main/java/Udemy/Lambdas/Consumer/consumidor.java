package Udemy.Lambdas.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/**
 * Classe com diversos exemplos de uso de java.util.function.Consumer<T>
 * Comentários em português explicando usabilidade, composição e cuidados.
 */
public class consumidor {
    public static void main(String[] args) {
        // 1) Lambda simples: uso para efeitos colaterais como imprimir/logging
        Consumer<String> imprimir = s -> System.out.println(s);
        imprimir.accept("Olá Mundo!");

        // 2) Method reference (más conciso quando apenas delegamos a um método existente)
        Consumer<String> imprimirRef = System.out::println;
        imprimirRef.accept("Usando method reference");

        // 3) Composição: andThen permite encadear consumidores (ordem importa)
        Consumer<String> pref = s -> System.out.println("[antes] " + s);
        Consumer<String> suf = s -> System.out.println("[depois] " + s.toUpperCase());
        Consumer<String> combinado = pref.andThen(suf);
        combinado.accept("composição");

        // 4) Uso em Collections / Streams: passar o Consumer para forEach
        List<String> nomes = Arrays.asList("Ana", "Beto", "Carlos");
        // Exemplo: imprimir cada nome (efeito colateral)
        nomes.forEach(imprimirRef);

        // 5) Consumer que mantém estado (cuidado com concorrência)
        AtomicInteger contador = new AtomicInteger(0);
        Consumer<String> contar = s -> {
            System.out.println(s);
            contador.incrementAndGet(); // mantém contagem como efeito colateral
        };
        nomes.forEach(contar);
        System.out.println("Total processado: " + contador.get());

        // 6) Uso com Map.forEach: consumidor com duas entradas (chave/valor)
        Map<String, Integer> mapa = Map.of("Maçã", 3, "Pera", 5);
        // Map.forEach recebe BiConsumer<K,V>, mas o princípio é o mesmo: consumir pares para efeitos colaterais
        mapa.forEach((k, v) -> System.out.println(k + " => " + v));

        // 7) Exemplo prático: método que recebe um Consumer<T> (injeção de comportamento)
        processarNomes(nomes, s -> System.out.println("Processando: " + s));

        // 8) Exemplo com tratamento de exceção dentro do Consumer (bom para log/recuperação)
        Consumer<String> safe = s -> {
            try {
                System.out.println("Tamanho: " + s.length());
            } catch (RuntimeException e) {
                System.out.println("Erro ao processar: " + e.getMessage());
            }
        };
        nomes.forEach(safe);

        // 9) Boas práticas e cuidados (demonstrados):
        // - Consumer é para efeitos colaterais (não retorna valor).
        // - Evite lógica pesada ou bloqueante dentro do Consumer quando usado em streams paralelos.
        // - Stateful Consumers (como contador) precisam de sincronização se usados concorrentemente.
    }

    /**
     * Exemplo de método utilitário que recebe um Consumer: permite o chamador decidir a ação.
     * Uso comum em APIs que desejam delegar o comportamento (ex.: callbacks, hooks, logging).
     */
    public static void processarNomes(List<String> nomes, Consumer<String> acao) {
        // Aqui apenas delegamos para o Consumer fornecido
        for (String nome : nomes) {
            acao.accept(nome);
        }
    }
}
