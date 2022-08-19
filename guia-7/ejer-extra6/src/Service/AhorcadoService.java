/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AhorcadoService {
    
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    
    public Ahorcado crearAhorcado() {
        Ahorcado ah = new Ahorcado();
        int lim;
        String pala;
        System.out.println("ingrese la palabra");
        pala = lr.next();
        lim = pala.length();
        String[] vec = new String[lim];
        for (int i = 0; i < lim; i++) {
            vec[i] = pala.substring(i, i+1);
        }
        System.out.println("ingrese la cantidad de intentos");
        ah.setLimite(lr.nextInt());
        ah.setPalabra(vec);
        ah.setAciertos(0);
        return ah;   
    }
    
    public int longitud(Ahorcado ah) {
        return ah.getPalabra().length;
    }
    
    public void buscar(Ahorcado ah,String letra) {
        if (Arrays.asList(ah.getPalabra()).contains(letra)) {
            System.out.println("la letra esta");
        }else {
            System.out.println("la letra no esta");
        }
    }
    
    public void encontradas(Ahorcado ah,String letra,boolean a) {
        String[] v = ah.getPalabra();
        int aci = 0;
        if (a) {
            System.out.println("la letra ya fue ingresar");
        }else {
            for (String v1 : v) {
                if (v1.equals(letra)) {
                    aci++;
                }
            }
            if (aci == 0) {
                ah.setLimite(ah.getLimite()-1);
            }else {
                ah.setAciertos(ah.getAciertos()+aci);
            }
        }
        System.out.println("se a acertado en ("+ah.getAciertos()+") letras/le faltan ("+(v.length-ah.getAciertos())+")");
    }
    
    public int intentos(Ahorcado ah) {
        return ah.getLimite();
    }
    
    public void juego(Ahorcado ah) {
        
        String[] v = new String[26];
        String[] w = new String[ah.getPalabra().length];
        String[] m = ah.getPalabra();
                
        Arrays.fill(w, "_ ");
        
        do {
            for (int i = 0; i < m.length; i++) {
                System.out.print(w[i]+" ");
            }
            System.out.println("");
            System.out.println("ingrese una letra");
            String l = lr.next();
            System.out.println("Longitud de la palabra: "+longitud(ah));
            System.out.print("Mensaje: ");
            buscar(ah,l);
            encontradas(ah,l,Arrays.asList(v).contains(l));
            if (Arrays.asList(v).contains(l) == false) {
                for (int i = 0; i < 26; i++) {
                    if (v[i] == null) {
                        v[i] = l;
                        break;
                    }
                }
            }
            System.out.println("");
            System.out.println("le quedan "+intentos(ah)+" intentos");
            System.out.println("---------------------------------------------");
            for (int i = 0; i < m.length; i++) {
                if (m[i].equals(l)) {
                    w[i] = l;
                }
            }
        } while (intentos(ah) > 0 && ah.getAciertos() < m.length);
        
        System.out.println("la palabra es: ");
        for (int i = 0; i < m.length; i++) {
            System.out.print(w[i]);
        }
        System.out.println("");
            
        System.out.println("Palabra completada gracias por jugar, se gano");
        System.out.println("una prueva gratis de nuestro siguiente juego");
        System.out.println("titulado Paredon de Fucilamiento, espere nuestro llamado");
    }
}