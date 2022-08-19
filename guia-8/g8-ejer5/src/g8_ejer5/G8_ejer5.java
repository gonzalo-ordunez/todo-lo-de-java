/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8_ejer5;

import Service.PaisesService;

/**
 *
 * @author alumno
 */
public class G8_ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisesService ps = new PaisesService();
        
        ps.fabricaPaises();
        ps.moslisord();
        System.out.println(ps.eliminarPais());
        ps.moslisord();
    }
    
}
