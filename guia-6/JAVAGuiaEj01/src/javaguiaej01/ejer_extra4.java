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
public class ejer_extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int n = leer.nextInt();
        String r = "";
        
        if (n > 0 && n < 11) {
            if (n > 8) {
                for (int i = 0; i < Math.abs(10-n); i++) {
                    r = r + "I";
                }
                r = r + "X";
            }else if (n > 5) {
                r = r + "V";
                for (int i = 0; i < Math.abs(5-n); i++) {
                    r = r + "I";
                }
            }else if (n > 3 && n <= 5) {
                for (int i = 0; i < Math.abs(5-n); i++) {
                    r = r + "I";
                }
                r = r + "V";
            }else {
                for (int i = 0; i < n; i++) {
                    r = r + "I";
                }
            }
        }else System.out.println("el numero is so big");
        
        System.out.println(r);
    }
    
}
