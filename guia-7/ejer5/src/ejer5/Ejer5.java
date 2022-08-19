/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer5;

import Entidades.Cuenta;
import Service.CuentaService;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaService cs = new CuentaService();
        Cuenta cu = cs.crearCuenta();
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("--------------------------");
            System.out.println("que desea hacer");
            System.out.println("--------------------------");
            System.out.println("1-ingresar fondos");
            System.out.println("2-retirar fondos");
            System.out.println("3-retiro rapido de fondos");
            System.out.println("4-consultar fondos");
            System.out.println("5-consultar datos");
            System.out.println("--------------------------");
            switch (lr.nextInt()) {
                case 1:
                    System.out.println("ingrese cuanto va a depocitar");
                    cs.ingresar(lr.nextDouble());
                    break;
                case 2:
                    System.out.println("ingrese cuanto va a retirar");
                    cs.retirar(lr.nextDouble());
                    break;
                case 3:
                    System.out.println("solo puede retirar un maximo del 20%");
                    System.out.println("ingrese cuanto va a retirar");
                    cs.retiro_rapido(lr.nextDouble());
                    break;
                case 4:
                    cs.consultar_saldo(cu);
                    break;
                case 5:
                    cs.consultar_cuenta(cu);
                    break;
                default:
                    System.out.println("no es una opcion valida");
            }
        }
    }
    
}
