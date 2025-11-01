package Udemy.Lambdas;

public class CalculoTeste1 {
    public static void main(String[] args) {
        Calculo soma = new Soma();
        Calculo multiplicar = new Multiplicar();
        Calculo subtrair = new Subtrair();

        System.out.println(soma.executar(2, 3));
    }
}
