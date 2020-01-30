/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Uber.Car;
import Uber.CarInfo;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Samruddhi
 */
public class AddCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCarJPanel
     */
    private CarInfo carInfo;
    private JPanel rightPanel;
    public AddCarJPanel(JPanel rightPanel, CarInfo carInfo) {
        initComponents();
        this.rightPanel = rightPanel;
        this.carInfo = carInfo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manuTextField = new javax.swing.JTextField();
        serialNumLable = new javax.swing.JLabel();
        manCertLable = new javax.swing.JLabel();
        modelNumLable = new javax.swing.JLabel();
        cityTextField = new javax.swing.JTextField();
        modelNumTextField = new javax.swing.JTextField();
        serialNumTextField = new javax.swing.JTextField();
        manuYearTextField = new javax.swing.JTextField();
        minSeatsLable = new javax.swing.JLabel();
        cityLable = new javax.swing.JLabel();
        maxSeatsTextField = new javax.swing.JTextField();
        availLable = new javax.swing.JLabel();
        createLable = new javax.swing.JLabel();
        maxSeatsLable = new javax.swing.JLabel();
        minSeatsTextField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        manuLable = new javax.swing.JLabel();
        modelLable = new javax.swing.JLabel();
        availCheckBox = new javax.swing.JCheckBox();
        manCertValidCheckBox = new javax.swing.JCheckBox();
        btnBack = new javax.swing.JButton();

        manuTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        serialNumLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        serialNumLable.setText("Serial Number:");

        manCertLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manCertLable.setText("Valid Maintenance Certificate:");

        modelNumLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modelNumLable.setText("Model Number:");

        cityTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        modelNumTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        serialNumTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        manuYearTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        minSeatsLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        minSeatsLable.setText("Minimum Number of Seats:");

        cityLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cityLable.setText("City of Availability:");

        maxSeatsTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        availLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        availLable.setText("Availability:");

        createLable.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        createLable.setText("Add Car Details");

        maxSeatsLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        maxSeatsLable.setText("Maximum Number of Seats:");

        minSeatsTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        addBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        manuLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manuLable.setText("Manufacturer:");

        modelLable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modelLable.setText("Year of Manufacture:");

        availCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availCheckBoxActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("<Back");
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
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(191, 191, 191)
                        .addComponent(createLable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manCertLable)
                                    .addComponent(availLable)
                                    .addComponent(maxSeatsLable)
                                    .addComponent(minSeatsLable)
                                    .addComponent(cityLable)
                                    .addComponent(modelNumLable)
                                    .addComponent(serialNumLable)
                                    .addComponent(modelLable)
                                    .addComponent(manuLable))
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(manuYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(serialNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(manuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modelNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maxSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(minSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(availCheckBox)
                                    .addComponent(manCertValidCheckBox))))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createLable)
                    .addComponent(btnBack))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(manuLable)
                            .addComponent(manuTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelLable)
                            .addComponent(manuYearTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serialNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(serialNumLable))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelNumLable)
                            .addComponent(modelNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cityLable)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minSeatsLable)
                            .addComponent(minSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maxSeatsLable)
                            .addComponent(maxSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(availLable))
                    .addComponent(availCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manCertLable)
                    .addComponent(manCertValidCheckBox))
                .addGap(18, 18, 18)
                .addComponent(addBtn)
                .addContainerGap(377, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clearField(boolean b){
        if(b == true){
            manuTextField.setText("");
            manuYearTextField.setText("");
            serialNumTextField.setText("");
            modelNumTextField.setText("");
            cityTextField.setText("");
            maxSeatsTextField.setText("");
            minSeatsTextField.setText("");
            availCheckBox.setSelected(false);
            manCertValidCheckBox.setSelected(false);
        }
    }
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed

        try{
            manuTextField.getText();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Manufacturer Name can't be Empty");
            return;
        }
                
        try{
            Integer.parseInt(manuYearTextField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input Year of Manufacture");
            return;
        }
        
        try{
            Integer.parseInt(serialNumTextField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input Year of Manufacture");
            return;
        }
        
        try{
            Integer.parseInt(modelNumTextField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input Year of Manufacture");
            return;
        }
        
        try{
            cityTextField.getText();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "City of Availabilty can't be Empty");
            return;
        }
        try{
            Integer.parseInt(maxSeatsTextField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input Minimum Number of Seats in a Car");
            return;
        }
        
        try{
            Integer.parseInt(minSeatsTextField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input Maximum Number of Seats in a Car");
            return;
        }

        //Binding the user input to the car object
        
        Car car = carInfo.addCar();
        
        car.setManufacturer(manuTextField.getText());
        car.setYear_manufactured(Integer.parseInt(manuYearTextField.getText()));
        car.setSerialNum(Integer.parseInt(serialNumTextField.getText()));
        car.setModelNum(Integer.parseInt(modelNumTextField.getText()));
        car.setCity(cityTextField.getText());
        car.setMaxSeats(Integer.parseInt(maxSeatsTextField.getText()));
        car.setMinSeats(Integer.parseInt(minSeatsTextField.getText()));
        
        if(availCheckBox.isSelected())
            car.setAvailable(true);
        else
            car.setAvailable(false);
        
        if(availCheckBox.isSelected())
            car.setMaintenanceCretValid(true);
        else
            car.setMaintenanceCretValid(false);

        //Prompt for successfull creation of car
        JOptionPane.showMessageDialog(null, "Car has been Added successfully");
        carInfo.setLastUpdate();
        clearField(true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void availCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availCheckBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.rightPanel.remove(this);
        CardLayout layout = (CardLayout)this.rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JCheckBox availCheckBox;
    private javax.swing.JLabel availLable;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel cityLable;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel createLable;
    private javax.swing.JLabel manCertLable;
    private javax.swing.JCheckBox manCertValidCheckBox;
    private javax.swing.JLabel manuLable;
    private javax.swing.JTextField manuTextField;
    private javax.swing.JTextField manuYearTextField;
    private javax.swing.JLabel maxSeatsLable;
    private javax.swing.JTextField maxSeatsTextField;
    private javax.swing.JLabel minSeatsLable;
    private javax.swing.JTextField minSeatsTextField;
    private javax.swing.JLabel modelLable;
    private javax.swing.JLabel modelNumLable;
    private javax.swing.JTextField modelNumTextField;
    private javax.swing.JLabel serialNumLable;
    private javax.swing.JTextField serialNumTextField;
    // End of variables declaration//GEN-END:variables
}
