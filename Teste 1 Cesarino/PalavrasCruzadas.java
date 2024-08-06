//Cesarino Teodoro Nhabangue Jr


import java.util.Scanner;

public class PalavrasCruzadas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra, c;
        int soma=0;
        System.out.println("Insira uma Palavra: ");
        palavra = scanner.nextLine();
        c = palavra.toUpperCase();
        for(int i=0; i<= c.length()-1; i++){
            if(( c.charAt(i)=='Q') || (c.charAt(i)=='Z')){
                soma+=10;
            }else if((c.charAt(i)=='J') || (c.charAt(i)=='X')){
                soma+=8;
            }else if(c.charAt(i)=='K'){
                soma+=5;
            }else if((c.charAt(i)=='F') || (c.charAt(i)=='H') || (c.charAt(i)=='V') || (c.charAt(i)=='W') || (c.charAt(i)=='Y')){
                soma+=4;
            } else if ((c.charAt(i)=='B') || (c.charAt(i)=='C') || (c.charAt(i)=='M') || (c.charAt(i)=='P')){
                soma+=3;
            }else if ((c.charAt(i)=='D') || (c.charAt(i)=='G')){
                soma+=2;
            }else{
                soma+=1;
            }
        }
        System.out.println("A palava inserida foi: " +palavra);
        System.out.println("A sua pontuaçao e: " +soma);
    }      
}

