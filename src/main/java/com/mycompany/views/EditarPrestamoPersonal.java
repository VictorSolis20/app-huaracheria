/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.views;

import com.mycompany.huaracheriamx.DAOPrestamoPersonalImpl;
import com.mycompany.interfaces.DAOPrestamoPersonal;
import com.mycompany.models.PrestamoPersonal;
import com.mycompany.utils.Utils;

/**
 *
 * @author Victor
 */
public class EditarPrestamoPersonal extends javax.swing.JPanel {

    PrestamoPersonal prestamoEdition;
    private float sumaMontoPrestamo;
    private float sueldoPorLiquidar;
    
    /**
     * Creates new form CaracteristicasHuarache
     */
    public EditarPrestamoPersonal() {
        initComponents();
        InitStyles();
    }

    public EditarPrestamoPersonal(PrestamoPersonal prestamoP) {
        initComponents();
        prestamoEdition = prestamoP;
        InitStyles();
    }
    
    private void InitStyles() {
        //Se obtiene el valor status registrado en la base de datos y se almacena en una variable
        String valor = prestamoEdition.getStatus(); // Suponiendo que prestamoEdition.getStatus() devuelve el valor String que deseas asignar

        montoPrestamoTxt.setText(Float.toString(prestamoEdition.getMontoPrestamo()));
        //Se eliminan los valores que contiene el comboBox para agregar primero el registrado en la base de datos y enseguida el valor contrario
        statusComboBox.removeAllItems();
        //Se evalua cual es el status guardado para agregar los valores al comboBox
        if(valor.equals("Pendiente")){
            statusComboBox.addItem(valor);
            statusComboBox.addItem("Aprobado");
            statusComboBox.addItem("Rechazado");
        }else if(valor.equals("Aprobado")){
            statusComboBox.addItem(valor);
            statusComboBox.addItem("Rechazado");
            statusComboBox.addItem("Pendiente");
        }else if(valor.equals("Rechazado")){
            statusComboBox.addItem(valor);
            statusComboBox.addItem("Aprobado");
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

        image = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        montoPrestamoTxt = new javax.swing.JTextField();
        libroIdLbl = new javax.swing.JLabel();
        folioLbl = new javax.swing.JLabel();
        guardarBtn = new javax.swing.JButton();
        statusComboBox = new javax.swing.JComboBox<>();
        image1 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editdatosP2.png"))); // NOI18N

        title2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title2.setText("Editar datos del préstamo");
        title2.setPreferredSize(new java.awt.Dimension(215, 32));

        montoPrestamoTxt.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        montoPrestamoTxt.setPreferredSize(new java.awt.Dimension(6, 20));

        libroIdLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        libroIdLbl.setText("Status");

        folioLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        folioLbl.setText("Monto del préstamo");

        guardarBtn.setBackground(new java.awt.Color(18, 90, 173));
        guardarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        guardarBtn.setForeground(new java.awt.Color(255, 255, 255));
        guardarBtn.setText("Guardar");
        guardarBtn.setBorderPainted(false);
        guardarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardarBtn.setMaximumSize(new java.awt.Dimension(100, 40));
        guardarBtn.setMinimumSize(new java.awt.Dimension(100, 40));
        guardarBtn.setPreferredSize(new java.awt.Dimension(100, 40));
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        statusComboBox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N

        image1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editdatosP.png"))); // NOI18N

        jSeparator9.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator9.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setPreferredSize(new java.awt.Dimension(200, 10));

        jSeparator10.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator10.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator10.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator10.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(image1)
                .addGap(4, 4, 4)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(folioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(155, 155, 155))
                    .addComponent(montoPrestamoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(libroIdLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(263, 263, 263))
                    .addComponent(statusComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(guardarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(70, 70, 70)))
                .addGap(4, 4, 4)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(image)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(title2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(image1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(folioLbl)
                                .addGap(8, 8, 8)
                                .addComponent(montoPrestamoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(libroIdLbl)
                                .addGap(8, 8, 8)
                                .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)))
                .addGap(150, 150, 150))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
        //Se extraen los datos ingresados por el usuario mediante la interfaz grafica
        String cantidadPrestamoSolicitado = montoPrestamoTxt.getText();
        
        //Se obtiene el valor seleccionado del comboBox de la interfaz grafica
        String valorSeleccionadoComboBox = (String) statusComboBox.getSelectedItem();

        //Validaciones para los campos
        // Se pone el nombre de la variable y con la función isEmpty() se evalua si esta vacia
        if (cantidadPrestamoSolicitado.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            // Posiciona el cursor en el campo nombre
            montoPrestamoTxt.requestFocus();
            return;
        }

        //Se convierte en float el monto del préstamo a solicitar
        float cantPrestamoSolicitado = Float.parseFloat(cantidadPrestamoSolicitado);

        //Se obtiene el sueldo por liquidar del personal que ingreso y la suma de los prestamos solicitados con status "Aprobado"
        try {
            DAOPrestamoPersonal dao = new DAOPrestamoPersonalImpl();
            sueldoPorLiquidar = dao.obtenerSueldoPorPagar(prestamoEdition.getIdPersonal());
            sumaMontoPrestamo = dao.obtenerPrestamosAprovados(prestamoEdition.getIdPersonal());
        } catch (Exception e) {
            sueldoPorLiquidar = 0;
            sumaMontoPrestamo = 0;
            System.out.println(e.getMessage());
        }

        float restaPrestamoSueldo = sueldoPorLiquidar - sumaMontoPrestamo;
        if (restaPrestamoSueldo < cantPrestamoSolicitado) {
            javax.swing.JOptionPane.showMessageDialog(this, "El monto del préstamo debe ser menor o igual a " + restaPrestamoSueldo + ". \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Se asignan los valores para registrarlos en la base de datos
        PrestamoPersonal prestPersonal = prestamoEdition;
        prestPersonal.setMontoPrestamo(cantPrestamoSolicitado);
        prestPersonal.setStatus(valorSeleccionadoComboBox);

        try {
            DAOPrestamoPersonal dao = new DAOPrestamoPersonalImpl();
            dao.modificar(prestPersonal);
            javax.swing.JOptionPane.showMessageDialog(this, "El registro del préstamo fue modificado exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al modificar el registro del préstamo. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_guardarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel folioLbl;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JLabel image;
    private javax.swing.JLabel image1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel libroIdLbl;
    private javax.swing.JTextField montoPrestamoTxt;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JLabel title2;
    // End of variables declaration//GEN-END:variables
}
