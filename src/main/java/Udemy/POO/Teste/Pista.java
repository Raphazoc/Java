package Udemy.POO.Teste;

import Udemy.POO.HerancaDesafio.Carro;
import Udemy.POO.HerancaDesafio.Ferrari;
import Udemy.POO.HerancaDesafio.Fusca;

public class Pista {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Sedan");
        carro1.acelerar();
        carro1.trocarMarcha(1);
        carro1.acelerar();
        carro1.acelerar();
        carro1.trocarMarcha(2);




        carro1.exibirEstado();

        System.out.println("  ");

        Ferrari ferrari1 = new Ferrari("Ferrari F8");
        ferrari1.acelerar();
        ferrari1.trocarMarcha(2);
        ferrari1.acelerar();
        ferrari1.frear();
        ferrari1.trocarMarcha(3);
        ferrari1.acelerar();
        ferrari1.acelerar();
        ferrari1.turbo();
        ferrari1.exibirEstado();

        System.out.println("  ");

        Fusca fusca1 = new Fusca("Fusca 1969");
        fusca1.acelerar();
        fusca1.trocarMarcha(2);
        fusca1.acelerar();
        fusca1.acelerar();
        fusca1.acelerar();
        fusca1.trocarMarcha(3);
        fusca1.acelerar();
        fusca1.velocidadeDoFusca();
        fusca1.empurrar();
        fusca1.exibirEstado();
    }
}
