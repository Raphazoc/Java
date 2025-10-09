package Udemy.POO.HerancaDesafio;

public class Pista {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.modelo = "Sedan";
        carro1.acelerar();
        carro1.trocarMarcha(1);
        carro1.acelerar();
        carro1.acelerar();
        carro1.trocarMarcha(2);




        carro1.exibirEstado();

        System.out.println("  ");

        Ferrari ferrari1 = new Ferrari();
        ferrari1.modelo = "Ferrari F8";
        ferrari1.acelerar();
        ferrari1.trocarMarcha(2);
        ferrari1.acelerar();
        ferrari1.frear();
        ferrari1.trocarMarcha(3);
        ferrari1.acelerar();
        ferrari1.acelerar();
        ferrari1.exibirEstado();

        System.out.println("  ");

        Fusca fusca1 = new Fusca();
        fusca1.modelo = "Fusca 1969";
        fusca1.acelerar();
        fusca1.trocarMarcha(2);
        fusca1.acelerar();
        fusca1.acelerar();
        fusca1.acelerar();
        fusca1.trocarMarcha(3);
        fusca1.acelerar();
        fusca1.exibirEstado();
    }
}
