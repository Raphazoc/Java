package Udemy.POO.Composicao.UmPraVarios;

import java.util.ArrayList;

public class Item {

    String cliente;
    ArrayList<Produto> itens = new ArrayList<>();

    //=======================================

    void adicionarItem(String nome, int quantidade, double preco) { // Método para adicionar um item à compra
        this.adicionarItem(new Produto(nome, quantidade, preco)); // Cria um novo produto e o adiciona à lista de itens da compra
    }

    void adicionarItem(Produto produto) { // Método para adicionar um item à compra
        this.itens.add(produto); // Adiciona o produto à lista de itens da compra
        produto.compra = this; // Associação bidirecional (opcional) - define a compra do produto como esta instância de Compra
    }

    double obterValorTotal() {
        double total = 0; // Inicializa a variável total para armazenar o valor total da compra
        for (Produto p : itens) { // Itera sobre cada produto na lista de itens da compra
            total += p.preco * p.quantidade; // Adiciona o valor do produto (preço * quantidade) ao total
        }
        return total; // Retorna o valor total da compra
    }


}
