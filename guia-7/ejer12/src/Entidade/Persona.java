/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Persona {
    private String nom;
    private Date fena;

    public Persona() {
    }

    public Persona(String nom, Date fena) {
        this.nom = nom;
        this.fena = fena;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getFena() {
        return fena;
    }

    public void setFena(Date fena) {
        this.fena = fena;
    }
    
}
// Una persona tiene un nombre 
//y una fecha de nacimiento (Tipo Date), constructor vacío, 
//constructor parametrizado, get y set. Y los siguientes métodos: