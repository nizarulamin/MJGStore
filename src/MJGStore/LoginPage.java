/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MJGStore;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
import java.io.*;
import java.util.*;

/**
 *
 * @author acer
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginPage() {
        initComponents();
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

        panelLoginPage = new javax.swing.JPanel();
        txtWelcomeBack = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLoginPage.setBackground(new java.awt.Color(51, 153, 255));

        txtWelcomeBack.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        txtWelcomeBack.setForeground(new java.awt.Color(255, 255, 255));
        txtWelcomeBack.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtWelcomeBack.setText("Welcome back!");

        panelLogin.setBackground(new java.awt.Color(255, 255, 255));

        txtUsername.setFont(new java.awt.Font("Raleway Medium", 0, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(153, 153, 153));
        txtUsername.setText("Username");
        txtUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernametxtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernametxtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernametxtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsernametxtUsernameKeyTyped(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.setText("Password");
        txtPassword.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordtxtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordtxtPasswordFocusLost(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordtxtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordtxtPasswordKeyTyped(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(51, 153, 255));
        btnLogin.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setBorderPainted(false);
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginbtnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Untitled.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Don't have an account? Click here");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLoginPageLayout = new javax.swing.GroupLayout(panelLoginPage);
        panelLoginPage.setLayout(panelLoginPageLayout);
        panelLoginPageLayout.setHorizontalGroup(
            panelLoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginPageLayout.createSequentialGroup()
                .addContainerGap(374, Short.MAX_VALUE)
                .addGroup(panelLoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginPageLayout.createSequentialGroup()
                        .addGroup(panelLoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtWelcomeBack, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(371, 371, 371))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginPageLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(422, 422, 422))))
        );
        panelLoginPageLayout.setVerticalGroup(
            panelLoginPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginPageLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWelcomeBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(125, 125, 125))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLoginPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLoginPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernametxtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernametxtUsernameFocusGained
        // clear the textfield on focus if the text is "Username"
        if(txtUsername.getText().trim().equals("Username"))
        {
            txtUsername.setText("");
        }
    }//GEN-LAST:event_txtUsernametxtUsernameFocusGained

    private void txtUsernametxtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernametxtUsernameFocusLost
        // if the text field is equal to Username or empty
        // we will set the "Username" text in the field
        // on focus lost event

        if(txtUsername.getText().trim().equals("") ||
            txtUsername.getText().trim().equals("Username"))
        {
            txtUsername.setText("Username");
            txtUsername.setForeground(new java.awt.Color(153, 153, 153));

        }
    }//GEN-LAST:event_txtUsernametxtUsernameFocusLost

    private void txtUsernametxtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernametxtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernametxtUsernameActionPerformed

    private void txtUsernametxtUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernametxtUsernameKeyTyped
        txtUsername.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_txtUsernametxtUsernameKeyTyped

    private void txtPasswordtxtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordtxtPasswordFocusGained
        // clear the password field on focus if the text is "Password"

        // get the password text
        String pass = String.valueOf(txtPassword.getPassword());
        if(pass.trim().equals("Password"))
        {
            txtPassword.setText("");
            txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtPasswordtxtPasswordFocusGained

    private void txtPasswordtxtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordtxtPasswordFocusLost
        // if the password field is equal to password or empty
        // we will set the "password" text in the field
        // on focus lost event

        // get the password text
        String pass = String.valueOf(txtPassword.getPassword());

        if(pass.trim().equals(""))
        {
            txtPassword.setText("Password");
            txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtPasswordtxtPasswordFocusLost

    private void txtPasswordtxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordtxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordtxtPasswordActionPerformed

    private void txtPasswordtxtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordtxtPasswordKeyTyped
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        
    }//GEN-LAST:event_txtPasswordtxtPasswordKeyTyped

    private void btnLoginbtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginbtnLoginActionPerformed
        String name,staffID,phoneNum,user,pass;
        String inUser,inPass;
        boolean haveuser=false;

        inUser=txtUsername.getText();
        inPass=txtPassword.getText();
        
        try{
            FileReader reader = new FileReader("user.txt");
            Scanner in = new Scanner(reader);
            
            while(in.hasNextLine()){
                String line = in.nextLine();
                StringTokenizer st = new StringTokenizer(line,";");
                name= st.nextToken();
                staffID= st.nextToken();
                phoneNum= st.nextToken();
                user= st.nextToken();
                pass= st.nextToken();
                
                if(inUser.equals(user) && inPass.equals(pass)){
                haveuser=true;
                break;
                }
                else
                haveuser=false;
            }
            if(haveuser)
            {
                JOptionPane.showMessageDialog(null,"Access Granted!");
                MainMenuPage menu = new MainMenuPage();
                menu.setVisible(true);
                menu.pack();
                menu.setLocationRelativeTo(null);
                menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
            else
                JOptionPane.showMessageDialog(null, "Access Denied!");
        }catch(FileNotFoundException  e){
            System.out.printf("ERROR:%s\n",e);
        }
    }//GEN-LAST:event_btnLoginbtnLoginActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
          RegistrationPage regPage = new RegistrationPage();
          regPage.setVisible(true);
          this.dispose();
//        StartUpPage startpage = new StartUpPage();
//        startpage.setVisible(true);
//        startpage.pack();
//        startpage.setLocationRelativeTo(null);
//        startpage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelLoginPage;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JLabel txtWelcomeBack;
    // End of variables declaration//GEN-END:variables
}
