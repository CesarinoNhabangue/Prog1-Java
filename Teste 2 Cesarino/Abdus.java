import java.util.Scanner;

public class Abdus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] count = new int[10];

        System.out.println("Insira 10 numeros:");

        for (int i = 0; i < 10; i++) {
            numeros[i] = scanner.nextInt();
            count[i] = 0;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (numeros[i] == numeros[j]) {
                    count[i]++;
                }
            }
        }
        int mci = 0;
        for (int i = 1; i < 10; i++) {
            if (count[i] > count[mci]) {
                mci = i;
            }
        }
        System.out.println("A moda e: " + numeros[maxCountIndex]);
    }
}//