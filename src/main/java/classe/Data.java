package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    String obterData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Data() {
//        dia = 1;
//        mes = 1;
//        ano = 1970;
        this(12, 1, 1998);
    }
}



