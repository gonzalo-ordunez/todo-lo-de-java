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
public class Revolver {
    private int po_agua,po_actual;

    public void llenarRevolver() {
        po_agua = (int) Math.round((Math.random() * 10 + 1) * 0.55);
        po_actual = (int) Math.round((Math.random() * 10 + 1) * 0.55);
    }
    
    public boolean mojar() {
        return po_agua == po_actual;
    }
    
    public void siguientedisparo(){
        po_actual++;
        if (po_actual == 7) {
            po_actual = 1;
        }
    }
    
    @Override
    public String toString() {return "posicion actual "+po_actual+", posicion del agua "+po_agua;}
    
    
    
    
}
