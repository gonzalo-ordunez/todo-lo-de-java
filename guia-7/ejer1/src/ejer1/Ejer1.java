/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer1;

import Libro.Libro;
import LibroService.LibroService;

/**
 *
 * @author alumno
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LibroService ls = new LibroService();
        
        Libro l1 = ls.Patata();
        
        ls.Soda(l1);
        
    }
    
}
