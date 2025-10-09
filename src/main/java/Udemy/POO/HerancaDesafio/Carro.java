package Udemy.POO.HerancaDesafio;

public class Carro {

    int velocidade;
    int marcha;
    String modelo;


    void acelerar() {
        velocidade += 5;
    }

    void frear() {
        if (velocidade >= 5) {
            velocidade -= 5;
        } else {
            velocidade = 0;
        }
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
