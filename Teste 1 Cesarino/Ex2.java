//Cesarino Teodoro Nhabangue Jr


import java.util.Scanner;

public class Ex2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nome, dataNascimento, morada, departamento;
        double salario, bonus;
        int antiguidade;

        System.out.println("Insira o nome do funcionário:");
        nome = scanner.nextLine();

        System.out.println("Insira a data de nascimento do funcionario:");
        dataNascimento = scanner.nextLine();

        System.out.println("Insira a morada do funcionário:");
        morada = scanner.nextLine();

        System.out.println("Insira o departamento do funcionario:");
        departamento = scanner.nextLine();

        System.out.println("Insira o salario do funcionario:");
        salario = scanner.nextDouble();

        System.out.println("Insira a antiguidade do funcionario :");
        antiguidade = scanner.nextInt();

        bonus = 0;
        if (antiguidade > 2 && antiguidade < 5 && salario > 40000){
            bonus = salario * 0.2;
        } else if (antiguidade > 5 && salario < 50000){
            bonus = salario * 0.3;
        } else if (antiguidade < 2 && salario > 20000){
            bonus = salario * 0.1;
        }

        double salarioFinal = salario + bonus;

        System.out.println("O funcionario " + nome + " ira ganhar " + salarioFinal + " no final do mes.");
    }
}
