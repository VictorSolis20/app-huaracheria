
package com.mycompany.interfaces;

import com.mycompany.models.TipoMaterial;
import java.util.List;

public interface DAOTipoMaterial {
    public void registrar(TipoMaterial typeMaterial) throws Exception;
    public void modificar(TipoMaterial typeMaterial) throws Exception;
    public List<TipoMaterial> listar() throws Exception;
    public TipoMaterial getTipoMaterialById(int typeMaterialId) throws Exception;
}
