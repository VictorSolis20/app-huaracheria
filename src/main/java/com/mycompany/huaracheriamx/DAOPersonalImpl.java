
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOPersonal;
import com.mycompany.models.Personal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOPersonalImpl extends Database implements DAOPersonal {

    @Override
    public void registrar(Personal persona) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO personal(nombre, apaterno, amaterno, telefono, correo, fechaRegistro, usuario, password, status) VALUES(?,?,?,?,?,?,?,?,?);");
            st.setString(1, persona.getNombre());
            st.setString(2, persona.getApaterno());
            st.setString(3, persona.getAmaterno());
            st.setString(4, persona.getTelefono());
            st.setString(5, persona.getCorreo());
            st.setString(6, persona.getFechaRegistro());
            st.setString(7, persona.getUsuario());
            st.setString(8, persona.getPassword());
            st.setString(9, persona.getStatus());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Personal persona) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE personal SET nombre = ?, apaterno = ?, amaterno = ?, telefono = ?, correo = ?, usuario = ?, password = ?, status = ? WHERE idPersonal = ?;");
            st.setString(1, persona.getNombre());
            st.setString(2, persona.getApaterno());
            st.setString(3, persona.getAmaterno());
            st.setString(4, persona.getTelefono());
            st.setString(5, persona.getCorreo());
            st.setString(6, persona.getUsuario());
            st.setString(7, persona.getPassword());
            st.setString(8, persona.getStatus());
            st.setInt(9, persona.getIdPersonal());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void eliminar(Personal persona) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Personal> listar(String nombre) throws Exception {
        List<Personal> lista = null;
        try {
            this.Conectar();
            String Query = nombre.isEmpty() ? "SELECT * FROM personal;" : "SELECT * FROM personal WHERE nombre LIKE '%" + nombre + "%';";
              PreparedStatement st = this.conexion.prepareStatement(Query);  
               
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Personal persona = new Personal();
                persona.setIdPersonal(rs.getInt("idPersonal"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApaterno(rs.getString("apaterno"));
                persona.setAmaterno(rs.getString("amaterno"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setCorreo(rs.getString("correo"));
                persona.setFechaRegistro(rs.getString("fechaRegistro"));
                persona.setUsuario(rs.getString("usuario"));
                persona.setPassword(rs.getString("password"));
                persona.setStatus(rs.getString("status"));
                lista.add(persona);
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
    public Personal getPersonalById(int personalId) throws Exception {
        Personal persona = new Personal();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM personal WHERE idPersonal = ? LIMIT 1;");
            st.setInt(1, personalId);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                persona.setIdPersonal(rs.getInt("idPersonal"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApaterno(rs.getString("apaterno"));
                persona.setAmaterno(rs.getString("amaterno"));
                persona.setTelefono(rs.getString("telefono"));
                persona.setCorreo(rs.getString("correo"));
                persona.setFechaRegistro(rs.getString("fechaRegistro"));
                persona.setUsuario(rs.getString("usuario"));
                persona.setPassword(rs.getString("password"));
                persona.setStatus(rs.getString("status"));
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return persona;
    }

}
