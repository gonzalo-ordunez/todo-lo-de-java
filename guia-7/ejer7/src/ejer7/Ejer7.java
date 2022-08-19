/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer7;

import Entidades.Persona;
import Service.PersonaService;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        PersonaService ps = new PersonaService();
        int mallor = 0, menor = 0, pen = 0, pea = 0, pes = 0;
        
        for (int i = 0; i < 4; i++) {
            Persona persona = ps.crearP();
            
            switch (ps.calcularIMC(persona)) {
                case -1:
                    pen++;
                    break;
                case 0:
                    pea++;
                    break;
                default:
                    pes++;
                    break;
            }
            
            if (persona.getEdad() < 18) {
                menor++;
            }else {
                mallor++;
            }
        }
        
        System.out.println("INFORME DE PERSONAS: ");
        System.out.println();
        System.out.println("• Porcentajes según IMC. ");
        System.out.println("·Bajo el ideal: "+((int) (pen * 100 / 2))+"%");
        System.out.println("·Ideal: "+((int) (pea * 100 / 2))+"%");
        System.out.println("·Encima del ideal: "+((int) (pes * 100 / 2))+"%");
        System.out.println();
        System.out.println("• Porcentaje según edad. ");
        System.out.println("·Mayores de 18: "+((int) (mallor * 100 / 2))+"%");
        System.out.println("·Menores de 18: "+((int) (menor * 100 / 2))+"%");

        
        
        
    }
    
}
