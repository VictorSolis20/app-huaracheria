
package com.mycompany.interfaces;

import com.mycompany.models.PagoPersonal;
import java.util.List;

public interface DAOPagoPersonal {
    public void registrar(PagoPersonal payPersonal) throws Exception;
    public List<PagoPersonal> listar(int idPersonalSeleccionado) throws Exception;
    public void cambioStatusHuaracheTejido() throws Exception;
    public void cambioStatusPrestamo() throws Exception;
}
