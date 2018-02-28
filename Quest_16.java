package Lista_02;

import java.util.Scanner;

public class Quest_16 {
    /**
     * Nos parques de diversão, alguns brinquedos têm idade e altura mínimas para 
     * poder andar neles. O parque Ambrolândia possui três brinquedos que possuem 
     * essa limitação:
      Barca Viking: 1,5m de altura e 12 anos.
      ElevatorofDeath: 1,4m de altura e 14 anos.
      Final Killer: 1,7m de altura ou 16 anos.
     Dada a altura e a idade de uma pessoa, faça um programa que identifique 
     quantos brinquedos ele pode andar.
     */
    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in);
        
        System.out.println("Informe a idade da pessoa:");
        int id = input.nextInt();
        System.out.println("Informe a altura da pessoa:");
        float alt = input.nextFloat();
        
        if(id >= 12 && alt >= 1.5){
            System.out.println("Só andará em um brinquedo!");
        }else{
            if(id >= 14 && alt >= 1.4){
                System.out.println("Só andará em dois brinquedos!");
            }else{
                if(id >= 16 || alt >= 1.7){
                    System.out.println("Andará nos três brinquedos!");
                }
            }
        }
    }   
}
