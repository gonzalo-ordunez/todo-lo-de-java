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
public class ejer5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        double n = leer.nextDouble();
        
        System.out.println("el doble " + n*2);
        
        System.out.println("el triple " + n*3);
        
        System.out.println("la raiz cuadrada " + Math.sqrt(n));
        /*
            Escribir un programa que lea un número entero por teclado y 
            muestre por pantalla el doble, el triple y la raíz cuadrada 
            de ese número. Nota: investigar la función Math.sqrt()
        */
        
    }
    
}
