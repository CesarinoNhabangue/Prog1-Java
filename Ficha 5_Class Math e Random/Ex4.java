import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra = "";

        for (int i = 1; i <= 10; i++) {
            palavra += String.valueOf(i);
        }

        System.out.println("A palavra original é: " + palavra);

        palavra = palavra.replaceAll("1", "a");
        palavra = palavra.replaceAll("3", "c");
        palavra = palavra.replaceAll("4", "d");
        palavra = palavra.replaceAll("12", "m");
        palavra = palavra.replaceAll("14", "o");
        palavra = palavra.replaceAll("15", "p");
        palavra = palavra.replaceAll("17", "r");
        palavra = palavra.replaceAll("19", "t");
        palavra = palavra.replaceAll("20", "u");

        System.out.println("A palavra convertida é: " + palavra);
    }
}

