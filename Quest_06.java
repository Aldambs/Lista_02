package Lista_02;

import java.util.Scanner;

public class Quest_06 {
    /**
      Escreva um programa que leia a idade de 2 homens e 2 mulheres (considere 
      que a idade entre os homens será sempre diferente, assim como entre as
      mulheres). Calcule e escreva a soma das idades do homem mais velho com a
      mulher mais nova, e o produto das idades do homem mais novo com a mulher
      mais velha
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h1, h2, m1, m2, s, p, a, b, c, d, e, f;
        
        System.out.println("Informe a idade do 1° homem:");
        h1 = input.nextInt();
        System.out.println("Informe a idade do 2° homem:");
        h2 = input.nextInt();
        System.out.println("Informe a idade do 1° mulher:");
        m1 = input.nextInt();
        System.out.println("Informe a idade do 2° mulher:");
        m2 = input.nextInt();
        
        if((h1 > m2) && (h2 < m1)){
            s = h1 + m2;
            System.out.println("A soma do homem mas velho com a mulher mas nova é: " +s);
        }else{
            p = h2 * m1;
            System.out.println("O produto da idade do homem mais novo e da mulher mais velha é: " +p);
        }if((h1 > m2) && (m1 < h2)){
            a = h1 + m1;
            System.out.println("A soma do homem mas velho com a mulher mas nova é: " +a);
        }else{
            b = m2 * h2;
            System.out.println("O produto da idade do homem mais novo e da mulher mais velha é: " +b);
        }if((m2 > h1) && (h2 < m1)){
            c = m2 + h2;
            System.out.println("A soma do homem mas velho com a mulher mas nova é: " +c);
        }else{
            d = h1 * m1;
            System.out.println("O produto da idade do homem mais novo e da mulher mais velha é: " +d);
        }if((m2 > h1) && (m1 < h2)){
             e = m2 + m1;
             System.out.println("A soma do homem mas velho com a mulher mas nova é: " +e);
        }else{
            f = h1 * h2;
            System.out.println("O produto da idade do homem mais novo e da mulher mais velha é: " +f); 
        }
    }
    
}
