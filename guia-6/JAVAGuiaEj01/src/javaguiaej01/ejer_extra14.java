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
public class ejer_extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int f;
        int h;
        int a = 0;
        int t = 0;
        
        
        System.out.println("cuantas familias");
        f = leer.nextInt();
        
        for (int i = 0; i < f; i++) {
            System.out.println("cuantos hijos");
            h = leer.nextInt();
            for (int j = 0; j < h; j++) {
                a++;
                t = t + (int) (Math.random() * 40);
            }
        }
        
        System.out.println("el promedio de edad es: "+(t/a));
    }
    
}
