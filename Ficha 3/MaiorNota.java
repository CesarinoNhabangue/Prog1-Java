import java.util.Scanner;

public class MaiorNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        double maiorNota;
        String posicao;
        
        if (nota1 >= nota2 && nota1 >= nota3) {
            maiorNota = nota1;
            posicao = "primeira";
        } else if (nota2 >= nota1 && nota2 >= nota3) {
            maiorNota = nota2;
            posicao = "segunda";
        } else {
            maiorNota = nota3;
            posicao = "terceira";
        }
        
        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("Ela está na " + posicao + " posiçao.");
    }
}
