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
public class Pelicula {
    private final String titulo;
    private final double duracion;
    private final int edad_minima;
    private final String director;
    
    public Pelicula(String t,double d,int e,String di) {
        this.titulo = t;
        this.duracion = d;
        this.edad_minima = e;
        this.director = di;
    }

    public int getEdad_minima() {
        return edad_minima;
    }

    @Override
    public String toString() {
        return "titulo: " + titulo + "\nduracion: " + duracion + "\nedad minima: " + edad_minima + "\ndirector: " + director;
    }
    
    
}
//las películas nos interesa saber
//el título, duración, edad mínima y director.