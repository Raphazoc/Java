package Udemy.POO.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade){ // adicionar item na compra
        this.itens.add(new Item(p, quantidade));
    }

    void adicionarItem(String nome, double preco, int quantidade){ // adicionar item na compra
        this.itens.add(new Item(new Produto(nome, preco), quantidade));
    }

    double obterValorTotal() { // soma o total de todos os itens
        double total = 0;
        for (Item item: itens) {
            total += item.quantidade * item.produto.preco;
        }
        return total;
    }
}
