/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10_ejer1;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Caballo;
import Entidades.Perro;

/**
 *
 * @author alumno
 */
public class G10_ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal perro1 = new Perro("pato","carnivoro",3,"cucaracha");
        perro1.Alimentarse();
        
        Animal perro2 = new Perro("chato","fideos",7,"patricio");
        perro2.Alimentarse();
        
        Animal gato1 = new Gato("poti","galletas",1,"Siames");
        gato1.Alimentarse();
        
        Animal caballo1 = new Caballo("lorenzo","polenta",74,"dodo");
        caballo1.Alimentarse();
        
    }
    
}
