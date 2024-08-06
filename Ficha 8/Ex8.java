import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a escala de temperatura:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                celsiusToFahrenheit();
                break;
            case 2:
                fahrenheitToCelsius();
                break;
            default:
                System.out.println("Escolha invalida. Por favor, escolha 1 ou 2.");
        }
    }
    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit e: " + fahrenheit);
    }
    public static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = 5 * (fahrenheit - 32) / 9;
        System.out.println("A temperatura em Celsius é: " + celsius);
    }
}
//Neste programa, o usuário escolhe entre as opções 1 e 2 para realizar a conversão desejada. Em seguida, o programa chama o método apropriado para executar a conversão e exibir o resultado. 