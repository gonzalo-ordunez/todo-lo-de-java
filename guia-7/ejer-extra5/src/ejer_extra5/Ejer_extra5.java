/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_extra5;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejer_extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        String[] meses = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        String secreto = meses[5],s;
        
        System.out.println("intente adivinar el mes secreto");
        s = lr.next();
        
        while (!s.equals(secreto)) {
            System.out.println("intentelo otra ves");
            s = lr.next();
        }
        
        System.out.println("correcto");
    }
    
}
