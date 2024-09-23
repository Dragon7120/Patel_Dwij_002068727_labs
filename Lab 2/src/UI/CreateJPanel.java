/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.VitalSignsHistory;
import Model.VitalSigns;
import javax.swing.JOptionPane;

public class CreateJPanel extends javax.swing.JPanel {

    VitalSignsHistory vitalSignsHistory;

    public CreateJPanel(VitalSignsHistory vitalSignsHistory) {
        initComponents();
        this.vitalSignsHistory = vitalSignsHistory;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();  // Change this to JTextField
        txtPulse = new javax.swing.JTextField();  // Change this to JTextField
        txtDate = new javax.swing.JTextField();  // Change this to JTextField
        lblTemperature = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();  // Change this to JLabel
        lblPulse = new javax.swing.JLabel();  // Change this to JLabel
        lblDate = new javax.swing.JLabel();  // Change this to JLabel

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Vital Signs");

        lblTemperature.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTemperature.setText("Temperature:");

        lblBloodPressure.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBloodPressure.setText("Blood Pressure:");

        lblPulse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPulse.setText("Pulse:");

        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDate.setText("Date:");

        // Layout for the components
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTemperature, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPulse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTemperature)
                    .addComponent(txtBloodPressure)  // Now a JTextField
                    .addComponent(txtPulse)  // Now a JTextField
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTemperature)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))  // Use JTextField
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))  // Use JTextField
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))  // Use JTextField
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

    }                        

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {
            Double temperature = Double.parseDouble(txtTemperature.getText().trim());
            Double bloodPressure = Double.parseDouble(txtBloodPressure.getText().trim());
            int pulse = Integer.parseInt(txtPulse.getText().trim());
            String date = txtDate.getText().trim();

            VitalSigns newVs = vitalSignsHistory.addNewVitals();
            newVs.setTemperature(temperature);
            newVs.setBloodPressure(bloodPressure);
            newVs.setPulse(pulse);
            newVs.setDate(date);

            // Show the user a confirmation dialog
            JOptionPane.showMessageDialog(this, "New Vital signs created.", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Cleanup the form
            txtTemperature.setText("");
            txtBloodPressure.setText("");
            txtPulse.setText("");
            txtDate.setText("");

        } catch (NumberFormatException e) {
            // Show error message if input is not valid
            JOptionPane.showMessageDialog(this, "Please enter valid numeric values for Temperature, Blood Pressure, and Pulse.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }                                        

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration                   
}
