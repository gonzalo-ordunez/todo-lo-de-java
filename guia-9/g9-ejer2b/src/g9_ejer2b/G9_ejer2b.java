/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g9_ejer2b;

import Entidades.Juego;

/**
 *
 * @author alumno
 */
public class G9_ejer2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego ruleta = new Juego();
        ruleta.prepararJuego();
        ruleta.ronda();
    }
    
}
