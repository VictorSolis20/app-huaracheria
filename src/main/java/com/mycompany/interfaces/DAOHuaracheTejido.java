
package com.mycompany.interfaces;

import com.mycompany.models.HuaracheTejido;
import java.util.List;

public interface DAOHuaracheTejido {
    public void registrar(HuaracheTejido huarTejido) throws Exception;
    public void modificar(HuaracheTejido huarTejido) throws Exception;
    public List<HuaracheTejido> listar(int idPersonal) throws Exception;
    public List<HuaracheTejido> listarNombresModeloTejido() throws Exception;
    public int obtenerIdModeloTejido(String nombre) throws Exception;
    public float obtenerPrecioModeloTejido(String nombreModeloTejido) throws Exception;
    public String obtenerNombrePersonalIngresado(int idPersonal) throws Exception;
    public String obtenerApellidoPaternoTrabajador(int idPersonal) throws Exception;
    public String obtenerApellidoMaternoTrabajador(int idPersonal) throws Exception;
    public HuaracheTejido getHuaracheTejidoById(int huarTejidoId) throws Exception;
    public float obtenerPorIdPrecioModeloTejido(int idModeloTejido) throws Exception;
}
