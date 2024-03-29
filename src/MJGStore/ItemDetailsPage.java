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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ItemDetailsPage extends javax.swing.JFrame {

    /**
     * Creates new form ItemDetails
     */
    public ItemDetailsPage() {
        initComponents();
        this.setLocationRelativeTo(null); //center form in the screen
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        try{
            FileReader reader = new FileReader("ItemDetails.txt");
            BufferedReader br = new BufferedReader(reader);
            model = (DefaultTableModel) table.getModel();
            String input;

            while((input = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(input,";");
                String ItemCode = st.nextToken();
                String ItemName = st.nextToken();
                String Brand = st.nextToken();
                String PricePerUnit = st.nextToken();
                String TotalStock = st.nextToken();
                String AvailableStock = st.nextToken();
                model.insertRow(model.getRowCount(),new Object[]{ItemCode,ItemName,Brand,PricePerUnit,TotalStock,AvailableStock});
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
        ItemDetailsTitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        ReturnButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ItemCodeTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ItemNameTF = new javax.swing.JTextField();
        BrandTF = new javax.swing.JTextField();
        PriceperTF = new javax.swing.JTextField();
        TotalStockTF = new javax.swing.JTextField();
        AvailableTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SearchTF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 152, 219));

        ItemDetailsTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ItemDetailsTitle.setText("ITEM DETAILS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ItemDetailsTitle)
                .addContainerGap(916, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(ItemDetailsTitle)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(149, 165, 166));

        ReturnButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
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

        AddButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        UpdateButton.setText("Update");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Brand", "Price per Unit", "Total Stock Quantity", "Available Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Item Code:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Brand:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Item Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Price per Unit:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Total Stock Quantity:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Available Stock:");

        jLabel7.setText("*Search Item Code,Item Name,Brand");

        SearchTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchTFActionPerformed(evt);
            }
        });
        SearchTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTFKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Search");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ReturnButton)
                        .addContainerGap(1074, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(SearchTF)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(UpdateButton)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteButton))
                            .addComponent(ItemNameTF)
                            .addComponent(ItemCodeTF)
                            .addComponent(BrandTF)
                            .addComponent(PriceperTF)
                            .addComponent(TotalStockTF)
                            .addComponent(AvailableTF))
                        .addGap(51, 51, 51))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchTF, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItemCodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ItemNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BrandTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PriceperTF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(TotalStockTF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(AvailableTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteButton)
                            .addComponent(UpdateButton)
                            .addComponent(AddButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(ReturnButton)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ReturnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnButtonMouseClicked
        MainMenuPage menu = new MainMenuPage();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ReturnButtonMouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        if(ItemCodeTF.getText().equals("")||ItemNameTF.getText().equals("")||BrandTF.getText().equals("")||PriceperTF.getText().equals("")||TotalStockTF.getText().equals("")||AvailableTF.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Please Enter All Data");

        }else{
            String data[] = {ItemCodeTF.getText(),ItemNameTF.getText(),BrandTF.getText(),PriceperTF.getText(),TotalStockTF.getText(),AvailableTF.getText()};

            DefaultTableModel model = (DefaultTableModel)table.getModel();
            model.addRow(data);
            JOptionPane.showMessageDialog(this,"Add Data Successfully");
            try{
                FileWriter fw = new FileWriter("ItemDetails.txt",true);
                PrintWriter out = new PrintWriter(fw);

                out.print(ItemCodeTF.getText()+";"+ItemNameTF.getText()+";"+BrandTF.getText()+";"+PriceperTF.getText()+";"+TotalStockTF.getText()+";"+AvailableTF.getText()+";\n");

                ;
                out.close();

            }

            catch (IOException ex) {
                Logger.getLogger(CustomerPageDetails.class.getName()).log(Level.SEVERE, null, ex);
            }

            ItemCodeTF.setText("");
            ItemNameTF.setText("");
            BrandTF.setText("");
            PriceperTF.setText("");
            TotalStockTF.setText("");
            AvailableTF.setText("");

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
                String cid = ItemCodeTF.getText().toString() + ";" + ItemNameTF.getText().toString() + ";" + BrandTF.getText().toString() + ";" + PriceperTF.getText().toString()+ ";" + TotalStockTF.getText().toString()+ ";" + AvailableTF.getText().toString()+";"; // ADDED
                String lineToRemove = cid;
                String file = "ItemDetails.txt";
                File inFile = new File("ItemDetails.txt");

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
            ItemCodeTF.setText("");
            ItemNameTF.setText("");
            BrandTF.setText("");
            PriceperTF.setText("");
            TotalStockTF.setText("");
            AvailableTF.setText("");
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
            model.setValueAt(ItemCodeTF.getText(), i, 0);
            model.setValueAt(ItemNameTF.getText(), i, 1);
            model.setValueAt(BrandTF.getText(), i, 2);
            model.setValueAt(PriceperTF.getText(), i, 3);
            model.setValueAt(TotalStockTF.getText(), i, 4);
            model.setValueAt(AvailableTF.getText(), i, 5);
        }
        else{
            JOptionPane.showMessageDialog(null,"Error");
        }

        try{
            FileWriter fw = new FileWriter("ItemDetails.txt");
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
        ItemCodeTF.setText("");
        ItemNameTF.setText("");
        BrandTF.setText("");
        PriceperTF.setText("");
        TotalStockTF.setText("");
        AvailableTF.setText("");
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();
        
        //https://stackoverflow.com/questions/14302489/jtable-correct-row-number-after-filtering
        if (table.getRowSorter()!=null) {
            selectedRow = table.getRowSorter().convertRowIndexToModel(selectedRow);
        }
        
        DefaultTableModel model = (DefaultTableModel)table.getModel();
      
        ItemCodeTF.setText(model.getValueAt(selectedRow, 0).toString());
        ItemNameTF.setText(model.getValueAt(selectedRow, 1).toString());
        BrandTF.setText(model.getValueAt(selectedRow, 2).toString());
        PriceperTF.setText(model.getValueAt(selectedRow, 3).toString());
        TotalStockTF.setText(model.getValueAt(selectedRow, 4).toString());
        AvailableTF.setText(model.getValueAt(selectedRow, 5).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void ReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnButtonActionPerformed
        MainMenuPage menu = new MainMenuPage();
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_ReturnButtonActionPerformed

    private void SearchTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTFKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        String search = SearchTF.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_SearchTFKeyReleased

    private void SearchTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchTFActionPerformed

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
            java.util.logging.Logger.getLogger(ItemDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemDetailsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ItemDetailsPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JTextField AvailableTF;
    private javax.swing.JTextField BrandTF;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField ItemCodeTF;
    private javax.swing.JLabel ItemDetailsTitle;
    private javax.swing.JTextField ItemNameTF;
    private javax.swing.JTextField PriceperTF;
    private javax.swing.JButton ReturnButton;
    private javax.swing.JTextField SearchTF;
    private javax.swing.JTextField TotalStockTF;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
