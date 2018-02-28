package Lista_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Quest_13 {

    /**
     * A Locadora de Veículos Eudora lançou uma grande promoção esse mês:
     * pagando apenas R$ 90 por diária, o cliente pode alugar um carro de
     * passeio. Para cada diária, o cliente recebe uma cota de quilometragem de
     * 100 Km. Cada quilômetro a mais custará uma taxa extra de R$ 12. Escreva
     * um programa que receba como entrada a quantidade de dias e a
     * quilometragem total rodada por um cliente dessa locadora e exiba o valor
     * total a ser pago com duas casas decimais.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        double totalPagar = 0, pagar = 0;
        System.out.println("Por quantos dias deseja alugar o carro:");
        int dias = ler.nextInt();
        System.out.println("Qual a quilomentragem utilizada:");
        double km = ler.nextDouble();

        if (km == 100) {
            pagar = dias * 90;
            System.out.println(df.format(pagar));
        }else{
            if(km != 100){
                totalPagar = (dias * 90 + ((km - 100) * 12));
                System.out.println(df.format(totalPagar));
            }
        }   
    }
}
