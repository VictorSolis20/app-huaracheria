
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOTipoMaterial;
import com.mycompany.models.TipoMaterial;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOTipoMaterialImpl extends Database implements DAOTipoMaterial{

    @Override
    public void registrar(TipoMaterial typeMaterial) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO tipomaterial(nombre, observaciones, fechaRegistro) VALUES(?,?,?)");
            st.setString(1, typeMaterial.getNombre());
            st.setString(2, typeMaterial.getObservaciones());
            st.setString(3, typeMaterial.getFechaRegistro());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(TipoMaterial typeMaterial) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE tipomaterial SET nombre = ?, observaciones = ? WHERE idTipoMaterial = ?;");
            st.setString(1, typeMaterial.getNombre());
            st.setString(2, typeMaterial.getObservaciones());
            st.setInt(3, typeMaterial.getIdTipoMaterial());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<TipoMaterial> listar() throws Exception {
        List<TipoMaterial> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM tipomaterial");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                TipoMaterial typeMaterial = new TipoMaterial();
                typeMaterial.setIdTipoMaterial(rs.getInt("idTipoMaterial"));
                typeMaterial.setNombre(rs.getString("nombre"));
                typeMaterial.setObservaciones(rs.getString("observaciones"));
                typeMaterial.setFechaRegistro(rs.getString("fechaRegistro"));
                lista.add(typeMaterial);
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
    public TipoMaterial getTipoMaterialById(int typeMaterialId) throws Exception {
        TipoMaterial typeMaterial = new TipoMaterial();
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM tipomaterial WHERE idTipoMaterial = ? LIMIT 1;");
            st.setInt(1, typeMaterialId);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                typeMaterial.setIdTipoMaterial(rs.getInt("idTipoMaterial"));
                typeMaterial.setNombre(rs.getString("nombre"));
                typeMaterial.setObservaciones(rs.getString("observaciones"));
                typeMaterial.setFechaRegistro(rs.getString("fechaRegistro"));
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return typeMaterial;
    }
    
}
