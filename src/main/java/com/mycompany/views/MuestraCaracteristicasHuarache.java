/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.views;

import com.mycompany.huaracheriamx.DAOColorTexturaImpl;
import com.mycompany.huaracheriamx.DAOModeloTejidoImpl;
import com.mycompany.huaracheriamx.DAOTipoMaterialImpl;
import com.mycompany.huaracheriamx.DAOTipoSuelaImpl;
import com.mycompany.huaracheriamx.MenuPrincipal;
import com.mycompany.interfaces.DAOColorTextura;
import com.mycompany.interfaces.DAOModeloTejido;
import com.mycompany.interfaces.DAOTipoMaterial;
import com.mycompany.interfaces.DAOTipoSuela;
import com.mycompany.utils.Utils;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Victor
 */
public class MuestraCaracteristicasHuarache extends javax.swing.JPanel {

    /**
     * Creates new form CaracteristicasHuarache
     */
    public MuestraCaracteristicasHuarache() {
        initComponents();
        LoadMuestraCaracteristicasHuarache();
    }

    public void LoadMuestraCaracteristicasHuarache() {
        try {
            DAOModeloTejido dao = new DAOModeloTejidoImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            dao.listar().forEach((m) -> model.addRow(new Object[]{m.getIdModeloTejido(), m.getNombre(), m.getObservaciones(), m.getFechaRegistro(), m.getPrecioParHuarache()}));
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
        jLabel2 = new javax.swing.JLabel();
        caracteristicaComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        nuevoBtn = new javax.swing.JButton();
        editarBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        title1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Características del Huarache");
        title1.setPreferredSize(new java.awt.Dimension(215, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Seleccione el nombre de una característica:");

        caracteristicaComboBox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        caracteristicaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Modelo de tejido", "Color o textura", "Tipo de suela", "Tipo de material (Correa y planta)" }));
        caracteristicaComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        caracteristicaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caracteristicaComboBoxActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Observaciones", "Fecha y hora de registro", "Precio por par tejido"
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

        nuevoBtn.setBackground(new java.awt.Color(18, 90, 173));
        nuevoBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nuevoBtn.setForeground(new java.awt.Color(255, 255, 255));
        nuevoBtn.setText("Nuevo");
        nuevoBtn.setBorderPainted(false);
        nuevoBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevoBtn.setFocusPainted(false);
        nuevoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoBtnActionPerformed(evt);
            }
        });

        editarBtn.setBackground(new java.awt.Color(153, 153, 153));
        editarBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        editarBtn.setForeground(new java.awt.Color(255, 255, 255));
        editarBtn.setText("Editar");
        editarBtn.setBorderPainted(false);
        editarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarBtn.setFocusPainted(false);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(nuevoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)
                        .addComponent(editarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(caracteristicaComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(166, 166, 166)))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(caracteristicaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuevoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoBtnActionPerformed
        //Se obtiene el valor seleccionado del comboBox de la interfaz grafica
        String valorSeleccionadoComboBox = (String) caracteristicaComboBox.getSelectedItem();

//        RegistroCaracteristicasHuarache caractHuarache = new RegistroCaracteristicasHuarache();
        MenuPrincipal.ShowJPanel(new RegistroCaracteristicasHuarache(valorSeleccionadoComboBox));
    }//GEN-LAST:event_nuevoBtnActionPerformed

    private void editarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBtnActionPerformed
        //Se obtiene el valor seleccionado del comboBox de la interfaz grafica
        String valorComboBox = (String) caracteristicaComboBox.getSelectedItem();

        //Se evalua el valor que se extrajo del comboBox
        if (valorComboBox.equals("Modelo de tejido")) {
            if (jTable1.getSelectedRow() > -1) {
                try {
                    int modeloTejidoId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                    DAOModeloTejido dao = new DAOModeloTejidoImpl();
                    MenuPrincipal.ShowJPanel(new EditarModeloTejido(dao.getModeloTejidoById(modeloTejidoId)));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el modelo de tejido a editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } else if (valorComboBox.equals("Color o textura")) {
            if (jTable1.getSelectedRow() > -1) {
                try {
                    int colorTexturaId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                    DAOColorTextura dao = new DAOColorTexturaImpl();
                    MenuPrincipal.ShowJPanel(new EditarColorTextura(dao.getColorTexturaById(colorTexturaId)));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el color o textura a editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } else if (valorComboBox.equals("Tipo de suela")) {
            if (jTable1.getSelectedRow() > -1) {
                try {
                    int tipoSuelaId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                    DAOTipoSuela dao = new DAOTipoSuelaImpl();
                    MenuPrincipal.ShowJPanel(new EditarTipoSuela(dao.getTipoSuelaById(tipoSuelaId)));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el tipo de suela a editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } else if (valorComboBox.equals("Tipo de material (Correa y planta)")) {
            if (jTable1.getSelectedRow() > -1) {
                try {
                    int tipoMaterialId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                    DAOTipoMaterial dao = new DAOTipoMaterialImpl();
                    MenuPrincipal.ShowJPanel(new EditarTipoMaterial(dao.getTipoMaterialById(tipoMaterialId)));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar el tipo de material a editar. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_editarBtnActionPerformed

    private void caracteristicaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caracteristicaComboBoxActionPerformed
        //Se obtiene el valor seleccionado del comboBox de la interfaz grafica
        String valorCombo = (String) caracteristicaComboBox.getSelectedItem();

        //Se extrae el número de columnas que contiene la tabla
        int columnas = jTable1.getColumnCount();

        //Se evalua el valor que se extrajo del comboBox
        if (valorCombo.equals("Modelo de tejido")) {
            //Se evalua si la tabla tiene cuatro columnas para agregar una mas
            if (columnas == 4) {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                //Se agrega una nueva columna a la tabla
                modelo.addColumn("Precio por par tejido");
            }

            try {
                DAOModeloTejido dao = new DAOModeloTejidoImpl();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                //Se eliminan las filas que contiene la tabla para agregar las nuevas
                model.setRowCount(0);
                dao.listar().forEach((m) -> model.addRow(new Object[]{m.getIdModeloTejido(), m.getNombre(), m.getObservaciones(), m.getFechaRegistro(), m.getPrecioParHuarache()}));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (valorCombo.equals("Color o textura")) {
            //Se evalua si la tabla tiene 5 columnas para eliminar la última columna
            if (columnas == 5) {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                TableColumnModel columnModelo = jTable1.getColumnModel();
                TableColumn columna = columnModelo.getColumn(columnas - 1);
                //Se elimina a la última columna
                columnModelo.removeColumn(columna);
                modelo.setColumnCount(columnas - 1);
            }

            try {
                DAOColorTextura dao = new DAOColorTexturaImpl();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                //Se eliminan las filas que contiene la tabla para agregar las nuevas
                model.setRowCount(0);
                dao.listar().forEach((c) -> model.addRow(new Object[]{c.getIdColorTextura(), c.getNombre(), c.getObservaciones(), c.getFechaRegistro()}));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (valorCombo.equals("Tipo de suela")) {
            //Se evalua si la tabla tiene 5 columnas para eliminar la última columna
            if (columnas == 5) {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                TableColumnModel columnModelo = jTable1.getColumnModel();
                TableColumn columna = columnModelo.getColumn(columnas - 1);
                //Se elimina a la última columna
                columnModelo.removeColumn(columna);
                modelo.setColumnCount(columnas - 1);
            }

            try {
                DAOTipoSuela dao = new DAOTipoSuelaImpl();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                //Se eliminan las filas que contiene la tabla para agregar las nuevas
                model.setRowCount(0);
                dao.listar().forEach((s) -> model.addRow(new Object[]{s.getIdTipoSuela(), s.getNombre(), s.getObservaciones(), s.getFechaRegistro()}));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else if (valorCombo.equals("Tipo de material (Correa y planta)")) {
            //Se evalua si la tabla tiene 5 columnas para eliminar la última columna
            if (columnas == 5) {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                TableColumnModel columnModelo = jTable1.getColumnModel();
                TableColumn columna = columnModelo.getColumn(columnas - 1);
                //Se elimina a la última columna
                columnModelo.removeColumn(columna);
                modelo.setColumnCount(columnas - 1);
            }

            try {
                DAOTipoMaterial dao = new DAOTipoMaterialImpl();
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                //Se eliminan las filas que contiene la tabla para agregar las nuevas
                model.setRowCount(0);
                dao.listar().forEach((m) -> model.addRow(new Object[]{m.getIdTipoMaterial(), m.getNombre(), m.getObservaciones(), m.getFechaRegistro()}));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_caracteristicaComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> caracteristicaComboBox;
    private javax.swing.JButton editarBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton nuevoBtn;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
