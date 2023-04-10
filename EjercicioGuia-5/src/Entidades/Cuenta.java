/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;


import java.time.LocalDate;


/**
 *
 * @author Usuario
 */
public class Cuenta {
    
    private int numeroCuenta;
    private int DNI;
    private int saldoActual;
    private LocalDate date;
    private int extacciones;
    private int saldoRapido;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, int DNI, int saldoActual, LocalDate date, int extacciones, int saldoRapido) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.date = date;
        this.extacciones = extacciones;
        this.saldoRapido = saldoRapido;
    }

    

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public int getDNI() {
        return DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getExtacciones() {
        return extacciones;
    }

    public void setExtacciones(int extacciones) {
        this.extacciones = extacciones;
    }

    public int getSaldoRapido() {
        return saldoRapido;
    }

    public void setSaldoRapido(int saldoRapido) {
        this.saldoRapido = saldoRapido;
    }

  
    
}
