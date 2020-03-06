/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao;

/**
 *
 * @author guilb
 */
public class TesteFuncao {

    /**
     * @param args the command line arguments
     */
    
    static void soma(int a, int b) // METODO, static apenas funcional dentro da classe
    {
        int s = a + b;
        System.out.println("a soma é " + s);
    }
    
    
    static int soma1 (int a, int b) // FUNCAO com retorno
    {
        int s = a+b;
        return s;
    }
    public static void main(String[] args) {
      soma(10,1);
      
      int i = soma1(1,8);
      System.out.println("a soma e " + i);
        
        
    }
    
}
