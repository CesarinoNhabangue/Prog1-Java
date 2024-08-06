import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorDepositado;
        double taxaJuros = 0.005;
        int meses;
        
        System.out.print("Insira o valor depositado na poupança: ");
        valorDepositado = teclado.nextDouble();
        
        meses = 12; 
        
        for (int i = 1; i <= meses; i++) {
            valorDepositado += valorDepositado * taxaJuros;
            System.out.println("Mês " + i + ": Valor com rendimento: " + valorDepositado);
        }
        
        teclado.close();
    }
}
