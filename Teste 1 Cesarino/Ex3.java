//Cesarino Teodoro Nhabangue Jr

import java.util.Scanner;

public class Ex3{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int Candidatos;
        char Partido;

        System.out.println("");
        System.out.println("Candidatos:");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("Partido:");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Em que candidato pretende votar :");
        Candidatos = scanner.nextInt();
        
        switch (Candidatos) {
            case 1:
                total += 1;
                break;
            case 2:
                total += 1;
                break;
            case 3:
                total += 1;
                break;
            case 4:
                total += 1;
                break;
            default:
                System.out.println("");
                return;
        }
        
        System.out.println("Em que partido pretende votar:");
        Partido = scanner.next().charAt(0);
        
        switch (Partido) {
            case 'a':
                break;
            case 'b':
                break;
            case 'c':
                break;
            case 'd':
                break;
            default:
                System.out.println("");
                return;
        }
        
        System.out.println("!");
        System.out.println("Nr de eleitores : ");
        System.out.println("Candidatos: " + );
        System.out.println("Partido: " + bebida);
        System.out.println("Preço total a pagar: " + total);
        
    }
}

    }
}



