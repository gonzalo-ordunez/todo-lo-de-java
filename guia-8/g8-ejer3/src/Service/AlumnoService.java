/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AlumnoService {
    
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    List<Alumno> notas = new ArrayList();
    
    public void crearAlumno() {
        String p;
        do {
            System.out.println("nombre del alumno");
            String nom = lr.next();
            System.out.println("nota 1");
            Integer n1 = lr.nextInt();
            System.out.println("nota 2");
            Integer n2 = lr.nextInt();
            System.out.println("nota 3");
            Integer n3 = lr.nextInt();
            
            Alumno al = new Alumno(nom, n1, n2, n3);
            
            notas.add(al);
            
            System.out.println("quiere agregar otro alumno Si/No");
            p = lr.next();
        } while (p.equalsIgnoreCase("si"));   
    }
    
    public Integer notaFinal(String nombre) {
        for (Alumno aux : notas) {
            if (aux.getNombre().equals(nombre)) {
                return (aux.getNota1()+aux.getNota2()+aux.getNota3())/3;
            }
        }
        return null;
    }
}
