import java.util.Scanner;

public class Extenso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Converte o número para uma string
        String numeroString = String.valueOf(numero);

        // Percorre a string, imprimindo cada dígito por extenso
        for (int i = 0; i < numeroString.length(); i++) {
            char digito = numeroString.charAt(i);

            // Obtém o valor do dígito como um número inteiro
            int valor = digito - '0';

            // Imprime o dígito por extenso
            String nomeDoDigito = "";
            switch (valor) {
                case 0:
                    nomeDoDigito = "zero";
                    break;
                case 1:
                    nomeDoDigito = "um";
                    break;
                case 2:
                    nomeDoDigito = "dois";
                    break;
                case 3:
                    nomeDoDigito = "três";
                    break;
                case 4:
                    nomeDoDigito = "quatro";
                    break;
                case 5:
                    nomeDoDigito = "cinco";
                    break;
                case 6:
                    nomeDoDigito = "seis";
                    break;
                case 7:
                    nomeDoDigito = "sete";
                    break;
                case 8:
                    nomeDoDigito = "oito";
                    break;
                case 9:
                    nomeDoDigito = "nove";
                    break;
            }

            System.out.print(nomeDoDigito + " ");
        }

        System.out.println();
    }
}
