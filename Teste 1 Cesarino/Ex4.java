//Cesarino Teodoro Nhabangue Jr


import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int comida;
        char bebida;

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|                                      Menu                                     |");
        System.out.println("|-------------------------------------------------------------------------------|");
        System.out.println("|                 Comidas                |                 Bebidas              |");
        System.out.println("|-------------------------------------------------------------------------------|");
        System.out.println("|1. Hamburguer - 150                     |a. 8               |");
        System.out.println("|-------------------------------------------------------------------------------|");
        System.out.println("|3. Batatas Fritas - 70                  |c. Sumo 1L- 130                       |");
        System.out.println("|-------------------------------------------------------------------------------|");
        System.out.println("|4. Dose de Frango - 200                 |d. Agua- 30                           |");
        System.out.println("---------------------------------------------------------------------------------");
        
        System.out.println("O que pretende comer:");
        comida = scanner.nextInt();
        
        switch (comida) {
            case 1:
                total += 150;
                break;
            case 2:
                total += 200;
                break;
            case 3:
                total += 70;
                break;
            case 4:
                total += 200;
                break;
            default:
                System.out.println("Nao temos disponivel");
                return;
        }
        
        System.out.println("O que pretende beber:");
        bebida = scanner.next().charAt(0);
        
        switch (bebida) {
            case 'a':
                total += 40;
                break;
            case 'b':
                total += 25;
                break;
            case 'c':
                total += 130;
                break;
            case 'd':
                total += 30;
                break;
            default:
                System.out.println("Nao temos disponivel");
                return;
        }
        
        System.out.println("Pedido registrado!");
        System.out.println("Itens pedidos: ");
        System.out.println("Comida: " + comida);
        System.out.println("Bebida: " + bebida);
        System.out.println("Preço total a pagar: " + total);
        
    }
}