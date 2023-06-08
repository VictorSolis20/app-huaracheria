
package com.mycompany.models;

public class DetallePedido {
    private int idDetallePedido;
    private int cantidadPares;
    private String modeloTejido;
    private String colorTextura;
    private String tipoMaterial;
    private String tipoSuela;
    private String numeroParHuarches;
    private int idPedido;

    public int getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public int getCantidadPares() {
        return cantidadPares;
    }

    public void setCantidadPares(int cantidadPares) {
        this.cantidadPares = cantidadPares;
    }

    public String getModeloTejido() {
        return modeloTejido;
    }

    public void setModeloTejido(String modeloTejido) {
        this.modeloTejido = modeloTejido;
    }

    public String getColorTextura() {
        return colorTextura;
    }

    public void setColorTextura(String colorTextura) {
        this.colorTextura = colorTextura;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getTipoSuela() {
        return tipoSuela;
    }

    public void setTipoSuela(String tipoSuela) {
        this.tipoSuela = tipoSuela;
    }

    public String getNumeroParHuarches() {
        return numeroParHuarches;
    }

    public void setNumeroParHuarches(String numeroParHuarches) {
        this.numeroParHuarches = numeroParHuarches;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    
    
}
