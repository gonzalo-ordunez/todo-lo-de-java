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
public class ejer_extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n = (int) (Math.random() * 10);
        int m;
        
        do {
            System.out.println("ingrese un numero");
            m = leer.nextInt();
            if (m > n) {
                System.out.println("el numero es mas pequeño");
            }else if (m < n) {
                System.out.println("el numero es mas grande");
            }
        } while (n != m);
        
        System.out.println("bien le diste");
    }
    
}
