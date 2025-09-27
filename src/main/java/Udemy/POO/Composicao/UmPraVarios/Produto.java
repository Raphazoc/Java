package Udemy.POO.Composicao.UmPraVarios;

public class Produto {

    String nome;
    int quantidade;
    double preco;
    Item compra; // Associação bidirecional (opcional)


    Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

}
