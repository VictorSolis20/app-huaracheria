
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOModeloTejido;
import com.mycompany.models.ModeloTejido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOModeloTejidoImpl extends Database implements DAOModeloTejido{

    @Override
    public void registrar(ModeloTejido modTejido) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO modelotejido(nombre, observaciones, fechaRegistro, precioParHuarache) VALUES(?,?,?,?);");
            st.setString(1, modTejido.getNombre());
            st.setString(2, modTejido.getObservaciones());
            st.setString(3, modTejido.getFechaRegistro());
            st.setFloat(4, modTejido.getPrecioParHuarache());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        }finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(ModeloTejido modTejido) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE modelotejido SET nombre = ?, observaciones = ?, precioParHuarache = ? WHERE idModeloTejido = ?;");
            st.setString(1, modTejido.getNombre());
            st.setString(2, modTejido.getObservaciones());
            st.setFloat(3, modTejido.getPrecioParHuarache());
            st.setFloat(4, modTejido.getIdModeloTejido());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        }finally{
            this.Cerrar();
        }
    }

    @Override
    public List<ModeloTejido> listar() throws Exception {
        List<ModeloTejido> lista =null;
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM modelotejido;");
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ModeloTejido modTejido = new ModeloTejido();
                modTejido.setIdModeloTejido(rs.getInt("idModeloTejido"));
                modTejido.setNombre(rs.getString("nombre"));
                modTejido.setObservaciones(rs.getString("observaciones"));
                modTejido.setFechaRegistro(rs.getString("fechaRegistro"));
                modTejido.setPrecioParHuarache(rs.getFloat("precioParHuarache"));
                lista.add(modTejido);
                
            }
            rs.close();
            st.close();
            
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public ModeloTejido getModeloTejidoById(int modTejidoId) throws Exception {
        ModeloTejido modTejido = new ModeloTejido();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM modelotejido WHERE idModeloTejido = ? LIMIT 1;");
            st.setInt(1, modTejidoId);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                modTejido.setIdModeloTejido(rs.getInt("idModeloTejido"));
                modTejido.setNombre(rs.getString("nombre"));
                modTejido.setObservaciones(rs.getString("observaciones"));
                modTejido.setFechaRegistro(rs.getString("fechaRegistro"));
                modTejido.setPrecioParHuarache(rs.getFloat("precioParHuarache"));
            }
            rs.close();
            st.close();
            
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return modTejido;
    }
    
    
}
