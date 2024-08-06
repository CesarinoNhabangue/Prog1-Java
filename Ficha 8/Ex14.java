import java.util.Arrays;

public class Ex14 {

    public static int[] junta_ordenados(int[] array1, int[] array2) {
        int[] array_resultado = new int[array1.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                array_resultado[k] = array1[i];
                i++;
            } else {
                array_resultado[k] = array2[j];
                j++;
            }
            k++;
        }
        while (i < array1.length) {
            array_resultado[k] = array1[i];
            i++;
            k++;
        }
        while (j < array2.length) {
            array_resultado[k] = array2[j];
            j++;
            k++;
        }
        return Arrays.copyOf(array_resultado, k);
    }
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};

        int[] array_resultado = junta_ordenados(array1, array2);

        System.out.println("Array resultado:");
        for (int i = 0; i < array_resultado.length; i++) {
            System.out.print(array_resultado[i] + " ");
        }
    }
}
