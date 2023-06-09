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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Victor
 */
public class RegistroHuarachesTejidos extends javax.swing.JPanel {

    //Se crea una variable que recibe el valor que se selecciono en el 
    //comboBox de la ventana "MuestraCaracteristicasHuarache".
    private int valorIdPersonal;
    private int idModeloTejidoSeleccionado;
    private float precioModeloTejidoSeleccionado;
    private float totalPagoParesTejidos;

    /**
     * Creates new form CaracteristicasHuarache
     */
    public RegistroHuarachesTejidos() {
        initComponents();
        InitStyles();
        LoadRegistroHuarachesTejidos();
    }

    public RegistroHuarachesTejidos(int valor) {
        initComponents();
        valorIdPersonal = valor;
        InitStyles();
        LoadRegistroHuarachesTejidos();
    }

    private void InitStyles() {
        //Se evalua el valor que se extrajo del comboBox para aplicar los "placeholderText"
        cantidadTejidoTxt.putClientProperty("JTextField.placeholderText", "Ingrese la cantidad de huaraches tejidos.");
        observacionesTxt.putClientProperty("JTextField.placeholderText", "Ingrese las observaciones.");
    }
    
    private void LoadRegistroHuarachesTejidos(){
        //Se muestra el listado de los nombres de los modelos de tejido en el comboBox
        try {
            DAOHuaracheTejido dao = new DAOHuaracheTejidoImpl();
            List<HuaracheTejido> huaraches = dao.listarNombresModeloTejido();
            List<String> nombresModeloTejido = new ArrayList<>();

            for (HuaracheTejido huarache : huaraches) {
                String nombreModelo = huarache.getListaNombres();
                nombresModeloTejido.add(nombreModelo);
            }

            for (String nombre : nombresModeloTejido) {
                modeloTejidoComboBox.addItem(nombre);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
        nombreLbl1 = new javax.swing.JLabel();
        modeloTejidoComboBox = new javax.swing.JComboBox<>();
        nombreLbl2 = new javax.swing.JLabel();
        cantidadTejidoTxt = new javax.swing.JTextField();
        nombreLbl = new javax.swing.JLabel();
        observacionesTxt = new javax.swing.JTextField();
        registrarBtn = new javax.swing.JButton();
        statusLbl = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        image1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        title1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Tejidos");
        title1.setPreferredSize(new java.awt.Dimension(215, 32));

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rht2.png"))); // NOI18N

        title2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Registro de Huaraches");
        title2.setPreferredSize(new java.awt.Dimension(215, 32));

        nombreLbl1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nombreLbl1.setText("Seleccione el modelo de tejido:");

        modeloTejidoComboBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        modeloTejidoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "          " }));
        modeloTejidoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloTejidoComboBoxActionPerformed(evt);
            }
        });

        nombreLbl2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nombreLbl2.setText("Cantidad de huaraches tejidos:");

        cantidadTejidoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        nombreLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        nombreLbl.setText("Observaciones");

        observacionesTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        registrarBtn.setBackground(new java.awt.Color(18, 90, 173));
        registrarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        registrarBtn.setText("Registrar");
        registrarBtn.setBorderPainted(false);
        registrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarBtn.setFocusPainted(false);
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        statusLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        statusLbl.setText("Status del pago:");

        statusComboBox.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "          ", "Pendiente", "Pagado" }));
        statusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboBoxActionPerformed(evt);
            }
        });

        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rht.png"))); // NOI18N

        jSeparator5.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));

        jSeparator6.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(80, 80, 80)))
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(nombreLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(modeloTejidoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(cantidadTejidoTxt)
                                .addGap(60, 60, 60))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(statusLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(98, 98, 98))
                            .addComponent(statusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nombreLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(100, 100, 100))
                            .addComponent(observacionesTxt))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(registrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(45, 45, 45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(image)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombreLbl1)
                        .addGap(8, 8, 8)
                        .addComponent(modeloTejidoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(observacionesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 50, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void modeloTejidoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloTejidoComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloTejidoComboBoxActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed

        //Código mediante el cual se obtiene el formato de fecha
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActualString = formato.format(fechaActual);

        //Se obtiene el valor seleccionado del comboBox de la interfaz grafica
        String valorSeleccionadoComboBox = (String) modeloTejidoComboBox.getSelectedItem();
        String valorStatusComboBox = (String) statusComboBox.getSelectedItem();

        //Se obtiene el ID y el precio del modelo de tejido seleccionado
        try {
            DAOHuaracheTejido dao = new DAOHuaracheTejidoImpl();
            idModeloTejidoSeleccionado = dao.obtenerIdModeloTejido(valorSeleccionadoComboBox);
            precioModeloTejidoSeleccionado = dao.obtenerPrecioModeloTejido(valorSeleccionadoComboBox);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

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
        } else if (valorSeleccionadoComboBox == "          ") {
            javax.swing.JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna opción en el apartado modelo de tejido. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            modeloTejidoComboBox.requestFocus();
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

        HuaracheTejido huarTejido = new HuaracheTejido();
        huarTejido.setCantidadHuarachesTejidos(Integer.parseInt(cantidadHuaracheTejido));
        huarTejido.setObservaciones(observaciones);
        huarTejido.setFechaRegistro(fechaActualString);
        huarTejido.setIdPersonal(valorIdPersonal);
        huarTejido.setStatus(valorStatusComboBox);
        huarTejido.setIdModeloTejido(idModeloTejidoSeleccionado);
        huarTejido.setTotalPago(totalPagoParesTejidos);

        try {
            DAOHuaracheTejido dao = new DAOHuaracheTejidoImpl();
            dao.registrar(huarTejido);

            javax.swing.JOptionPane.showMessageDialog(this, "Registro de huaraches tejidos realizado exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            //Ya que se realizo el registro se limpian todas las cajas de texto
            cantidadTejidoTxt.setText("");
            observacionesTxt.setText("");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al realizar el registro de los huaraches tejidos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_registrarBtnActionPerformed

    private void statusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadTejidoTxt;
    private javax.swing.JLabel image;
    private javax.swing.JLabel image1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JComboBox<String> modeloTejidoComboBox;
    private javax.swing.JLabel nombreLbl;
    private javax.swing.JLabel nombreLbl1;
    private javax.swing.JLabel nombreLbl2;
    private javax.swing.JTextField observacionesTxt;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
