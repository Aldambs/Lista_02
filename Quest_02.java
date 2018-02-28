package Lista_02;

import java.util.Scanner;

public class Quest_02 {
    /**
     * Construa um programa que leia dois valores numéricos e exiba a diferença 
     * do maior valor pelo menor valor.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        byte n1, n2;
        
        System.out.println("Digite o primeiro número:");
        n1 = ler.nextByte();
        System.out.println("Digite o segundo número:");
        n2 = ler.nextByte();
        
        if(n1 > n2){
            int sub = n1 - n2;
            System.out.println("A diferença é:" +sub);
        }else{
            int sub = n2 - n1;
            System.out.println("A diferença é:" +sub);
        }
    }  
}
