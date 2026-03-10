import java.util.ArrayList;

public class Main {
    static void main(String[] args) {

        var produto1 = new Produto("Agua" , 3.50);
        var produto2 = new Produto("Coca-cola" , 4.50);
        var produto3 = new Produto("Antartica" , 4);
        var produto4 = new Produto("Halls" , 1.50);

        var produto5 = new ProdutoPerecivel("maça", 0.60, "26-03-2026" );

        ArrayList carrinhoDeProdutos = new ArrayList();
        carrinhoDeProdutos.add(produto1);
        carrinhoDeProdutos.add(produto2);
        carrinhoDeProdutos.add(produto3);
        carrinhoDeProdutos.add(produto4);
        carrinhoDeProdutos.add(produto5);
        for (Object produto : carrinhoDeProdutos) {
            System.out.println(produto);
        }
        System.out.println("Quantidade de produtos no carrinho "+ carrinhoDeProdutos.size());
        System.out.println("Indice do produto " +carrinhoDeProdutos.indexOf(produto3) + " " + carrinhoDeProdutos.get(3));

    }
}
