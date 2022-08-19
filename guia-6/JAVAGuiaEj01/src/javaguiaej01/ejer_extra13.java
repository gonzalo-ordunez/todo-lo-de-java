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
public class ejer_extra13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n;
        
        n = leer.nextInt();
        
        for (int i = 1; i < n+2; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    
}
