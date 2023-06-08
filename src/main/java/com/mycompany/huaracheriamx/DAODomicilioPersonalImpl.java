
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAODomicilioPersonal;
import com.mycompany.models.DomicilioPersonal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAODomicilioPersonalImpl extends Database implements DAODomicilioPersonal{

    @Override
    public void registrar(DomicilioPersonal domPersonal) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO domiciliopersonal(estado, municipio, colonia, calle, numeroExterior, idPersonal, fechaRegistro) VALUES(?,?,?,?,?,?,?)");
            st.setString(1, domPersonal.getEstado());
            st.setString(2, domPersonal.getMunicipio());
            st.setString(3, domPersonal.getColonia());
            st.setString(4, domPersonal.getCalle());
            st.setString(5, domPersonal.getNumeroExterior());
            st.setInt(6, domPersonal.getIdPersonal());
            st.setString(7, domPersonal.getFechaRegistro());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int domPersonalId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM domiciliopersonal WHERE idDomicilio = ?;");
            st.setInt(1, domPersonalId);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<DomicilioPersonal> listar(int idPersonalSeleccionado) throws Exception {
        List<DomicilioPersonal> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM domiciliopersonal WHERE idPersonal = "+idPersonalSeleccionado+";");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                DomicilioPersonal domPersonal = new DomicilioPersonal();
                domPersonal.setIdDomicilio(rs.getInt("idDomicilio"));
                domPersonal.setEstado(rs.getString("estado"));
                domPersonal.setMunicipio(rs.getString("municipio"));
                domPersonal.setColonia(rs.getString("colonia"));
                domPersonal.setCalle(rs.getString("calle"));
                domPersonal.setNumeroExterior(rs.getString("numeroExterior"));
                domPersonal.setIdPersonal(rs.getInt("idPersonal"));
                domPersonal.setFechaRegistro(rs.getString("fechaRegistro"));
                lista.add(domPersonal);
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
    
}
