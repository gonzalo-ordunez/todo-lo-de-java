/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer10;

import java.util.Arrays;

/**
 *
 * @author alumno
 */
public class Ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] a = new double[50];
        double[] b = new double[20];
        
        
        Arrays.fill(a, Math.random()*10);
        Arrays.sort(a);
        System.arraycopy(a, 0, b, 0, 10);
        Arrays.fill(b, 10, 19, 0.5);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        
    }
//Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.
}
