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
public class ejer_extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n;
        int m = 0;
        
        n = leer.nextInt();
        
        do {
            n = n / 10;
            m++;
        } while (n != 0);
        
        System.out.println("el numero tiene "+m+" digitos");
    }
    
}
