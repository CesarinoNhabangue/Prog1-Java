import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();
        scanner.nextLine();

        int salarioMenor50000 = 0;
        int salarioMaior50000 = 0;
        int totalSalarios = 0;

        for (int i = 0; i < quantidadeFuncionarios; i++) {
            System.out.print("Salário do funcionário " + (i + 1) + " (entre 25000 e 200000 MTN): ");
            int salario = scanner.nextInt();

            if (salario < 25000 || salario > 200000) {
                System.out.println("Salário inválido. Insira um valor que esta entre 25000 e 200000 MTN.");
                i--; 
                continue;
            }

            totalSalarios += salario;

            if (salario < 50000) {
                salarioMenor50000++;
            } else {
                salarioMaior50000++;
            }
        }

        System.out.println("O número de funcionários com salário menor que 50000 MTN e: " + salarioMenor50000);
        System.out.println("O número de funcionários com salário maior ou igual a 50000 MTN e: " + salarioMaior50000);
        System.out.println("O total que a empresa gasta com salários e: " + totalSalarios + " MTN");

        scanner.close();
    }
}
