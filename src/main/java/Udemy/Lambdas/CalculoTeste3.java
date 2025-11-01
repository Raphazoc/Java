package Udemy.Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {


        BinaryOperator<Double> soma = (a, b) -> a + b; // Funcao Lambda sendo feita com interface funcional BinaryOperator
        System.out.println(soma.apply(2.0, 3.0)); // Executando a funcao lambda

    }
}
