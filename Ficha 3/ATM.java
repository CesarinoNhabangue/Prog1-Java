import java.util.Scanner;

public class ATM {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double valor, saldo;
        int opcao;

        System.out.println("Insira o saldo:");
        saldo = scanner.nextDouble();

        System.out.println("Deseja efectuar que operacao");
        System.out.println("1: consulta");
        System.out.println("2: transferencia");
        System.out.println("3: levantamento");
        System.out.println("4: deposito");
        System.out.println("Opcao:");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Saldo: " + saldo);
                break;
            case 2:
                System.out.println("Para transferir, insira o valor:");
                valor = scanner.nextDouble();
                if (valor <= saldo) {
                    saldo = saldo - valor;
                } else {
                System.out.println("Saldo insuficiente");
                }
                System.out.println("Saldo: " + saldo);
                break;
            case 3:
                System.out.println("Para levantar, insira o valor:");
                valor = scanner.nextDouble();
                if (valor <= saldo) {
                   saldo = saldo - valor;
                } else {
                System.out.println("Saldo insuficiente");
                }
                System.out.println("Saldo: " + saldo);
                break;
            case 4:
                System.out.println("Para deposito, insira o valor:");
                valor = scanner.nextDouble();
                saldo = saldo + valor;
                System.out.println("Saldo: " + saldo);
                break;
            default:
                System.out.println("Opcao invalida");

                scanner.close(); 
        } 
    }
}
