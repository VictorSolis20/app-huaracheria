
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOPrestamoPersonal;
import com.mycompany.models.PrestamoPersonal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOPrestamoPersonalImpl extends Database implements DAOPrestamoPersonal{

    @Override
    public void registrar(PrestamoPersonal prestPersonal) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO prestamopersonal(montoPrestamo, fechaRegistro, idPersonal, status) VALUES(?,?,?,?)");
            st.setFloat(1, prestPersonal.getMontoPrestamo());
            st.setString(2, prestPersonal.getFechaRegistro());
            st.setInt(3, prestPersonal.getIdPersonal());
            st.setString(4, prestPersonal.getStatus());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void modificar(PrestamoPersonal prestPersonal) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE prestamopersonal SET montoPrestamo = ?, status = ? WHERE idPrestamo = ?;");
            st.setFloat(1, prestPersonal.getMontoPrestamo());
            st.setString(2, prestPersonal.getStatus());
            st.setInt(3, prestPersonal.getIdPrestamo());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<PrestamoPersonal> listar(int idPersonalSeleccionado) throws Exception {
        List<PrestamoPersonal> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM prestamopersonal WHERE idPersonal = "+idPersonalSeleccionado+" ORDER BY fechaRegistro DESC;");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                PrestamoPersonal prestPersonal = new PrestamoPersonal();
                prestPersonal.setIdPrestamo(rs.getInt("idPrestamo"));
                prestPersonal.setMontoPrestamo(rs.getFloat("montoPrestamo"));
                prestPersonal.setFechaRegistro(rs.getString("fechaRegistro"));
                prestPersonal.setIdPersonal(rs.getInt("idPersonal"));
                prestPersonal.setStatus(rs.getString("status"));
                lista.add(prestPersonal);
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
    public float obtenerSueldoPorPagar(int idPersonal) throws Exception {
        float sueldoPorPagar = 0;
        try{
            
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT SUM(totalPago) AS sumaTotalPago FROM huarachetejido WHERE status = 'Pendiente' AND idPersonal = "+idPersonal+";");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                sueldoPorPagar = rs.getFloat("sumaTotalPago");
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return sueldoPorPagar;
    }

    @Override
    public float obtenerPrestamosAprovados(int idPersonal) throws Exception {
        float montoPrestamosAprovados = 0;
        try{
            
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT SUM(montoPrestamo) AS sumaMontoPrestamo FROM prestamopersonal WHERE status = 'Aprobado' AND idPersonal = "+idPersonal+";");
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                montoPrestamosAprovados = rs.getFloat("sumaMontoPrestamo");
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return montoPrestamosAprovados;
    }

    @Override
    public PrestamoPersonal getPrestamoById(int prestamoId) throws Exception {
        PrestamoPersonal prestPersonal = new PrestamoPersonal();
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM prestamopersonal WHERE idPrestamo = ? LIMIT 1;");
            st.setInt(1, prestamoId);
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                prestPersonal.setIdPrestamo(rs.getInt("idPrestamo"));
                prestPersonal.setMontoPrestamo(rs.getFloat("montoPrestamo"));
                prestPersonal.setFechaRegistro(rs.getString("fechaRegistro"));
                prestPersonal.setIdPersonal(rs.getInt("idPersonal"));
                prestPersonal.setStatus(rs.getString("status"));
            }
            rs.close();
            st.close();
            
        }catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
        return prestPersonal;
    }
    
}
