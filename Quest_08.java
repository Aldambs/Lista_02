package Lista_02;

import java.util.Scanner;

public class Quest_08 {
    /**
     Desenvolva um programa que leia três números inteiros e imprima o valor 
      intermediário (entre o menor e o maior número). Suponha que os números 
      são diferentes.
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
        
        if((n1 > n2) & (n1 > n3) & (n2 > n3)){
            System.out.println("O maior n°: " +n1+ " O menor n°: " +n3);
        }else{
            if((n1 > n2)& (n1 > n3) & (n3 > n2)){
                System.out.println("O maior n°: " +n1+ " O menor n°: " +n2);
            }else{
                if((n2 > n1)& (n2 > n3) & (n1 > n3)){
                    System.out.println("O maior n°: " +n2+ " O menor n°: " +n3);
                }else{
                    if((n2 > n1)& (n2 > n3) & (n3 > n1)){
                        System.out.println("O maior n°: " +n2+ " O menor n°: " +n1);
                    }else{
                        if((n3 > n2)& (n3 > n2) & (n1 > n2)){
                            System.out.println("O maior n°: " +n3+ " O menor n°: " +n2);
                        }else 
                            if((n3 > n1)& (n3 > n2) & (n2 > n1)){
                                System.out.println("O maior n°: " +n3+ " O menor n°: " +n1);
                        }
                    }
                }
            }
        }
    }
    
}
