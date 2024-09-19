/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Product;
import javax.swing.JOptionPane;

/**
 *
 * @author sanskruti
 */
public class CreateJPanel extends javax.swing.JPanel {
    Product product;

    /**
     * Creates new form CreateJPanel
     * @param p
     */
    public CreateJPanel(Product p) {
        product = p;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFName = new javax.swing.JTextField();
        lblFName = new javax.swing.JLabel();
        lblLName = new javax.swing.JLabel();
        txtLName = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblDateOfBirth = new javax.swing.JLabel();
        txtDob = new javax.swing.JTextField();
        lblNationality = new javax.swing.JLabel();
        txtNationality = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        txtSsn = new javax.swing.JTextField();
        lblDriverLiceNo = new javax.swing.JLabel();
        txtDriverLicNo = new javax.swing.JTextField();
        lblDriverLicState = new javax.swing.JLabel();
        txtDriverLicState = new javax.swing.JTextField();
        lblAdd1 = new javax.swing.JLabel();
        txtAdd1 = new javax.swing.JTextField();
        lblAdd2 = new javax.swing.JLabel();
        txtAdd2 = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        lblTelNo = new javax.swing.JLabel();
        txtTelNo = new javax.swing.JTextField();
        lblFaxNo = new javax.swing.JLabel();
        txtFaxNo = new javax.swing.JTextField();
        lblOccupation = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        lblMaritalStatus = new javax.swing.JLabel();
        txtMaritalStatus = new javax.swing.JTextField();
        lblRace = new javax.swing.JLabel();
        txtRace = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        lblCreateProfile = new javax.swing.JLabel();

        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });

        lblFName.setText("First Name");

        lblLName.setText("Last Name");

        txtLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLNameActionPerformed(evt);
            }
        });

        lblPhone.setText("Phone");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });

        lblEmail.setText("Email");

        lblDateOfBirth.setText("Date of Birth");

        lblNationality.setText("Nationality");

        lblGender.setText("Gender");

        lblSSN.setText("Social Security Number");

        txtSsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSsnActionPerformed(evt);
            }
        });

        lblDriverLiceNo.setText("Driver's License Number");

        lblDriverLicState.setText("Driver's License State");

        lblAdd1.setText("Address Line 1");

        lblAdd2.setText("Address Line 2");

        lblCity.setText("City");

        lblState.setText("State");

        lblZip.setText("Zip");

        lblTelNo.setText("Telephone Number");

        lblFaxNo.setText("Fax Number");

        lblOccupation.setText("Occupation");

        lblMaritalStatus.setText("Marital Status");

        lblRace.setText("Race");

        txtRace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRaceActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblCreateProfile.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblCreateProfile.setText("Create Profile");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFName)
                            .addComponent(lblLName)
                            .addComponent(lblPhone)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDriverLiceNo)
                                    .addComponent(lblDriverLicState)))
                            .addComponent(lblEmail)
                            .addComponent(lblDateOfBirth)
                            .addComponent(lblNationality)
                            .addComponent(lblGender)
                            .addComponent(lblSSN))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNationality, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDriverLicNo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDriverLicState, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAdd1)
                            .addComponent(lblAdd2)
                            .addComponent(lblCity)
                            .addComponent(lblState)
                            .addComponent(lblZip)
                            .addComponent(lblTelNo)
                            .addComponent(lblFaxNo)
                            .addComponent(lblOccupation)
                            .addComponent(lblMaritalStatus)
                            .addComponent(lblRace))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFaxNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave))
                        .addContainerGap(194, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCreateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDob, txtDriverLicNo, txtDriverLicState, txtEmail, txtFName, txtGender, txtLName, txtNationality, txtPhone, txtSsn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateProfile)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdd1)
                    .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblAdd2)
                        .addComponent(txtAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblLName)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblState)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEmail))
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateOfBirth)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblZip))
                    .addComponent(txtZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelNo)
                                .addComponent(lblNationality)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFaxNo)
                                .addComponent(lblGender))
                            .addComponent(txtFaxNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSSN)
                            .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOccupation))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDriverLicNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDriverLiceNo)
                            .addComponent(lblMaritalStatus))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDriverLicState)
                    .addComponent(txtDriverLicState, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRace))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(278, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void txtLNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLNameActionPerformed

    private void txtSsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSsnActionPerformed

    private void txtRaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRaceActionPerformed

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String fname = txtFName.getText();
        String lname = txtLName.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();
        String dob = txtDob.getText();
        String nationality = txtNationality.getText();
        String gender = txtGender.getText();
        String ssn = txtSsn.getText(); 
        String dln = txtDriverLicNo.getText();
        String dls = txtDriverLicState.getText();
        String add1 = txtAdd1.getText();
        String add2 = txtAdd2.getText();
        String city = txtCity.getText();
        String state = txtState.getText();
        String zip = txtZip.getText();
        String tn = txtTelNo.getText();
        String fn = txtFaxNo.getText();
        String occupation = txtOccupation.getText();
        String maritalStatus = txtMaritalStatus.getText();
        String race = txtRace.getText();
        
        product.setFname(fname);
        product.setLname(lname);
        product.setEmail(email);
        product.setPhone(phone);
        product.setDob(dob);
        product.setAdd1(add1);
        product.setAdd2(add2);
        product.setCity(city);
        product.setDln(dln);
        product.setDls(dls);
        product.setFn(fn);
        product.setGender(gender);
        product.setMaritalstatus(maritalStatus);
        product.setNationality(nationality);
        product.setOccupation(occupation);
        product.setRace(race);
        product.setTn(tn);
        product.setZip(zip);
        product.setState(state);
        product.setSsn(ssn);
       
        JOptionPane.showMessageDialog(this, "The personal information is saved!", "Success", JOptionPane.PLAIN_MESSAGE);
         
        txtFName.setText("");
        txtLName.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        txtDriverLicNo.setText("");  // Driver's License Number
        txtDriverLicState.setText("");  // Driver's License State
        txtSsn.setText("");
        txtCity.setText("");
        txtAdd1.setText("");  // Address Line 1
        txtAdd2.setText("");  // Address Line 2
        txtState.setText("");
        txtZip.setText("");
        txtTelNo.setText("");  // Telephone Number
        txtFaxNo.setText("");  // Fax Number
        txtOccupation.setText("");
        txtGender.setText("");  // Sex
        txtNationality.setText("");
        txtDob.setText("");
        txtRace.setText("");  // Religion in your original can be mapped to race or similar
        txtMaritalStatus.setText("");

    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAdd1;
    private javax.swing.JLabel lblAdd2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCreateProfile;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblDriverLicState;
    private javax.swing.JLabel lblDriverLiceNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblFaxNo;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLName;
    private javax.swing.JLabel lblMaritalStatus;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRace;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTelNo;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTextField txtAdd1;
    private javax.swing.JTextField txtAdd2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtDriverLicNo;
    private javax.swing.JTextField txtDriverLicState;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFaxNo;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLName;
    private javax.swing.JTextField txtMaritalStatus;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtRace;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtZip;
    // End of variables declaration//GEN-END:variables
}
