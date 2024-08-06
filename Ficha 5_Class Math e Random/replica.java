import java.util.Scanner;
import java.util.Random;
public class replica {
    public static void main(String[]args){
        Random x=new Random();
        Scanner data=new Scanner(System.in);
        double numero_digitado, formula;
        System.out.print('digite um numero:');
        numero_digitado=data.nextDouble();

        formula=Math.random()*numero_digitado;
    }
    
}
