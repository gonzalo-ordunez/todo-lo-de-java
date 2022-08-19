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
public class ejer_extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int alt;
        double c = 0;
        int p = 0;
        double to = 0;
        
        for (int i = 0; i < 5; i++) {
            alt = leer.nextInt();
            to = to + alt;
            if (alt <= 160) {
                c++;
            }
            p++;
        }
        
        System.out.println("el promedio de personas que miden 1.60 metros es: "+(c/p));
        System.out.println("la altura promedio es de:"+((to/p)*0.01)+" metros");
    }
    
}
