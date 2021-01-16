/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MJGStore;

/**
 *
 * @author Naim_ite
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class CustomerPage extends javax.swing.JFrame {

    /**
     * Creates new form Customer
     */
    public CustomerPage() {
        initComponents();
        this.setLocationRelativeTo(null); //center form in the screen
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        try{
            FileReader reader = new FileReader("Customer.txt");
            BufferedReader br = new BufferedReader(reader);
            model = (DefaultTableModel) table.getModel();
            String input;

            while((input = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(input,";");
                String CustomerName = st.nextToken();
                String IC = st.nextToken();
                String PhoneNum = st.nextToken();
                String Address = st.nextToken();
                model.insertRow(model.getRowCount(),new Object[]{CustomerName,IC,PhoneNum,Address});
            }
            br.close();
        }catch(Exception e){
            System.out.print(e.toString());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        ReturnButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelIC = new javax.swing.JLabel();
        jLabelPNum = new javax.swing.JLabel();
        jLabelPNum1 = new javax.swing.JLabel();
        NameTF = new javax.swing.JTextField();
        ICTF = new javax.swing.JTextField();
        PhoneNumTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AddressTA = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        SearchTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CUSTOMER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(149, 165, 166));

        AddButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        ReturnButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ReturnButton.setText("Return");
        ReturnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnButtonMouseClicked(evt);
            }
        });
        ReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Name :");

        jLabelIC.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelIC.setText("Ic      :");

        jLabelPNum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPNum.setText("Phone Number :");

        jLabelPNum1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelPNum1.setText("Address :");

        NameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTFActionPerformed(evt);
            }
        });

        ICTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ICTFActionPerformed(evt);
            }
        });

        PhoneNumTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNumTFActionPerformed(evt);
            }
        });

        AddressTA.setColumns(20);
        AddressTA.setRows(5);
        jScrollPane1.setViewportView(AddressTA);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "IC", "Phone Number", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setText("*Search Customer Name and IC");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ReturnButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabelPNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabelPNum)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(PhoneNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpdateButton)
                                .addGap(50, 50, 50)
                                .addComponent(AddButton)
                                .addGap(60, 60, 60)
                                .addComponent(DeleteButton)
                                .addGap(85, 85, 85))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelIC)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ICTF, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(SearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ICTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIC))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPNum)
                            .addComponent(PhoneNumTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPNum1))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateButton)
                            .addComponent(AddButton)
                            .addComponent(DeleteButton)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(ReturnButton)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if(NameTF.getText().equals("")||ICTF.getText().equals("")||PhoneNumTF.getText().equals("")||AddressTA.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter All Data");

        }else{
            String data[] = {NameTF.getText(),ICTF.getText(),PhoneNumTF.getText(),AddressTA.getText()};

            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.addRow(data);
            JOptionPane.showMessageDialog(this,"Add Data Successfully");
            try{
                FileWriter fw = new FileWriter("Customer.txt",true);
                PrintWriter out = new PrintWriter(fw);

                out.print(NameTF.getText()+";"+ICTF.getText()+";"+PhoneNumTF.getText()+";"+AddressTA.getText()+";\n");

                ;
                out.close();

            }

            catch (IOException ex) {
                Logger.getLogger(CustomerPage.class.getName()).log(Level.SEVERE, null, ex);
            }

            NameTF.setText("");
            ICTF.setText("");
            PhoneNumTF.setText("");
            AddressTA.setText("");

        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tblModel=(DefaultTableModel) table.getModel();

        //delete row
        if(table.getSelectedRowCount()==1){
            //if single row selected so delete
            tblModel.removeRow(table.getSelectedRow());
            try {
                String cid = NameTF.getText().toString() + ";" + ICTF.getText().toString() + ";" + PhoneNumTF.getText().toString() + ";" + AddressTA.getText().toString(); // ADDED
                String lineToRemove = cid;
                String file = "Customer.txt";
                File inFile = new File("Customer.txt");

                if (!inFile.isFile()) {
                    System.out.println("Parameter is not an existing file");
                    return;
                }

                //Construct the new file that will later be renamed to the original filename.
                File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

                BufferedReader br = new BufferedReader(new FileReader(file));
                PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

                String line = null;

                //Read from the original file and write to the new
                //unless content matches data to be removed.
                while ((line = br.readLine()) != null) {

                    if (!line.trim().equals(lineToRemove)) {

                        pw.println(line);
                        pw.flush();
                    }
                }
                pw.close();
                br.close();

                //Delete the original file
                if (!inFile.delete()) {
                    System.out.println("Could not delete file");
                    return;
                }

                //Rename the new file to the filename the original file had.
                if (!tempFile.renameTo(inFile))
                System.out.println("Could not rename file");

            }
            catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            catch (IOException ex) {
                ex.printStackTrace();
            }
            NameTF.setText("");
            ICTF.setText("");
            PhoneNumTF.setText("");
            AddressTA.setText("");
            JOptionPane.showMessageDialog(this,"Delete is Successful");
        }else{
            if(table.getRowCount()==0){
                //if table is empty(no data)than display message
                JOptionPane.showMessageDialog(this,"Table is Empty!");
            }else{
                //if tablle not empty but row is not selected or multiple selected
                JOptionPane.showMessageDialog(this,"Please Select Single Row for Delete!");
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
        // TODO add your handling code here:
        //get table model
        int i = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)table.getModel();

        if(i>=0){
            model.setValueAt(NameTF.getText(), i, 0);
            model.setValueAt(ICTF.getText(), i, 1);
            model.setValueAt(PhoneNumTF.getText(), i, 2);
            model.setValueAt(AddressTA.getText(), i, 3);
        }
        else{
            JOptionPane.showMessageDialog(null,"Error");
        }

        try{
            FileWriter fw = new FileWriter("Customer.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            for(int j=0; j<table.getRowCount(); j++){
                for(int k=0; k<table.getColumnCount(); k++){
                    bw.write((String)table.getModel().getValueAt(j,k)+";");
                }
                bw.write("\n");
            }
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(null, "Update successful!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        NameTF.setText("");
        ICTF.setText("");
        PhoneNumTF.setText("");
        AddressTA.setText("");
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ReturnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMouseClicked
        MainMenuPage menu = new MainMenuPage();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ReturnButtonMouseClicked

    private void NameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTFActionPerformed

    private void ICTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ICTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ICTFActionPerformed

    private void PhoneNumTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneNumTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneNumTFActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        NameTF.setText(model.getValueAt(selectedRow, 0).toString());
        ICTF.setText(model.getValueAt(selectedRow, 1).toString());
        PhoneNumTF.setText(model.getValueAt(selectedRow, 2).toString());
        AddressTA.setText(model.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        TableRowSorter<DefaultTableModel> tr;
        tr = new TableRowSorter<>(model);
        table.setRowSorter(tr);
        String search = SearchTF.getText();

        boolean found = false;

        try{
            FileReader fr = new FileReader("Customer.txt");
            BufferedReader br = new BufferedReader(fr);
            String input;

            while((input = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(input, ";");

                String CustomerName = st.nextToken();
                String CustomerIC = st.nextToken();
                String PhoneNum = st.nextToken();
                String Address = st.nextToken();

                if(SearchTF.getText().equalsIgnoreCase(CustomerName) || SearchTF.getText().equalsIgnoreCase(CustomerIC)) {
                    found = true;
                    NameTF.setText(CustomerName);
                    ICTF.setText(CustomerIC);
                    PhoneNumTF.setText(PhoneNum);
                    AddressTA.setText(Address);
                    JOptionPane.showMessageDialog(null, "User found!");
                    SearchTF.setText("");
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Sorry, user not found!","Message",JOptionPane.ERROR_MESSAGE);
                SearchTF.setText("");
            }
            br.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        MainMenuPage menu = new MainMenuPage();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ReturnButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextArea AddressTA;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField ICTF;
    private javax.swing.JTextField NameTF;
    private javax.swing.JTextField PhoneNumTF;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JTextField SearchTF;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelIC;
    private javax.swing.JLabel jLabelPNum;
    private javax.swing.JLabel jLabelPNum1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
