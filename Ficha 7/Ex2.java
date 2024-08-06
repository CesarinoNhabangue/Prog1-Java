import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.println("--------------------------------");
        System.out.println("|ano do nascimento %12|Signo   |");
        System.out.println("--------------------------------");
        System.out.println("|           0         |Macaco  |");
        System.out.println("--------------------------------");
        System.out.println("|           1         |Galo    |");
        System.out.println("--------------------------------");
        System.out.println("|           2         |Cao     |");
        System.out.println("--------------------------------");
        System.out.println("|           3         |Porco   |");
        System.out.println("--------------------------------");
        System.out.println("|           4         |Rato    |");
        System.out.println("--------------------------------");
        System.out.println("|           5         |Boi     |");
        System.out.println("--------------------------------");
        System.out.println("|           6         |Tigre   |");
        System.out.println("--------------------------------");
        System.out.println("|           7         |Coelho  |");
        System.out.println("--------------------------------");
        System.out.println("|           8         |Dragao  |");
        System.out.println("--------------------------------");
        System.out.println("|           9         |Serpente|");
        System.out.println("--------------------------------");
        System.out.println("|           10        |Cavalo  |");
        System.out.println("--------------------------------");
        System.out.println("|           11        |Carneiro|");
        System.out.println("--------------------------------");

        ArrayList<String> signos = new ArrayList<>();
        int opcao;
        opcao = scanner.nextInt();

        switch (opcao) {
            case 0:
                signos.add("Macaco");
                break;
            case 1:
                signos.add("Galo");
                break;
            case 2:
                signos.add("Cao");
                break;
            case 3:
                signos.add("Porco");
                break;
            case 4:
                signos.add("Rato");
                break;
            case 5:
                signos.add("Boi");
                break;
            case 6:
                signos.add("Tigre");
                break;
            case 7:
                signos.add("Coelho");
                break;
            case 8:
                signos.add("Dragao");
                break;
            case 9:
                signos.add("Serpente");
                break;
            case 10:
                signos.add("Cavalo");
                break;
            case 11:
                signos.add("Carneiro");
                break;
            default:
                System.out.println("");
                break;
        }
        
        int anoAtual = 2023;
        int anoDoSigno = anoAtual - anoNascimento % 12;

        if (signos.contains(anoDoSigno)) {
            System.out.println("Seu signo chines e: " + signos.get(anoDoSigno));
        } else {
            System.out.println("O ano de nascimento nao corresponde a um signo chines.");
        }
    }
}