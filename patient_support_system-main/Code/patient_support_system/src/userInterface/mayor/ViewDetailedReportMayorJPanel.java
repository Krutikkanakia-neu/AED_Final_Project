/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.mayor;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.HashMap;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class ViewDetailedReportMayorJPanel extends javax.swing.JPanel {
    private HashMap<String,Integer> communitydetailsmap;
    private JPanel userProcessContainer;
    /**
     * Creates new form ViewDetailedReportMayorJPanel
     */
    public ViewDetailedReportMayorJPanel(JPanel userProcessContainer,HashMap<String,Integer> communitydetailsmap) {
        initComponents();
        this.communitydetailsmap = communitydetailsmap;
        this.userProcessContainer = userProcessContainer;
        
        populateDetailsForCommunity();
        populatePieDataChartPanel();
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
    
    public void populateDetailsForCommunity()
    {
         try
        {
        txtheart.setText(String.valueOf(communitydetailsmap.get("SeniorswithheartProblem")));
       txtnoprblm.setText(String.valueOf(communitydetailsmap.get("SeniorswithNoheartProblem")));
       txtsenior.setText(String.valueOf(communitydetailsmap.get("TotalNoOfSeniorPeople")));
       txtdata.setText(String.valueOf(communitydetailsmap.get("seniorsSendDataToDoctor")));
       txtvital.setText(String.valueOf(communitydetailsmap.get("seniorsShareVitalInfo")));
       txtnodevice.setText(String.valueOf(communitydetailsmap.get("seniorsWithNoSensorDevice")));
       txtsensordevice.setText(String.valueOf(communitydetailsmap.get("seniorsWithSensorDevice")));
        }
       catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
       }  
    }
    
    public void populatePieDataChartPanel()
    {
        pieChartDetailedReportPanel.removeAll();
        
        try
        {
         DefaultPieDataset dataSet = new DefaultPieDataset(); 
         dataSet.setValue("SeniorswithheartProblem",communitydetailsmap.get("SeniorswithheartProblem"));
         dataSet.setValue("SeniorswithNoheartProblem", communitydetailsmap.get("SeniorswithNoheartProblem") );
         dataSet.setValue("TotalNoOfSeniorPeople", communitydetailsmap.get("TotalNoOfSeniorPeople"));
         dataSet.setValue("seniorsSendDataToDoctor",communitydetailsmap.get("seniorsSendDataToDoctor"));
         dataSet.setValue("seniorsShareVitalInfo",  communitydetailsmap.get("seniorsShareVitalInfo"));
         dataSet.setValue("seniorsWithSensorDevice", communitydetailsmap.get("seniorsWithSensorDevice"));
         dataSet.setValue("seniorsWithNoSensorDevice", communitydetailsmap.get("seniorsWithNoSensorDevice"));
     
         JFreeChart  chart = ChartFactory.createPieChart3D("Pie Chart ", dataSet, true, true, Locale.ENGLISH);
          chart.setBackgroundPaint(Color.WHITE);
          chart.getTitle().setPaint(Color.BLUE);
            ChartPanel chartpanel = new ChartPanel(chart);
          chartpanel.setDomainZoomable(true);
          chartpanel.setBackground(Color.WHITE);
        pieChartDetailedReportPanel.setLayout(new BorderLayout());
        pieChartDetailedReportPanel.add(chartpanel, BorderLayout.EAST);
        pieChartDetailedReportPanel.revalidate();
        pieChartDetailedReportPanel.setVisible(true);
       }
       
       catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
       }
    }
    
    public void populateBarDataChartPanel()
    {
        if(communitydetailsmap==null || communitydetailsmap.isEmpty())
        {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return;    
        }
        try
        {
            DefaultCategoryDataset dataSet = new DefaultCategoryDataset(); 
        if(communitydetailsmap.get("SeniorswithheartProblem")!=0)
        {
         dataSet.setValue(communitydetailsmap.get("SeniorswithheartProblem"),"Values","SeniorswithheartProblem");
        }
        if(communitydetailsmap.get("SeniorswithNoheartProblem")!=0)
        {
         dataSet.setValue(communitydetailsmap.get("SeniorswithNoheartProblem"),"Values","SeniorswithNoheartProblem" );
        }
        if(communitydetailsmap.get("TotalNoOfSeniorPeople")!=0)
        {
         dataSet.setValue(communitydetailsmap.get("TotalNoOfSeniorPeople"),"Values","TotalNoOfSeniorPeople" );
        }
        if(communitydetailsmap.get("seniorsSendDataToDoctor")!=0)
        {
         dataSet.setValue(communitydetailsmap.get("seniorsSendDataToDoctor"),"Values","seniorsSendDataToDoctor");
        }
        if(communitydetailsmap.get("seniorsShareVitalInfo")!=0)
        {
        dataSet.setValue(communitydetailsmap.get("seniorsShareVitalInfo"),"Values","seniorsShareVitalInfo"  );
        }
        if(communitydetailsmap.get("seniorsWithSensorDevice")!=0)
        {
        dataSet.setValue(communitydetailsmap.get("seniorsWithSensorDevice"),"Values","seniorsWithSensorDevice" );
        }
        if(communitydetailsmap.get("seniorsWithNoSensorDevice")!=0)
        {
        dataSet.setValue(communitydetailsmap.get("seniorsWithNoSensorDevice"),"Values","seniorsWithNoSensorDevice");
        }
        JFreeChart barchart = ChartFactory.createBarChart(" Bar Chart" ," Values " ,"Community Info", dataSet,PlotOrientation.VERTICAL, false, true, false);
             barchart.setBackgroundPaint(Color.WHITE);
             barchart.getTitle().setPaint(Color.BLUE);
             CategoryPlot plot = barchart.getCategoryPlot();
             plot.setBackgroundPaint(Color.CYAN);
             
            ChartFrame frame = new ChartFrame("Bar Chart  ", barchart);
            frame.setVisible(true);
            frame.setSize(450,350);
       }
       
       catch(NullPointerException npe)
       {
        JOptionPane.showMessageDialog(null, " No Data to display as of now!","warning", JOptionPane.WARNING_MESSAGE);
        return; 
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

        manageEnt1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        txtdata = new javax.swing.JTextField();
        sendToDoc = new javax.swing.JLabel();
        txtheart = new javax.swing.JTextField();
        totTransReq1 = new javax.swing.JLabel();
        totalSeniorPpl = new javax.swing.JLabel();
        txtvital = new javax.swing.JTextField();
        noheartPrblm = new javax.swing.JLabel();
        hasHeartPblm = new javax.swing.JLabel();
        txtnoprblm = new javax.swing.JTextField();
        txtsenior = new javax.swing.JTextField();
        hasNoSensor = new javax.swing.JLabel();
        txtsensordevice = new javax.swing.JTextField();
        hasSensor = new javax.swing.JLabel();
        txtnodevice = new javax.swing.JTextField();
        pieChartDetailedReportPanel = new javax.swing.JPanel();
        backbtn = new javax.swing.JButton();
        barbtn = new javax.swing.JButton();
        manageEnt2 = new javax.swing.JLabel();

        manageEnt1.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt1.setText("view summary");

        jLayeredPane1.setBackground(new java.awt.Color(255, 204, 204));
        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtdata.setEditable(false);
        txtdata.setBackground(new java.awt.Color(153, 204, 0));

        sendToDoc.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        sendToDoc.setText("Total No of Seniors who send details to doctor");

        txtheart.setEditable(false);
        txtheart.setBackground(new java.awt.Color(153, 204, 0));

        totTransReq1.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        totTransReq1.setText("Total No of Seniors who send vital detail");

        totalSeniorPpl.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        totalSeniorPpl.setText("Total Senior People who need Support");

        txtvital.setEditable(false);
        txtvital.setBackground(new java.awt.Color(153, 204, 0));

        noheartPrblm.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        noheartPrblm.setText("No of Senior people with no Health issue ");

        hasHeartPblm.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        hasHeartPblm.setText("No of Senior people with Health Issue");

        txtnoprblm.setEditable(false);
        txtnoprblm.setBackground(new java.awt.Color(153, 204, 0));

        txtsenior.setEditable(false);
        txtsenior.setBackground(new java.awt.Color(153, 204, 0));

        hasNoSensor.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        hasNoSensor.setText("Total No of Seniors who dont have sensor device");

        txtsensordevice.setEditable(false);
        txtsensordevice.setBackground(new java.awt.Color(153, 204, 0));

        hasSensor.setFont(new java.awt.Font("Malayalam MN", 3, 18)); // NOI18N
        hasSensor.setText("Total No of seniors who has sensor device");

        txtnodevice.setEditable(false);
        txtnodevice.setBackground(new java.awt.Color(153, 204, 0));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hasNoSensor)
                    .addComponent(totalSeniorPpl, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hasHeartPblm, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(hasSensor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noheartPrblm, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(totTransReq1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendToDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnodevice, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvital, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsensordevice, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnoprblm, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtheart, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsenior, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalSeniorPpl)
                    .addComponent(txtsenior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasHeartPblm)
                    .addComponent(txtheart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(noheartPrblm)
                    .addComponent(txtnoprblm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasSensor)
                    .addComponent(txtsensordevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totTransReq1)
                    .addComponent(txtvital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hasNoSensor)
                    .addComponent(txtnodevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendToDoc)
                    .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(txtdata, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(sendToDoc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtheart, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(totTransReq1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(totalSeniorPpl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtvital, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(noheartPrblm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(hasHeartPblm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnoprblm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtsenior, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(hasNoSensor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtsensordevice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(hasSensor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtnodevice, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pieChartDetailedReportPanelLayout = new javax.swing.GroupLayout(pieChartDetailedReportPanel);
        pieChartDetailedReportPanel.setLayout(pieChartDetailedReportPanelLayout);
        pieChartDetailedReportPanelLayout.setHorizontalGroup(
            pieChartDetailedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );
        pieChartDetailedReportPanelLayout.setVerticalGroup(
            pieChartDetailedReportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 370, Short.MAX_VALUE)
        );

        backbtn.setText(" Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        barbtn.setText("View Bar Chart");
        barbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barbtnActionPerformed(evt);
            }
        });

        manageEnt2.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt2.setText("Patient Support Mayor Main Page");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backbtn)
                                .addGap(312, 312, 312)
                                .addComponent(barbtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(pieChartDetailedReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(manageEnt2, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(manageEnt2)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(manageEnt1)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pieChartDetailedReportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(backbtn)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(barbtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backbtnActionPerformed

    private void barbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barbtnActionPerformed
       populateBarDataChartPanel();
    }//GEN-LAST:event_barbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JButton barbtn;
    private javax.swing.JLabel hasHeartPblm;
    private javax.swing.JLabel hasNoSensor;
    private javax.swing.JLabel hasSensor;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel manageEnt2;
    private javax.swing.JLabel noheartPrblm;
    private javax.swing.JPanel pieChartDetailedReportPanel;
    private javax.swing.JLabel sendToDoc;
    private javax.swing.JLabel totTransReq1;
    private javax.swing.JLabel totalSeniorPpl;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txtheart;
    private javax.swing.JTextField txtnodevice;
    private javax.swing.JTextField txtnoprblm;
    private javax.swing.JTextField txtsenior;
    private javax.swing.JTextField txtsensordevice;
    private javax.swing.JTextField txtvital;
    // End of variables declaration//GEN-END:variables
}
