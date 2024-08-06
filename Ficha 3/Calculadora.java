import java.util.Scanner;

public class Calculadora {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Insira o segundo numero:");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double divisao = num1/num2;
        double multiplicacao = num1 * num2;

        System.out.println("Soma e:" +soma);
        System.out.println("Subtracao e:" +subtracao);
        System.out.println("Divisao e:" +divisao);
        System.out.println("Multiplicacao e:" +multiplicacao);

        scanner.close();

    }
}