/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CuentaService {
    Cuenta cu = new Cuenta();
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    
    public Cuenta crearCuenta() {
        System.out.println("ingrese el numero de cuenta");
        cu.setNumeroCuenta(lr.nextInt());
        System.out.println("ingrese el DNI");
        cu.setDNI(lr.nextLong());
        cu.setSaldo_actual(0);
        return cu;
    }
    
    public Cuenta ingresar(double ingreso) {
        cu.setSaldo_actual((ingreso+cu.getSaldo_actual()));
        return cu;
    }
    
    public Cuenta retirar(double retiro) {
        double saldo = cu.getSaldo_actual();
        if (saldo == 0) {
            System.out.println("ERROR: la cuenta no tiene saldo");
        }else if (saldo < retiro) {
            cu.setSaldo_actual(0);
        }else {
            cu.setSaldo_actual(saldo-retiro);
        }
        return cu;
    }
    
    public Cuenta retiro_rapido(double retiro) {
        double saldo = cu.getSaldo_actual();
        if (retiro < ((saldo*20)/100)) {
            if (saldo == 0) {
                System.out.println("ERROR: la cuenta no tiene saldo");
            }else {
                cu.setSaldo_actual((saldo-retiro));
            }
        }else {
            System.out.println("con este metodo solo se puede retirar un maximo del 20%");
        }
        return cu;
    }
    
    public void consultar_saldo(Cuenta cu) {
        System.out.println("su saldo es: "+cu.getSaldo_actual());
    }
    
    public void consultar_cuenta(Cuenta cu) {
        System.out.println("N°:"+cu.getNumeroCuenta());
        System.out.println("DNI: "+cu.getDNI());
    }
    
}
//atributos: numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).