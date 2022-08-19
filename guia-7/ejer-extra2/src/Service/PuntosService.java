/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PuntosService {
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    Puntos pu = new Puntos();
    
    public Puntos crearPuntos() {
        System.out.println("coordenada x1");
        pu.setX1(lr.nextInt());
        System.out.println("coordenada x2");
        pu.setX2(lr.nextInt());
        System.out.println("coordenada y1");
        pu.setY1(lr.nextInt());
        System.out.println("coordenada y2");
        pu.setY2(lr.nextInt());
        return pu;
    }
    
    public double distancia(Puntos pu) {
        return Math.sqrt(Math.pow(pu.getX2()-pu.getX1(),2)+Math.pow(pu.getY2()-pu.getY1(),2));
    }
}
