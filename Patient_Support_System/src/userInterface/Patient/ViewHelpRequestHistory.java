/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Patient;

import business.userAccountpkg.UserAccount;
import business.workQueuepkg.NeedHelpWorkRequest;
import business.workQueuepkg.NeedSensorDeviceWorkRequest;
import business.workQueuepkg.SendDataToDoctorWorkRequest;
import business.workQueuepkg.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ViewHelpRequestHistory extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount; 
    /**
     * Creates new form ViewHelpRequestHistory
     */
    public ViewHelpRequestHistory(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        
       populateHelpSeekerRequestsHistoryTable();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(234,32,94);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
    public void populateHelpSeekerRequestsHistoryTable()
    {
     DefaultTableModel dtm = (DefaultTableModel)workRequestHistoryTable.getModel();
        dtm.setRowCount(0);
         DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy"); 
     for(WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList())
        {
         
           Object[] rowData = new Object[5];
           rowData[0] = workRequest.getMessage();
           rowData[1] = dateFormat.format(workRequest.getRequestDate());
           rowData[2] = workRequest.getReceiver() == null ? null : workRequest.getReceiver().getUserName() ;
           rowData[3] = workRequest.getStatus();
           if(workRequest.getMessage().equalsIgnoreCase("Need Help"))
           {
            NeedHelpWorkRequest nhwr = (NeedHelpWorkRequest)workRequest;
            rowData[4] = nhwr.getRequestResult();   
           }
           else if(workRequest.getMessage().equalsIgnoreCase("Need Sensor Device"))
           {
               NeedSensorDeviceWorkRequest nsdwr = (NeedSensorDeviceWorkRequest)workRequest ;
                 rowData[4] = nsdwr.getdonationRequestResult();
           }
           else if(workRequest.getMessage().equalsIgnoreCase("Vital Sign Data"))
           {
                SendDataToDoctorWorkRequest sdtdwr = (SendDataToDoctorWorkRequest)workRequest ;
                 rowData[4] = sdtdwr.getReqResult();
           }
           else
           {
                rowData[4] = "";
           }
           dtm.addRow(rowData);
        
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

        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestHistoryTable = new javax.swing.JTable();
        manageEnt = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(231, 41, 101));

        workRequestHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Help Recieved", "Requested Date", "Reciever ", "Status", "Request Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestHistoryTable);

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("View History of Support Requests");

        backbtn.setText("<< Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backbtn)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(217, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(manageEnt)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backbtn)
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JTable workRequestHistoryTable;
    // End of variables declaration//GEN-END:variables
}