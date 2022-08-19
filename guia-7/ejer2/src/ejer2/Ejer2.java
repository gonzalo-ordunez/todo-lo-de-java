/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2;

import Entidades.Circunferencia;
import Servicios.crearCircunferencia;

/**
 *
 * @author alumno
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        crearCircunferencia cs = new crearCircunferencia();
        Circunferencia c1 = cs.crea();
        
        cs.area(c1);
        
        cs.perimetro(c1);
        
    }
    
}
