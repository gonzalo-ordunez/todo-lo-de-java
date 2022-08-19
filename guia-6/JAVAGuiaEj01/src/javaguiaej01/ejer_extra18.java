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
public class ejer_extra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n = 4;
        int m = 0;
        int[] v = new int[n];
        
        for (int i = 0; i < n; i++) {
         v[i] = leer.nextInt();
         m = m + v[i];
        }
        
        System.out.println(m);
    }
    
}
