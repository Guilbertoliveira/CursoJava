
package estruturacondicional;

import java.util.Scanner;

public class EstruturaCondicional {

    
    public static void main(String[] args) {
       
        
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("digite o ano de nascimento");
        int a1 = teclado.nextInt();
        
        int idade = 2020 - a1;
        System.out.println("a idade é " + idade);
        
        if(idade <16)
        {
            System.out.println("não pode votar");
        }
        else
        {
            if(idade <= 17 || idade >= 70)
            {
                System.out.println("o voto é opcional");
            }
            else
            {
                System.out.println("voto é obrigatorio");
            }
        }
        
        
        
    }
    
}
