import java.util.ArrayList;

public class Main {

    static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("abacate");
        lista.add("brevidade");
        lista.add("vida");
        lista.add("brio");

        for (String item : lista) {
            System.out.println(item);
        }

        Cachorro enzo = new Cachorro("enzo" , 11 , "vira-lata");
        enzo.fazerSom();

        Animal animal = new Animal("Gato feio" , 1000);
        animal.fazerSom();

        Animal meuAnimal = (Animal) enzo;
        meuAnimal.fazerSom();

        Produto produto1 = new Produto("camiseta" , 110);
        Produto produto2 = new Produto("casaco" , 250);
        Produto produto3 = new Produto("sapato" , 300);
        Produto produto4 = new Produto("bone" , 60);

        ArrayList<Produto> carrinhoDeCompra = new ArrayList<>();
        carrinhoDeCompra.add(produto1);
        carrinhoDeCompra.add(produto2);
        carrinhoDeCompra.add(produto3);
        carrinhoDeCompra.add(produto4);

        double valorTotal = 0;
        for (Produto comprar : carrinhoDeCompra) {
            valorTotal += comprar.getPreco();

        }
        System.out.println("Valor total dos produtos é: " + valorTotal);

        double precoMedio = valorTotal / carrinhoDeCompra.size();

        System.out.println("a media do valor dos produtos é de " + precoMedio);


       Circulo circulo3 = new Circulo(5.0);
       Circulo circulo4 = new Circulo(4.0);
       Quadrado quadrado4 = new Quadrado(3.0);


       ArrayList<Forma> listaFormas = new ArrayList<>();

       listaFormas.add(circulo3);
       listaFormas.add(circulo4);
       listaFormas.add(quadrado4);


       for (Forma forma : listaFormas) {
           System.out.println(forma.calcularArea());
       }

       ContaBancaria conta1 = new ContaBancaria("123", 6690.0);
       ContaBancaria lucas = new ContaBancaria("4", 4.0);
       ContaBancaria conta2 = new ContaBancaria("497", 5320.0);
       ContaBancaria conta3 = new ContaBancaria("963", 1423.0);

       ArrayList<ContaBancaria> listaContas = new ArrayList<>();
       listaContas.add(conta1);
       listaContas.add(conta2);
       listaContas.add(lucas);
       listaContas.add(conta3);

       ContaBancaria contaMaiorSaldo = listaContas.get(0);
       for (ContaBancaria conta : listaContas) {

           if (conta.getSaldo() > contaMaiorSaldo.getSaldo()){
               contaMaiorSaldo = conta;
           }
       }
        System.out.println("Conta com maior saldo - Numero: " + contaMaiorSaldo.getNumeroConta()
                + " tem " + contaMaiorSaldo.getSaldo() + "R$ ");
    }



}
