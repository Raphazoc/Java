package org;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe uma média: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7) {
            System.out.println("Aprovado!");
            System.out.println("Parabens!");
        }
        else if (media <= 6 && media >= 2) {
            System.out.println("Reprovado!");
        }
        else {
            System.out.println("Valor invalido!");
        }

        entrada.close();

    }
}
