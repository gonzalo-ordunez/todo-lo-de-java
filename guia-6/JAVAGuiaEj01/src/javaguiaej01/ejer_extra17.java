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
public class ejer_extra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n = leer.nextInt();
        int i = 2;
        boolean b = false;
        
        while (b == false && i < n){
            b = 0 == n%i;
            i++;
        }
        
        if (b == false) {
            System.out.println("el numero es primo");
        }else {
            System.out.println("el numero no es primo");
        }
        
    }
    
}
