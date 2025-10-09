package Udemy.POO.HerancaDesafio;

public class Fusca extends Carro{

    // Atributos e métodos específicos do Fusca podem ser adicionados aqui
    // Fusca está hernando de Carro, mas posso alterar os parametros sem prejudicar a classe pai

    void empurrar() {
        System.out.println("O Fusca está sendo empurrado!");
    }
    void velocidadeDoFusca() {
        System.out.println("A velocidade do Fusca é: " + velocidade + " km/h");
    }

    void acelerar () {
        velocidade += 7;
    }

    void frear () {
        velocidade -= 2;
    }
}
