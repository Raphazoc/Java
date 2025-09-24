package Udemy.lista;

import java.util.ArrayList;

public class list {

    public static void main(String[] args) {

        ArrayList<Usuario> lista = new ArrayList<>(); // Cria a lista

        lista.add(new Usuario("Raphael")); // Cria os usuarios e adiciona na lista
        lista.add(new Usuario("Gabrielle"));
        lista.add(new Usuario("Lucas"));
        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Joao"));


        System.out.println(lista.size()); // Mostra o tamanho da lista
        System.out.println(" ");

        System.out.println(lista.get(1)); // Mostra o usuario que esta na posicao 1 da lista
        System.out.println(" ");

        System.out.println("Está na lista? " + lista.contains(new Usuario("Ana"))); // Verifica se o usuario esta na lista;
        System.out.println(" ");

        for (Usuario u: lista) { // Percorre a lista e mostra o nome de cada usuario
            System.out.println(u.nome);
        }

        System.out.println(" ");


        // Remove o usuario que esta na posicao 4 da lista
        System.out.println(" >>>> Usuario removido = "+ lista.remove(4));


        System.out.println(" ");
        for (Usuario u: lista) { // Percorre a lista e mostra o nome de cada usuario
            System.out.println(u.nome);
        }

    }


}
