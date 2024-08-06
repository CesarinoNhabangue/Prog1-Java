import java.util.Scanner;

public class Cilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();

        System.out.println("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();

        double areaBase = Math.PI * Math.pow(raio, 2);
        double areaLateral = 2 * Math.PI * raio * altura;
        double areaTotal = 2 * areaBase + areaLateral;
        double volume = areaBase * altura;

        System.out.println("Área da Base: " + areaBase);
        System.out.println("Área Lateral: " + areaLateral);
        System.out.println("Área Total: " + areaTotal);
        System.out.println("Volume: " + volume);

        scanner.close();
    }
}
