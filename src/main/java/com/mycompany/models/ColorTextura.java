
package com.mycompany.models;

public class ColorTextura {
    private int idColorTextura;
    private String nombre;
    private String observaciones;
    private String fechaRegistro;

    public int getIdColorTextura() {
        return idColorTextura;
    }

    public void setIdColorTextura(int idColorTextura) {
        this.idColorTextura = idColorTextura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
}
