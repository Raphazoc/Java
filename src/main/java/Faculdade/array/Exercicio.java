package Faculdade.array;

import java.util.Arrays;

public class Exercicio {

    public static void main(String[] args) {
        double[] notasAlunoA = new double[3]; // Criando a array com 3 espacos.

        notasAlunoA[0] = 8.5; // acessando os valores dentro da array
        notasAlunoA[1] = 6.4; // acessando os valores dentro da array
        notasAlunoA[2] = 7.8; // acessando os valores dentro da array

        System.out.println(notasAlunoA[0]); //Imprimindo dados da array selecionada

        System.out.println(Arrays.toString(notasAlunoA)); // Imprimindo todos os dados da array criada usando o pacote array


    }
}
