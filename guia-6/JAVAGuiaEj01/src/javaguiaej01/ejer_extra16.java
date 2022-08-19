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
public class ejer_extra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        boolean kl = false;
        String con;
        
       
        do {
            fun();
            System.out.println("quiere ingresar otro registro");
            con = leer.nextLine();
            kl = con.equals("no");
            
        } while (kl == false);
        
        
    }
    
    public static void fun (){
        Scanner leer = new Scanner(System.in);
        int nom;
        String edad;
        
        System.out.println("nombre y edad");
        
        edad = leer.nextLine();
        nom = leer.nextInt();
        
        System.out.println(">------------------------<");
        System.out.println("nombre: "+edad);
        System.out.println("edad: "+nom);
        
        if (nom >= 18) {
            System.out.println("es mayor de edad");
        }else {
            System.out.println("es menor de edad");
        }
        
        
    }
    /*
    Diseñe una función que pida el nombre y la edad de N personas
    e imprima los datos de las personas ingresadas por teclado e 
    indique si son mayores o menores de edad. Después de cada 
    persona, el programa debe preguntarle al usuario si quiere seguir
    mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
    */
}
