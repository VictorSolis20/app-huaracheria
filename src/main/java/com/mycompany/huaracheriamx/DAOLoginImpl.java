package com.mycompany.huaracheriamx;

import com.mycompany.db.Database;
import com.mycompany.interfaces.DAOLogin;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class DAOLoginImpl extends Database implements DAOLogin {

    @Override
    public void validaUsuario(JTextField ingresaUsuario, JPasswordField ingresaPassword) throws Exception {
        String contrasena = String.valueOf(ingresaPassword.getPassword());
        if (ingresaUsuario.getText().equals("martin18") && contrasena.equals("martinez18")) {
            MenuPrincipal objetoMenu = new MenuPrincipal();
            FormLogin form = new FormLogin();
            objetoMenu.setVisible(true);
            form.setVisible(false);
        } else {
            try {
                this.Conectar();
//            ResultSet rs = null;
                PreparedStatement ps = this.conexion.prepareStatement("SELECT * FROM personal WHERE usuario = ? and password = ?;");

                String contra = String.valueOf(ingresaPassword.getPassword());

                ps.setString(1, ingresaUsuario.getText());
                ps.setString(2, contra);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    try {
                        int valorLoginPersonal = 0;
                        DAOLogin dao = new DAOLoginImpl();
                        valorLoginPersonal = dao.obtenerIdPersonal(ingresaUsuario.getText(), contra);
                        MuestraHuaracheTejido huarTejido = new MuestraHuaracheTejido(valorLoginPersonal);
                        FormLogin form = new FormLogin();
                        huarTejido.setVisible(true);
                        form.setVisible(false);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El usuario y/o contraseña son incorrectos.", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public int obtenerIdPersonal(String usuario, String contrasena) throws Exception {
        int valorId = 0;
        try {

            this.Conectar();
            PreparedStatement st = this.conexion.prepareStatement("SELECT idPersonal FROM personal WHERE usuario = '" + usuario + "' and password = '" + contrasena + "';");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                valorId = rs.getInt("idPersonal");
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.Cerrar();
        }
        return valorId;
    }

}
