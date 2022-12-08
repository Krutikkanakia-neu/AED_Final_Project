/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.common;

import business.EcoSystem;
import business.commonUtils.SendEmailAndTextMessage;
import business.commonUtils.ValidateDateOfBirth;
import business.commonUtils.ValidateEmailTextField;
import business.commonUtils.ValidateNumbers;
import business.commonUtils.ValidatePasswords;
import business.commonUtils.ValidatePhoneNumber;
import business.commonUtils.ValidateStrings;
import business.commonUtils.Validation;
import business.enterprisepkg.Enterprise;
import business.enterprisepkg.HeartHelpEnterprise;
import business.enterprisepkg.HospitalEnterprise;
import business.enterprisepkg.SchoolEnterprise;
import business.networkpkg.Network;
import business.organizationpkg.DoctorOrganization;
import business.organizationpkg.HelpSeekerOrganization;
import business.organizationpkg.Organization;
import business.organizationpkg.SupervisorOrganization;
import business.organizationpkg.VolunteerOrganization;
import business.personpkg.HelpSeeker;
import business.personpkg.Person;
import business.personpkg.PersonDirectory;
import business.personpkg.Volunteer;
import business.rolepkg.DoctorRole;
import business.rolepkg.HelpSeekerRole;
import business.rolepkg.VolunteerRole;
import business.userAccountpkg.UserAccount;
import business.workQueuepkg.SupervisorWorkRequest;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class RegistrationWorkAreaPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private PersonDirectory personDirectory;
    private EcoSystem ecoSystem; 
    private Enterprise enterprise;
    private Organization organization;
    
    /**
     * Creates new form RegistrationWorkAreaPanel
     */
    public RegistrationWorkAreaPanel(JPanel userProcessContainer, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       this.ecoSystem = ecoSystem;
       
       helpSeekerPane.setVisible(false);
         
        addInputVerifiers();
        
        populateCountryComboBox();
        box_5.setVisible(false);
        volNetwork.setVisible(false);
        
   //     fillForm();
        
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
        txtffname.setInputVerifier(stringValidation);
        lnameeett.setInputVerifier(stringValidation);
        add_1txt.setInputVerifier(stringValidation);
        add_2txt.setInputVerifier(stringValidation);
        txt_city.setInputVerifier(stringValidation);
        txt_occ.setInputVerifier(stringValidation);
        add_1txt.setInputVerifier(stringValidation);
        add_2txt.setInputVerifier(stringValidation);
        txtuname.setInputVerifier(stringValidation);
        
        
        InputVerifier passwordValidation = new ValidatePasswords();
        txtpassword.setInputVerifier(passwordValidation);
        txtpass.setInputVerifier(passwordValidation);
        
        InputVerifier dobValidtion = new ValidateDateOfBirth();
        dobbb.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new ValidateNumbers();
        txt_zip.setInputVerifier(numberValidation);
        
        InputVerifier emailValidtion = new ValidateEmailTextField();
        txt_mail.setInputVerifier(emailValidtion);
     
         InputVerifier phnumberValidation = new ValidatePhoneNumber();
        txtp_no.setInputVerifier(phnumberValidation);
      
    }
    
    private void populateCountryComboBox(){
        countryyyy.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Please create networks.");  
         return;        
        }
        countryyyy.addItem("Please select a country");
        String networkVal = "";   
        HashSet<String> hs = new HashSet();
           
        for(Network network : ecoSystem.getNetworkList()){
           if(!network.getCountry().equals(networkVal))
           {
               hs.add(network.getCountry());
           }
        }
        for(String s : hs)
        {
         countryyyy.addItem(s);
        }
        }
    
         private void populateNetworkComboBox()
         {
        
        box_city.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Sorry for inconvenience.");  
         return;        
        }
        box_city.addItem("Please Choose a Network");
           
        for(Network network : ecoSystem.getNetworkList()){
             box_city.addItem(network);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        add_2txt = new javax.swing.JTextField();
        dobbb = new javax.swing.JFormattedTextField();
        add_1txt = new javax.swing.JTextField();
        emailID1 = new javax.swing.JLabel();
        town = new javax.swing.JLabel();
        txt_confirm = new javax.swing.JTextField();
        txt_city = new javax.swing.JTextField();
        zipCode = new javax.swing.JLabel();
        txt_zip = new javax.swing.JTextField();
        occupation = new javax.swing.JLabel();
        txt_occ = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        txt_mail = new javax.swing.JTextField();
        firstName = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        txtffname = new javax.swing.JTextField();
        txtp_no = new javax.swing.JTextField();
        reg_btn = new javax.swing.JButton();
        LastName = new javax.swing.JLabel();
        lnameeett = new javax.swing.JTextField();
        address2 = new javax.swing.JLabel();
        dateOfBirth = new javax.swing.JLabel();
        address1 = new javax.swing.JLabel();
        isHelpSeeker = new javax.swing.JRadioButton();
        isVolunteer = new javax.swing.JRadioButton();
        helpSeekerPane = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtuname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        helpSeekerNw = new javax.swing.JLabel();
        box_city = new javax.swing.JComboBox();
        manageEnt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        box_genderrrr = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        countryyyy = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        stateeebtn = new javax.swing.JComboBox();
        isDoctorRadioBtn = new javax.swing.JRadioButton();
        volNetwork = new javax.swing.JLabel();
        box_5 = new javax.swing.JComboBox();

        emailID1.setText("Confirm Email Address:");

        town.setText("Town/City: ");

        zipCode.setText("Zip Code:");

        occupation.setText("Occupation:");

        emailID.setText("Email Address:");

        firstName.setText("First Name:");

        phoneNumber.setText("Phone Number:");

        txtp_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtp_noActionPerformed(evt);
            }
        });

        reg_btn.setText("Register");
        reg_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_btnActionPerformed(evt);
            }
        });

        LastName.setText("Last Name:");

        address2.setText("Address Line2 : ");

        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");

        address1.setText("Address Line1 : ");

        buttonGroup1.add(isHelpSeeker);
        isHelpSeeker.setText("Patient");
        isHelpSeeker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isHelpSeekerActionPerformed(evt);
            }
        });

        buttonGroup1.add(isVolunteer);
        isVolunteer.setText("Volunteer");
        isVolunteer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isVolunteerActionPerformed(evt);
            }
        });

        helpSeekerPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        jLabel7.setText("Create Account:");

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter Username");

        jLabel4.setText("Enter Password");

        jLabel5.setText("Enter Confirm Password");

        helpSeekerNw.setText("Please Select the Closest City");

        box_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_cityActionPerformed(evt);
            }
        });

        helpSeekerPane.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(txtpassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(txtuname, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(txtpass, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(helpSeekerNw, javax.swing.JLayeredPane.DEFAULT_LAYER);
        helpSeekerPane.setLayer(box_city, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout helpSeekerPaneLayout = new javax.swing.GroupLayout(helpSeekerPane);
        helpSeekerPane.setLayout(helpSeekerPaneLayout);
        helpSeekerPaneLayout.setHorizontalGroup(
            helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpSeekerPaneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, helpSeekerPaneLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(helpSeekerPaneLayout.createSequentialGroup()
                        .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(helpSeekerNw, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(35, 35, 35)
                        .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtuname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(box_city, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );
        helpSeekerPaneLayout.setVerticalGroup(
            helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpSeekerPaneLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(helpSeekerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(helpSeekerNw)
                    .addComponent(box_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Welcome to Patient Support System");

        jLabel1.setText("Gender:");

        box_genderrrr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose gender", "Female", "Male", "Transgender", "Unknown" }));
        box_genderrrr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_genderrrrActionPerformed(evt);
            }
        });

        jLabel3.setText("Country:");

        countryyyy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryyyyActionPerformed(evt);
            }
        });

        jLabel6.setText("State:");

        stateeebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateeebtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(isDoctorRadioBtn);
        isDoctorRadioBtn.setText("Doctor");
        isDoctorRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isDoctorRadioBtnActionPerformed(evt);
            }
        });

        volNetwork.setText("Please Select the Closest City");

        box_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box_5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(145, 145, 145)
                            .addComponent(isHelpSeeker)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(isVolunteer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(isDoctorRadioBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(0, 353, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lnameeett)
                                        .addComponent(dobbb)
                                        .addComponent(txtffname, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_mail)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_occ, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(box_5, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_confirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_zip)
                                            .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(add_2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(add_1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(countryyyy, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(stateeebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(occupation)
                                .addComponent(emailID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailID1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(volNetwork)
                                    .addGap(212, 212, 212))
                                .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(address2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(address1)
                                        .addComponent(town))
                                    .addGap(288, 288, 288))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dateOfBirth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LastName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(phoneNumber))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtp_no, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_genderrrr, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(228, 228, 228))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(helpSeekerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))))
            .addGroup(layout.createSequentialGroup()
                .addGap(424, 424, 424)
                .addComponent(reg_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(431, 431, 431))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(manageEnt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isDoctorRadioBtn)
                    .addComponent(isVolunteer)
                    .addComponent(isHelpSeeker))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(box_genderrrr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phoneNumber)
                                    .addComponent(txtp_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(LastName)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateOfBirth)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addComponent(helpSeekerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtffname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstName))
                        .addGap(10, 10, 10)
                        .addComponent(lnameeett, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dobbb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(countryyyy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(stateeebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address1))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(add_2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(town))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_zip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCode))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_occ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(occupation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_confirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailID1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(box_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(volNetwork))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(reg_btn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reg_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_btnActionPerformed

        try
        {
         if(countryyyy.getSelectedIndex()<1 || stateeebtn.getSelectedIndex()<1)
         {
        JOptionPane.showMessageDialog(null, "Please Enter valid data for country and state ","warning", JOptionPane.WARNING_MESSAGE);
              return;             
         }
         if(box_genderrrr.getSelectedIndex()<1 )
         {
        JOptionPane.showMessageDialog(null, "Please Enter valid gender ","warning", JOptionPane.WARNING_MESSAGE);
              return;             
         }
         
         Date dateOfBirthVal = new SimpleDateFormat("MM/dd/yyyy").parse(dobbb.getText()) ;
            // Calculate age using dob
            int age = Validation.calculateAge(dateOfBirthVal);
            
            String phoneNumber = txtp_no.getText();
            String firstName =   txtffname.getText();
            String lastName = lnameeett.getText();
            String address1 = add_1txt.getText();
            String address2 = add_2txt.getText();
            String town = txt_city.getText();
            String zipCode = txt_zip.getText();
            String emailId = txt_mail.getText();
            String confirmEmail = txt_confirm.getText();
            String occupation = txt_occ.getText();
            String gender = (String)box_genderrrr.getSelectedItem();
            String country = (String)countryyyy.getSelectedItem();
            String state = (String)stateeebtn.getSelectedItem();
            
            if(firstName != null && !firstName.isEmpty() &&
                lastName!= null && !lastName.isEmpty() &&
                address1!=null && !address1.isEmpty() &&
                    address2!=null && !address2.isEmpty() &&
                town!=null && !town.isEmpty() &&
                occupation!=null && !occupation.isEmpty() &&
                emailId!=null && !emailId.isEmpty() &&
                confirmEmail!=null && !confirmEmail.isEmpty() &&
                zipCode != null && !zipCode.isEmpty() &&
                gender!=null && !gender.isEmpty() && age > 0 && !phoneNumber.isEmpty()
                    &&  country!=null && !country.isEmpty() 
                    &&  state!=null && !state.isEmpty() 
           )
            {
                if(buttonGroup1.getSelection()==null)
                {
             JOptionPane.showMessageDialog(null, "Please select radio button to know if you are volunteer or need help or a doctor ","warning", JOptionPane.WARNING_MESSAGE);
              return;       
                }

                if(!(confirmEmail.equals(emailId)))
                {
                    JOptionPane.showMessageDialog(null, "Email Address does not match, Please Enter valid email Address","warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
          
                  Person person = null;
              if(isHelpSeeker.isSelected())
                {
                 if(txtpassword.getPassword().length ==0 || txtpass.getPassword().length == 0 ||
                        txtuname.getText().trim().isEmpty() || box_city.getSelectedIndex()<1
                            )
                    {
                        JOptionPane.showMessageDialog(null, " Please Enter data in all fields","warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
               
                 
                  if(box_city.getSelectedIndex()<1)
                    {
                    JOptionPane.showMessageDialog(null, "Please choose a closest city","warning", JOptionPane.WARNING_MESSAGE);
                    return;     
                    }
                  if(age<50 || age==0 || age > 120)
                  {
                 JOptionPane.showMessageDialog(null, "Your age does not qualify as help seeker","warning", JOptionPane.WARNING_MESSAGE);
                    return;      
                  }
                    String userName = txtuname.getText();
                    String password = String.valueOf(txtpassword.getPassword());
                    String confirmPassword =String.valueOf(txtpass.getPassword());
               
                    Network helpSeekerNw = (Network)box_city.getSelectedItem();
                      if(!(password.equals(confirmPassword)))
                    {
                        JOptionPane.showMessageDialog(null, "Password does not match, Please Enter valid Password Address","warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getCustomerLsit().remove(person);
                        return;
                    }
                    
                    getEnterprise(helpSeekerNw);
                     if(enterprise == null)
                    {
                  JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! "+helpSeekerNw.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    } 
                    getOrganization("HelpSeeker",enterprise);
                    
                    if(organization == null)
                    {
                  JOptionPane.showMessageDialog(null, "HelpSeeker Organization does not exist for the enterprise! "+enterprise.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    } 
                 
                    person = organization.getPersonDirectory().addCustomer();
                    person.setHelpSeeker(true);
 
                    for(Enterprise e : helpSeekerNw.getEnterpriseDirectory().getEnterpriseList())
                    {
                     for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList())
                    {
                        if(ua.getUserName().equals(userName))
                        {
                         JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                         return;  
                        }
                        else
                        {
                        for(Organization o : e.getOrganizationDirectory().getOrganizationList())
                        {  
                         for(UserAccount ua1 : o.getUserAccountDirectory().getUserAccountList())
                            {  
                            if(ua1.getUserName().equals(userName))
                            {
                             JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                             return;  
                            }   
                            } 
                        }
                        }
                    }
                    }
                    if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                    {
                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getCustomerLsit().remove((HelpSeeker)person);
                        return;
                    }
                    // To get help seeker org
                    
                    UserAccount userAccount = organization.getUserAccountDirectory().addUserAccount(userName, password, person, new HelpSeekerRole());
                    userAccount.setPerson(person);
                   userAccount.setNetwork((Network)helpSeekerNw);
                  
                    // Send Req to Supervisor for approval       
                    SupervisorWorkRequest request = new SupervisorWorkRequest();
                    request.setMessage(SupervisorWorkRequest.REQUEST_APPROVAL);
                    request.setSender(userAccount);
                    request.setStatus(SupervisorWorkRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());
                    
                   // For Supervisor  
                  for(Enterprise e : helpSeekerNw.getEnterpriseDirectory().getEnterpriseList())
                  {
                      if(e instanceof HeartHelpEnterprise)
                      {
                       for(Organization organization : e.getOrganizationDirectory().getOrganizationList())
                       {
                      if (organization instanceof SupervisorOrganization ){
                                this.organization = organization;
                                this.personDirectory = organization.getPersonDirectory();
                      }
                      }
                      
                      }
                  }
                  
                    if (organization!=null){
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.setEnabled(false);
                    }
                }
                else if(isVolunteer.isSelected())
                {
                    if(age<10 || age==0 || age>100)
                  {
                 JOptionPane.showMessageDialog(null, "Your age does not qualify as Volunteer","warning", JOptionPane.WARNING_MESSAGE);
                    return;      
                  }
                    if(box_5.getSelectedIndex()<1)
                    {
                    JOptionPane.showMessageDialog(null, "Please choose a closest city","warning", JOptionPane.WARNING_MESSAGE);
                    return;     
                    }
                     Network volNetwork = (Network)box_5.getSelectedItem();
                    getEnterprise(volNetwork);
                    
                    if(enterprise==null)
                    {
                   JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! " +volNetwork.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    }
                    getOrganization("Volunteer",enterprise);
                  if(organization==null)
                    {
                   JOptionPane.showMessageDialog(null, "Volunteer Organization does not exist for the enterprise! " +enterprise.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                   return;      
                    }
                  
                  person = organization.getPersonDirectory().addVolunteer();
                  person.setVolunteer(true);
               
                   String userName = SendEmailAndTextMessage.generateUserName(lnameeett.getText());
                    if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                    {
                        userName = SendEmailAndTextMessage.generateUserName(lnameeett.getText());
                    }
                    String password = SendEmailAndTextMessage.generatePassword(txtffname.getText());
                    String emailMsg = buildEmailTxtMsg(userName, password);
                    
//                    boolean emailSent = SendEmailAndTextMessage.sendEmail(emailMsg, txt_mail.getText(),userName, password);
//                    if(!emailSent)
//                    {
//                    JOptionPane.showMessageDialog(null, "Please Enter a valid Email address! ","warning", JOptionPane.WARNING_MESSAGE);
//                    organization.getPersonDirectory().getVolunteerList().remove((Volunteer)person);
//                    return;         
//                    }
//                   
                    UserAccount userAccount = organization.getUserAccountDirectory().addUserAccount(userName,password , person, new VolunteerRole());
                    userAccount.setPerson(person);
                    userAccount.setNetwork(volNetwork);
                    
                    SupervisorWorkRequest request = new SupervisorWorkRequest();
                    request.setMessage(SupervisorWorkRequest.REQUEST_APPROVAL);
                    request.setSender(userAccount);
                    request.setStatus(SupervisorWorkRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());
                    
                   // For Supervisor  
                  for(Enterprise e : volNetwork.getEnterpriseDirectory().getEnterpriseList())
                  {
                      if(e instanceof HeartHelpEnterprise)
                      {
                       for(Organization organization : e.getOrganizationDirectory().getOrganizationList())
                       {
                      if (organization instanceof SupervisorOrganization ){
                                this.organization = organization;
                                this.personDirectory = organization.getPersonDirectory();
                      }
                      }
                      
                      }
                  }
                  
                    if (organization!=null){
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.setEnabled(false);
                    }
                }
                if(isDoctorRadioBtn.isSelected() )
                {
                  if(age<20 || age==0)
                  {
                 JOptionPane.showMessageDialog(null, "Your age does not qualify as Dcotor","warning", JOptionPane.WARNING_MESSAGE);
                    return;      
                  }
                     if(txtpassword.getPassword().length ==0 || txtpass.getPassword().length == 0 ||
                        txtuname.getText().trim().isEmpty() || box_city.getSelectedIndex()<1
                           )
                    {
                        JOptionPane.showMessageDialog(null, " Please Enter data in all fields","warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                     String userName = txtuname.getText();
                    String password = String.valueOf(txtpassword.getPassword());
                    String confirmPassword =String.valueOf(txtpass.getPassword());
                   
                    Network docNw = (Network)box_city.getSelectedItem();
                    
                    
                     if(!(password.equals(confirmPassword)))
                    {
                        JOptionPane.showMessageDialog(null, "Password does not match, Please Enter valid Password Address","warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getPersonList().remove(person);
                        return;
                    }
                    
                    getEnterprise(docNw);
                    if(enterprise==null)
                    {
                     JOptionPane.showMessageDialog(null, "Enterprise does not exist for the network! "+docNw.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                    } 
                    getOrganization("Doctor",enterprise);
                    if(organization==null)
                    {
                     JOptionPane.showMessageDialog(null, "Doctor Organization does not exist for the enterprise! "+enterprise.getName(),"warning", JOptionPane.WARNING_MESSAGE);
                     return;      
                    } 
                  person = organization.getPersonDirectory().addPerson();
                   
                    for(Enterprise e : docNw.getEnterpriseDirectory().getEnterpriseList())
                    {
                     for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList())
                    {
                        if(ua.getUserName().equals(userName))
                        {
                         JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                         return;  
                        }
                        else
                        {
                        for(Organization o : e.getOrganizationDirectory().getOrganizationList())
                        {  
                         for(UserAccount ua1 : o.getUserAccountDirectory().getUserAccountList())
                            {  
                            if(ua1.getUserName().equals(userName))
                            {
                             JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                             return;  
                            }   
                            } 
                        }
                        }
                    }
                    }
                    if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
                    {
                        JOptionPane.showMessageDialog(null, "User Name already exists!, Please Enter valid user name","warning", JOptionPane.WARNING_MESSAGE);
                        organization.getPersonDirectory().getPersonList().remove(person);
                        return;
                    }
                    // To get Doctor org
                    
                    UserAccount userAccount = organization.getUserAccountDirectory().addUserAccount(userName, password, person, new DoctorRole());
                    userAccount.setPerson(person);
                    userAccount.setNetwork(docNw);
                  
                // Request to Supervisor       
                    SupervisorWorkRequest request = new SupervisorWorkRequest();
                    request.setMessage(SupervisorWorkRequest.REQUEST_APPROVAL);
                    request.setSender(userAccount);
                    request.setStatus(SupervisorWorkRequest.REQUEST_SENT);
                    request.setRequestDate(new Date());
                    
                     // For Supervisor  
                  for(Enterprise e : docNw.getEnterpriseDirectory().getEnterpriseList())
                  {
                      if(e instanceof HeartHelpEnterprise)
                      {
                       for(Organization organization : e.getOrganizationDirectory().getOrganizationList())
                       {
                      if (organization instanceof SupervisorOrganization ){
                                this.organization = organization;
                                this.personDirectory = organization.getPersonDirectory();
                      }
                      }
                      
                      }
                  }
                     if (organization!=null){
                        organization.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                       userAccount.setEnabled(false);
                    }
                }
                
                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setAddress2(address2);
                person.setAddress1(address1);
                person.setTown(town);
                person.setZipCode(zipCode);
                person.setOccupation(occupation);
                person.setEmailId(emailId);
                person.setDob(dateOfBirthVal);
                person.setPhoneNumber(phoneNumber);
                person.setGender(gender);
                person.setCountry(country);
                person.setState(state);
                person.setName();
                person.setAge(age);
                
               
                JOptionPane.showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
                resetFields();
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Please Enter valid data in all the fields");
            }
        }
        
        catch(NumberFormatException npe)
        {
            JOptionPane.showMessageDialog(null, "Please Enter valid Number ! ");
        return;
        }
        catch(ParseException npe)
        {
            JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
           return;
        }
        catch(NullPointerException e )
        {
        JOptionPane.showMessageDialog(null, "Organization does not exist! ");  
          return;
        }
        catch(Exception e )
        {
        JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");  
          return;
        }
    }//GEN-LAST:event_reg_btnActionPerformed
    public void resetFields()
    {
     txtuname.setText("");
     txtpassword.setText("");
     txtpass.setText("");
    txtffname.setText("");
    lnameeett.setText("");
    dobbb.setText("");
    add_1txt.setText("");
    add_2txt.setText("");
    txt_city.setText("");
    txt_zip.setText("");
    txt_occ.setText("");
    txt_mail.setText("");
    txt_confirm.setText("");
    txtp_no.setText("");
    isHelpSeeker.setSelected(false);
    isVolunteer.setSelected(false);
    isDoctorRadioBtn.setSelected(false);
     
    }
    
    public void getEnterprise(Network network)
    {
          try
                {
                 for (Network n : ecoSystem.getNetworkList())
                    {
                    if(n.getCity().equals(network.getCity()))   
                    {  
                   for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList())
                      {
                           if(e instanceof SchoolEnterprise && isVolunteer.isSelected())
                           {
                             this.enterprise = e;
                             network = n;
                            }
                           else if(e instanceof HeartHelpEnterprise && isHelpSeeker.isSelected())
                           {
                             this.enterprise = e;
                              network = n;
                            }
                            else if(e instanceof HospitalEnterprise && isDoctorRadioBtn.isSelected())
                           {
                             this.enterprise = e;
                              network = n;
                           }
                      }
                    }
                    }
                }
                catch(Exception e)
                {
                 JOptionPane.showMessageDialog(null, "Please create Enterprise","warning", JOptionPane.WARNING_MESSAGE);
                    return;    
                }
    }
    
    public String buildEmailTxtMsg(String usrNm, String pwd)
    {
      StringBuilder emailMsgTxt = new StringBuilder();
        emailMsgTxt.append("Please find username and password to login into our application");
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("username : ".concat(usrNm));
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("password : ".concat(pwd));
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append(System.lineSeparator());
        emailMsgTxt.append("Thank You");
        emailMsgTxt.append("PatientSupportSystem");
        
        return emailMsgTxt.toString();
    }
    
    public void getOrganization(String orgVal, Enterprise e){
     
        try
        {
     for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
      
       if(orgVal.equals("Volunteer") && organization instanceof VolunteerOrganization)
        {
              this.organization = organization;
              this.personDirectory = organization.getPersonDirectory();
        
        }     
     else if(orgVal.equals("HelpSeeker") && organization instanceof HelpSeekerOrganization)
             {
               this.organization = organization;
               this.personDirectory = organization.getPersonDirectory();
             }  
       
       else if(orgVal.equals("Doctor") && organization instanceof DoctorOrganization)
             {
               this.organization = organization;
               this.personDirectory = organization.getPersonDirectory();
             } 
             }
        }
        catch(Exception ex)
        {
         return;     
        }
    }
    

    private void isHelpSeekerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isHelpSeekerActionPerformed

        helpSeekerPane.setVisible(true);
        box_5.setVisible(false);
        volNetwork.setVisible(false);
        populateNetworkComboBox();
        
    }//GEN-LAST:event_isHelpSeekerActionPerformed

    private void isVolunteerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isVolunteerActionPerformed
        helpSeekerPane.setVisible(false);
        box_5.setVisible(true);
        volNetwork.setVisible(true);
        populateVolNetworkComboBox();
    }//GEN-LAST:event_isVolunteerActionPerformed
    
    
    private void populateVolNetworkComboBox()
         {
         box_5.removeAllItems();
         if(ecoSystem.getNetworkList().isEmpty())
        {
        JOptionPane.showMessageDialog(null, "Networks does not exist! Sorry for inconvenience.");  
         return;        
        }
        box_5.addItem("Please Choose a Network");
           
        for(Network network : ecoSystem.getNetworkList()){
             box_5.addItem(network);
         }

        }
    
    private void box_genderrrrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_genderrrrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_genderrrrActionPerformed

    private void countryyyyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryyyyActionPerformed
        
        stateeebtn.removeAllItems();
       
        
      if(countryyyy.getSelectedIndex()>0)
      {
          stateeebtn.addItem("Please select a State");
         HashSet<String> hsstateVal = new HashSet<>();
        for (Network network : ecoSystem.getNetworkList())
        {
          if(network.getCountry().equals(countryyyy.getSelectedItem()))
          {
           hsstateVal.add(network.getState());
          }
        }
        for(String s1 : hsstateVal)
        {
        stateeebtn.addItem(s1);
        }
       }
         
    }//GEN-LAST:event_countryyyyActionPerformed

    private void stateeebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateeebtnActionPerformed

    }//GEN-LAST:event_stateeebtnActionPerformed

    private void box_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_cityActionPerformed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void isDoctorRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isDoctorRadioBtnActionPerformed
       helpSeekerPane.setVisible(true);
       box_5.setVisible(false);
        volNetwork.setVisible(false);
        populateNetworkComboBox();
    }//GEN-LAST:event_isDoctorRadioBtnActionPerformed

    private void txtp_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtp_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtp_noActionPerformed

    private void box_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_box_5ActionPerformed
    
  
    
    public void fillForm()
    {
    txtffname.setText("John");
    lnameeett.setText("Peter");
    dobbb.setText("12/12/1938");
    box_genderrrr.setSelectedItem("Female");
    add_1txt.setText("433");
    add_2txt.setText("Kenmore");
    txt_city.setText("boston");
    txt_zip.setText("02145");
    txt_occ.setText("student");
    txt_mail.setText("sruthi.ravula@gmail.com");
    txt_confirm.setText("sruthi.ravula@gmail.com");
    txtp_no.setText("8978989876");
  
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JTextField add_1txt;
    private javax.swing.JTextField add_2txt;
    private javax.swing.JLabel address1;
    private javax.swing.JLabel address2;
    private javax.swing.JComboBox box_5;
    private javax.swing.JComboBox box_city;
    private javax.swing.JComboBox box_genderrrr;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox countryyyy;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JFormattedTextField dobbb;
    private javax.swing.JLabel emailID;
    private javax.swing.JLabel emailID1;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel helpSeekerNw;
    private javax.swing.JLayeredPane helpSeekerPane;
    private javax.swing.JRadioButton isDoctorRadioBtn;
    private javax.swing.JRadioButton isHelpSeeker;
    private javax.swing.JRadioButton isVolunteer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField lnameeett;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel occupation;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JButton reg_btn;
    private javax.swing.JComboBox stateeebtn;
    private javax.swing.JLabel town;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_confirm;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_occ;
    private javax.swing.JTextField txt_zip;
    private javax.swing.JTextField txtffname;
    private javax.swing.JTextField txtp_no;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuname;
    private javax.swing.JLabel volNetwork;
    private javax.swing.JLabel zipCode;
    // End of variables declaration//GEN-END:variables
}
