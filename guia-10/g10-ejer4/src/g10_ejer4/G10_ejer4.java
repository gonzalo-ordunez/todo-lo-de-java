/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10_ejer4;

import Entidades.Circulo;
import Entidades.Rectangulo;

/**
 *
 * @author alumno
 */
public class G10_ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo cir = new Circulo(3,4);
        Rectangulo rec = new Rectangulo(8,9);
        
        System.out.println("el area del circulo es: "+cir.Area());
        System.out.println("el perimetro del circulo es: "+cir.Perimetro());
        System.out.println("el area del rectangulo es: "+rec.Area());
        System.out.println("el perimetro del rectangulo es: "+rec.Perimetro());
    }
    
}
