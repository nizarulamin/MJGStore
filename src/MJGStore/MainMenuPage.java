/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MJGStore;

/**
 *
 * @author acer
 */
import javax.swing.JFrame;
public class MainMenuPage extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenuPage() {
        initComponents();
        this.setLocationRelativeTo(null); //center form in the screen
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ItemDetails = new javax.swing.JButton();
        User = new javax.swing.JButton();
        Customer = new javax.swing.JButton();
        Cashier = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        LoginInform = new javax.swing.JTextArea();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(236, 240, 241));

        ItemDetails.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ItemDetails.setText("ITEM DETAILS");
        ItemDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemDetailsMouseClicked(evt);
            }
        });
        ItemDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemDetailsActionPerformed(evt);
            }
        });

        User.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        User.setText("USER");
        User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserActionPerformed(evt);
            }
        });

        Customer.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Customer.setText("CUSTOMER");
        Customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerMouseClicked(evt);
            }
        });
        Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerActionPerformed(evt);
            }
        });

        Cashier.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Cashier.setText("CASHIER");
        Cashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashierActionPerformed(evt);
            }
        });

        LoginInform.setColumns(20);
        LoginInform.setRows(5);
        jScrollPane1.setViewportView(LoginInform);

        ExitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ExitButton.setText("LOGOUT");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExitButton)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cashier)
                            .addComponent(Customer)
                            .addComponent(User)
                            .addComponent(ItemDetails))
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(101, Short.MAX_VALUE)
                        .addComponent(ItemDetails))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(User)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Customer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cashier)
                .addGap(58, 58, 58)
                .addComponent(ExitButton)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemDetailsMouseClicked
        ItemDetailsPage itd = new ItemDetailsPage();
        itd.setVisible(true);
        itd.pack();
        itd.setLocationRelativeTo(null);
        itd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ItemDetailsMouseClicked

    private void ItemDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemDetailsActionPerformed

    private void CustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerMouseClicked
        CustomerPageDetails cus = new CustomerPageDetails();
        cus.setVisible(true);
        cus.pack();
        cus.setLocationRelativeTo(null);
        cus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_CustomerMouseClicked

    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        LoginPage log = new LoginPage();
        log.setVisible(true);
        log.pack();
        log.setLocationRelativeTo(null);
        log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserActionPerformed
        UserInformationPage userinfo = new UserInformationPage();
        userinfo.setVisible(true);
        userinfo.pack();
        userinfo.setLocationRelativeTo(null);
        userinfo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_UserActionPerformed

    private void CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerActionPerformed
        CustomerPageDetails cus = new CustomerPageDetails();
        cus.setVisible(true);
        cus.pack();
        cus.setLocationRelativeTo(null);
        cus.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_CustomerActionPerformed

    private void CashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashierActionPerformed
        CashierPage cash = new CashierPage();
        cash.setVisible(true);
        cash.pack();
        cash.setLocationRelativeTo(null);
        cash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_CashierActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cashier;
    private javax.swing.JButton Customer;
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton ItemDetails;
    private javax.swing.JTextArea LoginInform;
    private javax.swing.JButton User;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}