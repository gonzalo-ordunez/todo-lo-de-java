/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer_extra6;

import Entidad.Ahorcado;
import Service.AhorcadoService;

/**
 *
 * @author alumno
 */
public class Ejer_extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoService as = new AhorcadoService();
        Ahorcado ah = as.crearAhorcado();
        as.juego(ah);
    }
    
}
