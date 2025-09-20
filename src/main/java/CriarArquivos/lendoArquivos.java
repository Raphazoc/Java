package CriarArquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class lendoArquivos {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String nome = "D:\\Java\\arquivo.txt";

        System.out.println("\nConteúdo do arquivo texto: \n");
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                System.out.println(linha);
                linha = lerArq.readLine();
            }
            arq.close();

        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        } finally {
            ler.close();
        }
    }
}
