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
public class ejer_extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String l = leer.nextLine();
        
        switch(l){
            case "a":
                System.out.println("es una vocal");
            break;
            case "e":
                System.out.println("es una vocal");
            break;
            case "i":
                System.out.println("es una vocal");
            break;
            case "o":
                System.out.println("es una vocal");
            break;
            case "u":
                System.out.println("es una vocal");
            break;
            default:
                System.out.println("no es una vocal");
        }
        
        
    }
    
}
