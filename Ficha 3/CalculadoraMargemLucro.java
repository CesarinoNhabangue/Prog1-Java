import java.util.Scanner;

public class CalculadoraMargemLucro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da compra (em Mt): ");
        double valorCompra = scanner.nextDouble();

        double margemLucro = 0.0;

        if (valorCompra < 340.00) {
            margemLucro = 0.45;
        } else if (valorCompra < 680.00) {
            margemLucro = 0.35;
        } else if (valorCompra < 1020.00) {
            margemLucro = 0.25;
        } else {
            margemLucro = 0.15;
        }

        double valorVenda = valorCompra * (1 + margemLucro);

        System.out.println("Preço de venda: " + valorVenda + " Mt");

        scanner.close();
    }
}

