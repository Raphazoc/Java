package Udemy.lista.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FilaQueue {
    public static void main(String[] args) {


        Queue<String> fila = new LinkedList<>();

        fila.add("Raphael"); // Adiciona elementos na fila
        fila.offer("Gabrielle"); // Adiciona elementos na fila, mas retorna false se não conseguir adicionar
        fila.add("Lucas");
        fila.offer("Ana");
        fila.add("Joao");



        System.out.println(fila); // Imprime a fila
        System.out.println(" ");

        System.out.println(fila.peek()); // Retorna o primeiro elemento da fila, mas não remove
        System.out.println(" ");

        System.out.println(fila.element()); // Retorna o primeiro elemento da fila, mas não remove, lança exceção se a fila estiver vazia
        System.out.println(" ");

        System.out.println(fila.poll()); // Retorna e remove o primeiro elemento da fila, retorna null se a fila estiver vazia
        System.out.println(" ");

        System.out.println(fila.remove()); // Retorna e remove o primeiro elemento da fila, lança exceção se a fila estiver vazia
        System.out.println(" ");

        System.out.println(fila.size()); // Retorna o tamanho da fila
        System.out.println(" ");

        System.out.println(fila.isEmpty()); // Verifica se a fila está vazia
        System.out.println(" ");

        System.out.println(fila); // Imprime a fila
        System.out.println(" ");

        fila.clear(); // Limpa a fila
        System.out.println(fila.isEmpty()); // Verifica se a fila está vazia
        System.out.println(" ");

        System.out.println(fila); // Imprime a fila



    }
}
