
package com.mycompany.interfaces;

import com.mycompany.models.DetallePedido;
import java.util.List;

public interface DAODetallePedido {
    public void registrar(DetallePedido detailPedido) throws Exception;
    public List<DetallePedido> listar(int idPedido) throws Exception;
}
