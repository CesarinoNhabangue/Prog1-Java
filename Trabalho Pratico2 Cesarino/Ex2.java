//Cesarino Teodoro Nhabangue Jr LECC11

import java.util.Scanner;

public class Ex2 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salto = new double[5];
        double soma = 0.0, media= 1.0;
        String atleta;
        int j;
        do {
            System.out.println("Insira um nome: ");
            atleta = scanner.next();
            for (int i = 0; i < 5; i++) {
                System.out.print("Insira salto " + (i + 1) + ": ");
                salto[i] = scanner.nextFloat();
            }
            System.out.println("Atleta: " + atleta);
            j = 1;
            for (double d : salto) {
                soma += d;
                System.out.println(" Salto " + j + ": " + d);
                j++;
            }
            media = soma / 5;
            System.out.println("Media de saltos: " + media);
        } while (!atleta.equals(" "));
    }
}
