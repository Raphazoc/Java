package CriarArquivos;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class criarArquivo {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String matricula, nome;
        double teste, prova;
        int faltas;

        FileWriter arq = new FileWriter("D:\\Java\\arquivo.txt");
        PrintWriter gravarArq = new PrintWriter(arq);

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

        gravarArq.printf("Matricula: %s\nNome: %s\nNota do teste: %.2f\nNota da prova: %.2f\nNumero de faltas: %d\n", matricula, nome, teste, prova, faltas);


        System.out.println("Arquivo criado com sucesso!");


        arq.close();
        teclado.close();

    }
}
