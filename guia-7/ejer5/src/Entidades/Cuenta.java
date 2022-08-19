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
public class Cuenta {
    private int numeroCuenta;
    private long DNI;
    private double saldo_actual;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, long DNI, double saldo_actual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldo_actual = saldo_actual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldo_actual() {
        return saldo_actual;
    }

    public void setSaldo_actual(double saldo_actual) {
        this.saldo_actual = saldo_actual;
    }
    
    
}
