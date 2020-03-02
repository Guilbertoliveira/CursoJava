/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidadade;

/**
 *
 * @author guilb
 */

import java.util.Scanner;

public class ProgramaIdadade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("digite o ano de nascimento");
        Scanner t = new Scanner(System.in);
        int nasc = t.nextInt();
        int i = 2020 - nasc;
        System.out.println("sua idade é: " + i);
        if (i>= 18)
        {
            System.out.println("maior de idade");
        }
        else
        {
            System.out.println("menor de idade");
        }
        
    }
    
}
