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
    private String Titulo;
    private String Director;
    private Double Duracion;

    public Pelicula() {
    }

    public Pelicula(String Titulo, String Director, Double Duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.Duracion = Duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Double getDuracion() {
        return Duracion;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + Titulo + ", Director=" + Director + ", Duracion=" + Duracion + '}';
    }
    
    
}
