import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.print("Insira um valor positivo: ");
        valor = scanner.nextInt();

        
        if (valor <= 0) {
            System.out.println("O valor inserido não é positivo.");
            return;
        }

        int contador = 1;
        while (contador <= valor) {
            System.out.println(contador);
            contador++;
        }

        scanner.close();
    }
}
