import java.util.Scanner;

public class Perguntabonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o nome da disciplina: ");
        String disciplina = scanner.nextLine();
        
        String acronimo = "";
        
        String[] palavras = disciplina.split(" ");
        
        if (palavras.length == 1) {
            acronimo = disciplina.substring(0, 3);
        } else {
            for (String palavra : palavras) {
                acronimo += palavra.charAt(0);
            }
        }
        
        System.out.println("O acronimo da disciplina e: " + acronimo.toUpperCase());
        
        scanner.close();
    }
}
