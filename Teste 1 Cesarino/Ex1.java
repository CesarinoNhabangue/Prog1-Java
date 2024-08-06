//Cesarino Teodoro Nhabangue Jr

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "Todos os estudantes organizados, interessados e com vontade de aprender merece,m uma atencao por parte dos docentes ";
        int qtdEspacos = 0;
        int qtdVogais = 0;
        int qtdCaracteres = frase.length();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                qtdEspacos++;
            }
        }
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                qtdVogais++;
            }
        }
        frase = frase.toUpperCase();

        System.out.println("Quantidade de espaços em branco: " + qtdEspacos);
        System.out.println("Quantidade de vogais: " + qtdVogais);
        System.out.println("Quantidade de caracteres: " + qtdCaracteres);
        System.out.println("Frase em maiúsculas: " + frase);
    }
}