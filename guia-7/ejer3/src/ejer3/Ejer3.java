/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import Entidades.Operacion;
import Service.OperacionService;

/**
 *
 * @author alumno
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionService os = new OperacionService();
        Operacion op = os.crearOperacion();
        
        os.sumar(op);
        os.restar(op);
        os.multi(op);
        os.divi(op);
        
    }
    
}
