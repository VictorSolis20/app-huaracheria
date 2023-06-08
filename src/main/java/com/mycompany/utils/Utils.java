package com.mycompany.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;

public class Utils {
    
    private String valorComboBox;

    public String getValorComboBox() {
        return valorComboBox;
    }

    public void setValorComboBox(String valorComboBox) {
        this.valorComboBox = valorComboBox;
    }
    
    
//    public static boolean isNumeric(String strNum) {
//        if (strNum == null) {
//            return false;
//        }
//        try {
//            double d = Integer.parseInt(strNum);
//        } catch (NumberFormatException nfe) {
//            return false;
//        }
//        return true;
//    }
    
    public static boolean isNumeric(String texto) {
        return texto.matches("\\d+"); // Expresión regular para verificar que solo contiene dígitos
    }
    
    
    
//    public static String getFechaActual() {
//        Date ahora = new Date();
//        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
//        return formateador.format(ahora);
//    }
}
