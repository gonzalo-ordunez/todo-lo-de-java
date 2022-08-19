/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver_de_agua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JuegoService {
    Scanner lr;
    JugadorService jus;
    
    public JuegoService() {
    }
    
    public JuegoService(Scanner lr) {
        this.lr = new Scanner(System.in).useDelimiter("\n");
        this.jus = new JugadorService();
    }
    
    public Juego llenarJuego(ArrayList<Jugador>jugadores, Revolver_de_agua r) {
        Juego juego = new Juego(jugadores,r);
        return juego;
    }
    
    public void ronda(Juego juego) {
        Boolean mojado = false;
        Revolver_de_agua r = juego.getR();
        do {
            for (Jugador aux : juego.getJugadores()) {
                if (jus.disparo(r)) {
                    aux.setMojado(true);
                    mojado = true;
                }
            }
        } while (mojado != true);
        
        juego.getJugadores().stream().filter((aux) -> (aux.getMojado())).forEachOrdered((aux) -> {
            if (aux.getMojado()) {
                System.out.println("el "+aux.getNombre()+"esta mojado");
            }
        });
    }
}
//ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.