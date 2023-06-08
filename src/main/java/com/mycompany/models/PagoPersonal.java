
package com.mycompany.models;

public class PagoPersonal {
    private int idPagoPersonal;
    private float montoTotalTejido;
    private float montoTotalPrestamo;
    private float montoTotalSueldo;
    private String fechaRegistro;
    private int idPersonal;

    public int getIdPagoPersonal() {
        return idPagoPersonal;
    }

    public void setIdPagoPersonal(int idPagoPersonal) {
        this.idPagoPersonal = idPagoPersonal;
    }

    public float getMontoTotalTejido() {
        return montoTotalTejido;
    }

    public void setMontoTotalTejido(float montoTotalTejido) {
        this.montoTotalTejido = montoTotalTejido;
    }

    public float getMontoTotalPrestamo() {
        return montoTotalPrestamo;
    }

    public void setMontoTotalPrestamo(float montoTotalPrestamo) {
        this.montoTotalPrestamo = montoTotalPrestamo;
    }

    public float getMontoTotalSueldo() {
        return montoTotalSueldo;
    }

    public void setMontoTotalSueldo(float montoTotalSueldo) {
        this.montoTotalSueldo = montoTotalSueldo;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdPersonal() {
        return idPersonal;
    }

    public void setIdPersonal(int idPersonal) {
        this.idPersonal = idPersonal;
    }
    
}
