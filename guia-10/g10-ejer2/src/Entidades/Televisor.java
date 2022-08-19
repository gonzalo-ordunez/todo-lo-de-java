/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public final class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, String color, String consumo_energetico, int peso) {
        super(color, consumo_energetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public void crearTelevisor() {
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.println("ingrese la resolucion");
        setResolucion(lr.nextInt());
        System.out.println("tiene TDT?");
        System.out.println("SI/NO");
        String si;
        si = lr.next();
        setTDT(si.equalsIgnoreCase("si"));
    }

    @Override
    public void precioFinal() {
        int p = precio;
        
        switch (consumo_energetico) {
            case "A":
                p = p + 1000;
                break;
            case "B":
                p = p + 800;
                break;
            case "C":
                p = p + 600;
                break;
            case "E":
                p = p + 500;
                break;
            case "D":
                p = p + 300;
                break;
            case "F":
                p = p + 100;
                break;
            default:
                throw new AssertionError();
        }
        
        if (peso <= 19) {
            p = p + 100;
        }else if (peso >= 20 && peso <= 49) {
            p = p + 500;
        }else if (peso >= 50 && peso <= 79) {
            p = p + 800;
        }else if (peso >= 80) {
            p = p + 1000;
        }
        
        precio = p;
        
        if (resolucion > 40) {
            setPrecio(getPrecio()+(getPrecio()*30/100));
        }
        if (isTDT()) {
            setPrecio(getPrecio()+500);
        }
        System.out.println("El precio de la Television es: "+precio);
    }
}
