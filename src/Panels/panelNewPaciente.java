/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Panels;

import Clases.Paciente;
import Clases.RegistroPaciente;
import Clases.exportarExcel;
import Clases.tools;
import Ventanas.Index;
import Ventanas.VerHistorialPaciente;
import Ventanas.newPaciente;
import Ventanas.tipoSRQ;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author parra
 */
public class panelNewPaciente extends javax.swing.JPanel {

    DefaultTableModel modelo;
    ArrayList<Paciente> pacientes = new ArrayList();
    String fecha01 = "1990/01/01", fecha02 = "2100/12/31";
    ArrayList<String> pacs = new ArrayList();
    ArrayList<RegistroPaciente> registros = new ArrayList();
    newPaciente np;
    public panelNewPaciente() {
        initComponents();
        modelo = (DefaultTableModel) tabla.getModel();
        tituloBoton.setVisible(false);
        //new Thread(this::iniciar).start();
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoCiclo = new javax.swing.ButtonGroup();
        panelDato01 = new rojeru_san.rspanel.RSPanelRound();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        pacientesListaEsperaLabel = new javax.swing.JLabel();
        panelDato4 = new rojeru_san.rspanel.RSPanelRound();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        pacientesRegistradosLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new rojerusan.RSTableMetro();
        buscarTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        barra = new rojeru_san.rsprogress.RSProgressBarAnimated();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        tituloBoton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 230, 230));

        panelDato01.setColorBackground(new java.awt.Color(230, 230, 230));
        panelDato01.setColorBorde(new java.awt.Color(51, 51, 51));

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pacientes en Lista Espera");

        pacientesListaEsperaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pacientesListaEsperaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pacientesListaEsperaLabel.setText("xxxxxx");
        pacientesListaEsperaLabel.setToolTipText("Muestra la cantidad de Pacientes Atendidos en el ciclo actual");
        pacientesListaEsperaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelDato01Layout = new javax.swing.GroupLayout(panelDato01);
        panelDato01.setLayout(panelDato01Layout);
        panelDato01Layout.setHorizontalGroup(
            panelDato01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDato01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDato01Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addComponent(pacientesListaEsperaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)))
        );
        panelDato01Layout.setVerticalGroup(
            panelDato01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pacientesListaEsperaLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDato4.setColorBackground(new java.awt.Color(230, 230, 230));
        panelDato4.setColorBorde(new java.awt.Color(51, 51, 51));

        jSeparator4.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Pacientes Registrados");

        pacientesRegistradosLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pacientesRegistradosLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pacientesRegistradosLabel.setText("xxxxxx");
        pacientesRegistradosLabel.setToolTipText("Muestra la cantidad de SESIONES Atendidos en el ciclo actual");
        pacientesRegistradosLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelDato4Layout = new javax.swing.GroupLayout(panelDato4);
        panelDato4.setLayout(panelDato4Layout);
        panelDato4Layout.setHorizontalGroup(
            panelDato4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDato4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(pacientesRegistradosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelDato4Layout.setVerticalGroup(
            panelDato4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDato4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pacientesRegistradosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Código", "Nombre", "Tipo Doc", "Num Doc", "Edad", "Telefono", "Correo", "Sesiones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setBackgoundHead(new java.awt.Color(0, 102, 102));
        tabla.setBackgoundHover(new java.awt.Color(0, 153, 153));
        tabla.setColorBorderRows(new java.awt.Color(255, 255, 255));
        tabla.setColorPrimaryText(new java.awt.Color(102, 102, 102));
        tabla.setColorSecundaryText(new java.awt.Color(102, 102, 102));
        tabla.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        tabla.setFontRowHover(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        tabla.setFontRowSelect(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        tabla.setSelectionBackground(new java.awt.Color(230, 100, 34));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setMinWidth(80);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(80);
            tabla.getColumnModel().getColumn(0).setMaxWidth(80);
            tabla.getColumnModel().getColumn(1).setMinWidth(125);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(125);
            tabla.getColumnModel().getColumn(1).setMaxWidth(125);
            tabla.getColumnModel().getColumn(3).setMinWidth(130);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(120);
            tabla.getColumnModel().getColumn(3).setMaxWidth(130);
            tabla.getColumnModel().getColumn(4).setMinWidth(120);
            tabla.getColumnModel().getColumn(4).setPreferredWidth(120);
            tabla.getColumnModel().getColumn(4).setMaxWidth(120);
            tabla.getColumnModel().getColumn(5).setMinWidth(80);
            tabla.getColumnModel().getColumn(5).setPreferredWidth(80);
            tabla.getColumnModel().getColumn(5).setMaxWidth(80);
            tabla.getColumnModel().getColumn(6).setMinWidth(120);
            tabla.getColumnModel().getColumn(6).setPreferredWidth(120);
            tabla.getColumnModel().getColumn(6).setMaxWidth(120);
            tabla.getColumnModel().getColumn(8).setMinWidth(85);
            tabla.getColumnModel().getColumn(8).setPreferredWidth(85);
            tabla.getColumnModel().getColumn(8).setMaxWidth(85);
        }

        buscarTxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        buscarTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                buscarTxtKeyTyped(evt);
            }
        });

        buscarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_search_32px.png"))); // NOI18N
        buscarBtn.setToolTipText("Buscar paciente");
        buscarBtn.setContentAreaFilled(false);
        buscarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_restore_32px_1.png"))); // NOI18N
        jButton7.setToolTipText("Actualizar valores");
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_32px.png"))); // NOI18N
        jButton8.setToolTipText("Agregar nuevo paciente");
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton8MouseExited(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_edit_32px_3.png"))); // NOI18N
        jButton2.setToolTipText("Editar Datos del paciente");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_info_32px.png"))); // NOI18N
        jButton3.setToolTipText("Detalle del paciente");
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_microsoft_excel_32px.png"))); // NOI18N
        jButton4.setToolTipText("Exportar Info de los pacientes a Excel");
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_remove_32px_1.png"))); // NOI18N
        jButton5.setToolTipText("Eliminar Paciente");
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Buscar Paciente");

        barra.setForeground(new java.awt.Color(0, 102, 102));
        barra.setToolTipText("");
        barra.setColorBorde(new java.awt.Color(0, 102, 102));
        barra.setColorSelBackground(new java.awt.Color(0, 102, 102));
        barra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        barra.setGrosorBorde(1);
        barra.setString("Actualizando y Sincronizando registos con la base de Datos");
        barra.setVelocidad(40);

        jButton10.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_32px.png"))); // NOI18N
        jButton10.setText("Indice B.");
        jButton10.setToolTipText("Agregar nueva Evaluación de Indice Bienestar");
        jButton10.setContentAreaFilled(false);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_add_32px.png"))); // NOI18N
        jButton9.setText(" SRQ18");
        jButton9.setToolTipText("Agregar nueva Evaluación SRQ18");
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        tituloBoton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tituloBoton.setText("Atender Paciente de Lista de Espera o Mis Pacientes Citados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(panelDato01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(panelDato4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buscarTxt)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 7, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(tituloBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelDato4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDato01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tituloBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 91, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.getSelectedRow();
        if (evt.getClickCount() == 2 && fila >= 0) {
            int idx = Integer.valueOf(tabla.getValueAt(fila, 0).toString());
            for (Paciente paciente : pacientes) {
                if (Float.compare(idx, paciente.getId()) == 0) {
                    new VerHistorialPaciente(paciente, Index.getUser()).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_tablaMouseClicked

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        llenarTabla();
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (JOptionPane.showConfirmDialog(panelDato01, "¿Desea volver a sincronizar con la base de datos?") == 0) {
            resetearBusqueda();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (JOptionPane.showConfirmDialog(panelDato01, "¿Desea Marcar como Eliminado al Paciente?") == 0) {

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        if( !np.isShowing() || !np.isVisible()){
            np = new newPaciente(this);
            np.setVisible(true);
        }else{
            np.setExtendedState(0);
        }
                
      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            int idx = Integer.valueOf(tabla.getValueAt(fila, 0).toString());
            for (Paciente paciente : pacientes) {
                if (Float.compare(idx, paciente.getId()) == 0) {
                    new VerHistorialPaciente(paciente, Index.getUser()).setVisible(true);
                    break;
                }
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JTable tablax = new JTable();
        modelo = (DefaultTableModel) tablax.getModel();

        new Thread(panelMonitoreo::verBarra).start();
        new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    modelo.addColumn("#");
                    modelo.addColumn("ID");
                    modelo.addColumn("Código");
                    modelo.addColumn("Nombres");
                    modelo.addColumn("apellidos");
                    modelo.addColumn("Tipo de Documento");
                    modelo.addColumn("N° DNI");
                    modelo.addColumn("Genero");
                    modelo.addColumn("Fecha Creación");
                    modelo.addColumn("Fecha Nacimiento");
                    modelo.addColumn("Total Sesiones");
                    modelo.addColumn("Telefono");
                    modelo.addColumn("TelefonoOpcional");
                    modelo.addColumn("Correo");
                    modelo.addColumn("Nacionalidad");
                    modelo.addColumn("Condición Migratoria");
                    modelo.addColumn("Departamento");
                    modelo.addColumn("Provincia");
                    modelo.addColumn("Distrito");
                    modelo.addColumn("Grupo Vulnerable");
                    modelo.addColumn("Discapacidad");
                    modelo.addColumn("¿Red Soporte?");
                    modelo.addColumn("Nombre red Soporte");
                    modelo.addColumn("SRQ Inicial");
                    modelo.addColumn("Observación");
                    modelo.addColumn("Proyecto");
                    modelo.addColumn("Motivo Consulta");
                    modelo.addColumn("Acciones");

                    int cont = 1;
                    for (Paciente paciente : pacientes) {
                        modelo.addRow(new Object[]{cont++,
                            paciente.getId(), paciente.getCodigo(), paciente.getNombres(), paciente.getApellidos(), paciente.getTipoDocumento(), paciente.getDni(), paciente.getGenero(),
                            paciente.getFechaCreacion(), paciente.getFechaNacimiento(), paciente.getTotalSesiones(), paciente.getTelefono(),paciente.getTelefonoOpcional(), paciente.getCorreo(), paciente.getNacionalidad(),
                            paciente.getCondicionMigratoria(), paciente.getDepartamento(), paciente.getProvincia(), paciente.getDistrito(), paciente.getGrupoVulnerable(), paciente.getDiscapacidad(), paciente.getRedSoporte(), paciente.getNombreRedSoporte(),
                            paciente.getSrqIngreso(), paciente.getObservacion(), paciente.getProyecto(), paciente.getMotivoConsulta(), paciente.getAcciones()
                        });
                    }
                    new exportarExcel().exportarExcel(tablax, "Pacientes");
                    new Thread(panelMonitoreo::ocultarBarra).start();

                } catch (IOException ex) {
                    Logger.getLogger(panelMonitoreo.class.getName()).log(Level.SEVERE, null, ex);

                }

            }
        }).start();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if (tabla.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(panelDato01, "Debe seleccionar un paciente dentro de la tabla");
        } else {
            for (Paciente p : pacientes) {
                if (Float.compare(p.getId(), Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString())) == 0) {
                     new tipoSRQ(p,"indice").setVisible(true);
                    break;
                }
            }

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (tabla.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(panelDato01, "Debe seleccionar un paciente dentro de la tabla");
        } else {
            for (Paciente p : pacientes) {
                if (p.getId() == Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString())) {
                    //for (RegistroPaciente rp : p.getRegistros()) {
                        //if (rp.getAccionRP().toLowerCase().contains("srq")) {
                            
                        //}
                    //}
                    new tipoSRQ(p,"srq").setVisible(true);
                            break;
                    //new newSRQ18(p, "Inicial").setVisible(true);
                    //break;
                    
                }
            }

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void buscarTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarTxtKeyTyped
        llenarTabla();
    }//GEN-LAST:event_buscarTxtKeyTyped

    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        tituloBoton.setText("Registrar Nuevo Paciente");
        tituloBoton.setVisible(true);
    }//GEN-LAST:event_jButton8MouseEntered

    private void jButton8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseExited
        tituloBoton.setVisible(false);
    }//GEN-LAST:event_jButton8MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        tituloBoton.setText("Editar Información del Paciente");
        tituloBoton.setVisible(true);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        tituloBoton.setVisible(false);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        tituloBoton.setText("Ver información detallada del paciente (Hoja de vida)");
        tituloBoton.setVisible(true);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        tituloBoton.setVisible(false);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        tituloBoton.setText("Exportar a Excel información detallada de los pacientes en la tabla");
        tituloBoton.setVisible(true);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        tituloBoton.setVisible(false);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if (tabla.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(panelDato01, "Debe seleccionar un paciente dentro de la tabla");
        } else {
            for (Paciente p : pacientes) {
                int idTomado = Integer.parseInt(tabla.getValueAt(tabla.getSelectedRow(), 0).toString());
                if (Float.compare(p.getId(), idTomado) == 0) {
                    new newPaciente(p, "editar",this).setVisible(true);
                    break;
                }
            }

        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    static rojeru_san.rsprogress.RSProgressBarAnimated barra;
    static javax.swing.JButton buscarBtn;
    static javax.swing.JTextField buscarTxt;
    private javax.swing.ButtonGroup grupoCiclo;
    private static javax.swing.JButton jButton10;
    static javax.swing.JButton jButton2;
    static javax.swing.JButton jButton3;
    static javax.swing.JButton jButton4;
    static javax.swing.JButton jButton5;
    static javax.swing.JButton jButton7;
    static javax.swing.JButton jButton8;
    private static javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private static javax.swing.JLabel pacientesListaEsperaLabel;
    private static javax.swing.JLabel pacientesRegistradosLabel;
    private rojeru_san.rspanel.RSPanelRound panelDato01;
    private rojeru_san.rspanel.RSPanelRound panelDato4;
    static rojerusan.RSTableMetro tabla;
    private javax.swing.JLabel tituloBoton;
    // End of variables declaration//GEN-END:variables

    public void iniciar() {
        barra.setVisible(false);
        resetearBusqueda();
         
    }

    public  void resetearBusqueda() {
        pacientes.clear();
        pacs.clear();
        barra.setVisible(true);

        new Thread(new Runnable() {
            @Override
            public void run() {
                pacientes = (ArrayList) new Paciente().ListarPacienteconRegistros().clone();
                llenarTabla();
                setIndicadores();
            }
        }).start();

    }

    public void llenarTabla() {
        modelo.setRowCount(0);

        String txt2 = buscarTxt.getText().isEmpty() ? "" : buscarTxt.getText().toLowerCase();
        for (Paciente paciente : pacientes) {
            if ((paciente.getCodigo().toLowerCase().contains(txt2) 
                    || paciente.getNombreCompleto().toLowerCase().contains(txt2) 
                    || paciente.getDni().contains(txt2))) {//validarPaciente(paciente)
                modelo.addRow(new Object[]{
                    paciente.getId(), paciente.getCodigo(), paciente.getNombreCompleto(),paciente.getTipoDocumento(),paciente.getDni(),
                    new tools().obtenerEdad2(paciente.getFechaNacimiento()),paciente.getTelefono(),paciente.getCorreo(), paciente.getTotalSesiones()
                });
            }
        }

        barra.setVisible(false);
    }

    private boolean validarPaciente(Paciente paciente) {
        boolean llave = false;
        boolean temp = false;

        for (String p : pacs) {
            if (paciente.getCodigo().equals(p)) {
                temp = true;
            }
        }
        if (temp == false) {
            pacs.add(paciente.getCodigo());
            llave = true;
        }

        return llave;
    }

    public void setIndicadores() {
        pacientesRegistradosLabel.setText(pacientes.size() + "");
        registros.clear();

        new Thread(new Runnable() {
            @Override
            public void run() {
                registros.clear();
                registros = (ArrayList) new RegistroPaciente().Listar("").clone();
                int conteoListaEspera = 0;
                for (RegistroPaciente rp : registros) {
                    if (rp.getAccionRP().contains("Lista de Espera") && rp.getEstadoRP().equalsIgnoreCase("activo")) {
                        conteoListaEspera += 1;
                    }
                }
                pacientesListaEsperaLabel.setText(conteoListaEspera + "");
            }
        }).start();

    }
}
