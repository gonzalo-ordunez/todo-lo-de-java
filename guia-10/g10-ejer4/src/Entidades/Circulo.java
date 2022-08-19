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
public class Circulo implements calculosFormas{

    private int radio;
    private int diametro;

    public Circulo() {
    }

    public Circulo(int radio, int diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }
    
    @Override
    public double Area() {
        return CONSTANTE * Math.pow(radio, 2);
    }
    
    @Override
    public double Perimetro() {
        return CONSTANTE * diametro;
    }
    
}
