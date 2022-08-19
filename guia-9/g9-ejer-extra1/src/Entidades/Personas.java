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
public class Personas {
    private final String nombre;
    private final String apellido;
    private final Integer edad;
    private final Integer documento;
    private Perro mascota;

    public Personas(String nom, String ape, int eda, int doc) {
        this.nombre = nom;
        this.apellido = ape;
        this.edad = eda;
        this.documento = doc;
    }
    
    public void asignarMascota(Perro p) {
        mascota = p;
    }

    @Override
    public String toString() {return "nombre: " + nombre + ", apellido: " + apellido + ", edad: " + edad + ", documento: " + documento + 
            "\nmascota: " + "\n"+mascota;}
    
    
}
