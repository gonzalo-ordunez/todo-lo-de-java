/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Lista {
    ArrayList<Personas> personas;
    ArrayList<Perro> perros;
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    
    public Lista(int n) {
        personas = new ArrayList();
        
        perros = new ArrayList();
        
        for (int i = 1; i <= n; i++) {
            personas.add(new Personas("nombre "+i,"apellido "+i,i,(i*10000)));
            perros.add(new Perro("nombre "+i,"raza "+i,i,"tamano "+i,true));
        }
    }
    
    public void mostrarPerros() {
        int n = 0;
        for (Perro aux : perros) {
            n++;
            if (aux.getDisponible()) {
                System.out.println("opcion: "+n);
                System.out.println(aux.toString());
                System.out.println("");
            }
        }
    }
    
    public void seleccionarPerro(Personas p) {
        System.out.println("ingrese su eleccion");
        int n = lr.nextInt()-1;
        System.out.println("");
        p.asignarMascota(perros.get(n));
        perros.get(n).setDisponible(false);
    }
    
    public void prosesoAdop() {
        for (Personas aux : personas) {
            mostrarPerros();
            seleccionarPerro(aux);
        }
    }
    
    public void mostraPersonas() {
        for (Personas aux : personas) {
            System.out.println(aux.toString());
            System.out.println("");
        }
    }
}
