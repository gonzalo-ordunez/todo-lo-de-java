/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_extra3;

import Entidad.Raices;
import Service.RaicesService;

/**
 *
 * @author alumno
 */
public class Ejer_extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    RaicesService rs = new RaicesService();
    Raices ra = rs.crearRaices();
    double n;
    
    n = rs.getDiscriminante(ra);
    rs.obtenerRaices(n);
    rs.obtenerRaiz(n);
    rs.calcular(n);
    
    }
    
}
