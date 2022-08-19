/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaej01;

/**
 *
 * @author alumno
 */

import java.util.Scanner;

public class JAVAGuiaEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String[] equipo = new String[6];
        
        for (int i = 0; i < 6; i++) {
            equipo[i] = leer.nextLine();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(equipo[i]);
        }
    }
    /* Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de 
       compañeros de equipo y define su tipo de dato de tal manera que te
       permita alojar sus nombres más adelante.
    */

}
