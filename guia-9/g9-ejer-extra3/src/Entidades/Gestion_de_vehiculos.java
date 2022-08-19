/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;



/**
 *
 * @author alumno
 */
public class Gestion_de_vehiculos {
    private String marca;
    private String modelo;
    private int ano;
    private int num_motor;
    private String chasis;
    private String color;
    private String tipo;
    private Gestion_Integral_de_clientes dueno;
    private Gestion_de_Polizas poliza;
//    Marca, modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).

    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    
    public Gestion_de_vehiculos() {
    }

    public Gestion_de_vehiculos(String marca, String modelo, int ano, int num_motor, String chasis, String color, String tipo, Gestion_Integral_de_clientes dueno) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.num_motor = num_motor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.dueno = dueno;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNum_motor() {
        return num_motor;
    }

    public void setNum_motor(int num_motor) {
        this.num_motor = num_motor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Gestion_Integral_de_clientes getDueno() {
        return dueno;
    }

    public void setDueno(Gestion_Integral_de_clientes dueno) {
        this.dueno = dueno;
    }

    public Gestion_de_Polizas getPoliza() {
        return poliza;
    }

    public void setPoliza(Gestion_de_Polizas poliza) {
        this.poliza = poliza;
    }
    
    public void crearVehiculo(String marca, String modelo, int ano, int num_motor, String chasis, String color, String tipo, Gestion_Integral_de_clientes dueno) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setNum_motor(num_motor);
        setChasis(chasis);
        setColor(color);
        setTipo(tipo);
        setDueno(dueno);
    }
    
    public void asignarPoliza(Gestion_de_Polizas poliza) {
        setPoliza(poliza);
    }
}
