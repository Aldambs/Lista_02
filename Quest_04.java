package Lista_02;

import java.util.Scanner;

public class Quest_04 {

    /**
     * Helena é dona de uma pequena cantina que fornece refeições para os
     * universitários. No cardápio de hoje, eles podem escolher entre lasanha
     * (R$ 8,00) ou estrogonofe (R$ 11,00) para comer, e entre refrigerante (R$
     * 3,00) ou suco (R$ 2,50) para beber. Escreva um programa que receba como
     * entrada as escolhas de um cliente e exiba o valor total a ser pago.
     */
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        char esc;
        double total, L, E, R, S, A, B, C, D;

        L = 8.00;
        E = 11.00;
        R = 3.00;
        S = 2.50;

        System.out.println("Informe o pedido do cliente (L/E/R/S):");
        esc = (char) ler.next().charAt(0);

        if (esc == 'L'){
            A = L + S;
            System.out.println("Lasanha e Suco:\n" +L+ " + " +S+ " = " +A);
            
        } else 
            
            if(esc == 'E'){
                B = E + R;
                System.out.println("Estrogonofe e Refrigerante:\n" +E+ " + " +R+ " = " +B);

            }else  
                
                if(esc == 'R'){
                    C = L + R;
                    System.out.println("Lasanha e Refrigerante:\n" +L+ " + " +R+ " = " +C);
                    
                } else 
                    
                    if(esc == 'S'){
                        D = E + S;
                        System.out.println("Estrogonofe e Suco:\n" +E+ " + " +S+ " = " +D);

        
        }
    }
}
