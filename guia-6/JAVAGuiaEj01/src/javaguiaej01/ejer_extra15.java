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
public class ejer_extra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n1;
        int n2;
        int n3;
        
        System.out.println("ingrese dos numeros");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        
        System.out.println("1 - sumar");
        System.out.println("2 - restar");
        System.out.println("3 - multiplicar");
        System.out.println("4 - dividir");
        
        do {
            n3 = leer.nextInt();
        } while (n3 < 1 || n3 > 4);
        
        switch(n3){
            case 1:
                System.out.println(sumar(n1,n2));
            break;
            case 2:
                System.out.println(restar(n1,n2));
            break;
            case 3:
                System.out.println(multiplicar(n1,n2));
            break;
            case 4:
                System.out.println(dividir(n1,n2));
            break;
        }
        
    }
    
    public static int sumar (int n1, int n2){
        int r;
        
        r = n1 + n2;
        
        return r;
    }
    public static int restar (int n1, int n2){
        int r;
        
        r = n1 - n2;
        
        return r;
    }
    public static int multiplicar (int n1, int n2){
        int r;
        
        r = n1 * n2;
        
        return r;
    }
    public static int dividir (int n1, int n2){
        int r;
        
        r = n1 / n2;
        
        return r;
    }
    /*
    Crea una aplicación que le pida dos números al usuario y este 
    pueda elegir entre sumar, restar, multiplicar y dividir. La 
    aplicación debe tener una función para cada operación matemática 
    y deben devolver sus resultados para imprimirlos en el main.
    */
}
