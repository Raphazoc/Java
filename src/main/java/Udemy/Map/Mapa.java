package Udemy.Map;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Raphael"); // Adiciona elementos no mapa e se colocar o mesmo id, ele substitui o valor
        usuarios.put(2, "Gabrielle");
        usuarios.put(3, "Lucas");
        usuarios.put(4, "Ana");
        usuarios.put(5, "Joao");

        // =========================

        System.out.println(usuarios.size()); // Mostra o tamanho do mapa
        System.out.println(" ");
        System.out.println(usuarios.isEmpty()); // Verifica se o mapa está vazio
        System.out.println(" ");
        System.out.println(usuarios.keySet()); // Mostra todas as chaves do mapa
        System.out.println(" ");
        System.out.println(usuarios.values()); // Mostra todos os valores do mapa
        System.out.println(" ");
        System.out.println(usuarios.entrySet()); // Mostra todas as chaves e valores do
        System.out.println(" ");
        System.out.println(usuarios.containsKey(3)); // Verifica se o mapa contém a chave
        System.out.println(" ");
        System.out.println(usuarios.containsValue("Ana")); // Verifica se o mapa contém o valor
        System.out.println(" ");
        System.out.println(usuarios.get(4)); // Mostra o valor da chave
        System.out.println(" ");
        System.out.println(usuarios.remove(5)); // Remove o valor da chave e retorna o valor removido
        System.out.println(" ");
        System.out.println(usuarios); // Mostra o mapa
        System.out.println(" ");
        System.out.println(usuarios.get(5)); // Mostra o valor da chave, retorna null se a chave não existir
        System.out.println(" ");
        System.out.println(usuarios.put(4, "Mariana")); // Substitui o valor da chave e retorna o valor antigo
        System.out.println(" ");
        System.out.println(usuarios); // Mostra o mapa
        System.out.println(" ");


    }

}
