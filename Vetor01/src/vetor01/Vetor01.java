/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

/**
 *
 * @author guilb
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int n[] = {3,2,5,47,9,6};
        System.out.println("total de casas de N " + n.length);
        
        for(int c = 0; c <= n.length-1; c++)
        {
               System.out.println(n[c]);
        }

    }
    
}
