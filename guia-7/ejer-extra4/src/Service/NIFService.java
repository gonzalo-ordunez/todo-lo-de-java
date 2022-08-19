/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class NIFService {
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    String[] l = new String[23];

    public NIF crearNIF() {
        l[0] = "T";
        l[1] = "R";
        l[2] = "W";
        l[3] = "A";
        l[4] = "G";
        l[5] = "M";
        l[6] = "Y";
        l[7] = "F";
        l[8] = "P";
        l[9] = "D";
        l[10] = "X";
        l[11] = "B";
        l[12] = "N";
        l[13] = "J";
        l[14] = "Z";
        l[15] = "S";
        l[16] = "Q";
        l[17] = "V";
        l[18] = "H";
        l[19] = "L";
        l[20] = "C";
        l[21] = "K";
        l[22] = "E";
        
        System.out.println("ingrese el DNI");
        long n = 100000000+lr.nextLong();
        int m = (int) ((n-100000000) % 23);
        NIF nif = new NIF();
        nif.setDNI(n);
        nif.setLetra(l[m]);
        return nif;
    }
    
    public void mostrar(NIF nif) {
        System.out.println(String.valueOf(nif.getDNI()).substring(1,9)+"-"+nif.getLetra());
    }
}
