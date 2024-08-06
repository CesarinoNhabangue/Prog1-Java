import java.util.Scanner;

public class CalculoMedia2 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        
        String Aluno;
        int Nota1, Nota2, Nota3, Nota4, Nota5;
        double Media;

        System.out.println("Digite o nome do aluno:");
        Aluno = scanner.nextLine();

        System.out.println("Digite a primeira nota:");
        Nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota:");
        Nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota:");
        Nota3 = scanner.nextInt();

        System.out.println("Digite a quarta nota:");
        Nota4 = scanner.nextInt();

        System.out.println("Digite a quinta nota:");
        Nota5 = scanner.nextInt();

        Media = (Nota1 + Nota2 + Nota3 + Nota4 + Nota5) / 5.0;

        System.out.println("=============================");
        System.out.println(" ");

        System.out.println("A media final e:" +Media);
        System.out.println(" ");

        if (Media >= 7){
            System.out.println("O Aluno" +Aluno+ ",Passou!");
        }else{
            System.out.println("O Aluno" +Aluno+ ",Reprovou!");

            scanner.close();
        }

    }
}
