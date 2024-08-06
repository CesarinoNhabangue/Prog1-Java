import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduz um nr: ");
        int num = scanner.nextInt();
        long sum = 0;

        for (int i = 0; i <= num; i++) {
            sum += factorial(i);
            System.out.println(i + "! = " + factorial(i));
        }
        System.out.println("A soma do fatorial de todos os numeros de 0 ate " + num + " e " + sum);
    }
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
