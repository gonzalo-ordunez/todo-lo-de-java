/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaej01;

/**
 *
 * @author alumno
 */
public class ejer_extra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] v = new int[5];
        
        foo(v);
        
        fun(v);
    }
    
    public static void foo (int[] v){
        for (int i = 0; i < 5; i++) {
            v[i] = (int) (Math.random() * 10);
        }
    }
    
    public static void fun (int[] v){
        for (int i = 0; i < 5; i++) {
            System.out.println(v[i]);
        }
    }
    /*
    Crear una función rellene un vector con números aleatorios, 
    pasándole un arreglo por parámetro. Después haremos otra 
    función o procedimiento que imprima el vector.
    */
}
