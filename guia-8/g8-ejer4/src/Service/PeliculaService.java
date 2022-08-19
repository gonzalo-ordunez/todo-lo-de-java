/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PeliculaService {
    private Scanner lr;
    private List<Pelicula> pelis;

    public PeliculaService() {
        this.lr = new Scanner(System.in).useDelimiter("\n");
        this.pelis = new ArrayList();
    }
    
    public Pelicula crearPelicula() {
        System.out.println("titulo");
        String ti = lr.next();
        System.out.println("director");
        String di = lr.next();
        System.out.println("duracion");
        Double du = lr.nextDouble();
        
        Pelicula pe = new Pelicula(ti,di,du);
        
        return pe;
    }
    
    public void fabricaPeliculas() {
        String p;
        do {
            Pelicula pe = crearPelicula();
            pelis.add(pe);
            System.out.println("crear otra peli");
            p = lr.next();
        } while (p.equalsIgnoreCase("si"));
        
        System.out.println("");
        System.out.println("lista de peliculas:");
        
        pelis.forEach((aux) -> {
            System.out.println(aux.toString());
        });
        
    }
    
    public void mostrarPelis() {
        System.out.println("");
        System.out.println("lista de peliculas con duracion mayor a 1 horas:");
        
        pelis.forEach((aux) -> {
            if (aux.getDuracion()>1) {
                System.out.println(aux.toString());
            }
        });
        
        Collections.sort(pelis, Comparadores.ordemame);
        
        System.out.println("");
        System.out.println("lista de peliculas mayor a menor:");
        
        pelis.forEach((aux) -> {
            System.out.println(aux.toString());
        });
        
        Collections.sort(pelis, Comparadores.ordemema);
        
        System.out.println("");
        System.out.println("lista de peliculas menor a mayor:");
        
        pelis.forEach((aux) -> {
            System.out.println(aux.toString());
        });
        
        Collections.sort(pelis, Comparadores.ordedi);
        
        System.out.println("");
        System.out.println("lista de peliculas por director:");
        
        pelis.forEach((aux) -> {
            System.out.println(aux.toString());
        });
        
        Collections.sort(pelis, Comparadores.ordeti);
        
        System.out.println("");
        System.out.println("lista de peliculas por titulo:");
        
        pelis.forEach((aux) -> {
            System.out.println(aux.toString());
        });
    }
}
