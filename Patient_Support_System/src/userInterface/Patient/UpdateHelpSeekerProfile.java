/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Patient;

import business.commonUtils.ValidateDateOfBirth;
import business.commonUtils.ValidateEmailTextField;
import business.commonUtils.ValidateNumbers;
import business.commonUtils.ValidatePhoneNumber;
import business.commonUtils.ValidateStrings;
import business.commonUtils.Validation;
import business.personpkg.Person;
import business.userAccountpkg.UserAccount;
import business.userAccountpkg.UserAccountDirectory;
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


public class UpdateHelpSeekerProfile extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount userAccount; 
    private Person person;
    private UserAccountDirectory userAccountDirectory;
    
    /**
     * Creates new form ViewVolunteerProfile
     */
    public UpdateHelpSeekerProfile(JPanel userProcessContainer, UserAccount userAccount, UserAccountDirectory userAccountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        person = userAccount.getPerson();
        this.userAccountDirectory = userAccountDirectory;
        DateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
                
        txtfname.setText(person.getFirstName());
        txtlname.setText(person.getLastName());
        txtdob.setText(dateformat.format(person.getDob()));
        boxgender.setSelectedItem(person.getGender());
        txtaddress2.setText(person.getAddress1());
        txtaddress1.setText(person.getAddress2());
        txttown.setText(person.getTown());
        txtzip.setText(person.getZipCode());
        txtocc.setText(person.getZipCode());
        txtemail.setText(person.getEmailId());
        txtuser.setText(userAccount.getUserName());
        txtphone.setText(String.valueOf(person.getPhoneNumber()));
        
        addInputVerifiers();
        
        
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
        txtfname.setInputVerifier(stringValidation);
        txtlname.setInputVerifier(stringValidation);
        txtaddress1.setInputVerifier(stringValidation);
        txtaddress2.setInputVerifier(stringValidation);
        txttown.setInputVerifier(stringValidation);
        txtocc.setInputVerifier(stringValidation);
        txtaddress1.setInputVerifier(stringValidation);
        txtaddress2.setInputVerifier(stringValidation);
        txtuser.setInputVerifier(stringValidation);
        
        
        InputVerifier dobValidtion = new ValidateDateOfBirth();
        txtdob.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new ValidateNumbers();
        txtzip.setInputVerifier(numberValidation);
        
        
        
       InputVerifier emailValidtion = new ValidateEmailTextField();
        txtemail.setInputVerifier(emailValidtion);
     
         InputVerifier phnumberValidation = new ValidatePhoneNumber();
        txtphone.setInputVerifier(phnumberValidation);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEnt = new javax.swing.JLabel();
        txtocc = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        areaCode = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        firstName = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        updtbtn = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        LastName = new javax.swing.JLabel();
        backbtn = new javax.swing.JButton();
        txtlname = new javax.swing.JTextField();
        dateOfBirth = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        txtaddress1 = new javax.swing.JTextField();
        town = new javax.swing.JLabel();
        txttown = new javax.swing.JTextField();
        zipCode = new javax.swing.JLabel();
        txtzip = new javax.swing.JTextField();
        occupation = new javax.swing.JLabel();
        txtdob = new javax.swing.JFormattedTextField();
        address2 = new javax.swing.JLabel();
        txtaddress2 = new javax.swing.JTextField();
        manageEnt1 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        boxgender = new javax.swing.JComboBox();
        viewYourProfile1 = new javax.swing.JLabel();
        viewYourProfile2 = new javax.swing.JLabel();

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Welcome to Heart Help");

        txtocc.setEditable(false);
        txtocc.setEnabled(false);

        emailID.setText("Email Address:");

        txtemail.setEditable(false);
        txtemail.setEnabled(false);

        areaCode.setText("User Name:");

        txtuser.setEditable(false);
        txtuser.setEnabled(false);

        firstName.setText("First Name:");

        phoneNumber.setText("Phone Number:");

        txtfname.setEditable(false);
        txtfname.setEnabled(false);

        txtphone.setEditable(false);
        txtphone.setEnabled(false);
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });

        updtbtn.setText("Update");
        updtbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updtbtnActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.setEnabled(false);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        LastName.setText("Last Name:");

        backbtn.setText("<< Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        txtlname.setEditable(false);
        txtlname.setEnabled(false);

        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");

        address.setText("Address Line1:");

        txtaddress1.setEditable(false);
        txtaddress1.setEnabled(false);

        town.setText("Town/City: ");

        txttown.setEditable(false);
        txttown.setEnabled(false);

        zipCode.setText("Zip Code:");

        txtzip.setEditable(false);
        txtzip.setEnabled(false);

        occupation.setText("Occupation:");

        txtdob.setEnabled(false);

        address2.setText("Address Line2 : ");

        txtaddress2.setEnabled(false);

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("Patient Support");

        gender.setText("Gender:");

        boxgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        boxgender.setEnabled(false);

        viewYourProfile1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile1.setText("Personal Information");

        viewYourProfile2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewYourProfile2.setText("Address: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(manageEnt1)
                        .addGap(68, 68, 68)
                        .addComponent(emailID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(backbtn)
                                .addGap(299, 299, 299))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(updtbtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnsave))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(town))
                                        .addGap(134, 134, 134)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txttown)
                                            .addComponent(txtzip, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(viewYourProfile1))
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(occupation)
                                                    .addComponent(areaCode)
                                                    .addComponent(phoneNumber))
                                                .addGap(114, 114, 114)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtlname)
                                            .addComponent(txtocc)
                                            .addComponent(txtuser)
                                            .addComponent(txtfname)
                                            .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(address2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtaddress2)
                                            .addComponent(txtaddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(gender)
                                            .addComponent(viewYourProfile2))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtdob)
                                            .addComponent(boxgender, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(421, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailID)
                    .addComponent(manageEnt1))
                .addGap(18, 18, 18)
                .addComponent(viewYourProfile1)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName)
                    .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName)
                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirth)
                    .addComponent(txtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(boxgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(viewYourProfile2)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address)
                    .addComponent(txtaddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtaddress2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(address2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(town))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtzip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(occupation)
                    .addComponent(txtocc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaCode))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backbtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsave)
                            .addComponent(updtbtn))))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void updtbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updtbtnActionPerformed

        txtfname.setEnabled(true);
        txtlname.setEnabled(true);
        txtdob.setEnabled(true);
        boxgender.setEnabled(true);
        txtaddress1.setEnabled(true);
        txtaddress2.setEnabled(true);
        txttown.setEnabled(true);
        txtzip.setEnabled(true);
        txtocc.setEnabled(true);
        txtuser.setEnabled(true);
        txtphone.setEnabled(true);
        btnsave.setEnabled(true);
        updtbtn.setEnabled(false);
        txtfname.setEditable(true);
        txtlname.setEditable(true);
        txtdob.setEditable(true);
        txtaddress1.setEditable(true);
         txtaddress2.setEditable(true);
        txttown.setEditable(true);
        txtzip.setEditable(true);
        txtocc.setEditable(true);
        txtuser.setEditable(true);
        txtphone.setEditable(true);
    }//GEN-LAST:event_updtbtnActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

       
        if(txtfname.getText()!= null && !txtfname.getText().isEmpty() &&
            txtlname.getText()!= null && !txtlname.getText().isEmpty() &&
           txtaddress1.getText()!=null && !txtaddress1.getText().isEmpty() &&
            txtaddress2.getText()!=null && !txtaddress2.getText().isEmpty() &&
            txttown.getText()!=null && !txttown.getText().isEmpty() &&
            txtocc.getText()!=null && !txtocc.getText().isEmpty() &&
            txtemail.getText()!=null && !txtemail.getText().isEmpty() &&
             txtuser.getText()!=null && !txtuser.getText().isEmpty() 
                && boxgender.getSelectedIndex()>=1 && txtdob.getText()!=null && 
                !txtdob.getText().isEmpty() && 
             txtzip.getText()!=null && !txtzip.getText().isEmpty())
        {
            try
            {
                 if(!(userAccount.getUserName().equals(txtuser.getText()))&&!(userAccountDirectory.checkIfUsernameIsUnique(txtuser.getText())))
                    {
                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                 
                
                  Date dateOfBirthVal = new SimpleDateFormat("MM/dd/yyyy").parse(txtdob.getText()) ;
                  int age = Validation.calculateAge(dateOfBirthVal);
                   if(age<12)
                    {
                    JOptionPane.showMessageDialog(null, "Your age does not qualify to be a Volunteer!","warning", JOptionPane.WARNING_MESSAGE);
                     return;
                    }
                    person.setFirstName(txtfname.getText());
                    person.setLastName(txtlname.getText());
                    person.setAddress2(txtaddress2.getText());
                    person.setAddress1(txtaddress1.getText());
                    person.setTown(txttown.getText());
                    person.setZipCode(txtzip.getText());
                    person.setOccupation(txtocc.getText());
                    userAccount.setUserName(txtuser.getText());
                    person.setDob(dateOfBirthVal);
                    person.setPhoneNumber(txtphone.getText());
            }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(this, "Please Enter valid details", "warning",JOptionPane.WARNING_MESSAGE);
            return;
            }
            catch(ParseException pe)
            {
            JOptionPane.showMessageDialog(this, "Please Enter valid details", "warning",JOptionPane.WARNING_MESSAGE);
            return; 
            }
           
             JOptionPane.showMessageDialog(null, "Your Profile has been updated successfully", "success", JOptionPane.PLAIN_MESSAGE);
                updtbtn.setEnabled(true);
                btnsave.setEnabled(false);
                txtfname.setEnabled(false);
                txtlname.setEnabled(false);
                txtaddress2.setEnabled(false);
                txtdob.setEnabled(false);
                boxgender.setEnabled(false);
                txtaddress1.setEnabled(false);
                txttown.setEnabled(false);
                txtzip.setEnabled(false);
                txtocc.setEnabled(false);
                txtemail.setEnabled(false);
                txtuser.setEnabled(false);
                txtphone.setEnabled(false);
         }
        else
        {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
        }

    }//GEN-LAST:event_btnsaveActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel address;
    private javax.swing.JLabel address2;
    private javax.swing.JLabel areaCode;
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox boxgender;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JLabel emailID;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel occupation;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel town;
    private javax.swing.JTextField txtaddress1;
    private javax.swing.JTextField txtaddress2;
    private javax.swing.JFormattedTextField txtdob;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtocc;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txttown;
    private javax.swing.JTextField txtuser;
    private javax.swing.JTextField txtzip;
    private javax.swing.JButton updtbtn;
    private javax.swing.JLabel viewYourProfile1;
    private javax.swing.JLabel viewYourProfile2;
    private javax.swing.JLabel zipCode;
    // End of variables declaration//GEN-END:variables
}
