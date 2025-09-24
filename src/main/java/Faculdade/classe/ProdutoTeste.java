package Faculdade.classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();

    p1.nome = "Notebook";
     p1.preco = 2100.00;


     System.out.println(p1.nome);
     System.out.println(p1.preco);
     System.out.println(p1.precoComDesconto());
     System.out.println("\n");

     // ============================================================
     Produto p2 = new Produto("Fone de Ouvido", 120.00);
     //Produto.desconto = 0.15;



     System.out.println(p2.nome);
     System.out.println(p2.preco + " Agora com desconto = " + p2.precoComDesconto());



    }
}
