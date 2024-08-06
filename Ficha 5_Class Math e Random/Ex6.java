import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double lado, volume;
        int volumeArredondado;
        
        System.out.print("Informe o valor do lado da caixa-d'água em metros: ");
        lado = scanner.nextDouble();
        
        volume = calcularVolume(lado);
        volumeArredondado = (int) Math.floor(volume);
        
        System.out.println("O volume da caixa-d'água é de " + volumeArredondado + " metros cúbicos.");
        
        scanner.close();
    }
    
    public static double calcularVolume(double lado) {
        double volume = Math.pow(lado, 3);
        return volume;
    }
}
