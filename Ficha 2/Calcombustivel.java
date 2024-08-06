import java.util.Scanner;

public class Calcombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo de viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();

        System.out.println("Digite a velocidade média (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        double distancia = tempoViagem * velocidadeMedia;
        double litrosUsados = distancia / 12.0;

        System.out.println("Distância da viagem: " + distancia + " km");
        System.out.println("Litros de combustível usados: " + litrosUsados + " litros");

        scanner.close();
    }
}
