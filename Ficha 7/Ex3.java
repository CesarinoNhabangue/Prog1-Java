import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Insira um numero real: ");
            double numero = scanner.nextDouble();
            numeros.add(numero);
        }
        double soma = 0.0;
        for (double numero : numeros) {
            soma += numero;
        }
        double media = soma / numeros.size();

        double maior = numeros.get(0);
        double menor = numeros.get(0);
        for (double numero : numeros) {
            if (numero > maior) {
                maior = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }
        int quantidadePositivos = 0;
        int quantidadeNegativos = 0;
        for (double numero : numeros) {
            if (numero >= 0) {
                quantidadePositivos++;
            } else {
                quantidadeNegativos++;
            }
        }
        System.out.println("Media: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Quantidade de elementos positivos: " + quantidadePositivos);
        System.out.println("Quantidade de elementos negativos: " + quantidadeNegativos);
    }
}