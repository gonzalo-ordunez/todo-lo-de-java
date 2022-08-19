/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer11;

import java.util.Date;

/**
 *
 * @author alumno
 */
public class Ejer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia = 2,mes = 9,anio = 110,fecha;
        Date fe = new Date(anio,mes,dia);
        Date fa = new Date();
        
        System.out.println(fa);
        System.out.println(fe);
        fecha = fa.getYear()-fe.getYear();
        System.out.println(fa.getYear());
        
    }
    
}
//Pongamos de lado un momento el concepto de POO, ahora vamos 
//a trabajar solo con la clase Date. En este ejercicio deberemos 
//instanciar en el main, una fecha usando la clase Date, para 
//esto vamos a tener que crear 3 variables, dia, mes y anio que
//se le pedirán al usuario para poner el constructor del objeto Date.
//Una vez creada la fecha de tipo Date, deberemos mostrarla y 
//mostrar cuantos años hay entre esa fecha y la fecha actual, que se
//puede conseguir instanciando un objeto Date con constructor vacío.
//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();