/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g10_ejer3;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;
import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class G10_ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
        int total = 0,l=0,t=0;
        
        Lavadora la = new Lavadora();
        Lavadora lava1 = new Lavadora(400,"B","F",300);
        Lavadora lava2 = new Lavadora(4,"F","A",10);
        Televisor tele1 = new Televisor(100,true,"b","A",100);
        Televisor tele2 = new Televisor(10,false,"b","A",40);
        
        electrodomesticos.add(tele1);
        electrodomesticos.add(tele2);
        electrodomesticos.add(lava1);
        electrodomesticos.add(lava2);
        
        for (Electrodomestico aux : electrodomesticos) {
            aux.precioFinal();
            
            total += aux.getPrecio();
        }
        System.out.println("El precio total de todos los electrodomesticos es: "+total);
    }
    
}
