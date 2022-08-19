/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;


import Entidades.Revolver_de_agua;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class RevolverService {
    Scanner lr;

    public RevolverService() {
    }

    
    public RevolverService(Scanner lr) {
        this.lr = new Scanner(System.in).useDelimiter("\n");
    }
    
    public Revolver_de_agua llenarRevolver() {
        Revolver_de_agua revolver = new Revolver_de_agua();
        
        revolver.setPosicion_actual((int) Math.round((Math.random() * 10 + 1) * 0.55));
        revolver.setPosicion_del_agua((int) Math.round((Math.random() * 10 + 1) * 0.55));
        
        return revolver;
        
    }
    
    public Boolean mojar(Revolver_de_agua revolver) {
        int pac = revolver.getPosicion_actual(); 
        int pag = revolver.getPosicion_del_agua();
        
        return pac == pag;
    }
    
    public void siguienteChorro(Revolver_de_agua revolver) {
        int n = revolver.getPosicion_actual();
        
        if (n == 5) {
            revolver.setPosicion_actual(0);
        }else {
            revolver.setPosicion_actual((n+1));
        }
    }
    
    public void mostrar(Revolver_de_agua revolver) {
        System.out.println(revolver.toString());
    }
}