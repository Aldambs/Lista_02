package Lista_02;

import java.util.Scanner;

public class Quest_10 {
    /**
     * Devido à proximidade com o Dia do Trabalho, uma empresa resolveu conceder 
     * aumentos salariais a seus funcionários. Aqueles com salário superior a 
     * R$ 500, terão aumento de 10%, enquanto os que ganham mais de R$ 300 terão 
     * aumento de 7%. Os demais funcionários terão aumento de apenas 5%. Escreva
     * um programa que receba como entrada o salário atual de um funcionário, 
     * calcule e exiba o valor de seu novo salário já com o aumento concedido.
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        double sal_atual, sal_novo;
        
        System.out.println("Digite o salário atual:");
        sal_atual = input.nextDouble();
        
        if(sal_atual >= 500){
            sal_novo = sal_atual + (sal_atual * 0.10);
            System.out.println("Novo salário: " +sal_novo);
        }else 
            if(sal_atual > 300){
                sal_novo = sal_atual + (sal_atual * 0.07);
                System.out.println("Novo salário: " +sal_novo);
            }else{
                sal_novo = sal_atual + (sal_atual * 0.05);
                System.out.println("Novo salário: " +sal_novo);
            }
    }
    
}
