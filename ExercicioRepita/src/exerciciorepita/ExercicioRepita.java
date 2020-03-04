/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author guilb
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, s = 0;
       // JOptionPane.showMessageDialog(null, "ola mundo", "boas vindas", JOptionPane.INFORMATION_MESSAGE);
       do
       {
                  i = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>informe um numero :  <br><em>(valor 0 interrompe)</html>"));
                  s += i;
       } while(i != 0);
       JOptionPane.showMessageDialog(null, "resultado final " +  s);
    }
    
}
