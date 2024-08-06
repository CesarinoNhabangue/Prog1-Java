import java.util.Scanner;

public class VolumeCone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio da base do cone: ");
        double raio = scanner.nextDouble();

        System.out.print("Informe a altura do cone: ");
        double altura = scanner.nextDouble();

        double volume = (1.0/3.0) * 3.14 * raio*raio * altura;

        System.out.println("O volume do cone é: " + volume);

        scanner.close();
    }
}
