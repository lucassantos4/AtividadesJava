import java.util.Collections;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o limite do cartão: ");
        double limite = scanner.nextDouble();
        Cartao cartao = new Cartao(limite);

        byte sair = 1;
        while (sair != 0) {
            System.out.println("Digite a descrição da compra: ");
            String descricao = scanner.next();

            System.out.println("Digite o valor da compra: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(valor , descricao);
            Boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada == true) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para ficar");
                sair = scanner.nextByte();
            } else {
                System.out.println("Saldo insuficiente");
                sair = 0;
            }
            System.out.println("""
                    ********************
                     COMPRAS REALIZADAS
                    ********************
                    
                    """);
            Collections.sort(cartao.getCompras());
            for(Compra c : cartao.getCompras()){
                System.out.println(c.getDescricao() + " - " + c.getValor());
            }
            System.out.println("/n*****************");
            System.out.println("\nSaldo do cartão: " + cartao.getSaldo());

        }


    }
}
