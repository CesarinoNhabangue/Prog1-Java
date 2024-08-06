import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite palavras (termine com uma palavra começando com 'f'):");

        while (true) {
            String palavra = scanner.nextLine();
            if (palavra.charAt(0) == 'f'||palavra.charAt(0) == 'F') {
                break;
            }
            char primeiraLetra = palavra.charAt(0);
            char ultimaLetra = palavra.charAt(palavra.length() - 1);

            System.out.println("Primeira letra e: " + primeiraLetra + ",E a ultima letra e: " + ultimaLetra);
        }
    }
}