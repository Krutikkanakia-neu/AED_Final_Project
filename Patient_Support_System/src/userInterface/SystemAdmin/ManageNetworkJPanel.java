/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdmin;


import business.EcoSystem;
import business.networkpkg.Network;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageNetworkJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     *
     * Creates new form ManageNetworkJPanel
     */
    public ManageNetworkJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateNetworkTable();
        populateComboBox();
       
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

    private void populateNetworkTable() {
        
        DefaultTableModel model = (DefaultTableModel) tbln.getModel();
        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            Object[] row = new Object[3];
            row[0] = network.getCountry();
            row[1] = network.getState();
            row[2] = network;
            
            model.addRow(row);
        }
    }
    
    private void populateComboBox()
    {
        countrybox.removeAllItems();
        countrybox.addItem("Please select a country");
        countrybox.addItem("United States");
        countrybox.addItem("India");
        countrybox.addItem("China");
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
        tbln = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        nbtn = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        countrybox = new javax.swing.JComboBox();
        addbtn = new javax.swing.JButton();
        statebox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        citybox = new javax.swing.JComboBox();
        country = new javax.swing.JLabel();
        state = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        delbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(182, 201, 233));

        tbln.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Country", "State", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbln);
        if (tbln.getColumnModel().getColumnCount() > 0) {
            tbln.getColumnModel().getColumn(0).setResizable(false);
            tbln.getColumnModel().getColumn(1).setResizable(false);
            tbln.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel4.setText("View Network ");

        nbtn.setText(" Back");
        nbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbtnActionPerformed(evt);
            }
        });

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        countrybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryboxActionPerformed(evt);
            }
        });

        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        statebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        statebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateboxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel2.setText("Add Network");

        citybox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        citybox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityboxActionPerformed(evt);
            }
        });

        country.setText("Country: ");

        state.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        state.setText("State:");

        city.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        city.setText("City:");

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(country)
                            .addComponent(state)
                            .addComponent(city))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(countrybox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(citybox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statebox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(country)
                    .addComponent(countrybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(statebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(citybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(addbtn)
                .addContainerGap())
        );
        jLayeredPane1.setLayer(countrybox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(addbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(statebox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(citybox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(country, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(state, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(city, javax.swing.JLayeredPane.DEFAULT_LAYER);

        delbtn.setText("Delete");
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel5.setText("Networks:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(nbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(199, 199, 199)
                            .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(83, 83, 83)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLayeredPane1)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delbtn)
                    .addComponent(nbtn))
                .addGap(35, 108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        
        if(countrybox.getSelectedIndex()<1 || statebox.getSelectedIndex()<0 ||
                citybox.getSelectedIndex() <0)
        {
            JOptionPane.showMessageDialog(null, "Please select all the values", "warning",JOptionPane.WARNING_MESSAGE);
            return;
           }
        else
        {
        
        String country = (String)countrybox.getSelectedItem();
        String state = (String)statebox.getSelectedItem();
        String city = (String)citybox.getSelectedItem();
        if(!system.getNetworkList().isEmpty())
        {
         for(Network network : system.getNetworkList())
         {
             if(city.equals(network.getCity()))
             {
            JOptionPane.showMessageDialog(null, "Network already exists! ", "warning",JOptionPane.WARNING_MESSAGE);
            return;      
             }
         }
        }
       
        Network network = system.addNetwork();
      
        network.setCountry(country);
        network.setState(state);
        network.setCity(city);

        populateNetworkTable();
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void nbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbtnActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populatenetworkJTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_nbtnActionPerformed

    private void countryboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryboxActionPerformed
        statebox.removeAllItems();
        citybox.removeAllItems();
        if(countrybox.getSelectedItem() == "United States")
        {
         statebox.addItem("Massachusetts");
         statebox.addItem("Tennessee");
         }
        else if(countrybox.getSelectedItem() == "India")
        {
        statebox.addItem("Andhra Pradesh");
        statebox.addItem("Telangana");    
        }
    }//GEN-LAST:event_countryboxActionPerformed

    private void stateboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateboxActionPerformed
        citybox.removeAllItems();
        if(statebox.getSelectedItem() == "Massachusetts")
        {
         citybox.addItem("Boston");
         citybox.addItem("Roxbury");
         citybox.addItem("Somerville");
         }
        else if(statebox.getSelectedItem() == "Tennessee")
        {
        citybox.addItem("Memphis");
        citybox.addItem("GermanTown");    
        }
        else if(statebox.getSelectedItem() == "Andhra Pradesh")
        {
         citybox.addItem("Vijayawada");
        }
        else if(statebox.getSelectedItem() == "Telangana")
        {
        citybox.addItem("Nalgonda");
        citybox.addItem("Karimnagar");    
        }
    }//GEN-LAST:event_stateboxActionPerformed

    private void cityboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityboxActionPerformed

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
        
        int selectedRow = tbln.getSelectedRow();
        if(selectedRow >= 0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to delete the row ", "warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                Network network = (Network)tbln.getValueAt(selectedRow, 2);
                system.deleteNetwork(network);
                populateNetworkTable();
               
            }
        }
        else
            {
                JOptionPane.showMessageDialog(this, "Please select a row", "warning",JOptionPane.PLAIN_MESSAGE);
            }
    }//GEN-LAST:event_delbtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel city;
    private javax.swing.JComboBox citybox;
    private javax.swing.JLabel country;
    private javax.swing.JComboBox countrybox;
    private javax.swing.JButton delbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton nbtn;
    private javax.swing.JLabel state;
    private javax.swing.JComboBox statebox;
    private javax.swing.JTable tbln;
    // End of variables declaration//GEN-END:variables
}
