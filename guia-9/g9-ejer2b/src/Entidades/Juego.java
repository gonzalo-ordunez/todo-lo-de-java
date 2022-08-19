/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Juego {
    private Revolver revolver;
    private ArrayList<Jugador> jugadores;
    
    public static Scanner lr = new Scanner(System.in).useDelimiter("\n");
    
    public void prepararJuego() {
        
        revolver = new Revolver();
        
        jugadores = new ArrayList();
        
        System.out.println("cuantos jugadores hay? \n(solo de 2 a 6 pueden jugar)");
        int ju = lr.nextInt();
        if (ju < 2) {
            ju = 2;
        }else if (ju > 6) {
            ju = 6;
        }
        revolver.llenarRevolver();
        for (int i = 1; i <= ju; i++) {
            jugadores.add(new Jugador(i));
        }
    }
    
    public void ronda() {
//        Iterator<Jugador> it = jugadores.iterator();
        while (jugadores.size()!=1) {
            for (Iterator<Jugador> i = jugadores.iterator(); i.hasNext();) {
                Jugador next = i.next();
                System.out.println("turno del " + next);
                next.disparar(revolver);
                if (next.getMojado()) {
                    System.out.println("el "+next+" se mojo");
                    jugadores.remove(next);
                    revolver.llenarRevolver();
                    if (jugadores.size()==1) {
                        System.out.println("");
                        System.out.println("el "+jugadores.get(0)+" es el ganador");
                    }else {
                        System.out.println("");
                        System.out.println("siguiente ronda");
                        System.out.println("");
                    }
                    break;
                }else {
                    System.out.println("el "+next+" se salvo");
                }
            }
            }
            for (Jugador jugador : jugadores) {
                
                
            }
        }
    }
