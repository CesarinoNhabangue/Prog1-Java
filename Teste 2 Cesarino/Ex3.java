public class Ex3 {
    public static void main(String[] args) {
        int[] sequencia = new int[10];
        sequencia[0] = 3; 

        for (int n = 2; n <= 10; n++) {
            sequencia[n - 1] = sequencia[n - 2] + 2 * n; 
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("U" + (i + 1) + " = " + sequencia[i]);
        }
    }
}