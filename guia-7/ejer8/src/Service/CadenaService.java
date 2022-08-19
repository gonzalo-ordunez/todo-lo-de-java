/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class CadenaService {
    Cadena ca = new Cadena();
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
        
    public Cadena crearCadena() {
        System.out.println("ingrese una frace o varias separadas por espacios");
        String frase = lr.next();
        ca.setFrase(frase);
        ca.setLongitud(frase.length());
        return ca;
    }
    
    public int mostrarVocales(Cadena ca) {
        int v = 0;
        for (int i = 0; i < ca.getLongitud(); i++) {
            switch (ca.getFrase().substring(i, i+1)) {
                case "a":
                    v++;
                break;
                case "A":
                    v++;
                break;
                case "e":
                    v++;
                break;
                case "E":
                    v++;
                break;
                case "i":
                    v++;
                break;
                case "I":
                    v++;
                break;
                case "o":
                    v++;
                break;
                case "O":
                    v++;
                break;
                case "u":
                    v++;
                break;
                case "U":
                    v++;
                break;
            }
        }
        return v;
    }
    
    public String invertirFrase(Cadena ca) {
        int j = ca.getLongitud() - 1;
        String ecarf = "";
        do {
            ecarf = ecarf.concat(ca.getFrase().substring(j,j+1));
            j--;
        } while (j >= 0);
        return ecarf;
    }
    
    public int vecesRepetido(String letra) {
        int r = 0;
        for (int i = 0; i < ca.getLongitud(); i++) {
            if (ca.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
                r++;
            }
        }
        return r;
    }
    
    public String compararLongitud(String frase) {
        String f;
        if (ca.getLongitud() > frase.length()) {
            f = "la nueva frase es mas corta";
        }else if (ca.getLongitud() == frase.length()) {
            f = "las frases son iguales";
        }else {
            f = "la nueva frase es mas larga";
        }
        return f;
    }
    
    public String unirFrases(String frase) {
        String f = ca.getFrase().concat(frase);
        return f;
    }
    
    public String reemplazar(String letra) {
        String f;
        f = ca.getFrase().replace("a", letra);
        return f;
    }
    
    public boolean contiene(String letra) {
        boolean con = ca.getFrase().contains(letra);
        return con;
    }
}
