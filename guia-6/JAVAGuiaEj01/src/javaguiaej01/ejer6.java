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
public class ejer6 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        int n = leer.nextInt();
        
        if (2 % n == 0) {
            System.out.println("es par");
        }else {
            System.out.println("es impar");
        }
    /*
       Crear un programa que dado un numero determine si es par o impar
    */
    }
}
