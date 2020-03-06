/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

import static java.lang.Math.pow;

/**
 *
 * @author guilb
 */
public class TesteFuncao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("vai começar a contagem");
        System.out.println(Operacoes.contador(1,10));
        System.out.println(Operacoes.contador1(2,3));
        
        
        int x, y;
double z;

x = 5;
y = 2;
z = x / y;
System.out.print(pow(8,2));

int v0 = 3;
int v1 = v0++;
int v2 = ++v1;
v1 += v0;
v2 += --v1;

        System.out.println("aa"
                + "");
        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);
    }
    
}




