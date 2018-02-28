package Lista_02;

import java.util.Scanner;

public class Quest_01 {
    /**
     * Faça um programa que efetue a leitura de um número inteiro qualquer e
     * verifique se esse número está ou não na faixa de 1 a 10.
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        int n;
        
        System.out.println("Digite um número:");
        n = ler.nextInt();
        
        if((n > 1) & (n < 10)){          
            System.out.println("Esta na faixa!");
        }else{
            System.out.println("Não esta na faixa!");
        }
    }
    
}
