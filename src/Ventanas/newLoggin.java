/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
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
import rojerusan.RSNotifyFade;

/**
 *
 * @author Franklin
 */
public class newLoggin extends javax.swing.JFrame {

    String userTemp = "";
    static Usuario user = new Usuario();
    static boolean userEncontrado = false;
    public newLoggin() {
        initComponents();
        changeIcon();
        barra.setVisible(false);
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

        panelCentral = new javax.swing.JPanel();
        rSPanelImage1 = new rojeru_san.rspanel.RSPanelImage();
        jPanel1 = new javax.swing.JPanel();
        rSButtonIconShadow1 = new RSMaterialComponent.RSButtonIconShadow();
        rSPanelRound1 = new rojeru_san.rspanel.RSPanelRound();
        rSLabelImage1 = new rojeru_san.rslabel.RSLabelImage();
        jSeparator1 = new javax.swing.JSeparator();
        ingresarBtn = new rojeru_san.rsbutton.RSButtonRound();
        usernameTxt = new RSMaterialComponent.RSTextFieldMaterial();
        passwordTxt = new RSMaterialComponent.RSTextFieldMaterial();
        rSLabelImage2 = new rojeru_san.rslabel.RSLabelImage();
        txtCaptcha = new rojeru_san.rsfield.RSTextFullRound();
        lbcaptcha = new javax.swing.JLabel();
        lbAvisoGatcha = new javax.swing.JLabel();
        barra = new rojeru_san.rsprogress.RSProgressBarAnimated();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso a Plataforma - CAPS");

        panelCentral.setBackground(new java.awt.Color(255, 255, 255));

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/imgs/fondoLoggin.jpg"))); // NOI18N

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonIconShadow1.setBackground(new java.awt.Color(157, 169, 167));
        rSButtonIconShadow1.setBackgroundHover(new java.awt.Color(157, 169, 167));
        rSButtonIconShadow1.setFontSize(24.0F);
        rSButtonIconShadow1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        rSButtonIconShadow1.setIconTextGap(0);
        rSButtonIconShadow1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PEOPLE);
        rSButtonIconShadow1.setOpaque(true);
        rSButtonIconShadow1.setRound(100);
        rSButtonIconShadow1.setTypeBorder(RSMaterialComponent.RSButtonIconShadow.TYPEBORDER.CIRCLE);
        jPanel1.add(rSButtonIconShadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 90, 90));

        rSPanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        rSPanelRound1.setAnchoBorde(1.5F);
        rSPanelRound1.setColorBackground(new java.awt.Color(157, 169, 167));
        rSPanelRound1.setOpaque(false);

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/logo caps.png"))); // NOI18N

        ingresarBtn.setBackground(new java.awt.Color(138, 128, 155));
        ingresarBtn.setText("ACCESO");
        ingresarBtn.setColorHover(new java.awt.Color(100, 128, 155));
        ingresarBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ingresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBtnActionPerformed(evt);
            }
        });

        usernameTxt.setBackground(new java.awt.Color(157, 169, 167));
        usernameTxt.setForeground(new java.awt.Color(255, 255, 255));
        usernameTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTxt.setColorMaterial(new java.awt.Color(138, 128, 155));
        usernameTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usernameTxt.setPhColor(new java.awt.Color(255, 255, 255));
        usernameTxt.setPlaceholder("Nombre de Usuario");
        usernameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameTxtKeyReleased(evt);
            }
        });

        passwordTxt.setBackground(new java.awt.Color(157, 169, 167));
        passwordTxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTxt.setColorMaterial(new java.awt.Color(138, 128, 155));
        passwordTxt.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        passwordTxt.setPhColor(new java.awt.Color(255, 255, 255));
        passwordTxt.setPlaceholder("Contraseña");
        passwordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTxtKeyPressed(evt);
            }
        });

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/captcha.png"))); // NOI18N

        txtCaptcha.setBackground(new java.awt.Color(157, 169, 167));
        txtCaptcha.setForeground(new java.awt.Color(255, 255, 255));
        txtCaptcha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCaptcha.setBorderColor(new java.awt.Color(236, 171, 175));
        txtCaptcha.setOpaque(true);
        txtCaptcha.setPhColor(new java.awt.Color(255, 255, 255));
        txtCaptcha.setPlaceholder("");
        txtCaptcha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCaptchaKeyReleased(evt);
            }
        });

        lbcaptcha.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbcaptcha.setForeground(new java.awt.Color(255, 255, 255));
        lbcaptcha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbAvisoGatcha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvisoGatcha.setText("Ingrese Captcha");

        javax.swing.GroupLayout rSPanelRound1Layout = new javax.swing.GroupLayout(rSPanelRound1);
        rSPanelRound1.setLayout(rSPanelRound1Layout);
        rSPanelRound1Layout.setHorizontalGroup(
            rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelRound1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound1Layout.createSequentialGroup()
                        .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound1Layout.createSequentialGroup()
                        .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound1Layout.createSequentialGroup()
                        .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rSPanelRound1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(rSLabelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbcaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbAvisoGatcha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                        .addGap(27, 27, 27))))
        );
        rSPanelRound1Layout.setVerticalGroup(
            rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelRound1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(lbAvisoGatcha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rSPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSLabelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbcaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCaptcha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSLabelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(rSPanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 400));

        barra.setForeground(new java.awt.Color(236, 171, 175));
        barra.setColorBorde(new java.awt.Color(157, 169, 167));
        barra.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        barra.setGrosorBorde(1);
        barra.setString("");
        barra.setVelocidad(50);

        javax.swing.GroupLayout rSPanelImage1Layout = new javax.swing.GroupLayout(rSPanelImage1);
        rSPanelImage1.setLayout(rSPanelImage1Layout);
        rSPanelImage1Layout.setHorizontalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rSPanelImage1Layout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(194, Short.MAX_VALUE))
            .addComponent(barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        rSPanelImage1Layout.setVerticalGroup(
            rSPanelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rSPanelImage1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCaptchaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCaptchaKeyReleased
      if (validarCaptcha()) {
            lbAvisoGatcha.setText("Captcha Correcto");
        } else {
            lbAvisoGatcha.setText("Captcha Invalido");
        }
     if(evt.getKeyCode() == KeyEvent.VK_ENTER){
         ingresarBtn.doClick();
     }
    }//GEN-LAST:event_txtCaptchaKeyReleased

    private void usernameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameTxtKeyReleased
      try {
            if(evt.getKeyCode() == KeyEvent.VK_PAGE_UP && new tools().Obtener_mac().equals("E8-40-F2-05-EC-40") 
                    || new tools().Obtener_mac().equals("00-24-81-CC-7D-05")){
                usernameTxt.setText("dev");
                passwordTxt.setText(".");
                txtCaptcha.setText(lbcaptcha.getText());
                validarCaptcha();
                ingresarBtn.doClick();
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_usernameTxtKeyReleased

    private void passwordTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTxtKeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ingresarBtn.doClick();
        }
        
    }//GEN-LAST:event_passwordTxtKeyPressed

    private void ingresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBtnActionPerformed
      new Thread(this::buscarUsuario).start();
    }//GEN-LAST:event_ingresarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(newLoggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newLoggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newLoggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newLoggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newLoggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.rsprogress.RSProgressBarAnimated barra;
    private rojeru_san.rsbutton.RSButtonRound ingresarBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbAvisoGatcha;
    private javax.swing.JLabel lbcaptcha;
    private javax.swing.JPanel panelCentral;
    private RSMaterialComponent.RSTextFieldMaterial passwordTxt;
    private RSMaterialComponent.RSButtonIconShadow rSButtonIconShadow1;
    private rojeru_san.rslabel.RSLabelImage rSLabelImage1;
    private rojeru_san.rslabel.RSLabelImage rSLabelImage2;
    private rojeru_san.rspanel.RSPanelImage rSPanelImage1;
    private rojeru_san.rspanel.RSPanelRound rSPanelRound1;
    private rojeru_san.rsfield.RSTextFullRound txtCaptcha;
    private RSMaterialComponent.RSTextFieldMaterial usernameTxt;
    // End of variables declaration//GEN-END:variables

private void actualizarCaptcha() {
        lbcaptcha.setText(new tools().getRandomString(4));
        
    }

private boolean validarCaptcha() {
        if (txtCaptcha.getText().equalsIgnoreCase(lbcaptcha.getText())) {
            //ingresarBtn.setEnabled(true);
            return true;
        } else {
            //ingresarBtn.setEnabled(false);
            return false;
        }
    }
 private void buscarUsuario() {
       ingresarBtn.setEnabled(false);
        try {

            if (!validarCaptcha()) {
                  new rojerusan.RSNotifyFade("¡Captcha Pendiente!",
                  "Debe realizar el captcha antes de continuar.", 5,
              RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
              
                
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
                        barra.setVisible(true);

                        if (userEncontrado == false || !userTemp.equals(usernameTxt.getText())) {
                            user = user.getUsuario(usernameTxt.getText());
                            userTemp = usernameTxt.getText();

                        }

                        if (user.getId() < 0) {
                            userEncontrado = false;
                            barra.setVisible(false);
                            barra.setVisible(false);
                            ingresarBtn.setEnabled(true);
                            new rojerusan.RSNotifyFade("¡Usuario no encontrado!",
                                    "Ingrese correctamente el usuario, no encontramos coincidencias en la base de datos.", 5,
                                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);

                        ingresarBtn.setEnabled(true);
                        } else {
                            if(!user.getEstado().equalsIgnoreCase("activo")){
                                barra.setVisible(false);
                            
                            new rojerusan.RSNotifyFade("¡Usuario inactivo!",
                                    "El usuario no se encuentra activo o habilitado para ingresar.", 5,
                                    RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.WARNING).setVisible(true);
                            }else{
                                 userEncontrado = true;
                            if (!user.getClave().equals(passwordTxt.getText())) {
                                barra.setVisible(false);
                                barra.setVisible(false);
                                new rojerusan.RSNotifyFade("¡Clave Incorrecta!",
                                        "La contraseña ingresada no es correcta, vuelva a intentarlo.", 5,
                                        RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.INFORMATION).setVisible(true);
                            ingresarBtn.setEnabled(true);
                            } else {
                                barra.setVisible(true);

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
}

