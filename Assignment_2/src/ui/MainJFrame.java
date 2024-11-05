/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
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
        
        populateData();
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
        UserProcessContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        AddPerson_Button = new javax.swing.JButton();
        ListPerson_Button = new javax.swing.JButton();
        lblPersonProfile = new javax.swing.JLabel();
        txtsearchforperson = new javax.swing.JTextField();
        SearchPerson_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(UserProcessContainer);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

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

        lblPersonProfile.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        lblPersonProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblPersonProfile.setText("Person Profile");

        SearchPerson_Button.setText("search for person");
        SearchPerson_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchPerson_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPersonProfile)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtsearchforperson, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchPerson_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListPerson_Button)
                            .addComponent(AddPerson_Button))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblPersonProfile)
                .addGap(45, 45, 45)
                .addComponent(AddPerson_Button)
                .addGap(36, 36, 36)
                .addComponent(ListPerson_Button)
                .addGap(85, 85, 85)
                .addComponent(txtsearchforperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(SearchPerson_Button)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListPerson_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListPerson_ButtonActionPerformed
       ListPersonJPanel listperson_panel = new ListPersonJPanel(UserProcessContainer,ListPerson);
       UserProcessContainer.add("ListPerson_JPanel", listperson_panel); 
        CardLayout layout=(CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);      
    }//GEN-LAST:event_ListPerson_ButtonActionPerformed

    private void AddPerson_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPerson_ButtonActionPerformed
        AddPersonJPanel addperson_panel = new AddPersonJPanel(UserProcessContainer, ListPerson);
        UserProcessContainer.add("AddPerson_JPanel", addperson_panel);
        
        CardLayout layout=(CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);   // TODO add your handling code here:
    }//GEN-LAST:event_AddPerson_ButtonActionPerformed

    private void SearchPerson_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchPerson_ButtonActionPerformed
        String search = txtsearchforperson.getText();
        person result = ListPerson.searchPerson(txtsearchforperson.getText());
        if (result == null){
            JOptionPane.showMessageDialog(null, "Does not exist", "Information", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else {
            ViewListJPanel viewperson_panel = new ViewListJPanel(UserProcessContainer,ListPerson, result);
            UserProcessContainer.add("ViewPerson_JPanel", viewperson_panel);
            CardLayout layout=(CardLayout) UserProcessContainer.getLayout();
            layout.next(UserProcessContainer);
           
        }
         txtsearchforperson.setText("");    // TODO add your handling code here:
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
        
   
        person p1 = ListPerson.addPerson();

// Set personal details
        p1.setFirstName("Sanskruti");
        p1.setLastName("Mahajan");
        p1.setSSN(12365487);
        p1.setAge(22);
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
        p2.setSSN(645123653);
        p2.setAge(30);
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
        p3.setSSN(543671635);
        p3.setAge(40);
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
        p4.setSSN(876765423);
        p4.setAge(39);
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
        p5.setSSN(342876536);
        p5.setAge(45);
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

    

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPerson_Button;
    private javax.swing.JButton ListPerson_Button;
    private javax.swing.JButton SearchPerson_Button;
    private javax.swing.JPanel UserProcessContainer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblPersonProfile;
    private javax.swing.JTextField txtsearchforperson;
    // End of variables declaration//GEN-END:variables
}






  
