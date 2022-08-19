/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidade.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PersonaService {
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    Persona pe = new Persona();
    Date fe = new Date();
    
    public Persona crearPernona() {
        int di,me,an;
        System.out.println("ingrese el nombre");
        pe.setNom(lr.next());
        System.out.println("ingrese la fecha de nacimiento DD/MM/AAAA");
        di = lr.nextInt();
        me = lr.nextInt();
        an = lr.nextInt();
        Date d = new Date(an,me,di);
        pe.setFena(d);
        return pe;
    }
    
    public int calcularEdad() {
        return fe.getYear()-(pe.getFena().getYear()-1900);
    }
    
    public boolean menorQue(int edad) {
        Date d = new Date();
        return calcularEdad() < edad; 
    }
    
    public void mostrarPersona() {
        Date fec = pe.getFena();
        System.out.println("nombre:"+pe.getNom());
        System.out.println("fecha de nacimiento:"+fec.getDate()+"/"+fec.getMonth()+"/"+fec.getYear());
    }
}
//• Agregar a la clase el método menorQue(int edad) que recibe 
//como parámetro otra edad y retorna true en caso de que el 
//receptor tenga menor edad que la persona que se recibe como 
//parámetro, o false en caso contrario.
//• Metodo mostrarPersona(): este método muestra la persona 
//creada en el método anterior.