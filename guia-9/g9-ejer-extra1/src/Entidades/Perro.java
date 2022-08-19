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
public class Perro {
    private final String nombre;
    private final String raza;
    private final Integer edad;
    private final String tamano;
    private boolean disponible;
    
    public Perro(String n,String r, int e, String t, boolean d) {
        this.nombre = n;
        this.raza = r;
        this.edad = e;
        this.tamano = t;
        this.disponible = d;
    }
    
    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {return "nombre: " + nombre + "\nraza: " + raza + "\nedad; " + edad + "\ntamano: " + tamano;}
    
    
}
