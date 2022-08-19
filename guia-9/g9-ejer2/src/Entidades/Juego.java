/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver_de_agua r;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver_de_agua r) {
        this.jugadores = jugadores;
        this.r = r;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver_de_agua getR() {
        return r;
    }

    public void setR(Revolver_de_agua r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", r=" + r + '}';
    }
    
}
