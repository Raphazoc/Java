package Udemy.POO.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    final String nome;

    Cliente (String nome) {
        this.nome = nome;
    }

    final List<Compra> compras = new ArrayList<>(); // lista de compras do cliente

    double obterValorTotal() { // soma o total de todas as compras
        double total = 0;
        for (Compra compra: compras) {
            total += compra.obterValorTotal();
        }
        return total;
    }
}
