/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import model.personDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.person;

/**
 *
 * @author sanskruti
 */
public class AddPersonJPanel extends javax.swing.JPanel {
    JPanel UserProcessContainer;
    personDirectory ListPerson;
    
    

    /**
     * Creates new form AddPersonJPanel
     */

    public AddPersonJPanel(JPanel container, personDirectory ListPerson) {
        initComponents();
        this.ListPerson = ListPerson;
        UserProcessContainer=container;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateProfile = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblSsn = new javax.swing.JLabel();
        txtSsn = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        lblHomeAdd = new javax.swing.JLabel();
        lblHomeStreetName = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();
        lblHomeCity = new javax.swing.JLabel();
        txtHomeCity = new javax.swing.JTextField();
        lblHomeZipCode = new javax.swing.JLabel();
        txtHomeZipCode = new javax.swing.JTextField();
        lblHomeUnitNumber = new javax.swing.JLabel();
        txtHomeUnitNumber = new javax.swing.JTextField();
        lblHomeState = new javax.swing.JLabel();
        txtHomeState = new javax.swing.JTextField();
        lblHomePhoneNumber = new javax.swing.JLabel();
        txtHomePhoneNumber = new javax.swing.JTextField();
        lblWorkAddress = new javax.swing.JLabel();
        lblWorkStreetName = new javax.swing.JLabel();
        txtWorkStreetAddress = new javax.swing.JTextField();
        lblWorkCity = new javax.swing.JLabel();
        txtWorkCity = new javax.swing.JTextField();
        lblWorkZipCode = new javax.swing.JLabel();
        txtWorkZipCode = new javax.swing.JTextField();
        lblWorkUnitNumber = new javax.swing.JLabel();
        txtWorkUnitNumber = new javax.swing.JTextField();
        lblWorkState = new javax.swing.JLabel();
        txtWorkState = new javax.swing.JTextField();
        lblWorkPhoneNumber = new javax.swing.JLabel();
        txtWorkPhoneNumber = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setForeground(new java.awt.Color(204, 255, 0));

        lblCreateProfile.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblCreateProfile.setText("Create Profile");

        lblFirstName.setText("First Name: ");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblLastName.setText("Last Name:");

        lblSsn.setText("Social Security Number:");

        lblAge.setText("Age:");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblHomeAdd.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblHomeAdd.setText("Home Address");

        lblHomeStreetName.setText("Street Name : ");

        lblHomeCity.setText("City :");

        txtHomeCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHomeCityActionPerformed(evt);
            }
        });

        lblHomeZipCode.setText("Zip Code :");

        txtHomeZipCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHomeZipCodeActionPerformed(evt);
            }
        });

        lblHomeUnitNumber.setText("Unit Number :");

        lblHomeState.setText("State :");

        lblHomePhoneNumber.setText("Phone Number :");

        lblWorkAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblWorkAddress.setText("Work Address");

        lblWorkStreetName.setText("Street Name:");

        lblWorkCity.setText("City:");

        lblWorkZipCode.setText("Zip Code :");

        lblWorkUnitNumber.setText("Unit Number :");

        lblWorkState.setText("State:");

        lblWorkPhoneNumber.setText("Phone Number:");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addGap(217, 217, 217)
                .addComponent(lblCreateProfile)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHomePhoneNumber)
                        .addGap(18, 18, 18)
                        .addComponent(txtHomePhoneNumber))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(txtLastName)))
                    .addComponent(lblHomeAdd)
                    .addComponent(lblHomeUnitNumber)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHomeCity)
                            .addComponent(lblHomeZipCode)
                            .addComponent(lblHomeState)
                            .addComponent(lblHomeStreetName))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHomeZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtHomeCity, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(txtHomeUnitNumber)
                                .addComponent(txtHomeState)))))
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSsn)
                            .addComponent(lblWorkAddress)
                            .addComponent(lblAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWorkCity)
                            .addComponent(lblWorkPhoneNumber)
                            .addComponent(lblWorkStreetName)
                            .addComponent(lblWorkZipCode)
                            .addComponent(lblWorkUnitNumber)
                            .addComponent(lblWorkState))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWorkState, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtWorkUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreate)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtWorkStreetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtWorkCity)
                                .addComponent(txtWorkZipCode)
                                .addComponent(txtWorkPhoneNumber)))
                        .addGap(0, 136, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblCreateProfile)))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSsn)
                    .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWorkAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHomeAdd))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHomeStreetName)
                            .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWorkStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWorkStreetName))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWorkCity)
                            .addComponent(txtWorkCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHomeCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblHomeCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHomeZipCode)
                            .addComponent(txtWorkZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWorkZipCode))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHomeUnitNumber)
                            .addComponent(txtHomeUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWorkUnitNumber)
                            .addComponent(txtWorkUnitNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWorkState)
                            .addComponent(txtWorkState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHomeState)
                            .addComponent(txtHomeZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtHomeState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHomePhoneNumber)
                    .addComponent(txtHomePhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWorkPhoneNumber)
                    .addComponent(txtWorkPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(btnCreate)
                .addGap(54, 54, 54))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        String FirstName = txtFirstName.getText();
        String LastName = txtLastName.getText();
        String SSN = txtSsn.getText();
        String Age = txtAge.getText();
        String WorkStreet = txtWorkStreetAddress.getText();
        String WorkCity = txtWorkCity.getText();
        String WorkState = txtWorkState.getText();
        String WorkUnitNumber = txtWorkUnitNumber.getText();
        String WorkZipCode = txtWorkZipCode.getText();
        String HomeStreet = txtStreetAddress.getText();
        String HomeCity = txtHomeCity.getText();
        String HomeState = txtHomeState.getText();
        String HomeUnitNumber = txtHomeUnitNumber.getText();
        String HomeZIP = txtHomeZipCode.getText();
        String HomePhoneNumber = txtHomePhoneNumber.getText();
        String WorkPhoneNumber = txtWorkPhoneNumber.getText();
      
        person p = ListPerson.addPerson();
      
        p.setFirstName(FirstName);
        p.setLastName(LastName);
        p.setSSN (Long.valueOf(SSN));
        p.setAge(Integer.valueOf(Age));
        p.getHomeAddress().setStreet(HomeStreet);
        p.getHomeAddress().setCity(HomeCity);
        p.getHomeAddress().setState(HomeState);
        p.getHomeAddress().setZIP(HomeZIP);
        p.getHomeAddress().setUnitNumber(HomeUnitNumber);
        p.getWorkAddress().setCity(WorkCity);
        p.getWorkAddress().setState(WorkState);
        p.getWorkAddress().setStreet(WorkStreet);
        p.getWorkAddress().setUnitNumber(WorkUnitNumber);
        p.getWorkAddress().setZIP(WorkZipCode);
        p.getWorkAddress().setPhoneNumber(WorkPhoneNumber);
        p.getHomeAddress().setPhoneNumber(HomePhoneNumber);
      
       JOptionPane.showMessageDialog(this, "Person Profile Created","Success",JOptionPane.INFORMATION_MESSAGE);
      
        txtFirstName.setText("");
        txtLastName.setText("");
        txtSsn.setText("");
        txtAge.setText("");
        txtWorkStreetAddress.setText("");
        txtWorkCity.setText("");
        txtWorkState.setText("");
        txtWorkUnitNumber.setText("");
        txtWorkZipCode.setText("");
        txtStreetAddress.setText("");
        txtHomeCity.setText("");
        txtHomeState.setText("");
        txtHomeUnitNumber.setText("");
        txtHomeZipCode.setText("");        
        txtHomePhoneNumber.setText("");
        txtWorkPhoneNumber.setText("");
    }                                             
                                          

    private void txtHomeCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHomeCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHomeCityActionPerformed

    private void txtHomeZipCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHomeZipCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHomeZipCodeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        UserProcessContainer.remove(this);
        CardLayout layout=(CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCreateProfile;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHomeAdd;
    private javax.swing.JLabel lblHomeCity;
    private javax.swing.JLabel lblHomePhoneNumber;
    private javax.swing.JLabel lblHomeState;
    private javax.swing.JLabel lblHomeStreetName;
    private javax.swing.JLabel lblHomeUnitNumber;
    private javax.swing.JLabel lblHomeZipCode;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblWorkAddress;
    private javax.swing.JLabel lblWorkCity;
    private javax.swing.JLabel lblWorkPhoneNumber;
    private javax.swing.JLabel lblWorkState;
    private javax.swing.JLabel lblWorkStreetName;
    private javax.swing.JLabel lblWorkUnitNumber;
    private javax.swing.JLabel lblWorkZipCode;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHomeCity;
    private javax.swing.JTextField txtHomePhoneNumber;
    private javax.swing.JTextField txtHomeState;
    private javax.swing.JTextField txtHomeUnitNumber;
    private javax.swing.JTextField txtHomeZipCode;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtWorkCity;
    private javax.swing.JTextField txtWorkPhoneNumber;
    private javax.swing.JTextField txtWorkState;
    private javax.swing.JTextField txtWorkStreetAddress;
    private javax.swing.JTextField txtWorkUnitNumber;
    private javax.swing.JTextField txtWorkZipCode;
    // End of variables declaration//GEN-END:variables
}
