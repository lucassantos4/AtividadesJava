package naoobrigatoriaatividade.atividade1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = null;

        numeros = new int[2];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero para divisão: ");
            numeros[i] = scanner.nextInt();
        }

        try {
            if (numeros[1] == 0) {
                throw new DivisaoPorZero();
            }
            System.out.printf("divisão de %.2f por %.2f = %.2f%n", numeros[0], numeros[1], numeros[0] / numeros[1]);
        } catch (DivisaoPorZero e) {
            System.out.println(e.getMessage());
        }
    }
}
