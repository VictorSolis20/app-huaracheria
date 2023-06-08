
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOHuaracheTejido;
import com.mycompany.models.HuaracheTejido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOHuaracheTejidoImpl extends Database implements DAOHuaracheTejido{

    @Override
    public void registrar(HuaracheTejido huarTejido) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO huarachetejido(cantidadHuarachesTejidos, observaciones, fechaRegistro, idPersonal, status, idModeloTejido, totalPago) VALUES(?,?,?,?,?,?,?)");
            st.setInt(1, huarTejido.getCantidadHuarachesTejidos());
            st.setString(2, huarTejido.getObservaciones());
            st.setString(3, huarTejido.getFechaRegistro());
            st.setInt(4, huarTejido.getIdPersonal());
            st.setString(5, huarTejido.getStatus());
            st.setInt(6, huarTejido.getIdModeloTejido());
            st.setFloat(7, huarTejido.getTotalPago());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<HuaracheTejido> listar(int idPersonal) throws Exception {
        List<HuaracheTejido> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM huarachetejido WHERE idPersonal = "+idPersonal+" ORDER BY fechaRegistro DESC;");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                HuaracheTejido huarTejido = new HuaracheTejido();
                huarTejido.setIdHuaracheTejido(rs.getInt("idHuaracheTejido"));
                huarTejido.setCantidadHuarachesTejidos(rs.getInt("cantidadHuarachesTejidos"));
                huarTejido.setObservaciones(rs.getString("observaciones"));
                huarTejido.setFechaRegistro(rs.getString("fechaRegistro"));
                huarTejido.setIdPersonal(rs.getInt("idPersonal"));
                huarTejido.setStatus(rs.getString("status"));
                huarTejido.setIdModeloTejido(rs.getInt("idModeloTejido"));
                huarTejido.setTotalPago(rs.getFloat("totalPago"));
                lista.add(huarTejido);
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
    public List<HuaracheTejido> listarNombresModeloTejido() throws Exception {
        List<HuaracheTejido> listaNombres = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT nombre FROM modelotejido;");
            listaNombres = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                HuaracheTejido huarTejido = new HuaracheTejido();
                huarTejido.setListaNombres(rs.getString("nombre"));
                listaNombres.add(huarTejido);
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return listaNombres;
    }

    @Override
    public int obtenerIdModeloTejido(String nombre) throws Exception {
        int valorId = 0;
        try{
            
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT idModeloTejido FROM modelotejido WHERE nombre = '"+nombre+"';");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                HuaracheTejido huarTejido = new HuaracheTejido();
                huarTejido.setIdModeloTejidoBuscado(rs.getInt("idModeloTejido"));
                valorId = rs.getInt("idModeloTejido");
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return valorId;
    }

    @Override
    public float obtenerPrecioModeloTejido(String nombreModeloTejido) throws Exception {
        float valorPrecio = 0;
        try{
            
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT precioParHuarache FROM modelotejido WHERE nombre = '"+nombreModeloTejido+"';");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                HuaracheTejido huarTejido = new HuaracheTejido();
                huarTejido.setPrecioModeloTejidoBuscado(rs.getFloat("precioParHuarache"));
                valorPrecio = rs.getFloat("precioParHuarache");
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return valorPrecio;
    }

    @Override
    public String obtenerNombrePersonalIngresado(int idPersonal) throws Exception {
        String nombrePersonal = "";
        try {

            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT nombre FROM personal WHERE idPersonal = " + idPersonal + ";");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                nombrePersonal = rs.getString("nombre");
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return nombrePersonal;
    }

    @Override
    public String obtenerApellidoPaternoTrabajador(int idPersonal) throws Exception {
        String apellidoPaternoPersonal = "";
        try {

            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT apaterno FROM personal WHERE idPersonal = " + idPersonal + ";");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                apellidoPaternoPersonal = rs.getString("apaterno");
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return apellidoPaternoPersonal;
    }

    @Override
    public String obtenerApellidoMaternoTrabajador(int idPersonal) throws Exception {
        String apellidoMaternoPersonal = "";
        try {

            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT amaterno FROM personal WHERE idPersonal = " + idPersonal + ";");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                apellidoMaternoPersonal = rs.getString("amaterno");
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return apellidoMaternoPersonal;
    }

    @Override
    public void modificar(HuaracheTejido huarTejido) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE huarachetejido SET cantidadHuarachesTejidos = ?, observaciones = ?, status = ?, totalPago = ? WHERE idHuaracheTejido = ?;");
            st.setInt(1, huarTejido.getCantidadHuarachesTejidos());
            st.setString(2, huarTejido.getObservaciones());
            st.setString(3, huarTejido.getStatus());
            st.setFloat(4, huarTejido.getTotalPago());
            st.setInt(5, huarTejido.getIdHuaracheTejido());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public HuaracheTejido getHuaracheTejidoById(int huarTejidoId) throws Exception {
        HuaracheTejido huaraTejido = new HuaracheTejido();
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM huarachetejido WHERE idHuaracheTejido = ? LIMIT 1;");
            st.setInt(1, huarTejidoId);
            
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                huaraTejido.setIdHuaracheTejido(rs.getInt("idHuaracheTejido"));
                huaraTejido.setCantidadHuarachesTejidos(rs.getInt("cantidadHuarachesTejidos"));
                huaraTejido.setObservaciones(rs.getString("observaciones"));
                huaraTejido.setStatus(rs.getString("status"));
                huaraTejido.setIdModeloTejido(rs.getInt("idModeloTejido"));
                huaraTejido.setTotalPago(rs.getFloat("totalPago"));
            }
            rs.close();
            st.close();
            
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return huaraTejido;
    }

    @Override
    public float obtenerPorIdPrecioModeloTejido(int idModeloTejido) throws Exception {
        float valorPrecio = 0;
        try{
            
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT precioParHuarache FROM modelotejido WHERE idModeloTejido = "+idModeloTejido+";");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                HuaracheTejido huarTejido = new HuaracheTejido();
                huarTejido.setPrecioModeloTejidoBuscado(rs.getFloat("precioParHuarache"));
                valorPrecio = rs.getFloat("precioParHuarache");
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return valorPrecio;
    }
    
}
