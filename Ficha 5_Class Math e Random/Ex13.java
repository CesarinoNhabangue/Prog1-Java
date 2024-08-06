import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        int numeroSorteado = random.nextInt(1001);
        int tentativas = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivinhe um número de 0 a 1000: ");
        int palpite = scanner.nextInt();

        while (palpite != numeroSorteado) {
            tentativas++;

            if (palpite > numeroSorteado) {
                System.out.println("O palpite é maior do que o número sorteado.");
            } else {
                System.out.println("O palpite é menor do que o número sorteado.");
            }
            System.out.println("Tente novamente: ");
            palpite = scanner.nextInt();
        }

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativas.");
        
        scanner.close();
    }
}
