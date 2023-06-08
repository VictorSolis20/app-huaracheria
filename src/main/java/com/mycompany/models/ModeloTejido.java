
package com.mycompany.models;

public class ModeloTejido {
    private int idModeloTejido;
    private String nombre;
    private String observaciones;
    private String fechaRegistro;
    private float precioParHuarache;

    public int getIdModeloTejido() {
        return idModeloTejido;
    }

    public void setIdModeloTejido(int idModeloTejido) {
        this.idModeloTejido = idModeloTejido;
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

    public float getPrecioParHuarache() {
        return precioParHuarache;
    }

    public void setPrecioParHuarache(float precioParHuarache) {
        this.precioParHuarache = precioParHuarache;
    }
    
}
