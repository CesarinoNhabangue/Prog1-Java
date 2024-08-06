import java.util.Scanner;

public class CalculoDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Insira o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        System.out.print("Insira a quantidade de unidades compradas: ");
        int quantidade = scanner.nextInt();

        double valorTotal = 0.0;

        if (quantidade <= 10) {
            valorTotal = precoProduto * quantidade;
        } else if (quantidade <= 20) {
            valorTotal = precoProduto * quantidade * 0.9; // 10% de desconto
        } else if (quantidade <= 50) {
            valorTotal = precoProduto * quantidade * 0.8; // 20% de desconto
        } else {
            valorTotal = precoProduto * quantidade * 0.75; // 25% de desconto
        }

        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor total a ser pago: " + valorTotal);

        scanner.close();
    }
}
