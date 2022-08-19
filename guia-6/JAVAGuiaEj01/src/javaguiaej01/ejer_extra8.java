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
public class ejer_extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        double n;
        int pares = 0;
        int impares = 0;
        
        do {
            n = leer.nextDouble();
            if (n > 0) {
                if (0 == n % 2) {
                    pares++;
                }else {
                    impares++;
                }
            }
        } while (0 != n % 5);
        
        System.out.println("hay "+pares+" numeros pares");
        System.out.println("hay "+impares+" numeros impares");
    }
    
}
