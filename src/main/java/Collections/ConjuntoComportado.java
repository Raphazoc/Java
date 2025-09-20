package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

    public static void main(String[] args) {

        SortedSet<String> lista1 = new TreeSet<>();
        lista1.add("Raphael");
        lista1.add("Gabrielle");
        lista1.add("Lucas");

        for (String candidatos : lista1) { // <-- FOREACH padrao
            System.out.println(candidatos);
        }

        Set<String> lista = new HashSet<>(); // Dizendo qual tipo de dados quer na lista.
        lista.add("Raphael");
        lista.add("Gabrielle");
        lista.add("Lucas");

        for (String candidatos : lista) { // <-- FOREACH padrao
            System.out.println(candidatos);
        }


    }
}
