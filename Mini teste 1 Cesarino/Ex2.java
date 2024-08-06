import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int andarAtual = 1;
		int andarDesejado;

        System.out.println("Bem-vindo ao elevador do ISUTC!");
        
        while (true) {
            System.out.print("Este e o andar " + andarAtual + ". Para que andar deseja ir (1 a 10) ou 0 para sair: ");
            andarDesejado = scanner.nextInt();

            if (andarDesejado < 0 || andarDesejado > 10) {
                System.out.println("Andar inválido. Por favor, escolha um andar entre 1 e 10 ou 0 para sair.");
                continue;
            }

            if (andarDesejado == 0) {
                System.out.println("Obrigado por usar o elevador do ISUTC!");
                break;
            }

            if (andarDesejado > andarAtual) {
                System.out.println("Subindo para o andar " + andarDesejado + "...");
                andarAtual = andarDesejado;
            } else if (andarDesejado < andarAtual) {
                System.out.println("Descendo para o andar " + andarDesejado + "...");
                andarAtual = andarDesejado;
            } else {
                System.out.println("O seu destino e este.");
            }
        }


    }
}
