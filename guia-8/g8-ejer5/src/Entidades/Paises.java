/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Objects;

/**
 *
 * @author alumno
 */
public class Paises {
    private String Pais;

    public Paises() {
    }

    public Paises(String Pais) {
        this.Pais = Pais;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.Pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paises other = (Paises) obj;
        if (!Objects.equals(this.Pais, other.Pais)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paises{" + "Pais=" + Pais + '}';
    }
    
    
}
