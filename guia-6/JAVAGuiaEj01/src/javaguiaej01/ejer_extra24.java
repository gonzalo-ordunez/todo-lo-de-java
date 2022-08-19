/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaej01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejer_extra24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n,m,aux,l,k;
        
        m = leer.nextInt();
        
        int[] v = new int[m*2];
        k = 0;
        l = 0;
        aux = 1;
        
        for (int i = 0; i < m; i++) {
            aux = aux + l;
            l = aux + l;
            
            v[k] = aux;
            v[k+1] = l;
            k = k + 2;
        }
        
        for (int i = 0; i < m; i++) {
            System.out.println(v[i]);
        }
    }
    
}
