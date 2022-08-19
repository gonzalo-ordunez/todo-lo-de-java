/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaej01;

/**
 *
 * @author alumno
 */
public class ejer18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] n = new int[4][4];
        int[][] m = new int[4][4];
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                n[i][j] = (int) (Math.random() * 10);
            }  
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.print("- ");
            for (int j = 0; j < 4; j++) {
                System.out.print(n[i][j]+" - ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = n[j][i];
            }
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.print("- ");
            for (int j = 0; j < 4; j++) {
                System.out.print(m[i][j]+" - ");
            }
            System.out.println("");
        }
    }
    
}
