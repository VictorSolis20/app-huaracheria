
package com.mycompany.models;

public class Pedido {
    private int idPedido;
    private String fechaRegistro;
    private String horaRegistro;
    private int idCliente;
    private int idDomicilioCliente;
    private String listaNombresModeloTejido;
    private String listaNombresTipoSuela;
    private String listaNombresColorTextura;
    private String listaNombresTipoMaterial;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getHoraRegistro() {
        return horaRegistro;
    }

    public void setHoraRegistro(String horaRegistro) {
        this.horaRegistro = horaRegistro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdDomicilioCliente() {
        return idDomicilioCliente;
    }

    public void setIdDomicilioCliente(int idDomicilioCliente) {
        this.idDomicilioCliente = idDomicilioCliente;
    }

    public String getListaNombresModeloTejido() {
        return listaNombresModeloTejido;
    }

    public void setListaNombresModeloTejido(String listaNombresModeloTejido) {
        this.listaNombresModeloTejido = listaNombresModeloTejido;
    }

    public String getListaNombresTipoSuela() {
        return listaNombresTipoSuela;
    }

    public void setListaNombresTipoSuela(String listaNombresTipoSuela) {
        this.listaNombresTipoSuela = listaNombresTipoSuela;
    }

    public String getListaNombresColorTextura() {
        return listaNombresColorTextura;
    }

    public void setListaNombresColorTextura(String listaNombresColorTextura) {
        this.listaNombresColorTextura = listaNombresColorTextura;
    }

    public String getListaNombresTipoMaterial() {
        return listaNombresTipoMaterial;
    }

    public void setListaNombresTipoMaterial(String listaNombresTipoMaterial) {
        this.listaNombresTipoMaterial = listaNombresTipoMaterial;
    }

    
    
}
