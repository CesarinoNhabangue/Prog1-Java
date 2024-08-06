public class Ex8 {
    public static void main(String[] args) {
        int a = 0, b = 1, c;

        System.out.println("Os 50 primeiros números da sequência de Fibonacci sao: ");
        System.out.print(a + " ");
        System.out.print(b + " ");

        for (int i = 2; i <= 50; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
