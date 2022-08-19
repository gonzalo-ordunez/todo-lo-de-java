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
public class ejer_extra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = 9;
        int m = 4;
        int p = 0;
        
        int[][] v = new int[n][m];
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                v[i][j] = (int) (Math.random() * 21);
            }
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                p = p + v[i][j];
            }
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(v[i][j]+"-");
            }
            System.out.println("");
        }
        
        System.out.println(p);
    }
    
}
