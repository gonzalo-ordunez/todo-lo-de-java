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
public class Gestion_Integral_de_clientes {
    private String nom_y_ape;
    private int documento;
    private String mail;
    private String domicilio;
    private long telefono;
    private ArrayList<Gestion_de_vehiculos> autos;
    private ArrayList<Gestion_de_Polizas> polizas;
//    empresa. Nombre y apellido, documento, mail, domicilio, teléfono.

    public Gestion_Integral_de_clientes() {
    }

    public Gestion_Integral_de_clientes(String nom_y_ape, int documento, String mail, String domicilio, long telefono, ArrayList<Gestion_de_vehiculos> autos, ArrayList<Gestion_de_Polizas> polizas) {
        this.nom_y_ape = nom_y_ape;
        this.documento = documento;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.autos = autos;
        this.polizas = polizas;
    }
    
}
