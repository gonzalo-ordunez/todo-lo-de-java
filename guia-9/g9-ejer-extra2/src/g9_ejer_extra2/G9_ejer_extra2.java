/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g9_ejer_extra2;

import Entidades.Sala;

/**
 *
 * @author alumno
 */
public class G9_ejer_extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sala s = new Sala();
        
        for (int i = 0; i < 3; i++) {
            s.crearSala(20);
            s.mostrarSala();
        }
    }
}
