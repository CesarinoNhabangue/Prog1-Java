import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a nota:");
        int nota = scanner.nextInt(); 
        
        switch(nota) {
            case 1:
                System.out.println("Pessima");
                break;
            case 2:
                System.out.println("Ruim");
                break;
            case 3:
                System.out.println("Regular");
                break;
            case 4:
                System.out.println("Boa");
                break;
            case 5:
                System.out.println("Otima");
                break;
            default:
                System.out.println("Nota invalida");

                scanner.close();
        }
    }
}
