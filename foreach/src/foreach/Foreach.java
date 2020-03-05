/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author guilb
 */
public class Foreach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double y[] = {3 , 5, 6, 7, -4.5};
        
        
        //prenchimento de vetor automatico  arrays.fill vetores com mesmo valor.
        
        System.out.println("qual numero deseja procurar");
        Scanner teclado = new Scanner(System.in);
        double i = teclado.nextDouble();
        
        int pos = Arrays.binarySearch(y, i);
        System.out.println("numero encontrado na posicao " + pos);
        
        Arrays.sort(y); //colcoando em ordem
        
        for (double qualquernome: y) // foreach
        {
            System.out.println(qualquernome + " ");
        }

    }
    
}
