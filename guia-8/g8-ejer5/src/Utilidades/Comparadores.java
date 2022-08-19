/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.Paises;
import java.util.Comparator;

/**
 *
 * @author alumno
 */
public class Comparadores {
    public static Comparator<Paises> ordna = new Comparator<Paises> () {
        @Override
        public int compare(Paises t, Paises t1) {
            return t.getPais().compareTo(t1.getPais());
        }
    };
}
