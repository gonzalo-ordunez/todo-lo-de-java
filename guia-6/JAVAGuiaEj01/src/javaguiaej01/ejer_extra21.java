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
public class ejer_extra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[][] v = new double[5][10];
        int a = 0;
        int d = 0;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                v[i][j] = 1 + (int) (Math.random() * 10);
            }
        }
        
        for (int i = 0; i < 10; i++) {
            v[4][i] = (v[0][i]*10/100) + (v[1][i]*15/100) + (v[2][i]*25/100) + (v[3][i]*50/100);
        }
        
        for (int i = 0; i < 10; i++) {
            if (v[4][i] < 7) {
                d++;
            }else {
                a++;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(v[i][j]+"-");
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println("aprobados "+a);
        System.out.println("desaprobados "+d);
    }
    
}
