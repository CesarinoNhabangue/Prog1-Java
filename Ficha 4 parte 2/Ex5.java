import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Insira o valor de x:");
        int x = scanner.nextInt();

        while (x != 1) {
            System.out.print(x + " -> ");
            
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
        }
        
        System.out.println(x);
    }
}
