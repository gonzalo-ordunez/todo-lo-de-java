/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Paises;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PaisesService {
    
    Scanner lr;
    List<Paises> paiseslis;
    HashSet<Paises> lis;

    public PaisesService() {
        this.lr = new Scanner(System.in).useDelimiter("\n");
        this.lis = new HashSet();
    }
    
    public Paises crearPais() {
        System.out.println("ingrese el pais");
        String pa = lr.next();
        Paises p = new Paises(pa);
        return p;
    }
    
    public void fabricaPaises() {
        String p;
        do {
            Paises pa = crearPais();
            lis.add(pa);
            System.out.println("quiere agregar otro pais Si/No");
            p = lr.next();
        } while (p.equalsIgnoreCase("si"));
        
        lis.forEach((aux) -> {
            System.out.println(aux.getPais());
        });
    }
    
    public void moslisord() {
        
        this.paiseslis = new ArrayList(lis);
        
        Collections.sort(paiseslis, Comparadores.ordna);
        System.out.println("");
        paiseslis.forEach((aux) -> {
            System.out.println(aux.getPais());
        });
    }
    
    public String eliminarPais() {
        System.out.println("ingrese el pais a eliminar");
        String pa = lr.next();
        
        for (Paises aux : lis) {
            if (aux.getPais().equalsIgnoreCase(pa)) {
                lis.remove(aux);
                return "se elimino el pais";
            }
        }
        return "no se encontro el pais";
    }
    
}
