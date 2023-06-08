
package com.mycompany.interfaces;

import com.mycompany.models.ModeloTejido;
import java.util.List;

public interface DAOModeloTejido {
    public void registrar(ModeloTejido modTejido) throws Exception;
    public void modificar(ModeloTejido modTejido) throws Exception;
    public List<ModeloTejido> listar() throws Exception;
    public ModeloTejido getModeloTejidoById(int modTejidoId) throws Exception;
}
