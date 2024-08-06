import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tamanho dos vectores:");
        int n = sc.nextInt();
        int[] vecA= new int[n];
        int[] vecB = new int[n];
        System.out.println("Preencha o primeiro vector: ");
        for(int i=0; i<vecA.length; i++){
            System.out.println("Insira o "+(i+1)+"º termo: ");
            vecA[i]=sc.nextInt();
        }
        System.out.println("Preencha o segundo vector: ");
        for(int j=0; j<vecB.length; j++){
            System.out.println("Insira o "+(j+1)+"º termo: ");
            vecB[j]=sc.nextInt();
        }
        System.out.println("Os vectores inseridos sao: ");
        System.out.println("Primeiro vector:");
        for(int num: vecA){
            System.out.print(num+"; ");
        }
        System.out.println("\nSegundo vector: ");
        for(int v: vecB){
            System.out.print(v+"; ");
        }
        somarVectores(n, vecA, vecB);
    }
    public static int[] somarVectores(int n, int[] a, int[] b){
        int[] soma = new int[n];
        System.out.println("\nOs elementos do vector soma sao: ");
        for(int i=0; i<soma.length; i++){
            soma[i]=a[i]+b[i];
            System.out.print(soma[i]+"; ");
        }
        return soma;
    }
}