/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author alumno
 */
public class Baraja {
    private final ArrayList<Carta> baraja;

    public Baraja(){
        baraja = new ArrayList<>();
        
        for (int i = 1; i <= 12; i++) {
            if (i != 8 && i != 9) {
            baraja.add(new Carta(i,"espadas",true));
            }
        }
        
        for (int i = 1; i <= 12; i++) {
            if (i != 8 && i != 9) {
            baraja.add(new Carta(i,"bastos",true));
            }
        }
        
        for (int i = 1; i <= 12; i++) {
            if (i != 8 && i != 9) {
            baraja.add(new Carta(i,"oros",true));
            }
        }
        
        for (int i = 1; i <= 12; i++) {
            if (i != 8 && i != 9) {
            baraja.add(new Carta(i,"copas",true));
            }
        }
    }
    
    public void barajar() {
        Collections.shuffle(baraja);
    }
    
    public void siguienteCarta2() {
        for (Carta ca : baraja) {
            if (ca.getJugado()) {
                ca.setJugado(false);
                break;
            }
        }
    }
    
    public void siguienteCarta() {
        boolean fal = true;
        for (Carta ca : baraja) {
            if (ca.getJugado()) {
                System.out.println("siguiente carta "+ca.toString());
                ca.setJugado(false);
                fal = false;
                break;
            }
        }
        if (fal) {
            System.out.println("no quedan cartas disponibles");
        }
    }
    
    public int cartasDisponibles() {
        int d = 0;
        for (Carta cartas : baraja) {
            if (cartas.getJugado()) {
                d++;
            }
        }
        return d;
    }
    
    public void mostrarcartasDisponibles() {
        int d = cartasDisponibles();
        if (d > 0) {
            System.out.println("quedan "+d+" cartas disponibles");
        }else {
            System.out.println("no quedan cartas disponibles");
        }
    }
    
    public void darCartas(int n) {
        if (n < cartasDisponibles()) {
            for (int i = 0; i < n; i++) {
                siguienteCarta2();
            }
        }else {
            System.out.println("no hay suficientes cartas");
        }
    }
    
    public void cartasMonton() {
        if (cartasDisponibles()==40) {
            System.out.println("no se an jugado cartas aun");
        }else {
            for (Carta carta : baraja) {
                if (!carta.getJugado()) {
                    System.out.println(carta.toString());
                }
            }
        }
    }
    
    public void mostrarBaraja() {
        for (Carta carta : baraja) {
            if (carta.getJugado()) {
                System.out.println(carta.toString());
            }
        }
    }
}
//Realizar una baraja de cartas espa??olas orientada a objetos. Una carta tiene un n??mero entre 1
//y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
//contener un m??todo toString() que retorne el n??mero de carta y el palo. La baraja estar??
//compuesta por un conjunto de cartas, 40 exactamente.
//Las operaciones que podr?? realizar la baraja son:
//??? barajar(): cambia de posici??n todas las cartas aleatoriamente.
//??? siguienteCarta(): devuelve la siguiente carta que est?? en la baraja, cuando no haya m??s o
//se haya llegado al final, se indica al usuario que no hay m??s cartas.
//??? cartasDisponibles(): indica el n??mero de cartas que a??n se puede repartir.
//??? darCartas(): dado un n??mero de cartas que nos pidan, le devolveremos ese n??mero de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indic??rselo al usuario.
//??? cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indic??rselo al usuario
//??? mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al m??todo, este no mostrara esa primera carta.
