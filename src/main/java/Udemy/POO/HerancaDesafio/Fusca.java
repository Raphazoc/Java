package Udemy.POO.HerancaDesafio;

public class Fusca extends Carro{

    public Fusca() {
        super();
    }

    public Fusca(String modelo) {
        super(modelo);
    }

    // Atributos e métodos específicos do Fusca podem ser adicionados aqui
    // Fusca está herdando de Carro, mas posso alterar os parâmetros sem prejudicar a classe pai

    public void empurrar() {
        System.out.println("O Fusca está sendo empurrado!");
    }
    public void velocidadeDoFusca() {
        System.out.println("A velocidade do Fusca é: " + velocidade + " km/h");
    }

    public void acelerar() {
        velocidade += 7;
    }

    public void frear() {
        if (velocidade >= 2) {
            velocidade -= 2;
        } else {
            velocidade = 0;
        }
    }
}
