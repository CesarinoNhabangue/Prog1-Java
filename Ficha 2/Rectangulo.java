import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do retângulo: ");
        double largura = scanner.nextDouble();

        System.out.println("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();

        double area = largura * altura;
        double perimetro = 2 * (largura + altura);
        double diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Diagonal: " + diagonal);

        scanner.close();
    }
}
