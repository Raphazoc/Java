package org;

public class DesafioFor2 {
    public static void main(String[] args) {

        //IMPRIMINDO USANDO VALORES NUMÉRICOS
        String valor = "#";
        for (int i = 1; i <= 5; i++) {
            System.out.println(valor);
            valor += "#";
        }

        //IMPRIMINDO SEM USAR VALORES NUMÉRICOS
        for(String v = "#"; !v.equals("######"); v += "#") {
            System.out.println(v);
        }
    }
}
