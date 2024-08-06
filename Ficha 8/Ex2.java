import java.util.Scanner;

public class Ex2 {

  public static int soma(int a, int b) {
    return a + b;
  }

  public static int subtracao(int a, int b) {
    return a - b;
  }

  public static int divisao(int a, int b) {
    return a / b;
  }

  public static int multiplicacao(int a, int b) {
    return a * b;
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("a = ");
    int a = scanner.nextInt();
    System.out.println("b = ");
    int b = scanner.nextInt();

    System.out.println("Soma: " + soma(a, b));
    System.out.println("Subtracao: " + subtracao(a, b));
    System.out.println("Divisao: " + divisao(a, b));
    System.out.println("Multiplicao: " + multiplicacao(a, b));
  }
}
