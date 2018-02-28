package Lista_02;

import java.util.Scanner;

public class Quest_15 {
    /**
     * Ambrósio é amigo da vizinhança e resolveu dar descontos para agradar seus 
     * clientes. A mercearia de Ambrósio contém apenas 04 itens, cujos preços 
     * são dados pela tabela abaixo:
     * Código  Preço Unitário
         1      R$ 5,30
         2      R$ 6,00
         3      R$ 3,20
         4      R$ 2,50  
    A regra de desconto é bem simples: se a quantidade de produtos comprados for 
    igual ou maior que quinze, então o desconto é concedido. O desconto também é
    concedido caso o valor total da compra seja maior ou igual a 40 reais.O valor 
    do desconto é de 15%.
    Sua missão é fazer um programa que leia o código do produto, a quantidade 
    comprada e imprima o valor que o cliente deve pagar, já considerando o 
    desconto quando aplicável.Considere que o cliente só pode comprar um único tipo produto por vez.
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int cod, qtd;
        double vp, vp1, vp2, vp3, vp4, vp5, vp6, vp7;
        
        System.out.println("Informe o código:");
        cod = input.nextInt();
        System.out.println("Informe a quantidade:");
        qtd = input.nextInt();
        
        vp = qtd * 5.30;
        vp1 = (vp - (vp * 0.15));
        vp2 = qtd * 6.00;
        vp3 = (vp2 - (vp2 * 0.15));
        vp4 = qtd * 3.20;
        vp5 = (vp4 - (vp4 * 0.15));
        vp6 = qtd * 2.50;
        vp7 = (vp6 - (vp6 * 0.15));
        
        if(cod == 1){ 
            if ((qtd >= 15) || (vp >= 40)){
                System.out.println("O valor a pagar é: " +vp1);
            }else{
                System.out.println("O valor a pagar é: " +vp);
            }  
        }
        
        if(cod == 2){
            if ((qtd >= 15) || (vp2 >= 40)){
                System.out.println("O valor a pagar é: " +vp3);
            }else{
                System.out.println("O valor a pagar é: " +vp2);
            }
        }
        
        if(cod == 3){
            if ((qtd >= 15) || (vp4 >= 40)){
                System.out.println("O valor a pagar é: " +vp5);
            }else{
                System.out.println("O valor a pagar é: " +vp4);
            }
        }
        
        if(cod == 4){
            if ((qtd >= 15) || (vp6 >= 40)){
                System.out.println("O valor a pagar é: " +vp7);
            }else{
                System.out.println("O valor a pagar é: " +vp6);
            }
        }
    }
    
}
