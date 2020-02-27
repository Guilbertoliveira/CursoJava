/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author guilb
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        
              
        System.out.println("nome do aluno");
        Scanner teclado = new Scanner(System.in);
        String nome =  teclado.nextLine(); // ler tipo string
        System.out.println("digite a nota do aluno");
        float nota = teclado.nextFloat(); // tipo float
        System.out.printf("a nota do %s é %.4f \n", nome, nota);
        nota = 2.5f;
        System.out.format("a nota do %s é %.4f \n", nome, nota);
    }
    
}
