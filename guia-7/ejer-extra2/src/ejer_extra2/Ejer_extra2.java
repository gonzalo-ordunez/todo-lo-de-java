/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_extra2;

import Entidad.Puntos;
import Service.PuntosService;

/**
 *
 * @author alumno
 */
public class Ejer_extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PuntosService ps = new PuntosService();
        Puntos pu = ps.crearPuntos();
        System.out.print("  ");
        for (int i = -10; i < 11; i++) {
            if (i < 0) {
                System.out.print(i); 
            }else {
                System.out.print(" "+i);
            }
        }
        System.out.println("");
        for (int i = -10; i < 11; i++) {
            if (i < 0 && i > -10) {
                System.out.print(" "+i);   
            }else if (i >= 0 && i < 10) {
                System.out.print("  "+i);
            }else if(i == 10) {
                System.out.print(" "+i);
            }else {
                System.out.print(i);
            }
            for (int j = -10; j < 11; j++) {
                if (j != 0 && i != 0) {
                    System.out.print(" +");   
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println(ps.distancia(pu));
        
    }
    
}
