/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8_ejer2;

import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class G8_ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        
        ArrayList<String> lis = new ArrayList();
        
        String p;
        
        do {
            System.out.println("ingrese una nueva raza de perro");
            lis.add(lr.next());
            System.out.println("quiere terminar? SI/NO");
            p = lr.next();
        } while (!p.equalsIgnoreCase("si"));
        
        System.out.println("");
        lis.forEach((li) -> {
            System.out.println(li);
        });
        System.out.println("");
        
        System.out.println("ingrese el perro que quiera eliminar");
        String perro_e = lr.next();
        
        if (lis.contains(perro_e)) {
            System.out.println("el perro esta y se eliminado");
            for (int i = 0; i < lis.size(); i++) {
                if (lis.get(i).equalsIgnoreCase(perro_e)) {
                    lis.remove(i);
                    i--;
                }
            }
        }else {
            System.out.println("el perro no esta");
        }
        
        Collections.sort(lis, Comparadores.ordunarperros);
        
        lis.forEach((li) -> {
            System.out.println("");
            System.out.println(li);
        });
    }
    
}
