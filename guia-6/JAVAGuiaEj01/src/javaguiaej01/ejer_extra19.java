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
public class ejer_extra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] v = new int[5];
        int[] w = new int[5];
        int n = 0;
        
        for (int i = 0; i < 5; i++) {
            v[i] = 2;
            w[i] = 2;
        }
        
        do {
            if (v[n] != w[n]) {
                break;
            }
            n++;
        } while (n != 5);
        
        if (n == 5) {
            System.out.println("no hay diferencias");
        }else {
            System.out.println("se encontro discrepancias");
        }
    }
    
}
