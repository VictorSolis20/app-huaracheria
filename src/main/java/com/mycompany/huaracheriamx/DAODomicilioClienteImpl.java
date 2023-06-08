
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAODomicilioCliente;
import com.mycompany.models.DomicilioCliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAODomicilioClienteImpl extends Database implements DAODomicilioCliente{

    @Override
    public void registrar(DomicilioCliente domCliente) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO domiciliocliente(estado, municipio, colonia, calle, numeroExterior, idCliente, fechaRegistro) VALUES(?,?,?,?,?,?,?)");
            st.setString(1, domCliente.getEstado());
            st.setString(2, domCliente.getMunicipio());
            st.setString(3, domCliente.getColonia());
            st.setString(4, domCliente.getCalle());
            st.setString(5, domCliente.getNumeroExterior());
            st.setInt(6, domCliente.getIdCliente());
            st.setString(7, domCliente.getFechaRegistro());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(int domClienteId) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("DELETE FROM domiciliocliente WHERE idDomicilioCliente = ?;");
            st.setInt(1, domClienteId);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<DomicilioCliente> listar(int idClienteSeleccionado) throws Exception {
        List<DomicilioCliente> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM domiciliocliente WHERE idCliente = "+idClienteSeleccionado+";");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                DomicilioCliente domCliente = new DomicilioCliente();
                domCliente.setIdDomicilioCliente(rs.getInt("idDomicilioCliente"));
                domCliente.setEstado(rs.getString("estado"));
                domCliente.setMunicipio(rs.getString("municipio"));
                domCliente.setColonia(rs.getString("colonia"));
                domCliente.setCalle(rs.getString("calle"));
                domCliente.setNumeroExterior(rs.getString("numeroExterior"));
                domCliente.setIdCliente(rs.getInt("idCliente"));
                domCliente.setFechaRegistro(rs.getString("fechaRegistro"));
                lista.add(domCliente);
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
