import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor inteiro de 1 a 10: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Valor inválido. Insira um valor entre 1 e 10.");
        } else {
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }

        scanner.close();
    }
}
