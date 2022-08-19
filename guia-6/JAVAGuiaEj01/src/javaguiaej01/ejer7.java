/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaej01;

import java.util.Scanner;

public class ejer7 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        String p = leer.nextLine();
        
        if (p.equals("eureka")) {
            System.out.println("correcto");
        }else System.out.println("incorrecto");
            
        /*
            Crear un programa que pida una frase y si esa frase es igual
            a “eureka” el programa pondrá un mensaje de Correcto, 
            sino mostrará un mensaje de Incorrecto. Nota: investigar
            la función equals() en Java.
        */
    }
}
