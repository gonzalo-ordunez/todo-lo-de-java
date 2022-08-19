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
public class Gestion_de_cuotas {
    
    private int num_cuota;
    private double monto_total;
    private boolean pagada;
    private Date fecha_vencimiento;
    private String forma_pago;
//    Esas cuotas van a contener la siguiente información: número de cuota,
//    monto total de la cuota, si está o no pagada, fecha de vencimiento, 
//    forma de pago (efectivo, transferencia, etc.).

    public Gestion_de_cuotas(int num_cuota, double monto_total, boolean pagada, Date fecha_vencimiento, String forma_pago) {
        this.num_cuota = num_cuota;
        this.monto_total = monto_total;
        this.pagada = pagada;
        this.fecha_vencimiento = fecha_vencimiento;
        this.forma_pago = forma_pago;
    }

    public Gestion_de_cuotas() {
    }

    public int getNum_cuota() {
        return num_cuota;
    }

    public void setNum_cuota(int num_cuota) {
        this.num_cuota = num_cuota;
    }

    public double getMonto_total() {
        return monto_total;
    }

    public void setMonto_total(double monto_total) {
        this.monto_total = monto_total;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }
}
