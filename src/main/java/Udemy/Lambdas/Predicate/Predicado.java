package Udemy.Lambdas.Predicate;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {
        
        Predicate<produto> isCaro = p -> (p.preco - (p.preco * p.desconto)) >= 750.0; // Define o predicado para verificar se o produto é caro usando lambda
        //calcula o preço com desconto e verifica se é maior ou igual a 750.0

        produto p1 = new produto("Notebook", 4000.0, 0.15);
        produto p2 = new produto("Impressora", 800.0, 0.3);
        produto p3 = new produto("Mouse", 80.0, 0.1);
        System.out.println("O produto " + p1.nome + " é caro? " + isCaro.test(p1)); // Testa o predicado com diferentes produtos e imprime o resultado como verdadeiro ou falso
        System.out.println("O produto " + p2.nome + " é caro? " + isCaro.test(p2));
        System.out.println("O produto " + p3.nome + " é caro? " + isCaro.test(p3));
    }

}
