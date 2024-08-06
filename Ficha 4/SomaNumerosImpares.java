public class SomaNumerosImpares {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 20; i += 2) { 
            soma += i;
        }

        System.out.println("A soma dos números ímpares de 0 a 20 é: " + soma);
    }
}
