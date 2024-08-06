//Cesarino Teodoro Nhabangue Jr LECC11

import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    
    double velocidadeA = 15; 
    double velocidadeB = 10; 
    double posicaoInicialB = 100; 
    
    double tempo = (posicaoInicialB) / (velocidadeA - velocidadeB);
    System.out.println("Instante em que A alcanca B: " + tempo + " s");
    
    
    double distancia = velocidadeA * tempo; 
    System.out.println("Distancia percorrida por A: " + distancia + " m");
  }
}
