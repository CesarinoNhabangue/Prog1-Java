import java.util.Arrays;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        int[] conjunto1 = new int[5];
        int[] conjunto2 = new int[3];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira os números do primeiro conjunto: ");
        for (int i = 0; i < conjunto1.length; i++) {
            conjunto1[i] = scanner.nextInt();
        }

        System.out.println("Insira os números do segundo conjunto: ");
        for (int i = 0; i < conjunto2.length; i++) {
            conjunto2[i] = scanner.nextInt();
        }
        int[] conjuntoUnido = new int[conjunto1.length + conjunto2.length];

        int i = 0, j = 0, k = 0;
        while (i < conjunto1.length && j < conjunto2.length) {
            if (conjunto1[i] < conjunto2[j]) {
                conjuntoUnido[k++] = conjunto1[i++];
            } else {
                conjuntoUnido[k++] = conjunto2[j++];
            }
        }

        while (i < conjunto1.length) {
            conjuntoUnido[k++] = conjunto1[i++];
        }
        while (j < conjunto2.length) {
            conjuntoUnido[k++] = conjunto2[j++];
        }
        Arrays.sort(conjuntoUnido);

        System.out.println("O conjunto unido é: ");
        for (int n : conjuntoUnido) {
            System.out.print(n + " ");
        }
    }
}
