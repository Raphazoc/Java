package classe;

public class DataTeste {
    public static void main(String[] args) {


        Data d1 = new Data();
        d1.dia = 12;
        d1.mes = 04;
        d1.ano = 1995;

        Data d2 = new Data(2, 6, 2021); // Pode alterar o valor estabelecido na Classe Data.

        var d3 = new Data(); // se eu nao especificar nada, vai imprimir o valor que esta em Data.

        System.out.println(d1.obterData());
        System.out.println(d2.obterData());
        System.out.println(d3.obterData());
    }

}
