import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Double> indenizacoesReajustadas = new ArrayList<>();
        String nome;
        int idade;
        double valorBase, reajuste, indenizacaoReajustada;

        while (true) {
            System.out.print("Insira o nome completo do paciente (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Insira a idade do paciente: ");
            idade = scanner.nextInt();
            
            System.out.print("Insira o valor base de indenização: ");
            valorBase = scanner.nextDouble();

            reajuste = 0;

            if (idade <= 12) {
                reajuste = 0.30;
            } else if (idade >= 13 && idade <= 49) {
                reajuste = 0.10;
            } else if (idade >= 50 && idade <= 65) {
                reajuste = 0.15;
            } else {
                reajuste = 0.35;
            }

            indenizacaoReajustada = valorBase * (1 + reajuste);

            nomes.add(nome);
            idades.add(idade);
            indenizacoesReajustadas.add(indenizacaoReajustada);
        }
        System.out.println("Pacientes Indenizados:");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i));
            System.out.println("Idade: " + idades.get(i));
            System.out.println("Indenizacao Reajustada: " + indenizacoesReajustadas.get(i));
            System.out.println();
        }
    }
}