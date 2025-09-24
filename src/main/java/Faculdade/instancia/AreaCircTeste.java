package Faculdade.instancia;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc circulo = new AreaCirc(5.6);
        AreaCirc circulo2 = new AreaCirc(5.6);

        AreaCirc.pi = 3.1416; //classe estatica chamada direto com o valor alterado
        System.out.println(circulo.area()); //impressao do calculo com pi 3.1416

        AreaCirc.pi = 3.1415; //classe estatica alterada de valor uma segunda vez
        System.out.println(circulo2.area()); //impressao do calculo pi 3.1415
    }
}
