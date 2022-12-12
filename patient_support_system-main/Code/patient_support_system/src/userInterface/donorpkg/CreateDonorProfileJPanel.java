/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.donorpkg;

import business.commonUtils.ValidateDateOfBirth;
import business.commonUtils.ValidateEmailTextField;
import business.commonUtils.ValidateNumbers;
import business.commonUtils.ValidatePhoneNumber;
import business.commonUtils.ValidateStrings;
import business.personpkg.Person;
import business.userAccountpkg.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class CreateDonorProfileJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    
    /**
     * Creates new form CreateDonorProfile
     */
    public CreateDonorProfileJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        addInputVerifiers();
        donornametxt.setText(userAccount.getPerson().getName());
        donorName.setVisible(true);
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
    
    private void addInputVerifiers() {
          
        InputVerifier stringValidation = new ValidateStrings();
        donornametxt.setInputVerifier(stringValidation);
        donoraddresstxt.setInputVerifier(stringValidation);
        towntxt.setInputVerifier(stringValidation);
        occtxt.setInputVerifier(stringValidation);
        
        InputVerifier dobValidtion = new ValidateDateOfBirth();
        donodobtxt.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new ValidateNumbers();
        donorzipcode.setInputVerifier(numberValidation);
        
        InputVerifier phnumberValidation = new ValidatePhoneNumber();
        donorphonenumber.setInputVerifier(phnumberValidation);
         
            InputVerifier emailValidtion = new ValidateEmailTextField();
            txtemail.setInputVerifier(emailValidtion);
     
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateOfBirth = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        donoraddresstxt = new javax.swing.JTextField();
        town = new javax.swing.JLabel();
        towntxt = new javax.swing.JTextField();
        zipCode = new javax.swing.JLabel();
        dbackbtn = new javax.swing.JButton();
        createYourProfile = new javax.swing.JLabel();
        donorName = new javax.swing.JLabel();
        donornametxt = new javax.swing.JTextField();
        donorzipcode = new javax.swing.JTextField();
        occupation = new javax.swing.JLabel();
        occtxt = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JLabel();
        donorphonenumber = new javax.swing.JTextField();
        cpbtn = new javax.swing.JButton();
        donodobtxt = new javax.swing.JFormattedTextField();
        manageEnt = new javax.swing.JLabel();

        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");

        address.setText("Address: ");

        town.setText("Town/City: ");

        zipCode.setText("Zip Code:");

        dbackbtn.setText("back");
        dbackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbackbtnActionPerformed(evt);
            }
        });

        createYourProfile.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        createYourProfile.setText("Create Your Profile");

        donorName.setText("Full Name:");

        donornametxt.setEditable(false);
        donornametxt.setEnabled(false);

        occupation.setText("Occupation:");

        emailID.setText("Email Address:");

        phoneNumber.setText("Phone Number:");

        cpbtn.setText("Create Profile ");
        cpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpbtnActionPerformed(evt);
            }
        });

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Donor Main Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(dbackbtn)
                .addGap(38, 272, Short.MAX_VALUE)
                .addComponent(cpbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(418, 418, 418))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(town))
                            .addComponent(occupation)
                            .addComponent(emailID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(donorName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumber)
                            .addComponent(createYourProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(donorphonenumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(donodobtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(donorzipcode, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(towntxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(occtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(donoraddresstxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(donornametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(manageEnt)
                .addGap(18, 18, 18)
                .addComponent(createYourProfile)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorName)
                    .addComponent(donornametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirth)
                    .addComponent(donodobtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address)
                    .addComponent(donoraddresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(town)
                    .addComponent(towntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(occupation))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(occtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailID)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCode))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorphonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpbtn)
                    .addComponent(dbackbtn))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dbackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbackbtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_dbackbtnActionPerformed

    private void cpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpbtnActionPerformed
        Person person = userAccount.getPerson();
        
        if( donoraddresstxt.getText().trim().isEmpty() ||
             towntxt.getText().trim().isEmpty() ||
            occtxt.getText().trim().isEmpty() ||
             txtemail.getText().trim().isEmpty() ||
           donorphonenumber.getText().trim().isEmpty() || 
             donodobtxt.getText().trim().isEmpty() ||
            donorzipcode.getText().trim().isEmpty() ) 
        {
        JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
           return;        
        }
        
        try
        {
          DateFormat dateFormat =  new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        Date dob =  dateFormat.parse(donodobtxt.getText());
        if(dob.after(date) || dob.equals(date))
        {
         JOptionPane.showMessageDialog(null, "Please Enter valid Date of Birth");
           return;    
        }
            person.setDob(dateFormat.parse(donodobtxt.getText()));
            person.setAddress1(donoraddresstxt.getText());
            person.setTown(towntxt.getText());
            person.setOccupation(occtxt.getText());
            person.setZipCode(donorzipcode.getText());
            person.setEmailId(txtemail.getText());
            person.setPhoneNumber(donorphonenumber.getText());      
            
            JOptionPane.showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
            resetFields();       
        }
        catch(ParseException pe)
        {
           JOptionPane.showMessageDialog(null, "Please Enter valid date of Birth!");
           return;   
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "Please Enter valid data in all the fields");
           return;     
        }
    }//GEN-LAST:event_cpbtnActionPerformed

public void resetFields()
{
    donornametxt.setText("");
    donodobtxt.setText("");
    donoraddresstxt.setText("");
    towntxt.setText("");
    occtxt.setText("");
    donorzipcode.setText("");
    txtemail.setText("");
    donorphonenumber.setText("");
    
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JButton cpbtn;
    private javax.swing.JLabel createYourProfile;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JButton dbackbtn;
    private javax.swing.JFormattedTextField donodobtxt;
    private javax.swing.JLabel donorName;
    private javax.swing.JTextField donoraddresstxt;
    private javax.swing.JTextField donornametxt;
    private javax.swing.JTextField donorphonenumber;
    private javax.swing.JTextField donorzipcode;
    private javax.swing.JLabel emailID;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JTextField occtxt;
    private javax.swing.JLabel occupation;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel town;
    private javax.swing.JTextField towntxt;
    private javax.swing.JTextField txtemail;
    private javax.swing.JLabel zipCode;
    // End of variables declaration//GEN-END:variables
}