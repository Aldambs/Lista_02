package Lista_02;

import java.util.Scanner;

public class Quest_05 {
    /**
      Faça um programa que leia a idade de uma pessoa e informe sua classe
      eleitoral: 
       Não eleitor: abaixo de 16 anos; 
       Eleitor obrigatório: maior e igual a 18 ou menor e igual a 65 anos; 
       Eleitor facultativo: entre 16 e 18 anos ou acima dos 65 anos.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id, cl;
        
        System.out.println("Informe a idade da pessoa:");
        id = input.nextInt();
        System.out.println("Informe a classe eleitoral:");
        cl = input.nextInt();
        
        if(id <= 16){
            System.out.println("Não eleitor!");
        }else{
            if((id >= 18) & (id <= 65)){
                System.out.println("Eleitor obrigatório!");
            }else{
                if((id >= 16)& (id <= 18) || (id >= 65)){
                    System.out.println("Eleitol facultativo!");
                }
            }
        }
    }

}
