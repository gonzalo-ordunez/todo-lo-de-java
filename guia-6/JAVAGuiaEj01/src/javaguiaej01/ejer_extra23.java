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
public class ejer_extra23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String pa;
        String[][] sopa = new String[20][20];
        int li;
        int n;
        int l = -1;
        int k;
        
        for (int i = 0; i < 10; i++) {
            do {
                System.out.println("ingres una palabra de 3 a 5 letras");
                pa = leer.nextLine();
                li = pa.length();
            } while (li >= 6 || li <= 2 );
            
            do {
                n = (int) (Math.random()*19);
                for (int j = 0; j < 15; j++) {
                    if (null == sopa[n][j]) {
                        l = j;
                        break;
                    }
                }   
            } while (l < 0);
            
            k = 0;
            for (int j = l; j < li+l; j++) {
                sopa[n][j] = pa.substring(k,k+1);
                k++;
            }
            l = -1;
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (null == sopa[i][j]) {
                    sopa[i][j] = "0";
                }
            }
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j]);
            }
            System.out.println("");
        }
    }
    
    /*
    Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 
    caracteres y, a medida que el usuario las va ingresando, construya
    una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
    Las palabras se ubicarán todas en orden horizontal en una fila que
    será seleccionada de manera aleatoria. Una vez concluida la ubicación
    de las palabras, rellene los espacios no utilizados con un número 
    aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
    */
}
