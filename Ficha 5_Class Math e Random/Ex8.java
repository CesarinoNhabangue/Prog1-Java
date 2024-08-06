import java.util.Scanner;

public class Ex8{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero:");
        int numero = scanner.nextInt();
        String numeroStr = String.valueOf(numero);

        for(int i =0; i < numeroStr.length(); i++){
            char digito = numeroStr.charAt(i);
            int valor = digito - '0';
            String nomeDoDigito = "";

            switch(valor){
            case 0:
                System.out.print("Zero");
                break;
            case 1:
                System.out.print("Um");
                break;
            case 2:
                System.out.print("Dois");
                break;
            case 3:
                System.out.print("Tres");
                break;
            case 4:
                System.out.print("Quatro");
                break;
            case 5:
                System.out.print("Cinco");
                break;
            case 6:
                System.out.print("Seis");
                break;
            case 7:
                System.out.print("Sete");
                break;
            case 8:
                System.out.print("Oito");
                break;
            case 9:
                System.out.print("Nove");
                break;
            default:
                System.out.print("");
            } 
            System.out.print(nomeDoDigito + " ");
        }
        System.out.println();
    }
}