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
public class ejer_extra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num = 0;
        int mas = 0;
        int min = 1000000000;
        double pro = 0;
        int p = 0;
        int con = 0;
        int n;
        
        System.out.println("elija una opcion");
            System.out.println("1 - do while");
            System.out.println("2 - while");
        do {
            n = leer.nextInt();
        } while (n != 1 && n != 2 );
        
        if (n == 2) {
            System.out.println("cuantos numeros va a ingresar");
            int m = leer.nextInt();
            while(m != 0){
                System.out.println("ingrese un numero");
                num = leer.nextInt();
                con = con + num;
                mas = Math.max(mas, num);
                min = Math.min(min, num);
                m--;
                p++;
            }
        }else {
            System.out.println("cuantos numeros va a ingresar");
            int m = leer.nextInt();
            do {
                m--;
                System.out.println("ingrese un numero");
                num = leer.nextInt();
                con = con + num;
                mas = Math.max(mas, num);
                min = Math.min(min, num);
                p++;
            } while (m != 0);
            
        }
        
        System.out.println("el promedio es:"+(pro=(con/p)));
        System.out.println("el numero maximo es:"+mas);
        System.out.println("el numero minimo es:"+min);
    }
    
}
