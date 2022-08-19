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
public class ejer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int[] v = new int[100];
        
        for (int i = 0; i < 100; i++) {
            v[i] = i+1;
        }
        
        for (int i = 99; i > -1; i--) {
            System.out.println(v[i]);
        }
    /*
        Realizar un algoritmo que rellene un vector con los 100 
        primeros números enteros y los
        muestre por pantalla en orden descendente.
    */
    }
    
}
