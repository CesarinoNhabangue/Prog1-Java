import java.util.Scanner;

public class LetraA {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String frase;
        int contagemA = 0;
        char caractere;

        System.out.println("Digite uma frase:");
        frase = scanner.nextLine();

        for(int i = 0; i < frase.length(); i++){
            caractere = frase.charAt(i);
            if (caractere == 'a' || caractere == 'A'){
                contagemA++;
            }
        }
        System.out.println("A letra 'a' aparece" + contagemA + "vezes na frase.");
    }
}
