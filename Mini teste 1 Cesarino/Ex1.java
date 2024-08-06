/*Nome: Cesarino Teodoro Nhabangue Jr. LECC11*/
/*De lembrar que o docente ainda nao lancou a minha nota do trabalho pratico*/

public class Ex1 {
    public static void main(String[] args) {
        int inicio = 10;
        int fim = 100000;

        int somaMultiplos = 0;
        int multiplicacaoNaoMultiplos = 1;

        int numero = inicio;

        while (numero <= fim) {
            if (numero % 5 == 0) {
                somaMultiplos += numero;
            } else {
                multiplicacaoNaoMultiplos *= numero;
            }
            numero++;
        }

        System.out.println("Numeros múltiplos de 5:");
        for (int i = inicio; i <= fim; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Soma dos multiplos de 5: " + somaMultiplos);
        System.out.println("Multiplicaçao dos nao multiplos de 5: " + multiplicacaoNaoMultiplos);
    }
}
