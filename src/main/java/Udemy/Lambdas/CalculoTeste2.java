package Udemy.Lambdas;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo soma = (a, b) -> a + b; // Funcao Lambda sendo feita
        System.out.println(soma.executar(2, 3)); // Executando a funcao lambda

        Calculo multiplicar = (a, b) -> {return a * b;}; // Funcao Lambda sendo feita de outra forma
        System.out.println(multiplicar.executar(2, 3)); // Executando a funcao lambda

        soma = (a, b) -> a + b; // Funcao Lambda express
        System.out.println(soma.executar(2, 8)); // Executando a funcao lambda

        System.out.println(soma.legal());
    }

}
