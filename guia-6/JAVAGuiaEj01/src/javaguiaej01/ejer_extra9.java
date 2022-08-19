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
public class ejer_extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n1 = 100;
        int n2 = 12;
        int d = 0;
        
        System.out.print("el resultado de "+n1+"/"+n2);
        
        do {
            n1 = n1 - n2;
            d++;
        } while (n1 > n2);
        
        System.out.println(" es "+d);
        
    }
    
}
