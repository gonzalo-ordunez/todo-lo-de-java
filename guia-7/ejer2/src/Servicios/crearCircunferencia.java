/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class crearCircunferencia {
    
    public Circunferencia crea() {
        Circunferencia c1 = new Circunferencia();
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Dame el radio por fabour");
        c1.setRadio(lr.nextDouble());
        return c1;
    }
    
    public void area(Circunferencia c1) {
        System.out.println("el area es: "+(Math.PI * Math.pow(c1.getRadio(), 2)));
    }
    
    public void perimetro(Circunferencia c1) {
        System.out.println("el perimetro es: "+(2 * Math.PI * c1.getRadio()));
    }
}
