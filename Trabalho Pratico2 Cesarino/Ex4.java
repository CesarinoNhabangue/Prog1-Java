import java.util.Scanner;
import java.util.ArrayList;

public class Ex4 {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> lista = new ArrayList<Integer>();
    lista.add(5);
    lista.add(3);
    lista.add(1);
    lista.add(4);
    lista.add(2);

    for (int i = 0; i < lista.size(); i++) {
        for (int j = i + 1; j < lista.size(); j++) {
            if (lista.get(i) > lista.get(j)) {
                int temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }
    }
}