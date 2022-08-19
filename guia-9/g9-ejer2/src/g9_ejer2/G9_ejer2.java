/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g9_ejer2;

import Entidades.Juego;
import Service.JuegoService;
import Service.JugadorService;
import Service.RevolverService;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class G9_ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        JuegoService js = new JuegoService();
        RevolverService rs = new RevolverService();
        JugadorService jus = new JugadorService();
        
        
        Juego juego = js.llenarJuego(jus.creaLista(lr.nextInt()), rs.llenarRevolver());
        js.ronda(juego);
        
    }
    
}
