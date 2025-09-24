package Faculdade.classe;
import java.util.Date;

public class EqualsEHashcode {

    public static void main(String[] args) {


        Usuario u1 = new Usuario();
        u1.nome = "Raphael Martins";
        u1.email = "raphaelmartins@com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Gabrielle Skrascke";
        u2.email = "gabrielle@skrascke.com";


        System.out.println(u1 == u2); // Esse
        System.out.println(u1.equals(u2)); // É igual a esse

        System.out.println(u1.equals(u1));
        System.out.println(u2.equals(new Date()));

    }
}
