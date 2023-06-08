
package com.mycompany.interfaces;

import com.mycompany.models.Personal;
import java.util.List;

public interface DAOPersonal {
    public void registrar(Personal persona) throws Exception;
    public void modificar(Personal persona) throws Exception;
    public void eliminar(Personal persona) throws Exception;
    public List<Personal> listar(String nombre) throws Exception;
    public Personal getPersonalById(int personalId) throws Exception;
}
