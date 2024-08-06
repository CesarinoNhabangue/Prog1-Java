import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Numero " + (i + 1) + ": " + numeros.get(i));
        }
    }
}