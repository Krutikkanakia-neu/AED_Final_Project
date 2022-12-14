/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;


import business.EcoSystem;
import business.commonUtils.ValidatePasswords;
import business.commonUtils.ValidateStrings;
import business.enterprisepkg.Enterprise;
import business.networkpkg.Network;
import business.organizationpkg.Organization;
import business.personpkg.Person;
import business.rolepkg.AdminRole;
import business.userAccountpkg.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;
        addInputVerifiers();
        populateEnterpriseUserTable();
        populateNetworkComboBox();
   
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

    private void populateEnterpriseUserTable() {
        DefaultTableModel model = (DefaultTableModel) stbt1.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise.getName();
                    row[1] = network.getCity();
                    row[2] = userAccount;

                    model.addRow(row);
                }
            }
        }
    }
    
      private void addInputVerifiers() {
        InputVerifier stringValidation = new ValidateStrings();
        stxt1.setInputVerifier(stringValidation);
        stxt2.setInputVerifier(stringValidation);
        InputVerifier passwordValidation = new ValidatePasswords();
        stxt3.setInputVerifier(passwordValidation);
        
        
    }
    
    private void populateNetworkComboBox(){
        box1.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            box1.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        box2.removeAllItems();
        
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            box2.addItem(enterprise);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        stbt1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        stxt1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        sbtn2 = new javax.swing.JButton();
        box2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        box1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        sbtn1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        stxt3 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        stxt2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sbtn3 = new javax.swing.JButton();
        sbtn5 = new javax.swing.JButton();

        setBackground(new java.awt.Color(182, 201, 233));

        stbt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(stbt1);

        jLabel6.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel6.setText("Enterprise Main Access:");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Network");

        sbtn2.setText("Cancel");
        sbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtn2ActionPerformed(evt);
            }
        });

        box2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel7.setText("Enter User");

        box1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Enterprise");

        sbtn1.setText("Create");
        sbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtn1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Enterprise Admin Name");

        jLabel2.setText("Username");

        jLabel4.setText("Password");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(27, 27, 27)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(stxt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(stxt2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stxt1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(sbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(box1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(box2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(stxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stxt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sbtn1)
                    .addComponent(sbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jLayeredPane1.setLayer(stxt1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(sbtn2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(box2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(box1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(sbtn1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(stxt3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(stxt2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        sbtn3.setText("Delete");
        sbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtn3ActionPerformed(evt);
            }
        });

        sbtn5.setText(" Back");
        sbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sbtn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(sbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sbtn5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed

        Network network = (Network) box1.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        
        
    }//GEN-LAST:event_box1ActionPerformed

    private void sbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbtn1ActionPerformed
        
       try
       {
        Enterprise enterprise = (Enterprise) box2.getSelectedItem();
        
        Network network = (Network)box1.getSelectedItem();
        String username = stxt2.getText();
        String password = String.valueOf(stxt3.getPassword());
        String name = stxt1.getText();
        
       for(Network network1 : system.getNetworkList())
        {
          for(Enterprise enterprise1 : network1.getEnterpriseDirectory().getEnterpriseList())
          {
              for(UserAccount ua : enterprise1.getUserAccountDirectory().getUserAccountList())
              {
            if(username.equalsIgnoreCase(ua.getUserName()))
            {
            JOptionPane.showMessageDialog(null, "User Name already exists!!", "warning", JOptionPane.WARNING_MESSAGE);  
            return;
            }   
              }
          }
        }
        
//           System.out.println("sameUserName"+sameUserName);
//        if(!sameUserName)
//         {
//         JOptionPane.showMessageDialog(null, "User name already exits!", "warning",JOptionPane.WARNING_MESSAGE);
//         return;
//        }
        
        Person person = enterprise.getPersonDirectory().addPerson();
        person.setLastName(name);
        person.setName();
        UserAccount account = enterprise.getUserAccountDirectory().addUserAccount(username, password, person, new AdminRole());
        
        account.setEnabled(true);
        account.setNetwork(network);
        populateEnterpriseUserTable();
        JOptionPane.showMessageDialog(null, "Enterprise admin Account has been created successfully", "success",JOptionPane.PLAIN_MESSAGE);
        resetFields();
       }
       catch(Exception e)
       {
        JOptionPane.showMessageDialog(this, "Please enter valid data", "warning",JOptionPane.WARNING_MESSAGE);    
       }
    }//GEN-LAST:event_sbtn1ActionPerformed

    private void sbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbtn2ActionPerformed
       resetFields();
    }//GEN-LAST:event_sbtn2ActionPerformed
    
    public void resetFields()
    {
        stxt2.setText("");
        stxt3.setText("");
        stxt1.setText("");
    }
    private void sbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbtn3ActionPerformed
        UserAccount userAccountToBeDeleted = null;
        int selectedRow = stbt1.getSelectedRow();
        if(selectedRow >= 0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete the row ", "warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                   
                UserAccount userAccount = (UserAccount)stbt1.getValueAt(selectedRow, 2);
                String entName = (String)stbt1.getValueAt(selectedRow, 0);
                for (Network network : system.getNetworkList()) {
                    for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                     if(entName.equals(enterprise.getName()))
                     {
                       for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                       if(ua.getUserName().equals(userAccount.getUserName()))
                       {
                           userAccountToBeDeleted = ua;
                        
                       }
                    }
                     }
                     enterprise.getUserAccountDirectory().deleteUserAccount(userAccountToBeDeleted);
                    }
                    
                }
             populateEnterpriseUserTable();
             JOptionPane.showMessageDialog(this, "User Account has been deleted successfully", "success",JOptionPane.PLAIN_MESSAGE);
            
        }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please select a row", "warning",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_sbtn3ActionPerformed

    private void sbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sbtn5ActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populatenetworkJTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_sbtn5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox box1;
    private javax.swing.JComboBox box2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sbtn1;
    private javax.swing.JButton sbtn2;
    private javax.swing.JButton sbtn3;
    private javax.swing.JButton sbtn5;
    private javax.swing.JTable stbt1;
    private javax.swing.JTextField stxt1;
    private javax.swing.JTextField stxt2;
    private javax.swing.JPasswordField stxt3;
    // End of variables declaration//GEN-END:variables
}
