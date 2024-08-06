import java.util.Scanner;

public class ContadorLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int contadorA = 0;

        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            if (caractere == 'a' || caractere == 'A') {
                contadorA++;
            }
        }

        System.out.println("A letra 'a' aparece " + contadorA + " vezes na frase.");

        scanner.close();
    }
}
