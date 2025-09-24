package Udemy.lista.Pilha;

import java.util.Deque;

public class pilha {

    public static void main(String[] args) {
        Deque<String> livros = new java.util.ArrayDeque<>();

        livros.add("O Homem de Ferro"); // Adiciona no final da pilha
        livros.push("O Pequeno Principe"); // Adiciona no topo da pilha
        livros.push("O Hobbit"); // Adiciona no topo da pilha

        System.out.println(livros); // Mostra todos os elementos da pilha
        System.out.println("  ");

        System.out.println(livros.peek()); // Mostra o elemento do topo da pilha sem remover
        System.out.println("  ");

        System.out.println(livros.element()); // Mostra o elemento do topo da pilha sem remover
        System.out.println("  ");

        System.out.println(livros.size()); // Mostra o tamanho da pilha
        System.out.println("  ");

        System.out.println(livros.contains(0));
        System.out.println("  ");

        System.out.println(livros.pop()); // Mostra o elemento do topo da pilha e remove
        System.out.println("  ");

        System.out.println(livros.poll()); // Mostra o elemento do topo da pilha e remove
        System.out.println("  ");


    }
}
