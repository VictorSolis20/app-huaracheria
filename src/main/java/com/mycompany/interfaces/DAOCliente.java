
package com.mycompany.interfaces;

import com.mycompany.models.Clientes;
import java.util.List;

public interface DAOCliente {
    public void registrar(Clientes cliente) throws Exception;
    public void modificar(Clientes cliente) throws Exception;
    public List<Clientes> listar(String nombre) throws Exception;
    public Clientes getClienteById(int clienteId) throws Exception;
    
}
