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
public class ejer_extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner(System.in);
          
          int horas = 0;
          int dias = 0;
          
          int minutos = leer.nextInt();
          System.out.print(minutos+" minutos son: ");
          while(minutos > 60){
              minutos = minutos - 60;
              horas++;
          }
          while(horas > 24){
              horas = horas - 24;
              dias++;
          }
          
          System.out.println(dias+" dias "+horas+" horas y "+minutos+ " minutos");
         
          
    }
    
}
