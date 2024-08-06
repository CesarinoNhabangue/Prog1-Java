import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalEstudantes = 10;
        int aprovados = 0;
        int reprovados = 0;

        for (int i = 1; i <= totalEstudantes; i++) {
            System.out.println("Informe o nome do estudante " + i + ": ");
            String nome = scanner.nextLine();

            System.out.println("Informe a nota do estudante " + i + ": ");
            double nota = scanner.nextDouble();

            scanner.nextLine(); 

            if (nota >= 225) {
                System.out.println("O estudante " + nome + " foi aprovado.");
                aprovados++;
            } else {
                System.out.println("O estudante " + nome + " foi reprovado.");
                reprovados++;
            }
        }

        System.out.println("Quantidade de estudantes aprovados: " + aprovados);
        System.out.println("Quantidade de estudantes reprovados: " + reprovados);

        scanner.close();
    }
}
