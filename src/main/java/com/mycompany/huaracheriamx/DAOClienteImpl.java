
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOCliente;
import com.mycompany.models.Clientes;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOClienteImpl extends Database implements DAOCliente{

    @Override
    public void registrar(Clientes cliente) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO cliente(nombre, apaterno, amaterno, fechaHoraRegistro, correo, telefono) VALUES(?,?,?,?,?,?);");
            st.setString(1, cliente.getNombre());
            st.setString(2, cliente.getApaterno());
            st.setString(3, cliente.getAmaterno());
            st.setString(4, cliente.getFechaHoraRegistro());
            st.setString(5, cliente.getCorreo());
            st.setString(6, cliente.getTelefono());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(Clientes cliente) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE cliente SET nombre = ?, apaterno = ?, amaterno = ?, correo = ?, telefono = ? WHERE idCliente = ?;");
            st.setString(1, cliente.getNombre());
            st.setString(2, cliente.getApaterno());
            st.setString(3, cliente.getAmaterno());
            st.setString(4, cliente.getCorreo());
            st.setString(5, cliente.getTelefono());
            st.setInt(6, cliente.getIdCliente());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<Clientes> listar(String nombre) throws Exception {
        List<Clientes> lista = null;
        try {
            this.Conectar();
            //Se evalua si la variable nombre esta vacia
            String Query = nombre.isEmpty() ? "SELECT * FROM cliente;" : "SELECT * FROM cliente WHERE nombre LIKE '%"+nombre+"%';";
            PreparedStatement st = this.conexion.prepareStatement(Query);
            
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Clientes cliente = new Clientes();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApaterno(rs.getString("apaterno"));
                cliente.setAmaterno(rs.getString("amaterno"));
                cliente.setFechaHoraRegistro(rs.getString("fechaHoraRegistro"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setTelefono(rs.getString("telefono"));
                lista.add(cliente);
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

    //Obtiene la informacion de un cliente mediante un id que se pasa como parametro
    @Override
    public Clientes getClienteById(int clienteId) throws Exception {
        Clientes cliente = new Clientes();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM cliente WHERE idCliente = ? LIMIT 1;");
            //Esta sentencia se utiliza para remplazar el valor del signo ? de arriba
            st.setInt(1, clienteId);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApaterno(rs.getString("apaterno"));
                cliente.setAmaterno(rs.getString("amaterno"));
                cliente.setFechaHoraRegistro(rs.getString("fechaHoraRegistro"));
                cliente.setCorreo(rs.getString("correo"));
                cliente.setTelefono(rs.getString("telefono"));
            }
            rs.close();
            st.close();
            
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return cliente;
    }
    
}
