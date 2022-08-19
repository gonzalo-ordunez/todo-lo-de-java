/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Matematica;

/**
 *
 * @author alumno
 */
public class MatematicaService {
    public double devolverMayor(Matematica ma) {
        return Math.max(ma.getNumero1(), ma.getNumero2());
    }
    
    public static double calcularPotencia(Matematica ma) {
        double r, n1 = ma.getNumero1(), n2 = ma.getNumero2();
        int p1,p2;
        p1 = (int) Math.max(n1, n2);
        p2 = (int) Math.min(n1, n2);
        return r = Math.pow(p1, p2);
    }
    
    public static double calculaRaiz(Matematica ma) {
        double r = Math.abs(Math.min(ma.getNumero1(), ma.getNumero2()));
        return Math.sqrt(r);
    }
}