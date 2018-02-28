package Lista_02;

import java.util.Scanner;

public class Quest_03 {
    /**
     * Construa um algoritmo que recebe como entrada a altura e sexo de uma
     * pessoa e calcula seu peso ideal. Use as seguintes fórmulas:  Para
     * homens: (72,7*altura) – 58  Para mulheres: (62,1*altura) – 44,7
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        char sexo;
        double alt, peso;

        System.out.println("Informe o sexo (H/F): ");
        sexo = ler.next().charAt(0);

        System.out.println("Informe a altura: ");
        alt = ler.nextDouble();

        if (sexo == 'H'){
            peso = (72.7 * alt) - 58;
            System.out.println("O peso ideal é: " +peso);
        } else 
            if (sexo == 'F') {
                peso = (62.1 * alt) - 44.7;
                System.out.println("O peso ideal é: " +peso);
            }else{
                System.out.println("Sexo inválido!");
        }
    }
}