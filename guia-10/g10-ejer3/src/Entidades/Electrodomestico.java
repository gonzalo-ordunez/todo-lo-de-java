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
public class Electrodomestico {
    
    protected int precio = 1000;
    protected String color;
    protected String consumo_energetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, String consumo_energetico, int peso) {
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(String consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    public String comprobarConsumoEnergetico(String letra) {
        if (letra.equalsIgnoreCase("A")) {
            return "A";
        }else if (letra.equalsIgnoreCase("b")) {
            return "B";
        }else if (letra.equalsIgnoreCase("c")) {
            return "C";
        }else if (letra.equalsIgnoreCase("d")) {
            return "D";
        }else if (letra.equalsIgnoreCase("e")) {
            return "E";
        }else {
            return "F";
        }
    }
    
    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("negro")) {
            return "NEGRO";
        }else if (color.equalsIgnoreCase("rojo")) {
            return "ROJO";
        }else if (color.equalsIgnoreCase("azul")) {
            return "AZUL";
        }else if (color.equalsIgnoreCase("gris")) {
            return "GRIS";
        }else {
            return "BLANCO";
        }
    }
    
    public void precioFinal(){
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
        
    }
    
    public void crearElectrodomestico() {
        Scanner lr = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("hola ingrese las caracteristicas del electrodomestico");
        System.out.println("color");
        String color1 = lr.next();
        color1 = comprobarColor(color1);
        System.out.println("consumo energetico");
        String consumo1 = lr.next();
        consumo1 = comprobarConsumoEnergetico(consumo1);
        System.out.println("peso");
        int peso1 = lr.nextInt();
        setColor(color1);
        setConsumo_energetico(consumo1);
        setPeso(peso1);
    }
}
