/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaej01;

import java.util.Scanner;

public class ejer3 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese su nombre");
        
        String nombre = leer.nextLine();
        
        System.out.println(nombre.toLowerCase());
        
        System.out.println(nombre.toUpperCase());
        
        
    }
}
