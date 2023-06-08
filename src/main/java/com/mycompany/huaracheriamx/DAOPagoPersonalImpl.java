
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOPagoPersonal;
import com.mycompany.models.PagoPersonal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAOPagoPersonalImpl extends Database implements DAOPagoPersonal{

    @Override
    public void registrar(PagoPersonal payPersonal) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO pagopersonal(montoTotalTejido, montoTotalPrestamos, montoTotalSueldo, fechaRegistro, idPersonal) VALUES(?,?,?,?,?)");
            st.setFloat(1, payPersonal.getMontoTotalTejido());
            st.setFloat(2, payPersonal.getMontoTotalPrestamo());
            st.setFloat(3, payPersonal.getMontoTotalSueldo());
            st.setString(4, payPersonal.getFechaRegistro());
            st.setInt(5, payPersonal.getIdPersonal());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<PagoPersonal> listar(int idPersonalSeleccionado) throws Exception {
        List<PagoPersonal> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM pagopersonal WHERE idPersonal = "+idPersonalSeleccionado+" ORDER BY fechaRegistro DESC;");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                PagoPersonal payPersonal = new PagoPersonal();
                payPersonal.setIdPagoPersonal(rs.getInt("idPagoPersonal"));
                payPersonal.setMontoTotalTejido(rs.getFloat("montoTotalTejido"));
                payPersonal.setMontoTotalPrestamo(rs.getFloat("montoTotalPrestamos"));
                payPersonal.setMontoTotalSueldo(rs.getFloat("montoTotalSueldo"));
                payPersonal.setFechaRegistro(rs.getString("fechaRegistro"));
                payPersonal.setIdPersonal(rs.getInt("idPersonal"));
                lista.add(payPersonal);
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
    public void cambioStatusHuaracheTejido() throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE huarachetejido SET status = 'Pagado' WHERE status = 'Pendiente';");
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public void cambioStatusPrestamo() throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("UPDATE prestamopersonal SET status = CASE WHEN status = 'Aprobado' THEN 'Pagado' WHEN status = 'Pendiente' THEN 'Rechazado' ELSE status END;");
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }



   
    
}
