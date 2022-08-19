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
public class ejer12 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        String mensaje;
        String s = "s";
        String pri;
        String ult;
        
        int f = 0;
        int v = 0;
        
        do {
            mensaje = leer.nextLine();
            if (mensaje.equals("&&&&&")) {
                v++;
                s = "f";
            }else if (5 == mensaje.length()) {
                pri = mensaje.substring(0, 1);
                ult = mensaje.substring(mensaje.length()-1,mensaje.length());
                if (pri.equals("x") && ult.equals("o")) {
                    v++;
                }else f++;
            }else f++;
        } while (s.equals("s"));

        System.out.println("correctos " + v);
        System.out.println("incorrectos " + f);
    /*
        
        */
    }

}