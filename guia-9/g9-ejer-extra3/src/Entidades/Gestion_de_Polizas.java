/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author alumno
 */
public class Gestion_de_Polizas {
    
    private int num_poliza;
    private Date fecha_inicio;
    private Date fecha_final;
    private int can_cuotas;
    private String forma_pag;
    private double monto_total_asegurado;
    private boolean incluye_granizo;
    private int monto_total_granizo;
    private String tipo_cobertura;
    private Gestion_de_vehiculos auto;
    private ArrayList<Gestion_de_cuotas> cuotas;
    private Gestion_Integral_de_clientes cliente;
    
    public Gestion_de_Polizas() {
    }

    public Gestion_de_Polizas(int num_poliza, Date fecha_inicio, Date fecha_final, int can_cuotas, 
            String forma_pag, double monto_total_asegurado, boolean incluye_granizo,
            int monto_total_granizo, String tipo_cobertura, Gestion_de_vehiculos auto, Gestion_Integral_de_clientes cliente) {
        this.num_poliza = num_poliza;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
        this.can_cuotas = can_cuotas;
        this.forma_pag = forma_pag;
        this.monto_total_asegurado = monto_total_asegurado;
        this.incluye_granizo = incluye_granizo;
        this.monto_total_granizo = monto_total_granizo;
        this.tipo_cobertura = tipo_cobertura;
        this.auto = auto;
        this.cliente = cliente;
    }

    public int getNum_poliza() {
        return num_poliza;
    }

    public void setNum_poliza(int num_poliza) {
        this.num_poliza = num_poliza;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }

    public int getCan_cuotas() {
        return can_cuotas;
    }

    public void setCan_cuotas(int can_cuotas) {
        this.can_cuotas = can_cuotas;
    }

    public String getForma_pag() {
        return forma_pag;
    }

    public void setForma_pag(String forma_pag) {
        this.forma_pag = forma_pag;
    }

    public double getMonto_total_asegurado() {
        return monto_total_asegurado;
    }

    public void setMonto_total_asegurado(double monto_total_asegurado) {
        this.monto_total_asegurado = monto_total_asegurado;
    }

    public boolean isIncluye_granizo() {
        return incluye_granizo;
    }

    public void setIncluye_granizo(boolean incluye_granizo) {
        this.incluye_granizo = incluye_granizo;
    }

    public int getMonto_total_granizo() {
        return monto_total_granizo;
    }

    public void setMonto_total_granizo(int monto_total_granizo) {
        this.monto_total_granizo = monto_total_granizo;
    }

    public String getTipo_cobertura() {
        return tipo_cobertura;
    }

    public void setTipo_cobertura(String tipo_cobertura) {
        this.tipo_cobertura = tipo_cobertura;
    }

    public Gestion_de_vehiculos getAuto() {
        return auto;
    }

    public void setAuto(Gestion_de_vehiculos auto) {
        this.auto = auto;
    }

    public ArrayList<Gestion_de_cuotas> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Gestion_de_cuotas> cuotas) {
        this.cuotas = cuotas;
    }

    public Gestion_Integral_de_clientes getCliente() {
        return cliente;
    }

    public void setCliente(Gestion_Integral_de_clientes cliente) {
        this.cliente = cliente;
    }
    
    public void crearPoliza(int num_poliza, Date fecha_inicio, Date fecha_final, int can_cuotas, String forma_pag, double monto_total_asegurado, boolean incluye_granizo, int monto_total_granizo, String tipo_cobertura, Gestion_de_vehiculos auto, Gestion_Integral_de_clientes cliente){
        setNum_poliza(num_poliza);
        setFecha_inicio(fecha_inicio);
        setFecha_final(fecha_final);
        setForma_pag(forma_pag);
        setCan_cuotas(can_cuotas);
        setForma_pag(forma_pag);
        setMonto_total_asegurado(monto_total_asegurado);
        setIncluye_granizo(incluye_granizo);
        setMonto_total_granizo(monto_total_granizo);
        setTipo_cobertura(tipo_cobertura);
        setAuto(auto);
        setCliente(cliente);
        setCuotas(crearCuota(can_cuotas,monto_total_asegurado,forma_pag,fecha_inicio));
    }
    
    public ArrayList<Gestion_de_cuotas> crearCuota(int can, double monto_t, String for_pag, Date f_v){
        ArrayList<Gestion_de_cuotas> cuots = new ArrayList();
        double d = monto_t/can;
        f_v.setMonth(f_v.getMonth()-1);
        
        for (int i = 1; i <= can; i++) {
            f_v.setMonth(f_v.getMonth()+i);
            Gestion_de_cuotas cuota = new Gestion_de_cuotas(i,d,false,f_v,for_pag);
            
        }
        
        return cuots;
    }
    
    
}
