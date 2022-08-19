/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10_ejer2;

import Entidades.Lavadora;
import Entidades.Televisor;

/**
 *
 * @author alumno
 */
public class G10_ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        Televisor tele = new Televisor();
        
        lavadora.crearLavadora();
        lavadora.precioFinal();
        
        tele.crearTelevisor();
        tele.precioFinal();
    }
    
}
