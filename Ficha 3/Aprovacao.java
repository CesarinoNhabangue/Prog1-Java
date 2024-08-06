import java.util.Scanner;

public class Aprovacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media > 14) {
            System.out.println("Aluno aprovado!");
        } else if (media < 10) {
            System.out.println("Aluno reprovado!");
        } else {
            System.out.println("Aluno deverá realizar o exame final.");
        }

        scanner.close();
    }
}
