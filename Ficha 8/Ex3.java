import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float x, y, z;

        System.out.println("Insira 3 valores para que o programa determine o m,aior entre eles");

        System.out.println("X=");
        x = scanner.nextFloat();

        System.out.println("Y=");
        y = scanner.nextFloat();

        System.out.println("Z=");
        z = scanner.nextFloat();

        System.out.println("O maior e:" +Maior(x,y,z));
    }

    public static float Maior(float x, float y,float z ){
        if (x > y && x > z){
            return x;
        }
        else if (y > x && y > z){
            return y;
        }
        else{
            return z;
        }
    }
}
