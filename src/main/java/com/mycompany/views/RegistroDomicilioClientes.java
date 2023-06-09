/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.views;

import com.mycompany.huaracheriamx.DAODomicilioClienteImpl;
import com.mycompany.huaracheriamx.MenuPrincipal;
import com.mycompany.interfaces.DAODomicilioCliente;
import com.mycompany.models.DomicilioCliente;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Victor
 */
public class RegistroDomicilioClientes extends javax.swing.JPanel {

    //Se crea una variable que recibe el valor del ID del cliente
    //que se selecciono en la ventana "MuestraClientes".
    private int valorIdCliente;
    
    /**
     * Creates new form Returns
     */
    public RegistroDomicilioClientes() {
        initComponents();
    }
    
    public RegistroDomicilioClientes(int idCliente) {
        initComponents();
        valorIdCliente = idCliente;
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        estadoLbl = new javax.swing.JLabel();
        estadoTxt = new javax.swing.JTextField();
        coloniaTxt = new javax.swing.JTextField();
        coloniaLbl = new javax.swing.JLabel();
        municipioTxt = new javax.swing.JTextField();
        municipioLbl = new javax.swing.JLabel();
        numeroExteriorTxt = new javax.swing.JTextField();
        numeroExteriorLbl = new javax.swing.JLabel();
        calleTxt = new javax.swing.JTextField();
        calleLbl = new javax.swing.JLabel();
        regresarBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        registrarBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(790, 590));

        bg1.setBackground(new java.awt.Color(255, 255, 255));
        bg1.setPreferredSize(new java.awt.Dimension(790, 590));

        title1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Registro de domicilios de clientes");
        title1.setPreferredSize(new java.awt.Dimension(215, 32));

        estadoLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        estadoLbl.setText("Estado");

        estadoTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        coloniaTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        coloniaLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        coloniaLbl.setText("Colonia");

        municipioTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        municipioLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        municipioLbl.setText("Municipio");
        municipioLbl.setPreferredSize(new java.awt.Dimension(80, 20));

        numeroExteriorTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        numeroExteriorLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        numeroExteriorLbl.setText("Número exterior");

        calleTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        calleLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        calleLbl.setText("Calle");
        calleLbl.setPreferredSize(new java.awt.Dimension(80, 20));

        regresarBtn.setBackground(new java.awt.Color(51, 204, 0));
        regresarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        regresarBtn.setForeground(new java.awt.Color(255, 255, 255));
        regresarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha.png"))); // NOI18N
        regresarBtn.setText("Regresar");
        regresarBtn.setBorderPainted(false);
        regresarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regresarBtn.setIconTextGap(10);
        regresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarBtnActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rdc.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        registrarBtn.setBackground(new java.awt.Color(18, 90, 173));
        registrarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        registrarBtn.setText("Registrar");
        registrarBtn.setBorderPainted(false);
        registrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarBtnActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rdc2.png"))); // NOI18N
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator4.setBackground(new java.awt.Color(240, 240, 240));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));

        javax.swing.GroupLayout bg1Layout = new javax.swing.GroupLayout(bg1);
        bg1.setLayout(bg1Layout);
        bg1Layout.setHorizontalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(180, 180, 180))
            .addGroup(bg1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(estadoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(479, 479, 479))
            .addGroup(bg1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estadoTxt)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addComponent(municipioLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(136, 136, 136))
                    .addComponent(municipioTxt)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addComponent(coloniaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(184, 184, 184))
                    .addComponent(coloniaTxt)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addComponent(calleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(254, 254, 254))
                    .addComponent(calleTxt)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addComponent(numeroExteriorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(177, 177, 177))
                    .addComponent(numeroExteriorTxt)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regresarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(64, 64, 64)))
                .addGap(16, 16, 16)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        bg1Layout.setVerticalGroup(
            bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(estadoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(bg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bg1Layout.createSequentialGroup()
                                .addComponent(estadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(municipioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(municipioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(coloniaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(coloniaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(calleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(calleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(numeroExteriorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(numeroExteriorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(registrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(regresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    //Botón para regresar a la ventana que muestra los domicilios del cliente seleccionado.
    private void regresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarBtnActionPerformed
        MenuPrincipal.ShowJPanel(new MuestraDomicilioClientes(valorIdCliente));
    }//GEN-LAST:event_regresarBtnActionPerformed

    private void registrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarBtnActionPerformed
        //Código mediante el cual se obtiene el formato de fecha
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaActualString = formato.format(fechaActual);
        
        //Se extraen los datos ingresados por el usuario mediante la interfaz grafica
        String estado = estadoTxt.getText();
        String municipio = municipioTxt.getText();
        String colonia = coloniaTxt.getText();
        String calle = calleTxt.getText();
        String numeroExterior = numeroExteriorTxt.getText();
        
        //Validaciones para los campos
        // Se pone el nombre de la variable y con la función isEmpty() se evalua si esta vacia
        if (estado.isEmpty() || municipio.isEmpty() || colonia.isEmpty() || calle.isEmpty() || numeroExterior.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            // Posiciona el cursor en el campo estadoTxt
            estadoTxt.requestFocus();
            return;
        }
        
        DomicilioCliente domCliente = new DomicilioCliente();
        domCliente.setEstado(estado);
        domCliente.setMunicipio(municipio);
        domCliente.setColonia(colonia);
        domCliente.setCalle(calle);
        domCliente.setNumeroExterior(numeroExterior);
        domCliente.setIdCliente(valorIdCliente);
        domCliente.setFechaRegistro(fechaActualString);

        
        try {
            DAODomicilioCliente dao = new DAODomicilioClienteImpl();
            dao.registrar(domCliente);
            
            javax.swing.JOptionPane.showMessageDialog(this, "Domicilio registrado exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            //Ya que se realizo el registro se limpian todas las cajas de texto
            estadoTxt.setText("");
            municipioTxt.setText("");
            coloniaTxt.setText("");
            calleTxt.setText("");
            numeroExteriorTxt.setText("");
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al registrar el domicilio del cliente. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_registrarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg1;
    private javax.swing.JLabel calleLbl;
    private javax.swing.JTextField calleTxt;
    private javax.swing.JLabel coloniaLbl;
    private javax.swing.JTextField coloniaTxt;
    private javax.swing.JLabel estadoLbl;
    private javax.swing.JTextField estadoTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel municipioLbl;
    private javax.swing.JTextField municipioTxt;
    private javax.swing.JLabel numeroExteriorLbl;
    private javax.swing.JTextField numeroExteriorTxt;
    private javax.swing.JButton registrarBtn;
    private javax.swing.JButton regresarBtn;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
