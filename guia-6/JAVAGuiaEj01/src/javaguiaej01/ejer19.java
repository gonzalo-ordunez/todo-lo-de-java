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
public class ejer19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
          
        int[][] v = new int[3][3];
        int[][] w = new int[3][3];
        int p = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                v[i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    if (v[i][j] != (v[j][i] * -1)) {
                        p = 1;
                    }
                }
            }
        }
        
        if (p == 0) {
            System.out.println("es anti simétrica.");
        }else   System.out.println("no es anti simétrica.");
    }
    
}
