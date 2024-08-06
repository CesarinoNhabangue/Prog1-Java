import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[20];
        int[] idade = new int[20];

        for (int i = 0; i < 20; i++) {
            System.out.print("Insira o nome da " + (i + 1) + " candidata: ");
            nome[i] = scanner.nextLine();
            System.out.print("Insira a idade da " + (i + 1) + " candidata: ");
            idade[i] = scanner.nextInt();
        }
        int quantidadeAptas = 0;
        for (int i = 0; i < 20; i++) {
            if (idade[i] >= 18 && idade[i] < 21) {
                quantidadeAptas++;
            }
        }
        String[] nomeAptas = new String[quantidadeAptas];

        int j = 0;
        for (int i = 0; i < 20; i++) {
            if (idade[i] >= 18 && idade[i] < 21) {
                nomeAptas[j] = nome[i];
                j++;
            }
        }
        System.out.println("Lista de candidatas aptas:");
        for (int i = 0; i < quantidadeAptas; i++) {
            System.out.println(nomeAptas[i]);
        }
    }
}