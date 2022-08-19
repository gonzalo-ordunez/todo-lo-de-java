/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CafeteraService {
    Cafetera ca = new Cafetera();
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    
    public Cafetera llenarCafetera() {
        ca.setCapacidadActual(ca.getCapacidadMaxima());
        return ca;
    }
    
    public void m() {
        System.out.println(ca.getCapacidadActual());
    }
    
    public Cafetera servirCafetera(int taza) {
        int cap = ca.getCapacidadActual();
        if (taza >= cap) {
            ca.setCapacidadActual(0);
        }else {
            ca.setCapacidadActual(cap-taza);
        }
        return ca;
    }
    
    public void vaciarCafetera() {
        ca.setCapacidadActual(0);
    }
    
    public void agrearCafe(int cafe) {
        int cm = ca.getCapacidadMaxima();
        int cac = ca.getCapacidadActual();
        
        if (cm < (cac + cafe)) {
            llenarCafetera();
        }else {
            ca.setCapacidadActual(+cafe);
        }
    }
}
