
package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAODetallePedido;
import com.mycompany.models.DetallePedido;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAODetallePedidoImpl extends Database implements DAODetallePedido{

    /**
     * En
     * @param detailPedido
     * @throws Exception 
     */
    @Override
    public void registrar(DetallePedido detailPedido) throws Exception {
        try {
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("INSERT INTO detallepedido(cantidadPares, modeloTejido, colorTextura, tipoMaterial, tipoSuela, numeroParHuaraches, idPedido) VALUES(?,?,?,?,?,?,?)");
            st.setInt(1, detailPedido.getCantidadPares());
            st.setString(2, detailPedido.getModeloTejido());
            st.setString(3, detailPedido.getColorTextura());
            st.setString(4, detailPedido.getTipoMaterial());
            st.setString(5, detailPedido.getTipoSuela());
            st.setString(6, detailPedido.getNumeroParHuarches());
            st.setInt(7, detailPedido.getIdPedido());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally{
            this.Cerrar();
        }
    }

    @Override
    public List<DetallePedido> listar(int idPedido) throws Exception {
        List<DetallePedido> lista = null;
        try{
            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT * FROM detallepedido WHERE idPedido = "+idPedido+";");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            while(rs.next()){
                DetallePedido detailPedido = new DetallePedido();
                detailPedido.setIdDetallePedido(rs.getInt("idDetallePedido"));
                detailPedido.setCantidadPares(rs.getInt("cantidadPares"));
                detailPedido.setModeloTejido(rs.getString("modeloTejido"));
                detailPedido.setColorTextura(rs.getString("colorTextura"));
                detailPedido.setTipoMaterial(rs.getString("tipoMaterial"));
                detailPedido.setTipoSuela(rs.getString("tipoSuela"));
                detailPedido.setNumeroParHuarches(rs.getString("numeroParHuaraches"));
                detailPedido.setIdPedido(rs.getInt("idPedido"));
                lista.add(detailPedido);
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
