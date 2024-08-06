import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra;

        System.out.print("Digite uma palavra com pelo menos 8 caracteres: ");
        palavra = scanner.nextLine();

        if (palavra.length() < 8) {
            System.out.println("A palavra deve ter pelo menos 8 caracteres.");
        } else {
            String novaPalavra = palavra.substring(0, 2) + palavra.substring(palavra.length() - 2);
            System.out.println("A nova palavra é: " + novaPalavra);
        }
    }
}
