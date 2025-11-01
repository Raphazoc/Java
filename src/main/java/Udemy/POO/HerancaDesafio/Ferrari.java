package Udemy.POO.HerancaDesafio;

public class Ferrari extends Carro {

    public Ferrari() {
        super();
    }

    public Ferrari(String modelo) {
        super(modelo);
    }

    public void acelerar() {
        velocidade += 15;
    }

    public void turbo() {
        System.out.println("Ativando turbo na Ferrari!");
        velocidade += 25;
    }
}
