/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author alumno
 */
public class Jugador {
    private final int id;
    private final String nombre;
    private boolean mojado;

    
    public Jugador(int id) {
        this.id = id;
        this.nombre = "juador "+id;
    }
    
    public void disparar(Revolver r) {
        mojado = r.mojar();
        if (!mojado) {
            r.siguientedisparo();
        }
    }
    
    public boolean getMojado(){return mojado;}

    @Override
    public String toString() {return nombre;}
    
    
    
    
}
