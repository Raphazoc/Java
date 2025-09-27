package Udemy.POO.Composicao.UmPraVarios;

public class CarrinhoDeCompras {

    public static void main(String[] args) {


        Item c1 = new Item(); // Cria uma nova instância da classe Compra

        c1.cliente = "João Pedro"; // Define o nome do cliente da compra c1

        c1.adicionarItem(new Produto("Caneta", 20, 1.5)); // Adiciona um produto à lista de produtos da compra c1
        c1.adicionarItem(new Produto("Borracha", 12, 0.75)); // Adiciona outro produto à lista de produtos da compra c1
        c1.itens.add(new Produto("Caderno", 5, 18.0)); // Adiciona mais um produto à lista de produtos da compra c1

        // Só para mostrar a relacao bidirecional!!!
       double total = c1.itens.get(0).compra.itens.get(1).compra.obterValorTotal(); // Acesso complexo para demonstrar a associação bidirecional (opcional)
        System.out.println("O total é: R$ " + total); // Imprime o valor total da compra c1

        // ====== Exibe informações sobre a compra c1 ====
        System.out.println(c1.cliente); // Imprime o nome do cliente da compra c1
        System.out.println(c1.itens.size()); // Imprime o número de itens na lista
        System.out.println("Total: R$ " + c1.obterValorTotal()); // Imprime o valor total da compra c1

        System.out.println("  ");




        // ====== Nova compra ======

        Item c2 = new Item(); // Cria uma nova instância da classe Compra
        c2.cliente = "Maria Clara"; // Define o nome do cliente da compra c

        c2.adicionarItem("Impressora", 1, 899.90); // Adiciona um produto à lista de produtos da compra c2
        c2.adicionarItem("Monitor", 2, 299.90); // Ad
        c2.adicionarItem("Mouse", 2, 79.90); // Adiciona outro produto à lista de produtos da compra c2
        c2.adicionarItem("Teclado", 1, 149.90);

        System.out.println(c2.cliente); // Imprime o nome do cliente da compra c2
        System.out.println(c2.itens.size()); // Imprime o número de itens na lista
        System.out.println("Total: R$ " + c2.obterValorTotal()); // Imprime o valor total da compra c2


    }
}
