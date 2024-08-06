import java.util.Scanner;
import java.util.Random;
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Digite um número: ");
        double numeroMaximo = scanner.nextDouble();

        double numeroAleatorio = Math.random() * numeroMaximo;

        double seno = Math.sin(numeroAleatorio);
        double cosseno = Math.cos(numeroAleatorio);
        double tangente = Math.tan(numeroAleatorio);

        System.out.println("Número Aleatório: " + numeroAleatorio);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);

        double raizQuadrada = Math.sqrt(numeroAleatorio);
        double potencia = Math.pow(numeroAleatorio, 2);

        System.out.println("Raiz Quadrada: " + raizQuadrada);
        System.out.println("Potência: " + potencia);
    }
}
