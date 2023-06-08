
package com.mycompany.interfaces;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public interface DAOLogin {
    public void validaUsuario(JTextField ingresaUsuario, JPasswordField ingresaPassword) throws Exception;
    public int obtenerIdPersonal(String usuario, String contrasena) throws Exception;
}
