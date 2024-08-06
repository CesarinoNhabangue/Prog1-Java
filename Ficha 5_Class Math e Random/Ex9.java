import java.util.Random;

public class Ex9 {
    public static void main(String[] args) {
        int numCartoes = 5;
        int numerosPorCartao = 6;
        
        for (int i = 1; i <= numCartoes; i++) {
            int[] cartao = gerarCartaoLoteria(numerosPorCartao);
            
            System.out.print("Cartão " + i + ": ");
            for (int j = 0; j < numerosPorCartao; j++) {
                System.out.print(cartao[j] + " ");
            }
            System.out.println();
        }
    }
    
    public static int[] gerarCartaoLoteria(int numerosPorCartao) {
        int[] cartao = new int[numerosPorCartao];
        Random random = new Random();
        
        for (int i = 0; i < numerosPorCartao; i++) {
            cartao[i] = random.nextInt(60) + 1;
            
            for (int j = 0; j < i; j++) {
                if (cartao[i] == cartao[j]) {
                    i--;
                    break;
                }
            }
        }
        
        return cartao;
    }
}
