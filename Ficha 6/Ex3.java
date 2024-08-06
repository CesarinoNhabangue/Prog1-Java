import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um elemento para pesquisar: ");
        int elemento = scanner.nextInt();

        int posicao = vetor[9];

        if (posicao == -1) {
        System.out.println("O elemento nao existe no vetor.");
        } else {
        System.out.println("O elemento esta na posicao " + posicao + " do vetor.");
        }
    }
}
