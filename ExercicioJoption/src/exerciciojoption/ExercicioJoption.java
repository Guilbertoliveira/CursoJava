/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciojoption;

import javax.swing.JOptionPane;

/**
 *
 * @author guilb
 */
public class ExercicioJoption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int dig = 0;
        int par = -1;
        int impar = 0;
        int maiorcem = 0;
        int media = 0;
        float media2 = 0;
        int valor =0;
        
        do 
        {
            dig = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero"));
            valor++;
            if(dig % 2 == 0)par++;
            else impar++;
            if (dig > 100) maiorcem++;
            media = media + dig;
            System.out.println(dig);
            
        } while (dig != 0);
        
        media2 = media/(valor-1);
        JOptionPane.showMessageDialog(null, "<html> Resultado: <br> Total de Valores: " + (valor-1) + "<br>Total de Pares: " +par+ "<br>Total de ímpares: " +impar+ "<br>Acima de 100: " + maiorcem+ "<br>Média dos valores: " + media2);
    }
    
}
