/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Panels;

import Clases.IndiceBienestar;
import Clases.Paciente;
import Clases.SRQ18;
import Ventanas.Index;
import Ventanas.newIndiceBienestar;
import Ventanas.newPaciente;
import Ventanas.newSRQ18;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author parra
 */
public class RnpObservaciones extends javax.swing.JPanel {

    public static String proyecto = "";
    public static SRQ18 srq18 = new SRQ18();
    newIndiceBienestar newIndice = new newIndiceBienestar();
    newSRQ18 newSrq;
    static IndiceBienestar indice = new IndiceBienestar();
    newPaciente ventanaOriginal;
    Index index;
    
    public RnpObservaciones() {
        initComponents();
        btnVerSrq.setVisible(false);
        newSrq = new newSRQ18();
    }

    public RnpObservaciones(Index index,newPaciente pc) {
        initComponents();
        this.ventanaOriginal = pc;
        this.index=index;
        alertaIcon1.setVisible(false);
        alertaMensaje1.setVisible(false);
        alertaIcon2.setVisible(false);
        alertaMensaje2.setVisible(false);
        alertaIcon3.setVisible(false);
        alertaMensaje3.setVisible(false);
        btnVerSrq.setVisible(false);
        btnVerIndice.setVisible(false);
        newSrq = new newSRQ18();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        accionesTxt = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        srqInicialBtn = new rojeru_san.rsbutton.RSButtonRound();
        jLabel4 = new javax.swing.JLabel();
        resultadoSRQLabel = new javax.swing.JLabel();
        rSButtonIconDos1 = new RSMaterialComponent.RSButtonIconDos();
        btnVerSrq = new rojeru_san.rsbutton.RSButtonRoundEffect();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacionesTxt = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        preocupacionTxt = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        indiceInicialBtn = new rojeru_san.rsbutton.RSButtonRound();
        jLabel9 = new javax.swing.JLabel();
        resultadoIndiceLabel = new javax.swing.JLabel();
        rSButtonIconDos2 = new RSMaterialComponent.RSButtonIconDos();
        btnVerIndice = new rojeru_san.rsbutton.RSButtonRoundEffect();
        jSeparator1 = new javax.swing.JSeparator();
        alertaMensaje1 = new javax.swing.JLabel();
        alertaIcon1 = new RSMaterialComponent.RSButtonIconDos();
        alertaMensaje2 = new javax.swing.JLabel();
        alertaIcon2 = new RSMaterialComponent.RSButtonIconDos();
        jLabel11 = new javax.swing.JLabel();
        alertaIcon3 = new RSMaterialComponent.RSButtonIconDos();
        alertaMensaje3 = new javax.swing.JLabel();
        rSPanelRound1 = new rojeru_san.rspanel.RSPanelRound();
        jLabel2 = new javax.swing.JLabel();
        acnurRadio = new RSMaterialComponent.RSRadioButtonMaterial();
        pdafRadio = new RSMaterialComponent.RSRadioButtonMaterial();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();

        accionesTxt.setColumns(20);
        accionesTxt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        accionesTxt.setRows(3);
        jScrollPane3.setViewportView(accionesTxt);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("red de apoyo, educación, profesión, etc.");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("como familia, trabajo, cuando llegó a Perú");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Datos complementarios ( aspecto social )");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciones y Evaluaciones SRQ - Indice B.", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 13))); // NOI18N
        setPreferredSize(new java.awt.Dimension(840, 767));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Evaluación SRQ18 de Ingreso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 15))); // NOI18N

        srqInicialBtn.setText("+ Generar SRQ");
        srqInicialBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        srqInicialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srqInicialBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Resultado:");

        resultadoSRQLabel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        resultadoSRQLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultadoSRQLabel.setText("Esperando Resultados ");

        rSButtonIconDos1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INFO_OUTLINE);
        rSButtonIconDos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconDos1ActionPerformed(evt);
            }
        });

        btnVerSrq.setText("Ver SRQ");
        btnVerSrq.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnVerSrq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSrqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addComponent(srqInicialBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButtonIconDos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(resultadoSRQLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerSrq, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(srqInicialBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonIconDos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoSRQLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btnVerSrq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Recomendaciones");

        observacionesTxt.setColumns(20);
        observacionesTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        observacionesTxt.setRows(2);
        jScrollPane1.setViewportView(observacionesTxt);

        preocupacionTxt.setColumns(20);
        preocupacionTxt.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        preocupacionTxt.setRows(3);
        jScrollPane2.setViewportView(preocupacionTxt);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Evaluación Indice Bienestar de Ingreso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 15))); // NOI18N

        indiceInicialBtn.setText("+ Generar Indice B.");
        indiceInicialBtn.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        indiceInicialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indiceInicialBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Resultado:");

        resultadoIndiceLabel.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        resultadoIndiceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultadoIndiceLabel.setText("Esperando Resultados ");

        rSButtonIconDos2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INFO_OUTLINE);
        rSButtonIconDos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconDos2ActionPerformed(evt);
            }
        });

        btnVerIndice.setText("Ver Indice");
        btnVerIndice.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnVerIndice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerIndiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(resultadoIndiceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(indiceInicialBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButtonIconDos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indiceInicialBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonIconDos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultadoIndiceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(btnVerIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        alertaMensaje1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alertaMensaje1.setText("Paciente posee intenciones Suicidas.");
        alertaMensaje1.setToolTipText("Paciente posee intenciones Suicidas.");

        alertaIcon1.setBackground(new java.awt.Color(204, 0, 0));
        alertaIcon1.setBackgroundHover(new java.awt.Color(153, 0, 0));
        alertaIcon1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertaIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);
        alertaIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertaIcon1ActionPerformed(evt);
            }
        });

        alertaMensaje2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        alertaMensaje2.setText("Prob. de sindrome andioso-depresivo o trastorno mental");
        alertaMensaje2.setToolTipText("Probabilidad de sindrome andioso-depresivo o algún trastorno mental");

        alertaIcon2.setBackground(new java.awt.Color(204, 0, 0));
        alertaIcon2.setBackgroundHover(new java.awt.Color(153, 0, 0));
        alertaIcon2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertaIcon2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);
        alertaIcon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertaIcon2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("(Aspectos psicológicos)");

        alertaIcon3.setBackground(new java.awt.Color(204, 0, 0));
        alertaIcon3.setBackgroundHover(new java.awt.Color(153, 0, 0));
        alertaIcon3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        alertaIcon3.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.WARNING);
        alertaIcon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alertaIcon3ActionPerformed(evt);
            }
        });

        alertaMensaje3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        alertaMensaje3.setText("Bajo Bienestar. Posible aplicación de ICD-10");
        alertaMensaje3.setToolTipText("Bajo Bienestar. Posible aplicación de ICD-10");

        rSPanelRound1.setAnchoBorde(0.5F);
        rSPanelRound1.setColorBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione tipo de Proyecto:");

        grupo1.add(acnurRadio);
        acnurRadio.setSelected(true);
        acnurRadio.setText("ACNUR");
        acnurRadio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        acnurRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                acnurRadioStateChanged(evt);
            }
        });

        grupo1.add(pdafRadio);
        pdafRadio.setText("PDAF");
        pdafRadio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        pdafRadio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                pdafRadioStateChanged(evt);
            }
        });

        javax.swing.GroupLayout rSPanelRound1Layout = new javax.swing.GroupLayout(rSPanelRound1);
        rSPanelRound1.setLayout(rSPanelRound1Layout);
        rSPanelRound1Layout.setHorizontalGroup(
            rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(acnurRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pdafRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        rSPanelRound1Layout.setVerticalGroup(
            rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(acnurRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pdafRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Motivo de Consulta ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(alertaIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(alertaMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(alertaIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(alertaMensaje3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(alertaIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(alertaMensaje2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(rSPanelRound1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(69, 69, 69)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(rSPanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alertaIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertaMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertaIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertaMensaje3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alertaIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alertaMensaje2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pdafRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_pdafRadioStateChanged
        if (pdafRadio.isSelected()) {
            if (validarPDAF()) {
                proyecto = "ACNUR";
            }

        }
    }//GEN-LAST:event_pdafRadioStateChanged

    private void acnurRadioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_acnurRadioStateChanged
        if (acnurRadio.isSelected()) {
            proyecto = "ACNUR";
        }
    }//GEN-LAST:event_acnurRadioStateChanged

    private void rSButtonIconDos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconDos1ActionPerformed
        JOptionPane.showMessageDialog(preocupacionTxt, "Para poder generar una nueva Evaluación SRQ debe tener algunos datos ingresados del paciente como:\n-Nombres y Apellidos\n-Fecha de nacimiento");
    }//GEN-LAST:event_rSButtonIconDos1ActionPerformed

    private void srqInicialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srqInicialBtnActionPerformed
        String respuesta = RnpDatosPersonales.validarparaSRQ();
        if (respuesta.equals("")) {
            String nombreCompleto = RnpDatosPersonales.nombresTxt.getText() +" "+ RnpDatosPersonales.apellidosTxt.getText();
            String fnac = new SimpleDateFormat("yyyy-MM-dd").format(RnpDatosPersonales.fnac.getDatoFecha());
           
            if(newSrq.isVisible()){
               newSrq.setExtendedState(0);
           }else{
                if(ventanaOriginal.srq18.getSumatoria()>0){
                    newSrq = new newSRQ18(index,ventanaOriginal, nombreCompleto, fnac, "Inicial",ventanaOriginal.srq18);
                    newSrq.setVisible(true);
                }else{
                   newSrq = new newSRQ18(index,ventanaOriginal, nombreCompleto, fnac, "Inicial");
               newSrq.setVisible(true); 
                }
               
           }
           
        } else {
            JOptionPane.showMessageDialog(preocupacionTxt, "La Evaluación SRQ18 Inicial es obligatoria para registar un paciente\nYPara poder generar una nueva Evaluación SRQ debe tener algunos datos ingresados del paciente como:\n-Nombres y Apellidos\n-Fecha de nacimiento");
        }
    }//GEN-LAST:event_srqInicialBtnActionPerformed

    private void indiceInicialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiceInicialBtnActionPerformed
        String respuesta = RnpDatosPersonales.validarparaSRQ();
        if (respuesta.equals("")) {
            Paciente paciente = new Paciente();
            paciente.setApellidos(ventanaOriginal.RnpPag1.apellidosTxt.getText());
            paciente.setNombres(ventanaOriginal.RnpPag1.nombresTxt.getText());
            
            if (newIndice.isVisible()){
                 newIndice.setExtendedState(0);
            }else{
                newIndice = new newIndiceBienestar(index,paciente, "Inicial",ventanaOriginal,ventanaOriginal.indice);
                newIndice.setVisible(true);
            }
            
        } else {
            JOptionPane.showMessageDialog(preocupacionTxt, "La Evaluación Indice Bienestar Inicial es obligatoria para registar un paciente\nYPara poder generar una nueva Evaluación SRQ debe tener algunos datos ingresados del paciente como:\n-Nombres y Apellidos\n-Fecha de nacimiento");
        }


    }//GEN-LAST:event_indiceInicialBtnActionPerformed

    private void rSButtonIconDos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconDos2ActionPerformed
        JOptionPane.showMessageDialog(preocupacionTxt, "La Evaluación de Indice Bienestar Inicial es obligatoria para registar un paciente\nY Para poder generar una nueva Evaluación SRQ debe tener algunos datos ingresados del paciente como:\n-Nombres y Apellidos\n-Fecha de nacimiento");

    }//GEN-LAST:event_rSButtonIconDos2ActionPerformed

    private void alertaIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertaIcon1ActionPerformed
       JOptionPane.showMessageDialog(alertaIcon1, "Paciente posee intenciones Suicidas.");
    }//GEN-LAST:event_alertaIcon1ActionPerformed

    private void alertaIcon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertaIcon2ActionPerformed
        JOptionPane.showMessageDialog(alertaIcon1, "Probabilidad de sindrome andioso-depresivo o algún trastorno mental");
    }//GEN-LAST:event_alertaIcon2ActionPerformed

    private void btnVerSrqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSrqActionPerformed
       Paciente paciente = new Paciente();
       paciente.setNombres(RnpDatosPersonales.nombresTxt.getText());
       paciente.setApellidos(RnpDatosPersonales.apellidosTxt.getText());
       paciente.setFechaNacimiento(new SimpleDateFormat("yyyy-MM-dd").format(RnpDatosPersonales.fnac.getDatoFecha()));
       paciente.setDepartamento(RnpDatosPersonales.departamentoTxt.getSelectedItem().toString());
       paciente.setProvincia(RnpDatosPersonales.provinviaTxt.getSelectedItem().toString());
       paciente.setDistrito(RnpDatosPersonales.distritoTxt.getSelectedItem().toString());
       
       new newSRQ18(index,paciente,srq18,"ver").setVisible(true);
    }//GEN-LAST:event_btnVerSrqActionPerformed

    private void alertaIcon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alertaIcon3ActionPerformed
        // Bajo Bienestar. Posible aplicación de ICD-10
        JOptionPane.showMessageDialog(alertaIcon1, "Bajo Bienestar. Posible aplicación de ICD-10");
    }//GEN-LAST:event_alertaIcon3ActionPerformed

    private void btnVerIndiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerIndiceActionPerformed
      Paciente paciente = new Paciente();
       paciente.setNombres(RnpDatosPersonales.nombresTxt.getText());
       paciente.setApellidos(RnpDatosPersonales.apellidosTxt.getText());
       
       new newIndiceBienestar(index,paciente,ventanaOriginal.indice).setVisible(true);
    }//GEN-LAST:event_btnVerIndiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea accionesTxt;
    public static RSMaterialComponent.RSRadioButtonMaterial acnurRadio;
    public RSMaterialComponent.RSButtonIconDos alertaIcon1;
    public RSMaterialComponent.RSButtonIconDos alertaIcon2;
    public RSMaterialComponent.RSButtonIconDos alertaIcon3;
    public javax.swing.JLabel alertaMensaje1;
    public javax.swing.JLabel alertaMensaje2;
    public javax.swing.JLabel alertaMensaje3;
    public rojeru_san.rsbutton.RSButtonRoundEffect btnVerIndice;
    private rojeru_san.rsbutton.RSButtonRoundEffect btnVerSrq;
    private javax.swing.ButtonGroup grupo1;
    public rojeru_san.rsbutton.RSButtonRound indiceInicialBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTextArea observacionesTxt;
    public static RSMaterialComponent.RSRadioButtonMaterial pdafRadio;
    public static javax.swing.JTextArea preocupacionTxt;
    private RSMaterialComponent.RSButtonIconDos rSButtonIconDos1;
    private RSMaterialComponent.RSButtonIconDos rSButtonIconDos2;
    private rojeru_san.rspanel.RSPanelRound rSPanelRound1;
    public static javax.swing.JLabel resultadoIndiceLabel;
    public static javax.swing.JLabel resultadoSRQLabel;
    public rojeru_san.rsbutton.RSButtonRound srqInicialBtn;
    // End of variables declaration//GEN-END:variables

    private boolean validarPDAF() {
        boolean llave = false;

        return llave;
    }

    public static void setResultadoSRQ(int valor) {
        resultadoSRQLabel.setText(valor + "");
    }

    public static String validar() {
        String resultado = "";
        if (resultadoSRQLabel.getText().equals("Esperando Resultados de la Evaluación")) {
            //resultado = "\nDatos Faltantes en Pagina#3:\n-Evaluación Inicial SRQ18";
        }
        if (resultadoIndiceLabel.getText().equals("Esperando Resultados de la Evaluación")) {
            if(resultado.isEmpty()){
               // resultado = "\nDatos Faltantes en Pagina#3:\n-Evaluación Inicial Indice Bienestar";
            }else{
              //  resultado+="\nEvaluación Inicial Indice Bienestar";
            }
        }
        

        return resultado;
    }

}
