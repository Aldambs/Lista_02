package Lista_02;

import java.util.Scanner;

public class Quest_09 {
    /**
     Construa um programa que leia três números inteiros e imprima um (e apenas um) dos seguintes números:
     1, se todos os números são iguais;
     2, se todos os números são diferentes;
     3, se apenas dois números são iguais.
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.println("Informe o 1° número:");
        n1 = input.nextInt();
        System.out.println("Informe o 2° número:");
        n2 = input.nextInt();
        System.out.println("Informe o 3° número:");
        n3 = input.nextInt();
        
        if(n1 > n2 && n1 > n3){
            System.out.println(n1);
        }else{
            if(n2 > n1 && n2 > n3){
                System.out.println(n2);
            }else{
                System.out.println(n3);
            }
        }
    }
    
}
