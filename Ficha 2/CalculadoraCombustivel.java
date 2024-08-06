import java.util.Scanner;

public class CalculadoraCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário para inserir o tempo de viagem em horas
        System.out.println("Digite o tempo de viagem (em horas): ");
        double tempoViagem = scanner.nextDouble();

        // Pedir ao usuário para inserir a velocidade média em km/h
        System.out.println("Digite a velocidade média (em km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        // Calcular a distância da viagem
        double distancia = tempoViagem * velocidadeMedia;

        // Calcular a quantidade de litros usados
        double litrosUsados = distancia / 12.0;

        System.out.println("Distância da viagem: " + distancia + " km");
        System.out.println("Litros de combustível usados: " + litrosUsados + " litros");

        scanner.close();
    }
}
