/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer9;

import Entidades.Matematica;
import Service.MatematicaService;

/**
 *
 * @author alumno
 */
public class Ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematica ma = new Matematica();
        MatematicaService ms = new MatematicaService();
        ma.setNumero1(Math.random()*10);
        ma.setNumero2(Math.random()*10);
        System.out.println(ma);
        System.out.println(ms.devolverMayor(ma));
        System.out.println(MatematicaService.calcularPotencia(ma));
        System.out.println(MatematicaService.calculaRaiz(ma));
    }
    
}
