package Lista_02;

import java.util.Scanner;

public class Quest_07 {
    /**
     Uma livraria está fazendo uma promoção para pagamento à vista em que o 
     comprador pode escolher entre dois critérios de desconto:
      Critério A: R$ 0,25 por livro + R$ 7,50 fixo
      Critério B: R$ 0,50 por livro + R$ 2,50 fixo
     Faça um programa em que o usuário digite a quantidade de livros que deseja 
     comprar e o programa diga qual é a melhor opção de desconto. Exemplos:
     * Supondo que fossem comprados 10 livros:
      Pelo critério A, ficaria: (0,25*10)+7,50 = 10,00
      Pelo critério B, ficaria: (0,50*10)+2,50 = 7,50
      Logo, o melhor critério de desconto, neste caso, é o critério A.
     * Supondo que fossem comprados 100 livros:
      Pelo critério A, ficaria: (0,25*100)+7,50 = 32,50
      Pelo critério B, ficaria: (0,50*100)+2,50 = 52,50
      Logo, o melhor critério de desconto, neste caso, é o critério B.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtd;
        float descA, descB;
        
        System.out.println("Digite a quantidade desejada:");
        qtd = ler.nextInt();
        
        descA = (float) ((0.25 * qtd) + 7.50);
        descB = (float) ((0.50 * qtd) + 2.50);
        
        if(descA < descB){
            System.out.println("O melhor critério é A: " +descA);
        }else{
            if(descB < descA){
                System.out.println("O melhor critério é B: " +descB);
            }
        }
        
    }
    
}
