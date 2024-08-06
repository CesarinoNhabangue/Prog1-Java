import java.util.Scanner;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
         int soma = 0;

        System.out.print("Informe um número: ");
        numero = scanner.nextInt();

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                soma += i;
            }
        }

        if (soma == numero) {
            System.out.println("O numero e perfeito.");
        } else {
            System.out.println("O numero nao e perfeito.");
        }
    }
}
