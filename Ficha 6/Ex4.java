import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        int soma = 0;
        int somaDiagonal = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o valor da posição [" + i + "," + j + "]:");
                matriz[i][j] = sc.nextInt();

                soma += matriz[i][j];

                if (i == j) {
                    somaDiagonal += matriz[i][j];
                }
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Soma dos valores da matriz: " + soma);

        System.out.println("Soma dos valores da diagonal principal: " + somaDiagonal);
    }
}