package Lista_02;

import java.util.Scanner;

public class Quest_14 {
    /**
     * Luana é uma funcionária dedicada e seu chefe prometeu-lhe um bônus
     * especial de 75% de seu salário no fim do ano. Ela decidiu usar o dinheiro
     * para fazer uma viagem, mas a escolha do destino dependerá do valor do
     * bônus. Caso ela receba menos de R$ 2000, ela irá conhecer a Argentina. Já
     * se o bônus for entre R$ 2000 e R$ 3000, ela irá para a Espanha. Se o
     * bônus ganho for maior que R$ 3000, ela realizará o sonho de conhecer a
     * Alemanha. Escreva um programa que receba como entrada o salário de Luana
     * e exiba o nome do país que ela irá conhecer.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o salário de Luana:");
        double sal = input.nextDouble();

        int bonus = (int) (sal + (sal % 75));
        System.out.println("O valor do bônus é: " + bonus);

        if (bonus < 2000) {
            System.out.println("Ela irá para a Argentina");
        } else {
            
            if (bonus > 2000 && bonus < 3000) {
                System.out.println("Ela irá para a Espanha");
            } else {
                
                if (bonus > 3000) {
                    System.out.println("Ela irá para a Alemanha");
                }
            }
        }

    }

}
