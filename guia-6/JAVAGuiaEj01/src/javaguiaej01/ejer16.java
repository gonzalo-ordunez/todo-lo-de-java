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
public class ejer16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int[] v = new int[40];
        
        for (int i = 0; i < 10; i++) {
            v[i] = (int) (Math.random() * 100);
        }
        
        int n = leer.nextInt();
        
        for (int i = 0; i < 40; i++) {
            if (v[i] == n) {
                System.out.println("El numero " + n + " esta repetido en la posicion " + i);
            }
        }
        /*
        Realizar un algoritmo que rellene un vector de tamaño N 
        con valores aleatorios y le pida al usuario un numero 
        a buscar en el vector. El programa mostrará donde se 
        encuentra el numero y si se encuentra repetido
        */
    }
    
}
