
package com.mycompany.interfaces;

import com.mycompany.models.TipoSuela;
import java.util.List;

public interface DAOTipoSuela {
    public void registrar(TipoSuela typeSuela) throws Exception;
    public void modificar(TipoSuela typeSuela) throws Exception;
    public List<TipoSuela> listar() throws Exception;
    public TipoSuela getTipoSuelaById(int typeSuelaId) throws Exception;
}
