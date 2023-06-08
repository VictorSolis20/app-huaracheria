
package com.mycompany.interfaces;

import com.mycompany.models.DomicilioPersonal;
import java.util.List;

public interface DAODomicilioPersonal {
    public void registrar(DomicilioPersonal domPersonal) throws Exception;
    public void eliminar(int domPersonalId) throws Exception;
    public List<DomicilioPersonal> listar(int idPersonalSeleccionado) throws Exception;
}
