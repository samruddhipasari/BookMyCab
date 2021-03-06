/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Uber.CarInfo;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Samruddhi
 */
public class ManageCarJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCarJPanel
     */
    private CarInfo carInfo;
    private JPanel rightPanel;
    public ManageCarJPanel(JPanel rightPanel, CarInfo carInfo) {
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

        btnViewCar = new javax.swing.JButton();
        btnAddCar = new javax.swing.JButton();

        btnViewCar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewCar.setText("View Car Details");
        btnViewCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCarActionPerformed(evt);
            }
        });

        btnAddCar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddCar.setText("Add Car Details");
        btnAddCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(355, 355, 355)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnViewCar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnAddCar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnViewCar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCarActionPerformed
        // TODO add your handling code here:
        ViewCarJPanel viewPanel = new ViewCarJPanel(this.rightPanel, carInfo);
        this.rightPanel.add("ViewCarJPanel", viewPanel);
        CardLayout layout = (CardLayout) this.rightPanel.getLayout();
        layout.next(this.rightPanel);
    }//GEN-LAST:event_btnViewCarActionPerformed

    private void btnAddCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarActionPerformed
        // TODO add your handling code here:
        AddCarJPanel addPanel = new AddCarJPanel(this.rightPanel, carInfo);
        this.rightPanel.add("AddCarJPanel", addPanel);
        CardLayout layout = (CardLayout) this.rightPanel.getLayout();
        layout.next(this.rightPanel);
    }//GEN-LAST:event_btnAddCarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCar;
    private javax.swing.JButton btnViewCar;
    // End of variables declaration//GEN-END:variables
}
