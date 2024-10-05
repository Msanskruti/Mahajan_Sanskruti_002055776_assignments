/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.person;
import model.personDirectory;

/**
 *
 * @author sanskruti
 */
public class MainJFrame extends javax.swing.JFrame {
    personDirectory ListPerson;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        ListPerson = new personDirectory();
        
        populatedata();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // </editor-fold>
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnAddPerson = new javax.swing.JButton();
        btnListPerson = new javax.swing.JButton();
        lblPersonProfile = new javax.swing.JLabel();
        txtsearchforperson = new javax.swing.JTextField();
        btnSearchForPerson = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAddPerson.setText("Add Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnListPerson.setText("List Person");

        lblPersonProfile.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblPersonProfile.setText("Person Profile");

        btnSearchForPerson.setText("search for person");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSearchForPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPersonProfile))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnListPerson)
                                    .addComponent(btnAddPerson))
                                .addGap(39, 39, 39))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtsearchforperson, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblPersonProfile)
                .addGap(46, 46, 46)
                .addComponent(btnAddPerson)
                .addGap(43, 43, 43)
                .addComponent(btnListPerson)
                .addGap(96, 96, 96)
                .addComponent(txtsearchforperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchForPerson)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 96, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        LeftComponent = new javax.swing.JPanel();
        AddPerson_Button = new javax.swing.JButton();
        ListPerson_Button = new javax.swing.JButton();
        SearchPerson_Button = new javax.swing.JButton();
        Search_Text = new javax.swing.JTextField();
        RightComponent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddPerson_Button.setText("Add Person");
        AddPerson_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPerson_ButtonActionPerformed(evt);
            }
        });

        ListPerson_Button.setText("List Person");
        ListPerson_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListPerson_ButtonActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout LeftComponentLayout = new javax.swing.GroupLayout(LeftComponent);
        LeftComponent.setLayout(LeftComponentLayout);
        LeftComponentLayout.setHorizontalGroup(
            LeftComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftComponentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SearchPerson_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Search_Text)
                    .addComponent(ListPerson_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddPerson_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftComponentLayout.setVerticalGroup(
            LeftComponentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftComponentLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(AddPerson_Button)
                .addGap(18, 18, 18)
                .addComponent(ListPerson_Button)
                .addGap(79, 79, 79)
                .addComponent(Search_Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchPerson_Button)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(LeftComponent);

        RightComponent.setLayout(new java.awt.CardLayout());
        SplitPane.setRightComponent(RightComponent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();    
    }// </editor-fold>//GEN-END:initComponents

   private void AddPerson_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPerson_ButtonActionPerformed
        AddPersonJPanel panel = new AddPersonJPanel(ListPerson);
        SplitPane.setRightComponent(panel);  
    }//GEN-LAST:event_AddPerson_ButtonActionPerformed

    private void ListPerson_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListPerson_ButtonActionPerformed
        ListPersonJPanel panel = new ListPersonJPanel(ListPerson);
        SplitPane.setRightComponent(panel);        
    }//GEN-LAST:event_ListPerson_ButtonActionPerformed

    private void SearchPerson_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPerson_ButtonActionPerformed
        String search = Search_Text.getText();
        person result = ListPerson.searchPerson(Search_Text.getText());
        if (result == null){
            JOptionPane.showMessageDialog(null, "Does not exist", "Information", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else {
            ViewListJPanel panel = new ViewListJPanel(ListPerson,search);
            SplitPane.setRightComponent(panel);
           
        }
         Search_Text.setText("");   
    }//GEN-LAST:event_SearchPerson_ButtonActionPerformed

  
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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainJFrame().setVisible(true);
        });
    }
  
    private void populateData() {
        
   
        person p1 = new person();

// Set personal details
        p1.setFirstName("Sanskruti");
        p1.setLastName("Mahajan");
        p1.setSSN("123-654-187");
        p1.setAge("22");
        p1.getHomeAddress().setStreet("Boylston St");
        p1.getHomeAddress().setCity("San Francisco"); 
        p1.getHomeAddress().setState("California");
        p1.getHomeAddress().setZIP("65342");
        p1.getHomeAddress().setUnitNumber("5");
        p1.getWorkAddress().setCity("Salt Lake City");
        p1.getWorkAddress().setState("Iowa");
        p1.getWorkAddress().setStreet("Cambridge St");
        p1.getWorkAddress().setUnitNumber("12");
        p1.getWorkAddress().setZIP("12345");
        p1.getWorkAddress().setPhoneNumber("673546382");
        p1.getHomeAddress().setPhoneNumber("673546382");

// Now p1 contains all the relevant person and address details.

                        
        person p2 = ListPerson.addPerson();
 
        p2.setFirstName("Alia");
        p2.setLastName("Bhatt");
        p2.setSSN("645-123-653");
        p2.setAge("30");
        p2.getHomeAddress().setStreet("Boylston St");
        p2.getHomeAddress().setCity("Los Angeles"); 
        p2.getHomeAddress().setState("California");
        p2.getHomeAddress().setZIP("64536");
        p2.getHomeAddress().setUnitNumber("1");
        p2.getWorkAddress().setCity("Boston");
        p2.getWorkAddress().setState("Mass");
        p2.getWorkAddress().setStreet("Boylston st");
        p2.getWorkAddress().setUnitNumber("2");
        p2.getWorkAddress().setZIP("12345");
        p2.getWorkAddress().setPhoneNumber("123471789");
        p2.getHomeAddress().setPhoneNumber("123471789");
        
        person p3 = ListPerson.addPerson();
 
        p3.setFirstName("Kendal");
        p3.setLastName("Jenner");
        p3.setSSN("543-671-635");
        p3.setAge("40");
        p3.getHomeAddress().setStreet("Kendall St");
        p3.getHomeAddress().setCity("Miami"); 
        p3.getHomeAddress().setState("Florida");
        p3.getHomeAddress().setZIP("4536");
        p3.getHomeAddress().setUnitNumber("12");
        p3.getWorkAddress().setCity("Miami");
        p3.getWorkAddress().setState("Florida");
        p3.getWorkAddress().setStreet("Tremont St");
        p3.getWorkAddress().setUnitNumber("24");
        p3.getWorkAddress().setZIP("4536");
        p3.getWorkAddress().setPhoneNumber("6372516332");
        p3.getHomeAddress().setPhoneNumber("6372516332");
        
        person p4 = ListPerson.addPerson();
 
        p4.setFirstName("Kim");
        p4.setLastName("Gen");
        p4.setSSN("876-765-423");
        p4.setAge("39");
        p4.getHomeAddress().setStreet("Lowell St");
        p4.getHomeAddress().setCity("Eugen"); 
        p4.getHomeAddress().setState("Oregon");
        p4.getHomeAddress().setZIP("54638");
        p4.getHomeAddress().setUnitNumber("65");
        p4.getWorkAddress().setCity("Eugen");
        p4.getWorkAddress().setState("Oregon");
        p4.getWorkAddress().setStreet("Lowell S");
        p4.getWorkAddress().setUnitNumber("6");
        p4.getWorkAddress().setZIP("12345");
        p4.getWorkAddress().setPhoneNumber("532426172");
        p4.getHomeAddress().setPhoneNumber("532426172");
        
        
        person p5 = ListPerson.addPerson();
 
        p5.setFirstName("Khloe");
        p5.setLastName("ken");
        p5.setSSN("342-876-536");
        p5.setAge("45");
        p5.getHomeAddress().setStreet("Beacon St");
        p5.getHomeAddress().setCity("New York"); 
        p5.getHomeAddress().setState("Mass");
        p5.getHomeAddress().setZIP("34531");
        p5.getHomeAddress().setUnitNumber("51");
        p5.getWorkAddress().setCity("New York");
        p5.getWorkAddress().setState("Mass");
        p5.getWorkAddress().setStreet("Beacon St");
        p5.getWorkAddress().setUnitNumber("54");
        p5.getWorkAddress().setZIP("34531");
        p5.getWorkAddress().setPhoneNumber("453637328");
        p5.getHomeAddress().setPhoneNumber("453637328");
        
    }

    private void populatedata() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddPersonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnListPerson;
    private javax.swing.JButton btnSearchForPerson;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblPersonProfile;
    private javax.swing.JTextField txtsearchforperson;
    // End of variables declaration//GEN-END:variables







  
