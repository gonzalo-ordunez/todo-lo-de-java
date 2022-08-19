/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CancionService {
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    
    public Cancion crearCancion() {
        Cancion ca = new Cancion();
        System.out.println("ingrese el nombre del autor ");
        ca.setAutor(lr.next());
        System.out.println("ingrese el nombre de la cancion");
        ca.setTitulo(lr.next());
        return ca;
    }
}
