package Udemy.POO.Composicao.Desafio;

public class Sistema {

    public static void main(String[] args) {

        // Aqui eu crio o cliente no sistema
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");
        // ========================================================

        // Aqui eu crio os produtos e anexo um preço ao produto
        Produto produto1 = new Produto("Caneta", 2.5);
        Produto produto2 = new Produto("Caderno", 15.0);
        Produto produto3 = new Produto("Mochila", 120.0);
        // ========================================================

        // Aqui eu crio as compras e coloco a quantidade de produtos
        Compra compra1 = new Compra();
        compra1.adicionarItem(produto1, 10); // 10 canetas
        compra1.adicionarItem(produto2, 2);  // 2 cadernos
        compra1.adicionarItem(produto3, 1);  // 1 mochila

        Compra compra2 = new Compra();
        compra2.adicionarItem("Lápis", 1.5, 5);
        compra2.adicionarItem("Borracha", 0.5, 3);
        compra2.adicionarItem("Mochila", 120.0, 1);
        // ========================================================

        // Aqui eu adiciono as compras aos clientes
        cliente1.compras.add(compra1); // adiciona compra1 na lista de compras do cliente1
        cliente2.compras.add(compra2); // adiciona compra2 na lista de compras do cliente2

        // ========================================================

        // Aqui eu mostro o total gasto por cada cliente
        System.out.printf("Total gasto por %s: R$ %.2f%n", cliente1.nome, cliente1.obterValorTotal());
        System.out.printf("Total gasto por %s: R$ %.2f%n", cliente2.nome, cliente2.obterValorTotal());
        // ========================================================



    }
}
