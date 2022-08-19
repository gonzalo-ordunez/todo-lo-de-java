/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaej01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejer14 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("cuantos euros cambias");
        int euro = leer.nextInt();
        
        cambio(euro);
        /*
        El cambio de divisas es:
            * 0.86 libras es un 1 €
            * 1.28611 $ es un 1 €
            * 129.852 yenes es un 1 €
        */
    }
    public static void cambio(int euro){
        System.out.println(euro + " euros son " + (euro*0.86) + " libras");
        System.out.println(euro + " euros son " + (euro*1.28611) + " dolar");
        System.out.println(euro + " euros son " + (euro*129.852) + " yenes");
    }
}