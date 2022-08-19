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
public class ejer17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in);
          
          int[] w = new int[5];
          int[] v = new int[20];
          int n;
          int c;
          
          for (int i = 0; i < 20; i++) {
            v[i] = (int) (Math.random() * 20000);
        }
          
          for (int i = 0; i < 20; i++) {
            n = v[i];
            c = 0;
            while (n != 0){
                c++;
                n = n/10;
            }
            switch(c) {
                case 1:
                w[0] = 1;
                break;
                case 2:
                w[1]++;
                break;
                case 3:
                w[2]++;
                break;
                case 4:
                w[3]++;
                break;
                case 5:
                w[4]++;
                break;
        }
          }
          for (int j = 0; j < 5; j++) {
                  System.out.println("la cantidad de numeros con " + (j+1) + " digitos son " + w[j]);
              }
          
        /*
        Recorrer un vector de N enteros contabilizando cuántos 
        números son de 1 dígito, cuántosde 2 dígitos, etcétera
        (hasta 5 dígitos).
        */
    } 
}
