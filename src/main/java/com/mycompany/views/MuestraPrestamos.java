/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.views;

import com.mycompany.huaracheriamx.DAOPersonalImpl;
import com.mycompany.huaracheriamx.DAOPrestamoPersonalImpl;
import com.mycompany.huaracheriamx.MenuPrincipal;
import com.mycompany.interfaces.DAOPersonal;
import com.mycompany.interfaces.DAOPrestamoPersonal;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor
 */
public class MuestraPrestamos extends javax.swing.JPanel {

    /**
     * Creates new form MuestraPrestamos
     */
    public MuestraPrestamos() {
        initComponents();
        LoadMuestraPrestamos();
    }

    private void LoadMuestraPrestamos() {
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
        historialPrestamoLbl = new javax.swing.JLabel();
        personalSearchTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        personalLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        nuevoBtn = new javax.swing.JButton();
        editarBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        title1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title1.setText("Préstamos de los trabajadores");
        title1.setPreferredSize(new java.awt.Dimension(215, 32));

        historialPrestamoLbl.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        historialPrestamoLbl.setText("Historial de préstamos");

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Monto del préstamo", "Status", "Fecha de registro", "ID_Personal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

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

        nuevoBtn.setBackground(new java.awt.Color(51, 204, 0));
        nuevoBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nuevoBtn.setForeground(new java.awt.Color(255, 255, 255));
        nuevoBtn.setText("Nuevo");
        nuevoBtn.setBorderPainted(false);
        nuevoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoBtnActionPerformed(evt);
            }
        });

        editarBtn.setBackground(new java.awt.Color(204, 0, 204));
        editarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editarBtn.setForeground(new java.awt.Color(255, 255, 255));
        editarBtn.setText("Editar");
        editarBtn.setBorderPainted(false);
        editarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBtnActionPerformed(evt);
            }
        });

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
                .addGap(10, 10, 10)
                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(historialPrestamoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(nuevoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(editarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(191, 191, 191))
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
                .addGap(20, 20, 20)
                .addComponent(historialPrestamoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuevoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
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

    private void nuevoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBtnActionPerformed
        if (jTable2.getSelectedRow() > -1) {
            int personalSeleccionadoId = (int) jTable2.getValueAt(jTable2.getSelectedRow(), 0);
            MenuPrincipal.ShowJPanel(new RegistroPrestamoPersonal(personalSeleccionadoId));
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el trabajador del cual va a registrar un préstamo. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_nuevoBtnActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
//        if (jTable1.getSelectedRow() > -1) {
//                try {
//                    int modeloTejidoId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
//                    DAOModeloTejido dao = new DAOModeloTejidoImpl();
//                    MenuPrincipal.ShowJPanel(new EditarModeloTejido(dao.getModeloTejidoById(modeloTejidoId)));
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
//            } else {
//                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el modelo de tejido a editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
//            }
        
        if (jTable1.getSelectedRow() > -1) {
            try {
                int prestamoId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                DAOPrestamoPersonal dao = new DAOPrestamoPersonalImpl();
                MenuPrincipal.ShowJPanel(new EditarPrestamoPersonal(dao.getPrestamoById(prestamoId)));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar el registro del préstamo a editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editarBtnActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        if (jTable2.getSelectedRow() > -1) {
            int personalSeleccionadoId = (int) jTable2.getValueAt(jTable2.getSelectedRow(), 0);
            //Se muestra el listado de los registros del historial de los préstamos en la tabla
            try {
                DAOPrestamoPersonal dao = new DAOPrestamoPersonalImpl();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setRowCount(0);
                dao.listar(personalSeleccionadoId).forEach((d) -> model.addRow(new Object[]{d.getIdPrestamo(), d.getMontoPrestamo(), d.getStatus(), d.getFechaRegistro(), d.getIdPersonal()}));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el trabajador del cual va a consultar su historial de préstamos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTable2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JButton editarBtn;
    private javax.swing.JLabel historialPrestamoLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton nuevoBtn;
    private javax.swing.JLabel personalLbl;
    private javax.swing.JTextField personalSearchTxt;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
