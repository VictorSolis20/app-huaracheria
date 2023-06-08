
package com.mycompany.interfaces;

import com.mycompany.models.PrestamoPersonal;
import java.util.List;

public interface DAOPrestamoPersonal {
    public void registrar(PrestamoPersonal prestPersonal) throws Exception;
    public void modificar(PrestamoPersonal prestPersonal) throws Exception;
    public List<PrestamoPersonal> listar(int idPersonalSeleccionado) throws Exception;
    public float obtenerSueldoPorPagar(int idPersonal) throws Exception;
    public float obtenerPrestamosAprovados(int idPersonal) throws Exception;
    public PrestamoPersonal getPrestamoById(int prestamoId) throws Exception;
}
