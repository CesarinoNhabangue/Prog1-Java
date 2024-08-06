import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Insira o número de peças a serem processadas: ");
        int numPecas = scanner.nextInt();
        
        int pecasAdequadas = 0;
        
        for (int i = 1; i <= numPecas; i++) {
            System.out.print("Insira o comprimento da peça " + i + " em metros: ");
            double comprimento = scanner.nextDouble();
            
            if (comprimento >= 1.20 && comprimento <= 1.30) {
                pecasAdequadas++;
            }
        }
        
        System.out.println("Quantidade de peças adequadas: " + pecasAdequadas);
        
        scanner.close();
    }
}
