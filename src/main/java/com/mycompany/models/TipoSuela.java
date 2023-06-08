
package com.mycompany.models;

public class TipoSuela {
    private int idTipoSuela;
    private String nombre;
    private String observaciones;
    private String fechaRegistro;

    public int getIdTipoSuela() {
        return idTipoSuela;
    }

    public void setIdTipoSuela(int idTipoSuela) {
        this.idTipoSuela = idTipoSuela;
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
