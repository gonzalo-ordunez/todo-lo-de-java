/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Jugador;
import Entidades.Revolver_de_agua;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class JugadorService {
    Scanner lr;
    RevolverService rs;

    public JugadorService() {
    }
    
    public JugadorService(Scanner lr, RevolverService rs) {
        this.lr = new Scanner(System.in).useDelimiter("\n");
        this.rs = new RevolverService();
    }
    
    private Jugador creaJugador(int nu,String ne) {
        Jugador jugador = new Jugador(nu,"jugador "+ne,false);
        
        return jugador;
    }
    
    public ArrayList<Jugador> creaLista(int numero) {
        ArrayList<Jugador> lista = new ArrayList<>();
        
        for (int i = 0; i < numero; i++) {
            lista.add(creaJugador((i+1),String.valueOf((i+1))));
        }
        
        return lista;
    }
    
    public Boolean disparo(Revolver_de_agua revolver) {
        
        Boolean que = rs.mojar(revolver);
        
        rs.siguienteChorro(revolver);
        
        return que;
    }
}
//disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.