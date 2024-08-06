import java.util.Scanner;

public class AreaHexagono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o comprimento do lado do hexágono: ");
        double lado = scanner.nextDouble();

        double area = (3 * lado*lado * 1.732) / 2;

        System.out.println("A área do hexágono é: " + area);
        scanner.close();
    }
}
