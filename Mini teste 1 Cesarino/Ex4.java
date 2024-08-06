import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tipoCombustivel;
        int quantidadeLitros;
        double precoLitroCombustivel;
        double valorTotal = 0;

        System.out.print("Digite o tipo de combustível (D-Diesel ou G-Gasolina): ");
        tipoCombustivel = scanner.nextLine();

        System.out.print("Digite a quantidade de litros: ");
        quantidadeLitros = scanner.nextInt();

        switch (tipoCombustivel) {
            case "D":
                precoLitroCombustivel = 72.49;
                break;
            case "G":
                precoLitroCombustivel = 69.90;
                break;
            default:
                System.out.println("Tipo de combustível inválido.");
                return;
        }
        if (quantidadeLitros <= 20) {

            valorTotal = precoLitroCombustivel * quantidadeLitros * (1 - 0.03);
        } else {
            valorTotal = precoLitroCombustivel * quantidadeLitros * (1 - 0.05);
        }
        System.out.println("Valor total a pagar: " + valorTotal);
    }
}
