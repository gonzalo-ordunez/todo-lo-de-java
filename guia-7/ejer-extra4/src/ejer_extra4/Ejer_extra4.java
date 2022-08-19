/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_extra4;

import Entidad.NIF;
import Service.NIFService;

/**
 *
 * @author alumno
 */
public class Ejer_extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NIFService ns = new NIFService();
        NIF ni = ns.crearNIF();
        
        ns.mostrar(ni);
    }
    
}
