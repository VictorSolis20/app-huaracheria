
package com.mycompany.models;

public class DomicilioCliente {
    private int idDomicilioCliente;
    private String estado;
    private String municipio;
    private String colonia;
    private String calle;
    private String numeroExterior;
    private int idCliente;
    private String fechaRegistro;

    public int getIdDomicilioCliente() {
        return idDomicilioCliente;
    }

    public void setIdDomicilioCliente(int idDomicilioCliente) {
        this.idDomicilioCliente = idDomicilioCliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumeroExterior() {
        return numeroExterior;
    }

    public void setNumeroExterior(String numeroExterior) {
        this.numeroExterior = numeroExterior;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
}
