package Faculdade.CriarArquivos;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class criarBinario {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner teclado = new Scanner(System.in);

        String matricula;
        String nome;
        double teste, prova;
        int faltas;

        FileOutputStream arq = new FileOutputStream("D:\\Java\\Arquivo.dat");
        DataOutputStream gravarArq = new DataOutputStream(arq);

        System.out.println("Digite sua matricula: ");
        matricula = teclado.nextLine();

        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite a nota do teste: ");
        teste = teclado.nextDouble();

        System.out.println("Digite a nota da prova: ");
        prova = teclado.nextDouble();

        System.out.println("Digite o numero de faltas: ");
        faltas = teclado.nextInt();

        gravarArq.writeUTF(matricula);
        gravarArq.writeUTF(nome);
        gravarArq.writeDouble(teste);
        gravarArq.writeDouble(prova);
        gravarArq.writeInt(faltas);

        System.out.println("Arquivo criado com sucesso!");
        arq.close();
        teclado.close();



    }
}
