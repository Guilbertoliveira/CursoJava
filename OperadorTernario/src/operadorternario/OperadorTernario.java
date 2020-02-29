/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author guilb
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 3;
        
        
        int maior = n1>n2?n1-3:n2;
        System.out.println(maior);
        
        String nome1 = "guil";
        String nome2 = "guil";
        String nome3 = new String("guil");
        
        String resul = nome1 == nome3?"é igual":"é diferente";
        String resul2 = (nome1.equals(nome3)?"igual":"diferente");
        
        System.out.println(resul);
        System.out.println(resul2);
        
    }
    
}
