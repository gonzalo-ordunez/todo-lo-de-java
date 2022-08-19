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
public class Cliente {
    private final String nombre;
    private final int edad;
    private final int dinero;
    
    public Cliente(String n, int e, int d){
        this.nombre = n;
        this.edad = e;
        this.dinero = d;
    }

    public int getEdad() {
        return edad;
    }

    public int getDinero() {
        return dinero;
    }

    @Override
    public String toString() {return nombre;}
    
    
    
}
//espectador, nos interesa saber su
//nombre, edad y el dinero que tiene disponible.