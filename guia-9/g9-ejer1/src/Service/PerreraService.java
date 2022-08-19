/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Mascota;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PerreraService {
    
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    HashMap<Integer, Mascota> lismas = new HashMap();
    List<Persona> lisper = new ArrayList();
    
    private Mascota crearMascota() {
        System.out.println("ingrese el nombre");
        String nembre = lr.next();
        System.out.println("ingrese el raza");
        String raza = lr.next();
        System.out.println("ingrese la edad");
        Integer edad =  lr.nextInt();
        System.out.println("ingrese el tamano");
        String tamano = lr.next();
        
        Mascota mas = new Mascota(nembre,raza,edad,tamano); 
        return mas;
    }
    
    public void addMascota() {
        Mascota mas = crearMascota();
        lismas.put((lismas.size()+1), mas);
    }
    public Persona crearPersona() {
        System.out.println("ingrese el nombre");
        String nembre = lr.next();
        System.out.println("ingrese el apellido");
        String raza = lr.next();
        System.out.println("ingrese la edad");
        Integer edad =  lr.nextInt();
        System.out.println("ingrese la documento");
        Integer documento =  lr.nextInt();
        System.out.println("seleccione una mascota de la lista");
        lismas.entrySet().forEach((aux) -> {
            Integer key = aux.getKey();
            Mascota value = aux.getValue();
            System.out.println("codigo:"+key+" mascota:"+value.toString());
        });
        Mascota mascota = lismas.get(lr.nextInt());
        
        Persona per = new Persona(nembre,raza,edad,documento,mascota);
        
        return per;
    }
    
    public void addPersona() {
        Persona per = crearPersona();
        lisper.add(per);
    }
    
    public void mostrarduenos() {
        lisper.forEach((aux) -> {
            System.out.println(aux.toString());
        });
    }
}
