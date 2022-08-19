/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje_extra1;

import Entidad.Cancion;
import Service.CancionService;

/**
 *
 * @author alumno
 */
public class Eje_extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CancionService cs = new CancionService();
        Cancion ca = cs.crearCancion();
        
        System.out.println(ca);
        
    }
    
}
//Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́definir
//además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas vacías y
//otro que reciba como parámetros el titulo y el autor de la canción. Se deberán además
//definir los métodos getters y setters correspondientes.