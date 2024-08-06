//Cesarino Teodoro Nhabangue Jr LECC11

public class Ex4 {
    public static void main(String[] args) {
        
        int[][] matriz = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int somaColuna1 = 0;
        for (int i = 0; i < matriz.length; i++) {
            somaColuna1 += matriz[i][0];
        }

        int produtoLinha1 = 1;
        for (int i = 0; i < matriz[0].length; i++) {
            produtoLinha1 *= matriz[0][i];
        }

        int somaTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaTotal += matriz[i][j];
            }
        }
        int produtoDiagonalPrincipal = 1;
        for (int i = 0; i < matriz.length; i++) {
            produtoDiagonalPrincipal *= matriz[i][i];
        }
        System.out.println("Soma dos elementos da primeira coluna: " + somaColuna1);
        System.out.println("Produto dos elementos da primeira linha: " + produtoLinha1);
        System.out.println("Soma de todos os elementos: " + somaTotal);
        System.out.println("Produto da diagonal principal: " + produtoDiagonalPrincipal);
    }
}