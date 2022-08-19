/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class RaicesService {
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    Raices ra = new Raices();
    
    public Raices crearRaices() {
        System.out.println("ingrese al valor de A");
        ra.setA(lr.nextInt());
        System.out.println("ingrese al valor de B");
        ra.setB(lr.nextInt());
        System.out.println("ingrese al valor de C");
        ra.setC(lr.nextInt());
        return ra;
    }
    
    public double getDiscriminante(Raices ra) {
        return (Math.pow(ra.getB(),2))-4*ra.getA()*ra.getC();
    }
    
    public boolean tieneRaices(double a) {
        return a >= 0;
    }
    
    public boolean tieneRaiz(double a) {
        return a == 0;
    }
    
    public void obtenerRaices(double a) {
        if (tieneRaices(a)) {
            System.out.println("raiz 1");
            System.out.println((ra.getB()+Math.sqrt(Math.pow(ra.getB(), 2)-(4*ra.getA()*ra.getC())))/(2*ra.getA()));
            System.out.println("raiz 2");
            System.out.println((ra.getB()-Math.sqrt(Math.pow(ra.getB(), 2)-(4*ra.getA()*ra.getC())))/(2*ra.getA()));
        }
//        (ra.getB()+Math.sqrt(Math.pow(ra.getB(), 2)-(4*ra.getA()*ra.getC())))/(2*ra.getA())
    }
    
    public void obtenerRaiz(double a) {
        if (tieneRaiz(a)) {
            System.out.println("solo raiz 1");
            System.out.println((ra.getB()+Math.sqrt(Math.pow(ra.getB(), 2)-(4*ra.getA()*ra.getC())))/(2*ra.getA()));
        }
//        (ra.getB()+Math.sqrt(Math.pow(ra.getB(), 2)-(4*ra.getA()*ra.getC())))/(2*ra.getA())
    }
    
    public void calcular(double a) {
        if (tieneRaices(a)) {
            System.out.println("raiz 1");
            System.out.println((ra.getB()+Math.sqrt(Math.pow(ra.getB(), 2)-(4*ra.getA()*ra.getC())))/(2*ra.getA()));
            System.out.println("raiz 2");
            System.out.println((ra.getB()-Math.sqrt(Math.pow(ra.getB(), 2)-(4*ra.getA()*ra.getC())))/(2*ra.getA()));
        }else if (tieneRaiz(a)) {
            System.out.println("solo raiz 1");
            System.out.println((ra.getB()+Math.sqrt(Math.pow(ra.getB(), 2)-(4*ra.getA()*ra.getC())))/(2*ra.getA()));
        }else {
            System.out.println("no hay solucion");
        }
    }
}
//• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles
//soluciones.
//• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es
//en el caso en que se tenga una única solución posible.
//• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo delante de -b