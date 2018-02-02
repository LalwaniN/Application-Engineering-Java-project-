/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CountryNetworkAdminRole;

import Business.Hospital.Patient;
import Business.Network.Network;
import Business.RegCenter.Donor;
import Business.RegCenter.Organ;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author ApoorvaLakhmani
 */
public class CountryReportsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Network countryNetwork;
    private ArrayList<Donor> donorList;
    private ArrayList<Patient> patientList;
    
    Map<String,Integer> stateDonorsMap = new HashMap<>();
    /**
     * Creates new form CountryReportsJPanel
     */
    public CountryReportsJPanel(JPanel userProcessContainer,Network countryNetwork) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.countryNetwork = countryNetwork;
        this.donorList = new ArrayList<Donor>();
        this.patientList = new ArrayList<Patient>();
        
        stateNameTextField.setVisible(false);
        createAddBtn.setVisible(false);
        
        populatePatientsAndDonors();
        
        //Pie chart for no of donors by organ
        final PieDataset datasetDonors = createDataSetForDonorReports();
        final JFreeChart donorChart = createDonorsReportsChart(datasetDonors,"No of Donors by Organ");
        final ChartPanel donorChartPanel = new ChartPanel(donorChart);
        donorReportsJPanel.setLayout(new BorderLayout());
        donorReportsJPanel.add(donorChartPanel, BorderLayout.CENTER);
        donorReportsJPanel.setPreferredSize(new Dimension(500, 270));
        donorReportsJPanel.validate();
        
        //Pie chart for no of patients by organ needed
        final PieDataset datasetPatients = createDataSetForPatientReports();
        final JFreeChart patientChart = createPatientReportsChart(datasetPatients, "No Of Patients by Organ");
        final ChartPanel patientChartPanel = new ChartPanel(patientChart);
        patientReportJPanel.setLayout(new BorderLayout());
        patientReportJPanel.add(patientChartPanel, BorderLayout.CENTER);
        patientReportJPanel.setPreferredSize(new Dimension(500, 270));
        patientReportJPanel.validate();
        
        //no of donors per state
        final CategoryDataset datasetDonorsByState = createDataSetForDonorByStateReports();
        final JFreeChart donorByStateChart = createDonorsByStateReportsChart(datasetDonorsByState);
        final ChartPanel donorChartPanelByState = new ChartPanel(donorByStateChart);
        noOfDonorsInState.setLayout(new BorderLayout());
        noOfDonorsInState.add(donorChartPanelByState, BorderLayout.CENTER);
        noOfDonorsInState.setPreferredSize(new Dimension(500, 270));
        noOfDonorsInState.validate();
       
    }

    public void populatePatientsAndDonors(){
        for(Network stateNetwork : countryNetwork.getSubNetwork()){
            donorList.addAll(stateNetwork.getDonorDirectory().getDonorList());
            patientList.addAll(stateNetwork.getNetworkPatientDirectory().getPatientDirectory());
        }
    }
    public PieDataset createDataSetForDonorReports(){
          DefaultPieDataset dataset= new DefaultPieDataset();
          HashMap<String,Integer> organDonorMap = new HashMap<>();
          for(Donor donor : donorList){
              for(Organ organ : donor.getOrganDonateList()){
                  if(organDonorMap.containsKey(organ.getOrganName())){
                      Integer count = organDonorMap.get(organ.getOrganName());
                      count++;
                      organDonorMap.put(organ.getOrganName(), count); 
                  }else{
                      organDonorMap.put(organ.getOrganName(), 1);
                  }
              }
          }
          
          for(Map.Entry<String,Integer> entry : organDonorMap.entrySet()){
            Integer noOfDonors = entry.getValue();
            noOfDonors = noOfDonors*100/donorList.size();
            organDonorMap.put(entry.getKey(), noOfDonors);
          }
          for(Map.Entry<String,Integer> entry : organDonorMap.entrySet()){
              dataset.setValue(entry.getKey()+" = "+entry.getValue(), entry.getValue());
          }
          return dataset;
    }
    
    public JFreeChart createDonorsReportsChart(PieDataset dataSet,String chartTitle){
        
        JFreeChart chart=ChartFactory.createPieChart(chartTitle, dataSet, true, true, false);
        PiePlot plot =(PiePlot)chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
      return chart;
    }
    
    public PieDataset createDataSetForPatientReports(){
          DefaultPieDataset dataset= new DefaultPieDataset();
          HashMap<String,Integer> organDonorMap = new HashMap<>();
          for(Patient patient : patientList){
              
                  if(organDonorMap.containsKey(patient.getOrganNeeded().getOrganName())){
                      Integer count = organDonorMap.get(patient.getOrganNeeded().getOrganName());
                      count++;
                      organDonorMap.put(patient.getOrganNeeded().getOrganName(), count); 
                  }else{
                      organDonorMap.put(patient.getOrganNeeded().getOrganName(), 1);
                  }
              
          }
          
          for(Map.Entry<String,Integer> entry : organDonorMap.entrySet()){
            Integer noOfDonors = entry.getValue();
            noOfDonors = (noOfDonors*100)/patientList.size();
            organDonorMap.put(entry.getKey(), noOfDonors);
          }
          for(Map.Entry<String,Integer> entry : organDonorMap.entrySet()){
              dataset.setValue(entry.getKey()+" = "+entry.getValue(), entry.getValue());
          }
          return dataset;
    }
    
    public JFreeChart createPatientReportsChart(PieDataset dataSet,String chartTitle){
        //ChartFactory.createPieChart(chartTitle, dataSet, true, true, false);
        JFreeChart chart=ChartFactory.createPieChart(chartTitle, dataSet, true, true, false);
        PiePlot plot =(PiePlot)chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        //plot.setForegroundAlpha(0.8f);
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
      return chart;
    }
    
    private CategoryDataset createDataSetForDonorByStateReports() {
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        //Map<String,Integer> stateDonorsMap = new HashMap<>();
        for(Network stateNetwork : countryNetwork.getSubNetwork()){
            stateDonorsMap.put(stateNetwork.getNetworkName(), stateNetwork.getDonorDirectory().getDonorList().size());
        }
        for (Map.Entry<String, Integer> entryset : stateDonorsMap.entrySet()) {
            barChartData.addValue(entryset.getValue(), " No of donors ", entryset.getKey());
        }

        return barChartData;
    }

    private JFreeChart createDonorsByStateReportsChart(CategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart("No Of Registered Donors by State",
                                                            "State", 
                                                            " No Of Registered Donors", 
                                                            dataset, 
                                                            PlotOrientation.VERTICAL, 
                                                            true, 
                                                            true, 
                                                            false);
        barChart.setBackgroundPaint(Color.white);  
        // Set the background color of the chart
        barChart.getTitle().setPaint(Color.DARK_GRAY);
        barChart.setBorderVisible(true);
        // Adjust the color of the title
        CategoryPlot plot = barChart.getCategoryPlot();
        plot.getRangeAxis().setLowerBound(0.0);
        // Get the Plot object for a bar graph
        plot.setBackgroundPaint(Color.white);     
        plot.setRangeGridlinePaint(Color.blue);
        CategoryItemRenderer renderer = plot.getRenderer();
        renderer.setSeriesPaint(0, Color.decode("#00008B"));
        //return chart;
        return barChart;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        patientReportJPanel = new javax.swing.JPanel();
        donorReportsJPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        noOfDonorsInState = new javax.swing.JPanel();
        generateAwarness = new javax.swing.JButton();
        stateNameTextField = new javax.swing.JTextField();
        createAddBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout patientReportJPanelLayout = new javax.swing.GroupLayout(patientReportJPanel);
        patientReportJPanel.setLayout(patientReportJPanelLayout);
        patientReportJPanelLayout.setHorizontalGroup(
            patientReportJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );
        patientReportJPanelLayout.setVerticalGroup(
            patientReportJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        add(patientReportJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 136, 490, 310));

        javax.swing.GroupLayout donorReportsJPanelLayout = new javax.swing.GroupLayout(donorReportsJPanel);
        donorReportsJPanel.setLayout(donorReportsJPanelLayout);
        donorReportsJPanelLayout.setHorizontalGroup(
            donorReportsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );
        donorReportsJPanelLayout.setVerticalGroup(
            donorReportsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(donorReportsJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, -1, 303));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 153, 153));
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 980, -1, -1));

        javax.swing.GroupLayout noOfDonorsInStateLayout = new javax.swing.GroupLayout(noOfDonorsInState);
        noOfDonorsInState.setLayout(noOfDonorsInStateLayout);
        noOfDonorsInStateLayout.setHorizontalGroup(
            noOfDonorsInStateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        noOfDonorsInStateLayout.setVerticalGroup(
            noOfDonorsInStateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(noOfDonorsInState, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 593, 730, 300));

        generateAwarness.setBackground(new java.awt.Color(0, 0, 0));
        generateAwarness.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        generateAwarness.setForeground(new java.awt.Color(255, 153, 153));
        generateAwarness.setText("<< Generate Awarness");
        generateAwarness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateAwarnessActionPerformed(evt);
            }
        });
        add(generateAwarness, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 930, -1, -1));

        stateNameTextField.setBackground(new java.awt.Color(204, 255, 255));
        stateNameTextField.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        add(stateNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 980, 185, 36));

        createAddBtn.setBackground(new java.awt.Color(0, 0, 0));
        createAddBtn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        createAddBtn.setForeground(new java.awt.Color(255, 153, 153));
        createAddBtn.setText("Create Advertisement");
        add(createAddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 1040, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void generateAwarnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateAwarnessActionPerformed
        stateNameTextField.setVisible(true);
        createAddBtn.setVisible(true);
    }//GEN-LAST:event_generateAwarnessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createAddBtn;
    private javax.swing.JPanel donorReportsJPanel;
    private javax.swing.JButton generateAwarness;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel noOfDonorsInState;
    private javax.swing.JPanel patientReportJPanel;
    private javax.swing.JTextField stateNameTextField;
    // End of variables declaration//GEN-END:variables
}
