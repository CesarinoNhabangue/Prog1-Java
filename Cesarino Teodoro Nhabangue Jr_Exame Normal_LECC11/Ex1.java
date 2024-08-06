//Cesarino Teodoro Nhbangue Jr LECC11

import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Insira um texto: ");
    String texto = scanner.nextLine();
    
    System.out.print("Insira o caractere a ser contado: ");
    char caractere = scanner.next().charAt(0);
    
    int contador = 0;
    for(int i = 0; i < texto.length(); i++) {
      if(texto.charAt(i) == caractere) {
        contador++;
      }
    }
    System.out.println("O caractere " + caractere + " aparece " + contador + " vezes no texto.");
  }
}