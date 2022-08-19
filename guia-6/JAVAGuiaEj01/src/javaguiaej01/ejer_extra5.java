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
public class ejer_extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        double n = leer.nextDouble();
        String k = leer.nextLine();
        String l = leer.nextLine();
        int p = 0;
        
        switch(l) {
            case "A":
                n = n - (n * 50)/100;
                p = 50;
            break;
            case "B":
                n = n - (n * 35)/100;
                p = 35;
            break;
        }
        
        System.out.println("su tal es de: "+n);
        System.out.println("los socios tipo: "+l+", tienen un descuento de: "+p+"%");
        
    }
    
}
