/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8_ejer3;

import Service.AlumnoService;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class G8_ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService as = new AlumnoService();
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        String p;
        
        as.crearAlumno();
        
        System.out.println("ingrese el nombre del alumno que quiere buscar");
        String alumno = lr.next();
        
        Integer fin = as.notaFinal(alumno);
        
        if (fin != null) {
            System.out.println("la nota final de "+alumno+" es: "+fin);
        }else {
            System.out.println("el alumno no existe");
        }
        
    }
    
}
