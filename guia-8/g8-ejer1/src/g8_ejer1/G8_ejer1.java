/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g8_ejer1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class G8_ejer1 {

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
        
        lis.forEach((li) -> {
            System.out.println(li);
        });
    }
    
}
