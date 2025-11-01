package Udemy.POO.HerancaDesafio;

public class Carro {

    int velocidade;
    int marcha;
    String modelo;

    public Carro() {
        this.velocidade = 0;
        this.marcha = 0;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
        this.marcha = 0;
    }


    public void acelerar() {
        velocidade += 5;
    }

    public void frear() {
        if (velocidade >= 5) {
            velocidade -= 5;
        } else {
            velocidade = 0;
        }
    }

    public void trocarMarcha(int novaMarcha) {
        marcha = novaMarcha;
    }

    public void exibirEstado() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Marcha: " + marcha);
    }



}
