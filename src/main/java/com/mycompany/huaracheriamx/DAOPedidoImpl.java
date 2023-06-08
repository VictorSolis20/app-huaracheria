
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOPedido;
import com.mycompany.models.Pedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOPedidoImpl extends Database implements DAOPedido{

    @Override
    public void registrar(Pedido order) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO pedido(fechaRegistro, horaRegistro, idCliente, idDomicilioCliente) VALUES(?,?,?,?);");
            st.setString(1, order.getFechaRegistro());
            st.setString(2, order.getHoraRegistro());
            st.setInt(3, order.getIdCliente());
            st.setInt(4, order.getIdDomicilioCliente());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<Pedido> listarNombresModeloTejido() throws Exception {
        List<Pedido> listaNombresModeloTejido = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT nombre FROM modelotejido;");
            listaNombresModeloTejido = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Pedido order = new Pedido();
                order.setListaNombresModeloTejido(rs.getString("nombre"));
                listaNombresModeloTejido.add(order);
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return listaNombresModeloTejido;
    }

    @Override
    public List<Pedido> listarNombresTipoSuela() throws Exception {
        List<Pedido> listaNombresTipoSuela = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT nombre FROM tiposuela;");
            listaNombresTipoSuela = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Pedido order = new Pedido();
                order.setListaNombresTipoSuela(rs.getString("nombre"));
                listaNombresTipoSuela.add(order);
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return listaNombresTipoSuela;
    }

    @Override
    public List<Pedido> listarNombresTipoMaterial() throws Exception {
        List<Pedido> listaNombresTipoMaterial = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT nombre FROM tipomaterial;");
            listaNombresTipoMaterial = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Pedido order = new Pedido();
                order.setListaNombresTipoMaterial(rs.getString("nombre"));
                listaNombresTipoMaterial.add(order);
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return listaNombresTipoMaterial;
    }

    @Override
    public List<Pedido> listarNombresColorTextura() throws Exception {
        List<Pedido> listaNombresColorTextura = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT nombre FROM colortextura;");
            listaNombresColorTextura = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Pedido order = new Pedido();
                order.setListaNombresColorTextura(rs.getString("nombre"));
                listaNombresColorTextura.add(order);
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return listaNombresColorTextura;
    }

    @Override
    public int obtenerUltimoIdRegistrado() throws Exception {
        int ultimoIdPedido = 0;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT MAX(idPedido) AS ultimo_id FROM pedido;");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                ultimoIdPedido = rs.getInt("ultimo_id");
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return ultimoIdPedido;
    }

    @Override
    public List<Pedido> listar() throws Exception {
        List<Pedido> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM pedido ORDER BY fechaRegistro DESC;");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                Pedido order = new Pedido();
                order.setIdPedido(rs.getInt("idPedido"));
                order.setFechaRegistro(rs.getString("fechaRegistro"));
                order.setHoraRegistro(rs.getString("horaRegistro"));
                order.setIdCliente(rs.getInt("idCliente"));
                order.setIdDomicilioCliente(rs.getInt("idDomicilioCliente"));
                lista.add(order);
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
