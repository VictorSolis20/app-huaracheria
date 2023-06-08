
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOColorTextura;
import com.mycompany.models.ColorTextura;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOColorTexturaImpl extends Database implements DAOColorTextura{

    @Override
    public void registrar(ColorTextura colorText) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO colortextura(nombre, observaciones, fechaRegistro) VALUES(?,?,?)");
            st.setString(1, colorText.getNombre());
            st.setString(2, colorText.getObservaciones());
            st.setString(3, colorText.getFechaRegistro());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(ColorTextura colorText) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE colortextura SET nombre = ?, observaciones = ? WHERE idColorTextura = ?;");
            st.setString(1, colorText.getNombre());
            st.setString(2, colorText.getObservaciones());
            st.setInt(3, colorText.getIdColorTextura());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<ColorTextura> listar() throws Exception {
        List<ColorTextura> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM colortextura");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ColorTextura colorText = new ColorTextura();
                colorText.setIdColorTextura(rs.getInt("idColorTextura"));
                colorText.setNombre(rs.getString("nombre"));
                colorText.setObservaciones(rs.getString("observaciones"));
                colorText.setFechaRegistro(rs.getString("fechaRegistro"));
                lista.add(colorText);
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
    public ColorTextura getColorTexturaById(int colorTextId) throws Exception {
        ColorTextura colorText = new ColorTextura();
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM colortextura WHERE idColorTextura = ? LIMIT 1;");
            st.setInt(1, colorTextId);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                colorText.setIdColorTextura(rs.getInt("idColorTextura"));
                colorText.setNombre(rs.getString("nombre"));
                colorText.setObservaciones(rs.getString("observaciones"));
                colorText.setFechaRegistro(rs.getString("fechaRegistro"));
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return colorText;
    }
    
}
