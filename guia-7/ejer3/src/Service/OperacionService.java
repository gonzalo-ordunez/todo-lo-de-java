/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class OperacionService {
    
    public Operacion crearOperacion() {
        Operacion op = new Operacion();
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("ingrese dos numeros");
        op.setNumero1(lr.nextInt());
        op.setNumero2(lr.nextInt());
        return op;
    }
    
    public void sumar(Operacion op) {
        System.out.println("el resultado es: "+(op.getNumero1()+op.getNumero2()));
    }
    
    public void restar(Operacion op) {
        System.out.println("el resultado es: "+(op.getNumero1()-op.getNumero2()));
    }
    
    public void multi(Operacion op) {
        if (op.getNumero1() > 0 && op.getNumero2() > 0) {
            System.out.println("el resultado es: "+(op.getNumero1()*op.getNumero2()));
        }else {
            System.out.println("ERROR");
        }
    }
    
    public void divi(Operacion op) {
        if (op.getNumero1() > 0 && op.getNumero2() > 0) {
            System.out.println("el resultado es: "+(op.getNumero1()/op.getNumero2()));
        }else {
            System.out.println("ERROR");
        }
    }
}
