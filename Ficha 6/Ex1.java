import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {s
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0;
        int count = 0;

        System.out.println("Por favor, insira 10 números inteiros:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        double average = (double) sum / array.length;

        for (int j : array) {
            if (j > average) {
                count++;
            }
        }

        System.out.println("A média aritmética é: " + average);
        System.out.println("O número de elementos acima da média é: " + count);
    }
}
