/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaej01;

import java.util.Scanner;

public class ejer11 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        int n;
        int n1;
        int n2;
        int a;
        double i;
        String s = "no";
        
        do {
            System.out.println("MENU");
            System.out.println("1.sumar");
            System.out.println("2.restar");
            System.out.println("3.multiplicar");
            System.out.println("4.dividir");
            System.out.println("5.salir");
            n = leer.nextInt();
            leer.nextLine();
            switch(n){
                case 1:
                    System.out.println("ingrese dos numeros para sumar");
                    n1 = leer.nextInt();
                    n2 = leer.nextInt();
                    System.out.println(a = n1 + n2);
                break;
                case 2:
                    System.out.println("ingrese dos numeros para restar");
                    n1 = leer.nextInt();
                    n2 = leer.nextInt();
                    System.out.println(a = n1 - n2);
                break;
                case 3:
                    System.out.println("ingrese dos numeros para multiplicar");
                    n1 = leer.nextInt();
                    n2 = leer.nextInt();
                    System.out.println(i = n1 * n2);
                break;
                case 4:
                    System.out.println("ingrese dos numeros para dividir");
                    n1 = leer.nextInt();
                    n2 = leer.nextInt();
                    System.out.println(i = n1 / n2);
                break;
                case 5:
                    System.out.println("esta seguro de que quiere salir (si/no)");
                    s = leer.nextLine();
                    if (s.equals("si")) {
                        s = "no";
                    break;
                    }else s = "si";
                break;
                default:
                    System.out.println(n + " no es una opcion valida");
            } 
        } while (s.equals("si"));

        /*
            Realizar un programa que pida dos números enteros positivos por 
            teclado y muestre por pantalla el siguiente menú:
        */
        
    }
}