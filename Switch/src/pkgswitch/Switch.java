/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author guilb
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("escolha quantas pernas o animal tem");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        
        switch(num)
        {
            case 1:
                System.out.println("saci");
                break;
            case 2:
                System.out.println("bipede");
                break;
            case 3:
                System.out.println("TRIPE");
                break;
            case 4:
                System.out.println("Quadrúpede");
                break;
            case 5:
                System.out.println("Aranha");
                 break;
            default:
                System.out.println("alienigenaa");
            
        }
       
            
        
    }
    
}
