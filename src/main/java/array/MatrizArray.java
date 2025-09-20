package array;

import java.util.Scanner;

public class MatrizArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdeAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno?");
        int qtdeNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas]; //Criando a matriz
        double total = 0;

        for (int i = 0; i < notasDaTurma.length; i++) {
            for (int j = 0; j < notasDaTurma[i].length; j++) {
                System.out.printf("Digite a nota %d do aluno %d: ", j + 1, i + 1);
                notasDaTurma[i][j] = entrada.nextDouble();
                total += notasDaTurma[i][j];
            }
        }
        double media = total / (qtdeAlunos * qtdeNotas);
        System.out.println("Média da turma é: " + media);
    entrada.close();




    }
}
