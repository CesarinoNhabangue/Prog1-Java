import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a,b;
        int ad, mult, sub, div;

        System.out.println("Insira a");
        a = entrada.nextInt();

        System.out.println("Insira b");
        b = entrada.nextInt();

        ad = a + b;
        mult = a * b;
        sub = a - b;
        div = a / b;

        System.out.println(ad);
        System.out.println(mult);
        System.out.println(sub);
        System.out.println(div);


    }
}
