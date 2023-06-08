/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.views;

import com.mycompany.huaracheriamx.DAOHuaracheTejidoImpl;
import com.mycompany.huaracheriamx.DAOPagoPersonalImpl;
import com.mycompany.huaracheriamx.DAOPersonalImpl;
import com.mycompany.huaracheriamx.DAOPrestamoPersonalImpl;
import com.mycompany.huaracheriamx.MenuPrincipal;
import com.mycompany.interfaces.DAOHuaracheTejido;
import com.mycompany.interfaces.DAOPagoPersonal;
import com.mycompany.interfaces.DAOPersonal;
import com.mycompany.interfaces.DAOPrestamoPersonal;
import com.mycompany.models.PagoPersonal;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor
 */
public class MuestraPagosPersonal extends javax.swing.JPanel {

    private float sueldoPorLiquidar;
    private float sumaMontoPrestamo;
    private float sumaMontoHuaracheTejido;

    /**
     * Creates new form MuestraPrestamos
     */
    public MuestraPagosPersonal() {
        initComponents();
        LoadMuestraHuarachesTejidos();
    }

    private void LoadMuestraHuarachesTejidos() {
        try {
            DAOPersonal dao = new DAOPersonalImpl();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            dao.listar("").forEach((p) -> model.addRow(new Object[]{p.getIdPersonal(), p.getNombre(), p.getApaterno(), p.getAmaterno(), p.getTelefono(), p.getCorreo(), p.getStatus(), p.getUsuario(), p.getPassword(), p.getFechaRegistro()}));
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
        personalSearchTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        personalLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        liquidarSueldoBtn = new javax.swing.JButton();
        historialPagosBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        recibeMontoTotalPrestamoLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        recibeMontoTotalTejidoLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        recibeMontoTotalSueldoLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        title1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Pagos de trabajadores");
        title1.setPreferredSize(new java.awt.Dimension(215, 32));

        personalSearchTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        personalSearchTxt.setPreferredSize(new java.awt.Dimension(6, 20));

        buscarBtn.setBackground(new java.awt.Color(18, 90, 173));
        buscarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buscarBtn.setForeground(new java.awt.Color(255, 255, 255));
        buscarBtn.setText("Buscar");
        buscarBtn.setBorderPainted(false);
        buscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        personalLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        personalLbl.setText("Personal");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Telefono", "Correo", "Status", "Usuario", "Contraseña", "Fecha y hora de registro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        liquidarSueldoBtn.setBackground(new java.awt.Color(51, 204, 0));
        liquidarSueldoBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        liquidarSueldoBtn.setForeground(new java.awt.Color(255, 255, 255));
        liquidarSueldoBtn.setText("Liquidar sueldo");
        liquidarSueldoBtn.setBorderPainted(false);
        liquidarSueldoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        liquidarSueldoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liquidarSueldoBtnActionPerformed(evt);
            }
        });

        historialPagosBtn.setBackground(new java.awt.Color(204, 0, 204));
        historialPagosBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        historialPagosBtn.setForeground(new java.awt.Color(255, 255, 255));
        historialPagosBtn.setText("Ver historial de pagos");
        historialPagosBtn.setBorderPainted(false);
        historialPagosBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historialPagosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialPagosBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("$");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Monto total por huaraches tejidos:");

        recibeMontoTotalPrestamoLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        recibeMontoTotalPrestamoLbl.setText("0.0");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Monto total por prestamos recibidos:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Monto total por liquidar:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("$");

        recibeMontoTotalTejidoLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        recibeMontoTotalTejidoLbl.setText("0.0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("$");

        recibeMontoTotalSueldoLbl.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        recibeMontoTotalSueldoLbl.setText("0.0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(personalLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addGap(512, 512, 512))
                    .addComponent(personalSearchTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(liquidarSueldoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(historialPagosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(160, 160, 160))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(263, 263, 263))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recibeMontoTotalSueldoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recibeMontoTotalTejidoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recibeMontoTotalPrestamoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(personalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(personalSearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(liquidarSueldoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historialPagosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recibeMontoTotalTejidoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recibeMontoTotalPrestamoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recibeMontoTotalSueldoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        try {
            DAOPersonal dao = new DAOPersonalImpl();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            //Elimina todas las filas que contiene la tabla
            model.setRowCount(0);
            //Agrega a la tabla los registros que se encontraron mediante el filtro de buscar
            dao.listar(personalSearchTxt.getText()).forEach((p) -> model.addRow(new Object[]{p.getIdPersonal(), p.getNombre(), p.getApaterno(), p.getAmaterno(), p.getTelefono(), p.getCorreo(), p.getStatus(), p.getUsuario(), p.getPassword(), p.getFechaRegistro()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void liquidarSueldoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liquidarSueldoBtnActionPerformed
        if (jTable2.getSelectedRow() > -1) {
            int personalSeleccionadoId = (int) jTable2.getValueAt(jTable2.getSelectedRow(), 0);

            //Código mediante el cual se obtiene el formato de fecha
            Date fechaActual = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            String fechaActualString = formato.format(fechaActual);

            PagoPersonal payPersonal = new PagoPersonal();
            payPersonal.setMontoTotalTejido(sumaMontoHuaracheTejido);
            payPersonal.setMontoTotalPrestamo(sumaMontoPrestamo);
            payPersonal.setMontoTotalSueldo(sueldoPorLiquidar);
            payPersonal.setFechaRegistro(fechaActualString);
            payPersonal.setIdPersonal(personalSeleccionadoId);

            try {
                DAOPagoPersonal dao = new DAOPagoPersonalImpl();
                dao.registrar(payPersonal);

                javax.swing.JOptionPane.showMessageDialog(this, "¡Sueldo liquidado exitosamente por un monto de $" + sueldoPorLiquidar + "! \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

                //Se modifica el "status" de la tabla "huaracheTejido" y de la tabla "prestamoPersonal".
                dao.cambioStatusHuaracheTejido();
                dao.cambioStatusPrestamo();
                //Se inicializan los label en "0.0"
                recibeMontoTotalTejidoLbl.setText("0.0");
                recibeMontoTotalPrestamoLbl.setText("0.0");
                recibeMontoTotalSueldoLbl.setText("0.0");

            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al liquidar el sueldo del trabajador. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
                System.out.println(e.getMessage());
            }

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el trabajador del cual va a liquidar su sueldo semanal. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_liquidarSueldoBtnActionPerformed

    private void historialPagosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialPagosBtnActionPerformed
        if (jTable2.getSelectedRow() > -1) {
            int personalSeleccionadoId = (int) jTable2.getValueAt(jTable2.getSelectedRow(), 0);
            MenuPrincipal.ShowJPanel(new MuestraHistorialPagos(personalSeleccionadoId));
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el trabajador del cual va a consultar su historial de pagos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_historialPagosBtnActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        if (jTable2.getSelectedRow() > -1) {
            int personalSeleccionadoId = (int) jTable2.getValueAt(jTable2.getSelectedRow(), 0);
            //Se obtiene el sueldo por liquidar del personal seleccionado y la suma de los prestamos solicitados con status "Aprobado"
            try {
                DAOPrestamoPersonal dao = new DAOPrestamoPersonalImpl();
                sumaMontoHuaracheTejido = dao.obtenerSueldoPorPagar(personalSeleccionadoId);
                sumaMontoPrestamo = dao.obtenerPrestamosAprovados(personalSeleccionadoId);
            } catch (Exception e) {
                sumaMontoHuaracheTejido = 0;
                sumaMontoPrestamo = 0;
                System.out.println(e.getMessage());
            }
            sueldoPorLiquidar = sumaMontoHuaracheTejido - sumaMontoPrestamo;
            recibeMontoTotalTejidoLbl.setText(Float.toString(sumaMontoHuaracheTejido));
            recibeMontoTotalPrestamoLbl.setText(Float.toString(sumaMontoPrestamo));
            recibeMontoTotalSueldoLbl.setText(Float.toString(sueldoPorLiquidar));

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el trabajador del cual va a calcular su sueldo semanal. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTable2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton historialPagosBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton liquidarSueldoBtn;
    private javax.swing.JLabel personalLbl;
    private javax.swing.JTextField personalSearchTxt;
    private javax.swing.JLabel recibeMontoTotalPrestamoLbl;
    private javax.swing.JLabel recibeMontoTotalSueldoLbl;
    private javax.swing.JLabel recibeMontoTotalTejidoLbl;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}