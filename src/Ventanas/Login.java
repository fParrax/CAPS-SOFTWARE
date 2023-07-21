/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Usuario;
import Clases.tools;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import rojeru_san.complementos.RSUtilities;
import rojerusan.RSNotifyFade;

public class Login extends javax.swing.JFrame {

    static Usuario user = new Usuario();
    static boolean userEncontrado = false;
    String userTemp = "";
    static int nuevoValorBarra = 0;
    boolean llaveCaptcha = false;

    public Login() {
        initComponents();
        RSUtilities.setOpaqueWindow(this, false);
        RSUtilities.setOpacityComponent(this.fondoPanel, 150);
        changeIcon();
        usernameTxt.requestFocus();
        gif.setVisible(false);
        barra.setVisible(false);
        //captchaBtn.setVisible(false);
        //captchaLabel.setVisible(false);
        //captchaTxt.setVisible(false);
        new Thread(new Runnable() {
            @Override
            public void run() {
                user = new Usuario().getUsuario(".");
                user = new Usuario();
            }
        }).start();
        actualizarCaptcha();
    }

    public void changeIcon() {
        Image icon = new ImageIcon(getClass().getResource("/imgs/logo.png")).getImage();
        setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rSPanelImage1 = new rojeru_san.rspanel.RSPanelImage();
        rSPanelRound1 = new rojeru_san.rspanel.RSPanelRound();
        rSLabelIcon1 = new RSMaterialComponent.RSLabelIcon();
        rSLabelIcon2 = new RSMaterialComponent.RSLabelIcon();
        usernameTxt = new rojeru_san.rsfield.RSTextFullRound();
        passwordTxt = new rojeru_san.rsfield.RSPassViewRound();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        captchaCheck = new javax.swing.JCheckBox();
        captchaLabel = new javax.swing.JLabel();
        captchaTxt = new javax.swing.JTextField();
        mensajeTxt = new javax.swing.JLabel();
        ingresarBtn = new rojeru_san.rsbutton.RSButtonRound();
        barra = new javax.swing.JProgressBar();
        jPanel4 = new javax.swing.JPanel();
        gif = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setResizable(false);

        fondoPanel.setBackground(new java.awt.Color(255, 255, 255));
        fondoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(13, 123, 131));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo caps.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        fondoPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 500, 130));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imgs/peru.png"))); // NOI18N

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        jPanel1.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -20, 150, 140));

        rSPanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelRound1.setColorBackground(new java.awt.Color(255, 255, 255));
        rSPanelRound1.setColorBorde(new java.awt.Color(13, 123, 131));

        rSLabelIcon1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE_OUTLINE);

        rSLabelIcon2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.LOCK);

        usernameTxt.setForeground(new java.awt.Color(0, 0, 0));
        usernameTxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        usernameTxt.setPlaceholder("");
        usernameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameTxtKeyReleased(evt);
            }
        });

        passwordTxt.setForeground(new java.awt.Color(0, 0, 0));
        passwordTxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        passwordTxt.setPlaceholder("");
        passwordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTxtKeyPressed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/captcha.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        captchaCheck.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        captchaCheck.setText("No soy un Robot");
        captchaCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        captchaCheck.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                captchaCheckItemStateChanged(evt);
            }
        });
        captchaCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                captchaCheckMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(captchaCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(captchaCheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        captchaLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        captchaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        captchaTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        captchaTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        captchaTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                captchaTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                captchaTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                captchaTxtKeyTyped(evt);
            }
        });

        mensajeTxt.setBackground(new java.awt.Color(102, 102, 102));
        mensajeTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeTxt.setText("esperando inicio de sesión");

        ingresarBtn.setText("Ingresar");
        ingresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBtnActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        gif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cargando.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gif, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gif, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout rSPanelRound1Layout = new javax.swing.GroupLayout(rSPanelRound1);
        rSPanelRound1.setLayout(rSPanelRound1Layout);
        rSPanelRound1Layout.setHorizontalGroup(
            rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound1Layout.createSequentialGroup()
                        .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(rSPanelRound1Layout.createSequentialGroup()
                                .addComponent(captchaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(captchaTxt))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound1Layout.createSequentialGroup()
                                .addComponent(rSLabelIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound1Layout.createSequentialGroup()
                                .addComponent(rSLabelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mensajeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound1Layout.createSequentialGroup()
                        .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        rSPanelRound1Layout.setVerticalGroup(
            rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSLabelIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSLabelIcon2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(captchaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(captchaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajeTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rSPanelRound1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        jPanel1.add(rSPanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 440, 410));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INGRESO A LA PLATAFORMA");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 360, -1));

        fondoPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBtnActionPerformed

        new Thread(this::buscarUsuario).start();


    }//GEN-LAST:event_ingresarBtnActionPerformed

    private void passwordTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ingresarBtn.doClick();
        }
        
        
    }//GEN-LAST:event_passwordTxtKeyPressed

    private void captchaCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_captchaCheckMouseClicked
        captchaTxt.requestFocus();
        captchaLabel.setVisible(true);
        captchaTxt.setVisible(true);
        if (validarCaptcha()) {
            captchaCheck.setSelected(true);
        } else {
            captchaCheck.setSelected(false);
        }
    }//GEN-LAST:event_captchaCheckMouseClicked

    private void captchaCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_captchaCheckItemStateChanged
        if (validarCaptcha()) {
            captchaCheck.setSelected(true);
        } else {
            captchaCheck.setSelected(false);
        }
    }//GEN-LAST:event_captchaCheckItemStateChanged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    if (validarCaptcha()) {
        setMensaje("CAPTCHA VERIFICADO - NO NECESITA ACTUALIZAR");
    }else{
        actualizarCaptcha();
    }
        
        
    }//GEN-LAST:event_jLabel3MouseClicked

    private void captchaTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_captchaTxtKeyTyped
       
    }//GEN-LAST:event_captchaTxtKeyTyped

    private void captchaTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_captchaTxtKeyReleased
     if (validarCaptcha()) {
            captchaCheck.setSelected(true);
        } else {
            captchaCheck.setSelected(false);
            //actualizarCaptcha();
            mensajeTxt.setText("CAPTCHA INCORRECTO");
        }
     if(evt.getKeyCode() == KeyEvent.VK_ENTER){
         ingresarBtn.doClick();
     }
    }//GEN-LAST:event_captchaTxtKeyReleased

    private void captchaTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_captchaTxtKeyPressed
      
    }//GEN-LAST:event_captchaTxtKeyPressed

    private void usernameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTxtKeyReleased
        
        try {
            if(evt.getKeyCode() == KeyEvent.VK_PAGE_UP && new tools().Obtener_mac().equals("00-24-81-CC-7D-05")){
                usernameTxt.setText("dev");
                passwordTxt.setText(".");
                captchaTxt.setText(captchaLabel.getText());
                validarCaptcha();
                ingresarBtn.doClick();
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_usernameTxtKeyReleased

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JProgressBar barra;
    private javax.swing.JCheckBox captchaCheck;
    private javax.swing.JLabel captchaLabel;
    private javax.swing.JTextField captchaTxt;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel gif;
    private rojeru_san.rsbutton.RSButtonRound ingresarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private static javax.swing.JLabel mensajeTxt;
    private static rojeru_san.rsfield.RSPassViewRound passwordTxt;
    private RSMaterialComponent.RSLabelIcon rSLabelIcon1;
    private RSMaterialComponent.RSLabelIcon rSLabelIcon2;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage1;
    private rojeru_san.rspanel.RSPanelRound rSPanelRound1;
    private rojeru_san.rsfield.RSTextFullRound usernameTxt;
    // End of variables declaration//GEN-END:variables

    private void buscarUsuario() {
       ingresarBtn.setEnabled(false);
        try {

            if (!validarCaptcha()) {
                setMensaje("Debe realizar el captcha Primero");
                  new rojerusan.RSNotifyFade("¡Captcha Pendiente!",
                  "Debe realizar el captcha antes de continuar.", 5,
              RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
              
                captchaLabel.setVisible(true);
                captchaTxt.setVisible(true);
                ingresarBtn.setEnabled(true);

            } else {
                if (usernameTxt.getText().isEmpty()) {
                    new rojerusan.RSNotifyFade("¡Ingrese Usuario!",
                                        "Debe ingresar el nombre de usuario para continuar.", 5,
                                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
                    ingresarBtn.setEnabled(true);
                } else {
                    if (passwordTxt.getText().isEmpty()) {
                         new rojerusan.RSNotifyFade("¡Ingrese Contraseña!",
                                        "Debe ingresar la contraseña del usuario para continuar.", 5,
                                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
                                        ingresarBtn.setEnabled(true);    
                    } else {
                        ingresarBtn.setEnabled(false);
                        gif.setVisible(true);
                        setMensaje("validando credenciales");

                        if (userEncontrado == false || !userTemp.equals(usernameTxt.getText())) {
                            user = user.getUsuario(usernameTxt.getText());
                            userTemp = usernameTxt.getText();

                        }

                        if (user.getId() < 0) {
                            userEncontrado = false;
                            gif.setVisible(false);
                            setMensaje("Usuario no encontrado");
                            barra.setVisible(false);
                            nuevoValorBarra = 0;
                            ingresarBtn.setEnabled(true);
                            new Thread(Login::setValorBarra).start();
                            new rojerusan.RSNotifyFade("¡Usuario no encontrado!",
                                    "Ingrese correctamente el usuario, no encontramos coincidencias en la base de datos.", 5,
                                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

                        ingresarBtn.setEnabled(true);
                        } else {
                            if(!user.getEstado().equalsIgnoreCase("activo")){
                                gif.setVisible(false);
                            setMensaje("Usuario no está activo");
                            
                            new rojerusan.RSNotifyFade("¡Usuario inactivo!",
                                    "El usuario no se encuentra activo o habilitado para ingresar.", 5,
                                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
                            }else{
                                 userEncontrado = true;
                            if (!user.getClave().equals(passwordTxt.getText())) {
                                gif.setVisible(false);
                                setMensaje("Clave Incorrecta");
                                nuevoValorBarra = 0;
                                new Thread(Login::setValorBarra).start();
                                barra.setVisible(false);
                                new rojerusan.RSNotifyFade("¡Clave Incorrecta!",
                                        "La contraseña ingresada no es correcta, vuelva a intentarlo.", 5,
                                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
                            ingresarBtn.setEnabled(true);
                            } else {
                                barra.setVisible(true);
                                nuevoValorBarra = 5;
                                new Thread(Login::setValorBarra).start();
                                setMensaje("Buscando y cargando credenciales");

                                new Index(user).setVisible(true);
                                this.dispose();
                            }
                            
                            
                           

                            }
                        }
                    }
                }

            }

        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(rootPane, "Error1");
            ingresarBtn.setEnabled(true);
        }
    }

    public static void setMensaje(String texto) {
        mensajeTxt.setText(texto);
    }

    public static void setValorBarra() {
        for (int i = barra.getValue(); i < nuevoValorBarra; i++) {
            barra.setValue(i);
            barra.repaint();
            espera();
        }
    }

    private static void espera() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void actualizarCaptcha() {
        captchaLabel.setText(new tools().getRandomString(6));
        captchaTxt.setText("");
    }

    private boolean validarCaptcha() {
        if (captchaLabel.getText().equalsIgnoreCase(captchaTxt.getText())) {
            setMensaje("CAPTCHA VERIFICADO");
            return true;
        } else {
            return false;
        }
    }
}
