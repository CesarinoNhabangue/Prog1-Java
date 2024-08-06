import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int ano;
        double valor, desconto, valorFinal;
        int totalCarrosAte2000 = 0;
        int totalCarrosGeral = 0;
        char continuar = 'S';
        
        while (continuar == 'S' || continuar == 's') {
            System.out.println("Insira o ano do carro:");
            ano = scanner.nextInt();
            
            System.out.println("Insira o valor do carro:");
            valor = scanner.nextDouble();
            
            if (ano <= 2000) {
                desconto = valor * 0.12;
                totalCarrosAte2000++;
            } else {
                desconto = valor * 0.07;
            }
            
            valorFinal = valor - desconto;
            
            System.out.println("Desconto: " + desconto);
            System.out.println("Valor a ser pago: " + valorFinal);
            
            totalCarrosGeral++;
            
            System.out.println("Deseja continuar calculando descontos? (S/N)");
            continuar = scanner.next().charAt(0);
			
        }
        
        System.out.println("Total de carros até 2000: " + totalCarrosAte2000);
        System.out.println("Total de carros no geral: " + totalCarrosGeral);
    }
}
