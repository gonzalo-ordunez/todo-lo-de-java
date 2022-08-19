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
public class ejer13 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("inrese el tamaño del dado");
        
        int lado = leer.nextInt();
        
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i < lado-2; i++) {
            System.out.print("*");
            for (int j = 0; j < lado-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < lado; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
