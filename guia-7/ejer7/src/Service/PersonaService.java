/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class PersonaService {
    
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    
    private Persona crearPersona() {
        Persona pe = new Persona();
        System.out.println("cual es el nombre");
        pe.setNombre(lr.next());
        System.out.println("la edad");
        pe.setEdad(lr.nextInt());
        System.out.println("ingrese el sexo M - F - O");
        String sex = lr.next();
        while (!sex.equalsIgnoreCase("M") && !sex.equalsIgnoreCase("F") && !sex.equalsIgnoreCase("O")) {
            System.out.println("ERROR: las opciones son M,F,O");
            sex = lr.next();
        }
        pe.setSexo(sex);
        System.out.println("ingrese el peso");
        pe.setPeso(lr.nextDouble());
        System.out.println("ingrese la altura");
        pe.setAltura(lr.nextDouble());
        return pe;
    }
    
    public Persona crearP() {
        return crearPersona();
    }
    
    public int calcularIMC(Persona per) {
        int imc = 1;
        int cal = (int) (per.getPeso() / Math.pow(per.getAltura(), 2));
        if (cal < 20) {
            imc = -1;
        }else if (cal >= 20 && cal <= 25) {
            imc = 0;
        }
        return imc;
    }
    
    
}
