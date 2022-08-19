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
public class ejer20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] v = new int[3][3];
        int[] w = new int[7];
        int m = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                v[i][j] = 2;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 if (i == j) {
                    w[6] = w[6] + v[i][j];
                }
                w[m] = w[m] + v[i][j];
                w[m+3] = w[m+3] + v[j][i];
            }
            m++;
        }
        
        m = 0;
        
        for (int i = 0; i < 7; i++) {
            System.out.println(w[i]);
            if (w[0] != w[i]) {
                m = 1;
            }
        }
        
        if (m == 1) {
            System.out.println("no es magico");
        }else System.out.println("es magico");
    }
    
}
