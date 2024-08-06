public class Ex13 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = 5;
        System.out.println("Numero de elementos menores que " + num + ": " + conta_menores(array, num));
    }
    
    public static int conta_menores(int[] array, int num) {
        int count = 0;
        for (int i : array) {
            if (i < num) {
                count++;
            }
        }
        return count;
    }
}