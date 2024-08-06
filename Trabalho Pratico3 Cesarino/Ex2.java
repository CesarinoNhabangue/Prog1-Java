import java.util.Scanner;

public class Temperaturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        int dia;
        int semana;
        double temperatura;

        // Criação do array para armazenar as temperaturas
        double[] temperaturas = new double[31];

        // Menu
        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Preencher temperaturas");
            System.out.println("2 - Mostrar temperaturas");
            System.out.println("3 - Visualizar temperatura média do mês");
            System.out.println("4 - Dia ou dias mais quentes do mês");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Preenchimento das temperaturas
                    for (int i = 0; i < temperaturas.length; i++) {
                        System.out.print("Dia " + (i + 1) + ": ");
                        dia = scanner.nextInt();
                        System.out.print("Semana " + (i + 1) + ": ");
                        semana = scanner.nextInt();
                        System.out.print("Temperatura " + (i + 1) + ": ");
                        temperatura = scanner.nextDouble();

                        temperaturas[i] = temperatura;
                    }
                    break;
                case 2:
                    // Mostrar as temperaturas
                    for (int i = 0; i < temperaturas.length; i++) {
                        System.out.println("Dia " + (i + 1) + " - Semana " + (i + 1) + " - Temperatura: " + temperaturas[i]);
                    }
                    break;
                case 3:
                    // Visualizar a temperatura média do mês
                    double temperaturaMedia = 0;
                    for (int i = 0; i < temperaturas.length; i++) {
                        temperaturaMedia += temperaturas[i];
                    }
                    temperaturaMedia /= temperaturas.length;

                    System.out.println("Temperatura média do mês: " + temperaturaMedia);
                    break;
                case 4:
                    // Dia ou dias mais quentes do mês
                    double temperaturaMaxima = 0;
                    int diaMaximo = 0;
                    int semanaMaxima = 0;

                    for (int i = 0; i < temperaturas.length; i++) {
                        if (temperaturas[i] > temperaturaMaxima) {
                            temperaturaMaxima = temperaturas[i];
                            diaMaximo = i + 1;
                            semanaMaxima = i + 1;
                        }
                    }

                    System.out.println("Dia mais quente do mês: " + diaMaximo + " - Semana " + semanaMaxima + " - Temperatura: " + temperaturaMaxima);
                    break;
                case 0:
                    System.out.println("Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
