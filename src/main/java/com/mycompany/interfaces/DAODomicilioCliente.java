
package com.mycompany.interfaces;

import com.mycompany.models.DomicilioCliente;
import java.util.List;

public interface DAODomicilioCliente {
    public void registrar(DomicilioCliente domCliente) throws Exception;
    public void eliminar(int domClienteId) throws Exception;
    public List<DomicilioCliente> listar(int idClienteSeleccionado) throws Exception;
    
}
