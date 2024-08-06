import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		int n, idade;
		char genero;
        
        System.out.print("Quantos estudantes deseja calcular a idade media? ");
        n = scanner.nextInt();
        
        int idadeHomens = 0;
        int idadeMulheres = 0;
        int totalIdade = 0;
        int countHomens = 0;
        int countMulheres = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.println("Estudante " + i + ":");
            
            System.out.print("Digite a idade: ");
            idade = scanner.nextInt();
            
            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            sexo = scanner.next().charAt(0);
            
            totalIdade += idade;
            
            if (sexo == 'M' || sexo == 'm') {
                idadeHomens += idade;
                countHomens++;
            } else if (sexo == 'F' || sexo == 'f') {
                idadeMulheres += idade;
                countMulheres++;
            } else {
                System.out.println("Sexo não reconhecido. Por favor, insira 'M' ou 'F'.");
                i--;
            }
        }
        
        if (countHomens > 0) {
            double mediaIdadeHomens = (double) idadeHomens / countHomens;
            System.out.println("Media de idade dos homens: " + mediaIdadeHomens);
        } else {
            System.out.println("Nenhum homem foi insirido para o calculo da media.");
        }
        
        if (countMulheres > 0) {
            double mediaIdadeMulheres = (double) idadeMulheres / countMulheres;
            System.out.println("Media de idade das mulheres: " + mediaIdadeMulheres);
        } else {
            System.out.println("Nenhuma mulher foi insirido para o calculo da media.");
        }
        
        double mediaIdadeTotal = (double) totalIdade / n;
        System.out.println("Media de idade de todos os estudantes: " + mediaIdadeTotal);
        
    }
}
