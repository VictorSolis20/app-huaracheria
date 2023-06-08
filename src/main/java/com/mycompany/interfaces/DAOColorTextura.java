
package com.mycompany.interfaces;

import com.mycompany.models.ColorTextura;
import java.util.List;

public interface DAOColorTextura {
    public void registrar(ColorTextura colorText) throws Exception;
    public void modificar(ColorTextura colorText) throws Exception;
    //public void eliminar(ColorTextura colorText) throws Exception;
    public List<ColorTextura> listar() throws Exception;
    public ColorTextura getColorTexturaById(int colorTextId) throws Exception;
}
