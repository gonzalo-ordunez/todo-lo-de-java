/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class RectanguloService {
    public Rectangulo crearRectangulo() {
        Rectangulo re = new Rectangulo();
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese la base");
        re.setBase(lr.nextInt());
        System.out.println("ingrese la altura");
        re.setAltura(lr.nextInt());
        return re;
    }
    
    public void superficie(Rectangulo re) {
        System.out.println("la superficie es: "+(re.getBase()*re.getAltura()));
    }
    
    public void perimetro(Rectangulo re) {
        System.out.println("el perimetro es: "+((re.getBase()+re.getAltura())*2));  
    }
    
    public void dibujo(Rectangulo re) {
        int b = re.getBase();
        int a = re.getAltura();
        
        for (int i = 0; i < b; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        for (int i = 0; i < a-2; i++) {
            System.out.print("*");
            for (int j = 0; j < b-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        
        for (int i = 0; i < b; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
