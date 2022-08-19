/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author alumno
 */
public class Ahorcado {
    private String[] palabra;
    private int aciertos;
    private int limite;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int aciertos, int limite) {
        this.palabra = palabra;
        this.aciertos = aciertos;
        this.limite = limite;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    
}
//Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como
//atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
//jugadas máximas que puede realizar el usuario. Definir los siguientes métodos con los
//parámetros que sean necesarios:
