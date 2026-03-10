import java.util.Random;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 1;

        while (tentativas <= 5) {
            System.out.println("digite um numero: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("você acertou!!! o numero é " + numeroSecreto);
                break;
            } else if (palpite > numeroSecreto) {
                System.out.println("mais uma chance. ta chutando alto");
            } else {
                System.out.println("Mais uma chance. ta chutando baixo");
            }
        }
    }
}