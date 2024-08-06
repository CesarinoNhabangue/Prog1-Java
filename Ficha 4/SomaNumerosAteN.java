import java.util.Scanner;

public class SomaNumerosAteN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }

        System.out.println("A soma total de 1 até " + numero + " é: " + soma);

        scanner.close();
    }
}
