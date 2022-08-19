/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author alumno
 */
public class Revolver_de_agua {
    private Integer posicion_actual;
    private Integer posicion_del_agua;

    public Revolver_de_agua() {
    }

    public Revolver_de_agua(Integer posicion_actual, Integer posicion_del_agua) {
        this.posicion_actual = posicion_actual;
        this.posicion_del_agua = posicion_del_agua;
    }

    public Integer getPosicion_actual() {
        return posicion_actual;
    }

    public void setPosicion_actual(Integer posicion_actual) {
        this.posicion_actual = posicion_actual;
    }

    public Integer getPosicion_del_agua() {
        return posicion_del_agua;
    }

    public void setPosicion_del_agua(Integer posicion_del_agua) {
        this.posicion_del_agua = posicion_del_agua;
    }

    @Override
    public String toString() {
        return "Revolver_de_agua{" + "posicion_actual=" + posicion_actual + ", posicion_del_agua=" + posicion_del_agua + '}';
    }
    
    
}
