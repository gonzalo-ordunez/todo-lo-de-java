/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer8;

import Entidades.Cadena;
import Service.CadenaService;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        CadenaService cs = new CadenaService();
        Cadena ca = cs.crearCadena();
        
        System.out.println(cs.mostrarVocales(ca));
//        System.out.println(cs.invertirFrase(ca));
//        System.out.println(cs.vecesRepetido(lr.next()));
//        System.out.println(cs.compararLongitud(lr.nextLine()));
//        System.out.println(cs.unirFrases(lr.nextLine()));
//        System.out.println(cs.reemplazar(lr.nextLine()));
//        System.out.println(cs.contiene(lr.nextLine()));
        
        
    }
    
}
