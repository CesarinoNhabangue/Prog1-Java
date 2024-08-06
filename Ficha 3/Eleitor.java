import java.util.Scanner;

public class Eleitor {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a sua idade:");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Nao pode votar");
        } else if (idade >= 16 && idade < 18 || idade > 65) {
            System.out.println("Voto facultativo");
        } else {
            System.out.println("Voto obrigatorio");

            scanner.close();
        }    
    }    
}
