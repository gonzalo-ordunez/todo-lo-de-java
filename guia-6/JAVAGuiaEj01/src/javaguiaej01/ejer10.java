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
public class ejer10 { 
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int n = leer.nextInt();
        int m = 0;
        
        while(m < n+1){
            System.out.println("ingrese un numero para sumar");
            m = m + leer.nextInt();
        }
        
        /*
            Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
            números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        */
    }
}