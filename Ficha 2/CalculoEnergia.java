import java.util.Scanner;

public class CalculoEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.println("Digite a quantidade de quilowatts gasta: ");
        double quilowatts = scanner.nextDouble();

        double valorPorQuilowatt = salarioMinimo / 7 / 100;
        double valorAPagar = valorPorQuilowatt * quilowatts;
        double valorComDesconto = valorAPagar * 0.9;

        System.out.println("Valor por Quilowatt: " + valorPorQuilowatt);
        System.out.println("Valor a Pagar: " + valorAPagar);
        System.out.println("Valor com Desconto: " + valorComDesconto);

        scanner.close();
    }
}
