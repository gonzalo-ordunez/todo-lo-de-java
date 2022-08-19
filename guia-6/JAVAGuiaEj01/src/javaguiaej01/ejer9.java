/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaej01;

import java.util.Scanner;

public class ejer9 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
     
        String p = leer.nextLine();
        p = p.substring(0,1);
        
        if (p.equalsIgnoreCase("a")) {
            System.out.println("correcto");
        }else System.out.println("incorrecto");
        
        /*
        Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
        es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
        diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
        la función Substring y equals() de Java.
        */
    }
}