/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaguiaej01;

import java.util.Scanner;

public class ejer1 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese dos numeros");
        
        int n1 = leer.nextInt();
        
        int n2 = leer.nextInt();
        
        int n3 = n1 + n2;
        
        System.out.println(n3);
    }
}
