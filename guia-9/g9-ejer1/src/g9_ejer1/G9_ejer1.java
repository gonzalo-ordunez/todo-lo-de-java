/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g9_ejer1;

import Entidades.Mascota;
import Entidades.Persona;
import Service.PerreraService;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class G9_ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PerreraService ps = new PerreraService();
        
        for (int i = 0; i < 2; i++) {
        ps.addMascota();
        }
        
        for (int i = 0; i < 2; i++) {
        ps.addPersona();
        }
        
        ps.mostrarduenos();
        
        
//        Mascota mascota1 = new Mascota("taco","gato",3,"chico");
//        
//        Mascota mascota2 = new Mascota("pati","perro",7,"grande");
//        
//        Persona persona1 = new Persona("pachu","tatu",56,1456,mascota1);
//        
//        Persona persona2 = new Persona("tucho","bado",16,6956,mascota2);

        
    }
    
}
