import java.util.Random;

public class Simulacao{
    public static void main (String[]args){
        Random random = new Random();
        int resultado;

        System.out.println("Simulacao de jogada de um dado de seis lados dez vezes:");
        for(int i = 1; i <= 10; i++){
            resultado = random.nextInt(6) + 1;
            System.out.println("Jogada" +i+ ":" +resultado);
        }
    }
}