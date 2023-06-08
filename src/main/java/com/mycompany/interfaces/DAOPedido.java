
package com.mycompany.interfaces;

import com.mycompany.models.Pedido;
import java.util.List;

public interface DAOPedido {
    public void registrar(Pedido order) throws Exception;
    public List<Pedido> listarNombresModeloTejido() throws Exception;
    public List<Pedido> listarNombresTipoSuela() throws Exception;
    public List<Pedido> listarNombresTipoMaterial() throws Exception;
    public List<Pedido> listarNombresColorTextura() throws Exception;
    public int obtenerUltimoIdRegistrado() throws Exception;
    public List<Pedido> listar() throws Exception;
}
