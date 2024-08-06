public class Ex7 {
    public static void main(String[] args) {
        double numero1 = 900.0;
        double numero2 = 30.25;
        
        double raizQuadrada1 = calcularRaizQuadrada(numero1);
        double raizQuadrada2 = calcularRaizQuadrada(numero2);
        
        System.out.println("A raiz quadrada de " + numero1 + " é: " + raizQuadrada1);
        System.out.println("A raiz quadrada de " + numero2 + " é: " + raizQuadrada2);
    }
    
    public static double calcularRaizQuadrada(double numero) {
        return Math.sqrt(numero);
    }
}
