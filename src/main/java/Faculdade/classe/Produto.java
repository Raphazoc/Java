package Faculdade.classe;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;

    Produto() {

    }
    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    }
    public Produto(String string, double d, double e) {
        //TODO Auto-generated constructor stub
    }
    double precoComDesconto () {
        return preco * (1 - desconto);
    }

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    }
}
