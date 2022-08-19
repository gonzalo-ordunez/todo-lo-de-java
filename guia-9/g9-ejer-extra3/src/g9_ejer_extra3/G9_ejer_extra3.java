/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g9_ejer_extra3;

import Entidades.Gestion_Integral_de_clientes;
import Entidades.Gestion_de_Polizas;
import Entidades.Gestion_de_vehiculos;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class G9_ejer_extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gestion_Integral_de_clientes c = new Gestion_Integral_de_clientes();
        Gestion_de_vehiculos v = new Gestion_de_vehiculos();
        Gestion_de_Polizas n = new Gestion_de_Polizas();
        Date d = new Date();
//        int num_poliza, Date fecha_inicio, Date fecha_final, int can_cuotas, String forma_pag, 
//        double monto_total_asegurado, boolean incluye_granizo, int monto_total_granizo,
//        String tipo_cobertura, Gestion_de_vehiculos auto, Gestion_Integral_de_clientes cliente){
        
        n.crearPoliza(1, d, d, 3, "tarjeta", 1000.0, true, 100, "completa", v, c);
        
        
    }
    
}
