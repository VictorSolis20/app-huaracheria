
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOTipoSuela;
import com.mycompany.models.TipoSuela;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOTipoSuelaImpl extends Database implements DAOTipoSuela{

    @Override
    public void registrar(TipoSuela typeSuela) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO tiposuela(nombre, observaciones, fechaRegistro) VALUES(?,?,?)");
            st.setString(1, typeSuela.getNombre());
            st.setString(2, typeSuela.getObservaciones());
            st.setString(3, typeSuela.getFechaRegistro());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(TipoSuela typeSuela) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE tiposuela SET nombre = ?, observaciones = ? WHERE idTipoSuela = ?;");
            st.setString(1, typeSuela.getNombre());
            st.setString(2, typeSuela.getObservaciones());
            st.setInt(3, typeSuela.getIdTipoSuela());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<TipoSuela> listar() throws Exception {
        List<TipoSuela> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM tiposuela");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                TipoSuela typeSuela = new TipoSuela();
                typeSuela.setIdTipoSuela(rs.getInt("idTipoSuela"));
                typeSuela.setNombre(rs.getString("nombre"));
                typeSuela.setObservaciones(rs.getString("observaciones"));
                typeSuela.setFechaRegistro(rs.getString("fechaRegistro"));
                lista.add(typeSuela);
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return lista;
    }

    @Override
    public TipoSuela getTipoSuelaById(int typeSuelaId) throws Exception {
        TipoSuela typeSuela = new TipoSuela();
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM tiposuela WHERE idTipoSuela = ? LIMIT 1;");
            st.setInt(1, typeSuelaId);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                typeSuela.setIdTipoSuela(rs.getInt("idTipoSuela"));
                typeSuela.setNombre(rs.getString("nombre"));
                typeSuela.setObservaciones(rs.getString("observaciones"));
                typeSuela.setFechaRegistro(rs.getString("fechaRegistro"));
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return typeSuela;
    }
    
}
