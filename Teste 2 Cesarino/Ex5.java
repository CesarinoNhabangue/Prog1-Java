import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        LeerArray(list);
        String longestString = LongString(list);
        System.out.println("A string mais longa e: " + longestString);
    }

    public static void LeerArray(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira strings (digite END para terminar):");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }
            list.add(input);
        }
    }

    public static String LongString(ArrayList<String> list) {
        String longestString = "";
        for (String str : list) {
            if (str.length() > longestString.length()) {
                longestString = str;
            }
        }
        return longestString;
    }
}