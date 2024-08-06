//Cesarino Teodoro Nhabangue Jr LECC11

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Double> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar numero");
            System.out.println("2. Pesquisar numero");
            System.out.println("3. Modificar numero");
            System.out.println("4. Deletar numero");
            System.out.println("5. Inserir número em uma posicao");
            System.out.println("6. Exibir numeros");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opcao: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o numero a ser adicionado: ");
                    double numero = scanner.nextDouble();
                    numeros.add(numero);
                    System.out.println("Numero adicionado com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o numero a ser pesquisado: ");
                    double numeroPesquisado = scanner.nextDouble();
                    if (numeros.contains(numeroPesquisado)) {
                        System.out.println("Numero encontrado na posicao " + numeros.indexOf(numeroPesquisado));
                    } else {
                        System.out.println("Numero nao encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o numero a ser modificado: ");
                    double numeroModificado = scanner.nextDouble();
                    if (numeros.contains(numeroModificado)) {
                        System.out.print("Digite o novo valor: ");
                        double novoValor = scanner.nextDouble();
                        int indice = numeros.indexOf(numeroModificado);
                        numeros.set(indice, novoValor);
                        System.out.println("Numero modificado com sucesso.");
                    } else {
                        System.out.println("Numero nao encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o numero a ser deletado: ");
                    double numeroDeletado = scanner.nextDouble();
                    if (numeros.contains(numeroDeletado)) {
                        numeros.remove(numeroDeletado);
                        System.out.println("Numero deletado com sucesso.");
                    } else {
                        System.out.println("Numero nao encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Digite o numero a ser inserido: ");
                    double numeroInserir = scanner.nextDouble();
                    System.out.print("Digite a posicao de insercao: ");
                    int posicaoInserir = scanner.nextInt();
                    if (posicaoInserir >= 0 && posicaoInserir <= numeros.size()) {
                        numeros.add(posicaoInserir, numeroInserir);
                        System.out.println("Numero inserido com sucesso.");
                    } else {
                        System.out.println("Posicao invalida. A posicao deve estar entre 0 e " + numeros.size());
                    }
                    break;
                case 6:
                    System.out.println("Números na lista:");
                    for (int i = 0; i < numeros.size(); i++) {
                        System.out.println("Posicao " + i + ": " + numeros.get(i));
                    }
                    break;
                case 7:
                    System.out.println("Saindo do programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }
}