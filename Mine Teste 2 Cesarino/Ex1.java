//Cesarino Teodoro Nhabangue Jr LECC11

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o seu nome:");
        String nome = scanner.nextLine();
        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.substring(0, i + 1));
        }
    }
}
