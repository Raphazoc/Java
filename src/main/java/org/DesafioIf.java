package org;


import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class DesafioIf {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("\nPara passar de ano, o aluno deve ter a média de notas superior a 7. As 3 notas serao dividas por 3.");

        System.out.println("\nDigite a primeira nota do aluno: ");
        double nota = entry.nextDouble();

        System.out.print("\nDigite a segunda nota do aluno: ");
        double nota2 = entry.nextDouble();

        System.out.print("\nDigite a terceira nota do aluno: ");
        double nota3 = entry.nextDouble();

        double mediaNota = (nota + nota2 + nota3) / 3;

        if (mediaNota >= 7) {
            System.out.println("Parabéns! Sua nota está superior a média! ");
            System.out.println("Média total: " + mediaNota);
        }
        else if (mediaNota == 6.9) {
            System.out.println("Por pouco voce nao passa, ficou na média. Parabéns.");
            System.out.println("Média total: " + mediaNota);
        }
        else if (mediaNota <= 6.8 && mediaNota >= 5.0) {
            System.out.println("Voce está de recuperacao, ainda dá tempo de passar! Estude!");
            System.out.println("Média total: " + mediaNota);
        }
        else if (mediaNota <= 4.9 && mediaNota >= 3.0) {
            System.out.println("Voce está Reprovado! Com sua nota, nao há como passar na matéria.");
            System.out.println("Média total: " + mediaNota);        
        }
        else {
            System.out.println("Valor Inválido.");
        }
        entry.close();
    }
}
