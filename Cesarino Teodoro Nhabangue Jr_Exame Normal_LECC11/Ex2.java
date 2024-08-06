//Cesarino Teodoro Nhbangue Jr LECC11

import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Insira um numero: ");
    int numero = scanner.nextInt();
    
    if(isNarcissistic(numero)) {
      System.out.println(numero + " e um numero narcisista.");
    } else {
      System.out.println(numero + " nao e um numero narcisista.");
    }
  }
  
  public static boolean isNarcissistic(int num) {
    int digitos = String.valueOf(num).length();
    int soma = 0;

    int temp = num;
    while(temp > 0) {
      int lastDigit = temp % 10;
      soma += Math.pow(lastDigit, digitos);
      temp /= 10;
    }
    return (soma == num);
  }
}
