/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.views;

import com.mycompany.huaracheriamx.DAOColorTexturaImpl;
import com.mycompany.huaracheriamx.DAOHuaracheTejidoImpl;
import com.mycompany.huaracheriamx.DAOModeloTejidoImpl;
import com.mycompany.huaracheriamx.DAOTipoMaterialImpl;
import com.mycompany.huaracheriamx.DAOTipoSuelaImpl;
import com.mycompany.interfaces.DAOColorTextura;
import com.mycompany.interfaces.DAOHuaracheTejido;
import com.mycompany.interfaces.DAOModeloTejido;
import com.mycompany.interfaces.DAOTipoMaterial;
import com.mycompany.interfaces.DAOTipoSuela;
import com.mycompany.models.ColorTextura;
import com.mycompany.models.HuaracheTejido;
import com.mycompany.models.ModeloTejido;
import com.mycompany.models.TipoMaterial;
import com.mycompany.models.TipoSuela;
import com.mycompany.utils.Utils;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Victor
 */
public class EditarHuarachesTejidos extends javax.swing.JPanel {

    //Se crea una variable que recibe el valor que se selecciono en el 
    //comboBox de la ventana "MuestraCaracteristicasHuarache".
    private int valorIdHuarachesTejidos;
//    private int idModeloTejidoSeleccionado;
    private float precioModeloTejidoSeleccionado;
    private float totalPagoParesTejidos;
    
    HuaracheTejido huaracheTejidoEdition;

    /**
     * Creates new form CaracteristicasHuarache
     */
    public EditarHuarachesTejidos() {
        initComponents();
        InitStyles();
    }

    public EditarHuarachesTejidos(HuaracheTejido huarTejido) {
        initComponents();
        huaracheTejidoEdition = huarTejido;
        InitStyles();
    }

    private void InitStyles() {
        //Se obtiene el valor status registrado en la base de datos y se almacena en una variable
        String valorStatus = huaracheTejidoEdition.getStatus(); // Suponiendo que huaracheTejidoEdition.getStatus() devuelve el valor String que deseas asignar
        int valorModeloTejido = huaracheTejidoEdition.getIdModeloTejido();
        
        //Se obtiene el ID y el precio del modelo de tejido seleccionado
        try {
            DAOHuaracheTejido dao = new DAOHuaracheTejidoImpl();
            precioModeloTejidoSeleccionado = dao.obtenerPorIdPrecioModeloTejido(valorModeloTejido);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        cantidadTejidoTxt.setText(String.valueOf(huaracheTejidoEdition.getCantidadHuarachesTejidos()));
        observacionesTxt.setText(huaracheTejidoEdition.getObservaciones());
        
        if(valorStatus.equals("Pendiente")){
            statusComboBox.addItem(valorStatus);
            statusComboBox.addItem("Pagado");
            statusComboBox.addItem("Rechazado");
        }else if(valorStatus.equals("Pagado")){
            statusComboBox.addItem(valorStatus);
            statusComboBox.addItem("Rechazado");
            statusComboBox.addItem("Pendiente");
        }else if(valorStatus.equals("Rechazado")){
            statusComboBox.addItem(valorStatus);
            statusComboBox.addItem("Pagado");
            statusComboBox.addItem("Pendiente");
        }
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1 = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        nombreLbl2 = new javax.swing.JLabel();
        cantidadTejidoTxt = new javax.swing.JTextField();
        nombreLbl = new javax.swing.JLabel();
        observacionesTxt = new javax.swing.JTextField();
        guardarBtn = new javax.swing.JButton();
        statusLbl = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        image1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        title1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("huaraches tejidos");
        title1.setPreferredSize(new java.awt.Dimension(215, 32));

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huaracheTejido.png"))); // NOI18N

        title2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Edición de registros de");
        title2.setPreferredSize(new java.awt.Dimension(215, 32));

        nombreLbl2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nombreLbl2.setText("Cantidad de huaraches tejidos:");

        cantidadTejidoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        nombreLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nombreLbl.setText("Observaciones");

        observacionesTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        guardarBtn.setBackground(new java.awt.Color(18, 90, 173));
        guardarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        guardarBtn.setForeground(new java.awt.Color(255, 255, 255));
        guardarBtn.setText("Guardar");
        guardarBtn.setBorderPainted(false);
        guardarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarBtn.setFocusPainted(false);
        guardarBtn.setPreferredSize(new java.awt.Dimension(100, 40));
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        statusLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        statusLbl.setText("Status del pago:");

        statusComboBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        statusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboBoxActionPerformed(evt);
            }
        });

        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/huaracheteji.png"))); // NOI18N

        jSeparator7.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator7.setPreferredSize(new java.awt.Dimension(200, 10));

        jSeparator8.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator8.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(40, 40, 40))
                    .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreLbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(cantidadTejidoTxt)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(statusLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(68, 68, 68))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(statusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(nombreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(observacionesTxt)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(guardarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)))
                .addGap(14, 14, 14)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(image1)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLbl2)
                        .addGap(8, 8, 8)
                        .addComponent(cantidadTejidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(statusLbl)
                        .addGap(8, 8, 8)
                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(nombreLbl)
                        .addGap(8, 8, 8)
                        .addComponent(observacionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addGap(100, 100, 100))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed

        //Código mediante el cual se obtiene el formato de fecha
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActualString = formato.format(fechaActual);

        //Se obtiene el valor seleccionado del comboBox de la interfaz grafica
        String valorStatusComboBox = (String) statusComboBox.getSelectedItem();

        //Se extraen los datos ingresados por el usuario mediante la interfaz grafica
        String cantidadHuaracheTejido = cantidadTejidoTxt.getText();
        String observaciones = observacionesTxt.getText();

        //Validaciones para los campos
        // Se pone el nombre de la variable y con la función isEmpty() se evalua si esta vacia
        if (cantidadHuaracheTejido.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            // Posiciona el cursor en el campo nombre
            cantidadTejidoTxt.requestFocus();
            return;
        } else if (valorStatusComboBox == "          ") {
            javax.swing.JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna opción en el apartado status del pagoo. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            statusComboBox.requestFocus();
            return;
        } else if (!Utils.isNumeric(cantidadHuaracheTejido)) {
            javax.swing.JOptionPane.showMessageDialog(this, "El campo cantidad de huaraches tejidos debe contener números enteros. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            cantidadTejidoTxt.requestFocus();
            return;
        }
        

        //Se realizan las operaciones para calcular el pago de los huaraches tejidos
        totalPagoParesTejidos = precioModeloTejidoSeleccionado * Integer.parseInt(cantidadHuaracheTejido);

        //Se asignan los valores para registrarlos en la base de datos
        HuaracheTejido huarTejido = huaracheTejidoEdition;
        huarTejido.setCantidadHuarachesTejidos(Integer.parseInt(cantidadHuaracheTejido)); ///////////////////////////////////////////////////////////////////
        huarTejido.setObservaciones(observaciones);
        huarTejido.setStatus(valorStatusComboBox);
        huarTejido.setTotalPago(totalPagoParesTejidos);
        huarTejido.setIdHuaracheTejido(huaracheTejidoEdition.getIdHuaracheTejido());

        try {
            DAOHuaracheTejido dao = new DAOHuaracheTejidoImpl();
            dao.modificar(huarTejido);
            javax.swing.JOptionPane.showMessageDialog(this, "El registro de los huaraches tejidos fue modificado exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al modificar el registro de los huaraches tejidos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void statusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadTejidoTxt;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel image;
    private javax.swing.JLabel image1;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JLabel nombreLbl2;
    private javax.swing.JTextField observacionesTxt;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
