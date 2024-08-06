//Cesarino Teodoro Nhabangue Jr LECC11

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou a vitima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vitima?");
        perguntas.add("Devia para vitima?");
        perguntas.add("Ja trabalhou com a vitima?");

        int numeroDeRespostasPositivas = 0;

        for (int i = 0; i < perguntas.size(); i++) {

            System.out.println(perguntas.get(i));

            String resposta = scanner.nextLine();

            if (resposta.equals("sim")) {
                numeroDeRespostasPositivas++;
            }
        }

        String classificacao;

        switch (numeroDeRespostasPositivas) {
            case 2:
                classificacao = "suspeita";
                break;
            case 3:
            case 4:
                classificacao = "cumplice";
                break;
            case 5:
                classificacao = "assassino";
                break;
            default:
                classificacao = "inocente";
                break;
        }
        System.out.println("Classificacao: " + classificacao);
    }
}    
