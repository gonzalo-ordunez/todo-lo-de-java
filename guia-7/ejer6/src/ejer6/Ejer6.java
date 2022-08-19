/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer6;

import Entidades.Cafetera;
import Service.CafeteraService;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CafeteraService cs = new CafeteraService();
        Cafetera ca = cs.llenarCafetera();
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        
        
        for (int i = 0; i < 7; i++) {
            System.out.println("--------------------------");
            System.out.println("que desea hacer");
            System.out.println("--------------------------");
            System.out.println("1-servir cafe");
            System.out.println("2-llenar cafetera");
            System.out.println("3-vasiar cafetera");
            System.out.println("4-agregar cafe");
            System.out.println("--------------------------");
            switch (lr.nextInt()) {
                case 1:
                    System.out.println("el tamaño de la taza");
                    cs.servirCafetera(lr.nextInt());
                    break;
                case 2:
                    cs.llenarCafetera();
                    break;
                case 3:
                    cs.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("cuanto va a agregar");
                    cs.agrearCafe(lr.nextInt());
                    break;
                default:
                    System.out.println("no es una opcion valida");
            }
            cs.m();
        }
        
        
    }
    
}
