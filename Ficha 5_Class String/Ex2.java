public class Ex2 {
    public static void main(String[] args) {
        String texto = "Java";
        int tamanho = texto.length();

        for (int i = 0; i < tamanho * 2 - 1; i++) {
            int limite = i < tamanho ? i + 1 : tamanho * 2 - 1 - i;
            for (int j = 0; j < limite; j++) {
                System.out.print(texto.charAt(j));
            }
            System.out.println();
        }
    }
}
