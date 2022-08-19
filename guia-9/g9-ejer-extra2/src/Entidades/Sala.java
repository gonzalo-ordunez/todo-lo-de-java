/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author alumno
 */
public class Sala {
    private final HashMap<String,Cliente> columnas;
    private final HashMap<Integer,HashMap<String,Cliente>> filas;
    Scanner lr = new Scanner(System.in).useDelimiter("\n");
    
    public Sala() {
        this.columnas = new HashMap();
        this.filas = new HashMap();
    }

    public HashMap<String,Cliente> crearColumna(int edadm, int dine) {
        HashMap<String,Cliente> col = new HashMap();
        
        for (int i = 1; i <= 6; i++) {
            Cliente cli = new Cliente("cliente "+i,(int) ((Math.random() * 100 + 1) * 0.55),(int) (Math.random() * 100));
            if (edadm <= cli.getEdad() && dine <= cli.getDinero()) {
                switch(i){
                    case 1:
                        col.put("A", cli);
                    break;
                    case 2:
                        col.put("B", cli);
                    break;
                    case 3:
                        col.put("C", cli);
                    break;
                    case 4:
                        col.put("D", cli);
                    break;
                    case 5:
                        col.put("E", cli);
                    break;
                    case 6:
                        col.put("F", cli);
                    break;
                }
            }else {
                switch(i){
                    case 1:
                        col.put("A", null);
                    break;
                    case 2:
                        col.put("B", null);
                    break;
                    case 3:
                        col.put("C", null);
                    break;
                    case 4:
                        col.put("D", null);
                    break;
                    case 5:
                        col.put("E", null);
                    break;
                    case 6:
                        col.put("F", null);
                    break;
                }
            }
        }
        
        return col;
    }
    
    public ArrayList<Pelicula> crearCartelera() {
        ArrayList<Pelicula> pilis = new ArrayList();
        for (int i = 1; i <= 3; i++) {
            Pelicula peli = new Pelicula("peli "+i,2,(i*6),"paco");
            System.out.println(i-1);
            System.out.println(peli.toString());
            pilis.add(peli);
        }
        return pilis;
    }
    
    public void crearSala(int precio) {
        
        System.out.println("que pelicula va a tener la sala");
        ArrayList<Pelicula> pilis = crearCartelera();
        Pelicula peli = pilis.get(lr.nextInt());
        
        for (Integer i = 1; i <= 8; i++) {
            filas.put(i, crearColumna(peli.getEdad_minima(),precio));
        }
        
        System.out.println(peli.toString());
        
    }
    
    public void mostrarSala() {
        
        for (Map.Entry<Integer, HashMap<String, Cliente>> entry : filas.entrySet()) {
            Integer key = entry.getKey();
            HashMap<String, Cliente> value = entry.getValue();
            System.out.print("|");
            for (Map.Entry<String, Cliente> entry1 : value.entrySet()) {
                System.out.print(key);
                String key1 = entry1.getKey();
                Cliente value1 = entry1.getValue();
                if (value1 == null) {
                    System.out.print(" "+key1+"   "+"|");
                }else {
                    System.out.print(" "+key1+" X "+"|");
                }
            }
            System.out.println("");
        }
        
//        HashMap<Integer,HashMap<String,String>> fila

//        fila.entrySet().forEach((aux) -> {
//            Integer key = aux.getKey();
//            HashMap<String, String> value = aux.getValue();
//            System.out.println(key);
//            value.entrySet().forEach((a) -> {
//                String key1 = a.getKey();
//                String value1 = a.getValue();
//                
//                System.out.print(key1+value1+"|");
//            });
//        });
    }
    
    
    
}
//De Cine nos interesa conocer la película que se está reproduciendo, la
//sala con los espectadores y el precio de la entrada.