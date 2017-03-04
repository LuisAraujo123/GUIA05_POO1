/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.controlador.EquiposCtrl;
import com.sv.udb.controlador.JugadoresCtrl;
import com.sv.udb.modelo.Equipos;
import com.sv.udb.modelo.Jugadores;
import com.sv.udb.recursos.Conexion;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bernardo
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    
    public frmPrincipal() {
        initComponents();
        this.setTitle("Guia_05-POO1 :: Luis Enrique Araujo Aquino");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGuar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEqui = new javax.swing.JTable();
        btnCons = new javax.swing.JButton();
        txtCodi = new javax.swing.JTextField();
        txtNomb = new javax.swing.JTextField();
        txtDesc = new javax.swing.JTextField();
        btnElim = new javax.swing.JButton();
        btnModi = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtCodJuga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtJuga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        btnGuarJuga = new javax.swing.JButton();
        btnModiJuga = new javax.swing.JButton();
        btnElimJuga = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblJuga = new javax.swing.JTable();
        btnConJuga = new javax.swing.JButton();
        btnNuevJuga = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAltu = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        cmbEqui = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });
        jTabbedPane1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTabbedPane1ComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setText("Codigo:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Descripción:");

        btnGuar.setBackground(new java.awt.Color(102, 204, 255));
        btnGuar.setText("Guardar");
        btnGuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuarActionPerformed(evt);
            }
        });

        tblEqui.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEquiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEqui);

        btnCons.setBackground(new java.awt.Color(204, 204, 0));
        btnCons.setText("Consultar");
        btnCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsActionPerformed(evt);
            }
        });

        txtCodi.setEditable(false);

        btnElim.setBackground(new java.awt.Color(204, 0, 0));
        btnElim.setText("Eliminar");
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        btnModi.setBackground(new java.awt.Color(0, 204, 51));
        btnModi.setText("Modificar");
        btnModi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiActionPerformed(evt);
            }
        });

        btnNew.setBackground(new java.awt.Color(153, 153, 153));
        btnNew.setText("Nuevo");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomb)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodi, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(txtDesc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCons))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(btnElim)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNomb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuar)
                            .addComponent(btnElim)
                            .addComponent(btnModi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCons)
                            .addComponent(btnNew))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Equipos", jPanel1);

        jLabel4.setText("Codigo:");

        txtCodJuga.setEditable(false);

        jLabel5.setText("Nombre:");

        jLabel6.setText("Equipo:");

        btnGuarJuga.setBackground(new java.awt.Color(102, 204, 255));
        btnGuarJuga.setText("Guardar");
        btnGuarJuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuarJugaActionPerformed(evt);
            }
        });

        btnModiJuga.setBackground(new java.awt.Color(0, 204, 51));
        btnModiJuga.setText("Modificar");
        btnModiJuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModiJugaActionPerformed(evt);
            }
        });

        btnElimJuga.setBackground(new java.awt.Color(204, 0, 0));
        btnElimJuga.setText("Eliminar");
        btnElimJuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimJugaActionPerformed(evt);
            }
        });

        tblJuga.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Equipo", "Edad", "Altura", "Peso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJuga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblJugaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblJuga);

        btnConJuga.setBackground(new java.awt.Color(204, 204, 0));
        btnConJuga.setText("Consultar");
        btnConJuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConJugaActionPerformed(evt);
            }
        });

        btnNuevJuga.setBackground(new java.awt.Color(153, 153, 153));
        btnNuevJuga.setText("Nuevo");
        btnNuevJuga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevJugaActionPerformed(evt);
            }
        });

        jLabel7.setText("Edad:");

        jLabel8.setText("Altura:");

        jLabel9.setText("Peso:");

        cmbEqui.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)
                        .addComponent(txtPeso))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevJuga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConJuga))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnGuarJuga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModiJuga)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(btnElimJuga))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtEdad))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(20, 20, 20)
                                .addComponent(txtAltu))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEqui, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtJuga)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCodJuga, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCodJuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtJuga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbEqui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtAltu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuarJuga)
                            .addComponent(btnElimJuga)
                            .addComponent(btnModiJuga))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnConJuga)
                            .addComponent(btnNuevJuga))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jugadores", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limp() {
        this.txtCodi.setText("");
        this.txtNomb.setText("");
        this.txtDesc.setText("");
        this.txtCodJuga.setText("");
        this.txtAltu.setText("");
        this.txtEdad.setText("");
        this.txtJuga.setText("");
        this.txtPeso.setText("");
    }
    private void actTabEqui() {
        try {
            EquiposCtrl obje = new EquiposCtrl();
            DefaultTableModel model = (DefaultTableModel)tblEqui.getModel();
            while(model.getRowCount()>0){model.removeRow(0);} //Limpiar modelo
            //Se agregan todos los que esten en la lista
            for (Equipos temp : obje.consTodo())
            {
                model.addRow(new Object[]{temp, temp.getDescEqui()});
            }
            limp();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void actTabJuga() {
        try {
            JugadoresCtrl obje = new JugadoresCtrl();
            DefaultTableModel model = (DefaultTableModel)tblJuga.getModel();
            while(model.getRowCount()>0){model.removeRow(0);} //Limpiar modelo
            //Se agregan todos los que esten en la lista
            for (Jugadores temp : obje.consTodo())
            {
                model.addRow(new Object[]{temp, temp.getNombEqui(), temp.getEdadJuga(), temp.getAltuJuga(), temp.getPesoJuga()});
            }
            limp();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    private void llenCmb() {
        EquiposCtrl obje = new EquiposCtrl();
        this.cmbEqui.removeAllItems();
        DefaultComboBoxModel<Equipos> dcm = new DefaultComboBoxModel<>();
        for (Equipos temp : obje.consTodo())
            {
                dcm.addElement(temp);
            }
        this.cmbEqui.setModel((ComboBoxModel)dcm);
    }
    
    
    private void btnGuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuarActionPerformed
        try {
            if (!this.txtNomb.getText().isEmpty() && !this.txtDesc.getText().isEmpty())
            {
                Equipos obje = new Equipos();
                //obje.setCodiEqui(Integer.parseInt(txtCodi.getText()));
                obje.setNombEqui(txtNomb.getText());
                obje.setDescEqui(this.txtDesc.getText());
                if (new EquiposCtrl().guar(obje))
                {
                    JOptionPane.showMessageDialog(this, "Datos guardados");
                    this.actTabEqui();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Por favor complete los campos");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
    }//GEN-LAST:event_btnGuarActionPerformed

    
    
    
    private void btnConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsActionPerformed
        this.actTabEqui();
    }//GEN-LAST:event_btnConsActionPerformed

    private void tblEquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEquiMouseClicked
        try {
            int fila = this.tblEqui.getSelectedRow();
            if (fila >= 0) {
                Equipos obje = (Equipos)this.tblEqui.getValueAt(fila, 0);
                this.txtCodi.setText(String.valueOf(obje.getCodiEqui()));
                this.txtNomb.setText(obje.getNombEqui());
                this.txtDesc.setText(obje.getDescEqui());
            }
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_tblEquiMouseClicked

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        if (this.tblEqui.getSelectedRow() > -1)
        {
            try {
                if (!this.txtCodi.getText().isEmpty() && !this.txtNomb.getText().isEmpty() && !this.txtDesc.getText().isEmpty()) {
                    Equipos obje = new Equipos();
                    obje.setCodiEqui(Integer.parseInt(txtCodi.getText()));
                    obje.setNombEqui(txtNomb.getText());
                    obje.setDescEqui(this.txtDesc.getText());
                    if (JOptionPane.showConfirmDialog(this, "Esta seguro de que desea eliminar este registro?", "AVISO", JOptionPane.YES_NO_OPTION) == 0) 
                    {
                        if (new EquiposCtrl().dele(obje))
                        {
                            JOptionPane.showMessageDialog(this, "Datos Eliminados");
                            this.actTabEqui();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Error");
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Por favor complete los campos");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un registro a Eliminar");
        }
    }//GEN-LAST:event_btnElimActionPerformed

    
    
    private void btnModiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiActionPerformed
        if (this.tblEqui.getSelectedRow() > -1)
        {
            try {
                if (!this.txtCodi.getText().isEmpty() && !this.txtNomb.getText().isEmpty() && !this.txtDesc.getText().isEmpty()) {
                    Equipos obje = new Equipos();
                    obje.setCodiEqui(Integer.parseInt(txtCodi.getText()));
                    obje.setNombEqui(txtNomb.getText());
                    obje.setDescEqui(this.txtDesc.getText());
                    if (new EquiposCtrl().upda(obje))
                    {
                        JOptionPane.showMessageDialog(this, "Datos Actualizados");
                        this.actTabEqui();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Error");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Por favor complete los campos");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un registro a modificar");
        }
    }//GEN-LAST:event_btnModiActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        limp();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnGuarJugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuarJugaActionPerformed
        try {
            if (!this.txtJuga.getText().isEmpty() && !this.txtAltu.getText().isEmpty() && !this.txtEdad.getText().isEmpty() && !this.txtPeso.getText().isEmpty())
            {
                Jugadores obje = new Jugadores();
                //obje.setCodiEqui(Integer.parseInt(txtCodi.getText()));
                obje.setNombJuga(txtJuga.getText());
                obje.setAltuJuga(Integer.parseInt(txtAltu.getText()));
                Equipos objeEqui = (Equipos)this.cmbEqui.getSelectedItem();
                obje.setCodiEqui(objeEqui.getCodiEqui());
                obje.setEdadJuga(this.txtEdad.getText());
                obje.setPesoJuga(this.txtPeso.getText());
                if (new JugadoresCtrl().guar(obje))
                {
                    JOptionPane.showMessageDialog(this, "Datos guardados");
                    this.actTabJuga();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Por favor complete los campos");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnGuarJugaActionPerformed

    private void btnModiJugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModiJugaActionPerformed
        if (this.tblJuga.getSelectedRow() > -1)
        {
            try {
                if (!this.txtCodJuga.getText().isEmpty() && !this.txtJuga.getText().isEmpty() && !this.txtAltu.getText().isEmpty() && !this.txtEdad.getText().isEmpty() && !this.txtPeso.getText().isEmpty())
                {
                    Jugadores obje = new Jugadores();
                    obje.setCodiJuga(Integer.parseInt(txtCodJuga.getText()));
                    obje.setNombJuga(txtJuga.getText());
                    obje.setAltuJuga(Integer.parseInt(txtAltu.getText()));
                    Equipos objeEqui = (Equipos)this.cmbEqui.getSelectedItem();
                    obje.setCodiEqui(objeEqui.getCodiEqui());
                    obje.setEdadJuga(this.txtEdad.getText());
                    obje.setPesoJuga(this.txtPeso.getText());
                    if (new JugadoresCtrl().upda(obje))
                    {
                        JOptionPane.showMessageDialog(this, "Datos Actualizados");
                        this.actTabJuga();
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Error");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Por favor complete los campos");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un registro a modificar");
        }
        
    }//GEN-LAST:event_btnModiJugaActionPerformed

    private void btnElimJugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimJugaActionPerformed
        if (this.tblJuga.getSelectedRow() > -1)
        {
            try {
                if (!this.txtCodJuga.getText().isEmpty() && !this.txtJuga.getText().isEmpty() && !this.txtAltu.getText().isEmpty() && !this.txtEdad.getText().isEmpty() && !this.txtPeso.getText().isEmpty()) {
                    Jugadores obje = new Jugadores();
                    obje.setCodiJuga(Integer.parseInt(txtCodJuga.getText()));
                    if (JOptionPane.showConfirmDialog(this, "Esta seguro de que desea eliminar este registro?", "AVISO", JOptionPane.YES_NO_OPTION) == 0) 
                    {
                        if (new JugadoresCtrl().dele(obje))
                        {
                            JOptionPane.showMessageDialog(this, "Datos Eliminados");
                            this.actTabJuga();
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Error");
                        }
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Por favor complete los campos");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Por favor seleccione un registro a Eliminar");
        }
    }//GEN-LAST:event_btnElimJugaActionPerformed

    private void tblJugaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblJugaMouseClicked
        try {
            int fila = this.tblJuga.getSelectedRow();
            if (fila >= 0) {
                Jugadores obje = (Jugadores)this.tblJuga.getValueAt(fila, 0);
                this.txtCodJuga.setText(String.valueOf(obje.getCodiJuga()));
                this.txtJuga.setText(obje.getNombJuga());
                this.cmbEqui.setEditable(true); 
                this.cmbEqui.setSelectedItem((Equipos)new EquiposCtrl().consUno(obje.getCodiEqui()));
                this.cmbEqui.setEditable(false);
                this.txtAltu.setText(String.valueOf(obje.getAltuJuga()));
                this.txtEdad.setText(obje.getEdadJuga());
                this.txtPeso.setText(obje.getPesoJuga());
            }
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_tblJugaMouseClicked

    private void btnConJugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConJugaActionPerformed
        // TODO add your handling code here:
        this.actTabJuga();
    }//GEN-LAST:event_btnConJugaActionPerformed

    private void btnNuevJugaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevJugaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevJugaActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        // TODO add your handling code here:
        if (this.jTabbedPane1.getSelectedIndex() == 1)
        {
            try {
                this.llenCmb();
            } catch (Exception e) {
                
            }
        }
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void jTabbedPane1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTabbedPane1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1ComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConJuga;
    private javax.swing.JButton btnCons;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnElimJuga;
    private javax.swing.JButton btnGuar;
    private javax.swing.JButton btnGuarJuga;
    private javax.swing.JButton btnModi;
    private javax.swing.JButton btnModiJuga;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNuevJuga;
    private javax.swing.JComboBox<String> cmbEqui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblEqui;
    private javax.swing.JTable tblJuga;
    private javax.swing.JTextField txtAltu;
    private javax.swing.JTextField txtCodJuga;
    private javax.swing.JTextField txtCodi;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtJuga;
    private javax.swing.JTextField txtNomb;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
