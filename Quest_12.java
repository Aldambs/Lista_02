package Lista_02;

import java.util.Scanner;

public class Quest_12 {
    /**
     * A sorveteria Tropical oferece uma diversidade de sabores e os preços são
     * os seguintes: 
     * Sabor             Preço por bola 
     * Morango/Cereja       R$ 4,50
     * Damasco/Siriguela    R$ 3,80
     * Outro sabores        R$ 2,75 
      Caso o cliente consuma mais de duas bolas, ele tem direito a uma calda de 
      caramelo. 
      Sabendo disso, escreva um programa que receba como entrada o sabor e a
      quantidade de bolas desejada por um cliente, e exiba o valor total a ser 
      pago e uma mensagem informando se o sorvete terá calda ou não.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o sabor desejados:");
        String sabor = input.nextLine();
        System.out.println("Digite a quantidade de bolas de sorverte:");
        double qtd = input.nextInt();
        double M_C, D_S, O;

        if (sabor.equalsIgnoreCase("M") || sabor.equalsIgnoreCase("C")) {
            M_C = qtd * 4.50;
            if (qtd > 2){
                System.out.println("O valor a ser pago é: " +M_C);
                System.out.println("COM CALDA DE CARAMELO!!");
            }else{
                System.out.println("O valor a ser pago é: " +M_C);
                System.out.println("SEM CALDA DE CARAMELO!!");
            }
        }
        if (sabor.equalsIgnoreCase("D") || sabor.equalsIgnoreCase("S")) {
            D_S = qtd * 3.80;
            if((qtd > 2)){
                System.out.println("O valor a ser pago é: " +D_S);
                System.out.println("COM CALDA DE CARAMELO!!");
            }else{
                System.out.println("O valor a ser pago é: " +D_S);
                System.out.println("SEM CALDA DE CARAMELO!");
            }
        }               
        if (sabor.equalsIgnoreCase("O")) {
            O = qtd * 2.75;
            if((qtd > 2)){
                System.out.println("O valor a ser pago é: " +O);
                System.out.println("COM CALDA DE CARAMELO!!");
            }else{
                System.out.println("O valor a ser pago é: " +O);
                System.out.println("SEM CALDA DE CARAMELO!!");
            }
        }
    }
}