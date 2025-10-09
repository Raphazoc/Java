package Udemy.POO.HerancaDesafio;

public class Ferrari {

    int velocidade;
    int marcha;
    String modelo;

    void acelerar() {
        velocidade += 15;
    }

    void frear() {
        velocidade -= 5;
    }

     void trocarMarcha(int novaMarcha) {
        marcha = novaMarcha;
    }

    void exibirEstado() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Marcha: " + marcha);
    }
}
