/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturaderepeticao;

import java.util.Scanner;

/**
 *
 * @author guilb
 */
public class EstruturadeRepeticao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("quantas cambalhotas você deseja");
        
        Scanner teclado = new Scanner(System.in);
        
        int a = teclado.nextInt();
        int b = 0;
        
        while (b < a)
        {
            b++;
            if (b == 5) continue; //interrompe no 5 e volta pro laço
            // ja o break jogaria pra fora do laço
            System.out.println("while " + b);
            
        }

    }
    
}
