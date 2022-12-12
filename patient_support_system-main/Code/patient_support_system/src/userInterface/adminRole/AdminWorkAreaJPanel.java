/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userInterface.adminRole;



import business.enterprisepkg.Enterprise;
import business.userAccountpkg.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;


public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
   private JPanel userProcessContainer;
   private  Enterprise enterprise;
   private UserAccount userAccount;
   
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        
        valueLabel.setText(enterprise.getName());
      
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
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnp3 = new javax.swing.JButton();
        btnp2 = new javax.swing.JButton();
        btnp1 = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        manageEnt2 = new javax.swing.JLabel();

        btnp3.setText("Handle User");
        btnp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnp3ActionPerformed(evt);
            }
        });

        btnp2.setText(" Create Employee");
        btnp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnp2ActionPerformed(evt);
            }
        });

        btnp1.setText("Create  Organization");
        btnp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnp1ActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        enterpriseLabel.setText("Enterprise");

        manageEnt2.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt2.setText("Patient Home Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnp1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnp2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnp3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(659, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(196, 196, 196)
                    .addComponent(manageEnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(592, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnp1)
                .addGap(18, 18, 18)
                .addComponent(btnp2)
                .addGap(18, 18, 18)
                .addComponent(btnp3)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(manageEnt2)
                    .addContainerGap(458, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnp3ActionPerformed
        // TODO add your handling code here:
        ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer, enterprise,userAccount);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnp3ActionPerformed
    
     
    
    private void btnp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnp2ActionPerformed

        ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnp2ActionPerformed

    private void btnp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnp1ActionPerformed

        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnp1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnp1;
    private javax.swing.JButton btnp2;
    private javax.swing.JButton btnp3;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel manageEnt2;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}