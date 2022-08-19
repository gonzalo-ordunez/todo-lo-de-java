/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4;

import Entidades.Rectangulo;
import Service.RectanguloService;

/**
 *
 * @author alumno
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloService rs = new RectanguloService();
        Rectangulo re = rs.crearRectangulo();
        
        rs.perimetro(re);
        rs.superficie(re);
        rs.dibujo(re);
        
    }
    
}
