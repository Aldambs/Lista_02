package Lista_02;

import java.util.Scanner;

public class Quest_11 {
    /**
     * A companhia aérea oferece passagens baratas para várias cidades 
     * européias e é muito procurada por turistas de todo o mundo. Entretanto, 
     * ela tem regras muito rígidas para o tamanho da bagagem de mão de cada 
     * cliente: para ser aceita, a mala deve ter no máximo 45 cm de largura,
     * 56 cm de comprimento e 25 cm de altura. Escreva um programa que receba 
     * como entrada as dimensões de uma mala e exiba uma mensagem informando se
     * a mala será aceita ou não.
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int l, c, a;
  
        System.out.println("Informe a dimensões da mala:");
        l = input.nextInt();
        c = input.nextInt();
        a = input.nextInt();
        
        if((l <= 45) && (c <= 56) && (a <= 25)){
            System.out.println("Aceita!");
        }else{
            System.out.println("Não aceita!");
        }
    }
}