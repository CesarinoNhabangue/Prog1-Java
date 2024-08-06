//Cesarino Teodoro Nhabangue Jr LECC11

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v1 = new int[15];
        int[] v2 = new int[15];
        int contador = 0;

        System.out.println("Insira 15 numeros para o primeiro vetor:");
        for (int i = 0; i < 15; i++) {
            v1[i] = scanner.nextInt();
        }

        System.out.println("Insira 15 numeros para o segundo vetor:");
        for (int i = 0; i < 15; i++) {
            v2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 15; i++) {
            if (v1[i] == v2[i]) {
                contador++;
            }
        }
        System.out.println("Os dois vetores tem o mesmo numero nas mesmas posicoes " + contador + " vezes.");
    }
}