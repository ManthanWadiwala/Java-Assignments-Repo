/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import hospital.Encounter;
import hospital.EncounterHistory;
import hospital.Patient;
import hospital.PatientDirectory;
import hospital.Person;
import hospital.PersonDirectory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author manthanwadiwala
 */
public class ReportJPanel1 extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */

    EncounterHistory encounterHistory;
    
    public ReportJPanel1(EncounterHistory encounterHistory) {
        initComponents();
        
        this.encounterHistory = encounterHistory;
        //c1Panel.setVisible(false);
        //c2Panel.setVisible(false);
        populateTable();
        getCommunities();
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblComm1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        JTableLegend1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblComm2 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel1.setText("Patient Visit History");

        tblComm1.setBackground(new java.awt.Color(8, 34, 137));
        tblComm1.setFont(new java.awt.Font("Lucida Grande", 3, 12)); // NOI18N
        tblComm1.setForeground(new java.awt.Color(255, 255, 255));
        tblComm1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0 - 20", "0"},
                {"21 - 40", "0"},
                {"41 - 80", "0"},
                {"80 +", "0"},
                {"Total", null}
            },
            new String [] {
                "Age Range(Years)", "No. Of Patients"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComm1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComm1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblComm1);
        if (tblComm1.getColumnModel().getColumnCount() > 0) {
            tblComm1.getColumnModel().getColumn(0).setResizable(false);
            tblComm1.getColumnModel().getColumn(1).setResizable(false);
        }

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel2.setText("Patients with Abnormalities");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel3.setText("Select a community: ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 2, 13)); // NOI18N
        jLabel4.setText("Select a community: ");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        tblPerson.setBackground(new java.awt.Color(8, 34, 137));
        tblPerson.setFont(new java.awt.Font("Lucida Grande", 3, 12)); // NOI18N
        tblPerson.setForeground(new java.awt.Color(255, 255, 255));
        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Age", "Gender", "House", "Community", "City", "Blood Pressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPerson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPerson);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel5.setText("Normal Patient Blood Pressure Reference");

        JTableLegend1.setBackground(new java.awt.Color(8, 34, 137));
        JTableLegend1.setFont(new java.awt.Font("Lucida Grande", 3, 12)); // NOI18N
        JTableLegend1.setForeground(new java.awt.Color(255, 255, 255));
        JTableLegend1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0 - 20", "60", "70"},
                {"21 - 40", "70", "80"},
                {"41 - 80", "65", "75"},
                {"80 +", "67", "77"}
            },
            new String [] {
                "Age Range(Years)", "Upper Limit", "Lower Limit"
            }
        ));
        JTableLegend1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableLegend1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JTableLegend1);
        if (JTableLegend1.getColumnModel().getColumnCount() > 0) {
            JTableLegend1.getColumnModel().getColumn(0).setResizable(false);
            JTableLegend1.getColumnModel().getColumn(1).setResizable(false);
            JTableLegend1.getColumnModel().getColumn(2).setHeaderValue("Lower Limit");
        }

        tblComm2.setBackground(new java.awt.Color(8, 34, 137));
        tblComm2.setFont(new java.awt.Font("Lucida Grande", 3, 12)); // NOI18N
        tblComm2.setForeground(new java.awt.Color(255, 255, 255));
        tblComm2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0 - 20", ""},
                {"21 - 40", ""},
                {"41 - 80", ""},
                {"80 +", ""},
                {"Total", null}
            },
            new String [] {
                "Age Range(Years)", "No. Of Patients"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblComm2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComm2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblComm2);
        if (tblComm2.getColumnModel().getColumnCount() > 0) {
            tblComm2.getColumnModel().getColumn(0).setResizable(false);
            tblComm2.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(61, 61, 61)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(61, 61, 61)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(342, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(254, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(135, 135, 135))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(77, 77, 77)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(597, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String community = jComboBox1.getSelectedItem().toString();
        System.out.println(community);
        populateAbnormalitiesC1(community);
                
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        String community = jComboBox2.getSelectedItem().toString();
        System.out.println(community);
        populateAbnormalitiesC2(community);
                
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void tblPersonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblPersonMouseClicked

    private void tblComm1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComm1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_tblComm1MouseClicked

    private void JTableLegend1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableLegend1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JTableLegend1MouseClicked

    private void tblComm2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComm2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblComm2MouseClicked

        private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
        model.setRowCount(0);
        //int i=0;
        
        for(Encounter p : encounterHistory.getEncounterHistory()){
            
            Object[] row = new Object[8];
            //row[0] = f.getId();
            row[0] = p.getPatientId();
            row[1] = p.getName();
            row[2] = p.getAge();
            row[3] = p.getGender();
            row[4] = p.getHouse();
            row[5] = p.getCommunity();
            row[6] = p.getCity();
            row[7] = p.getBloodPressure();
            model.addRow(row);
        }
    }
        
        private void getCommunities()
        {
            
            jComboBox1.removeAllItems();
            jComboBox2.removeAllItems();
            int size=encounterHistory.getEncounterHistory().size();
            ArrayList<String> comm = new ArrayList<String>();
            for (int i = 0; i < size; i++) {
              comm.add(encounterHistory.getEncounterHistory().get(i).getCommunity());
            }
            HashSet<String> communities = new HashSet<String>(comm);
            jComboBox1.addItem("Select");
            jComboBox2.addItem("Select");
            for(String s : communities)
            {
                jComboBox1.addItem(s);
                jComboBox2.addItem(s);
            }
            
            
        }
        private void populateAbnormalitiesC1(String community)
        {
           ArrayList<String> a1 = new ArrayList<String>(); 
           ArrayList<String> a2 = new ArrayList<String>();
           ArrayList<String> a3 = new ArrayList<String>();
           ArrayList<String> a4 = new ArrayList<String>();
           
           for(Encounter e : encounterHistory.getEncounterHistory())
            {
                if(e.community.equals(community))
                {
                    //c1Panel.setVisible(true);
                        if((e.getAge() <= 20 && e.getBloodPressure() <= 60) || (e.getAge() <= 20 && e.getBloodPressure() >= 60))
                        {                           
                            a1.add(Integer.toString(e.getPatientId()));
                        }
                        if((e.getAge() >= 21 && e.getAge() <= 40 && e.getBloodPressure() <= 70) || (e.getAge() >= 21 && e.getAge() <= 40 && e.getBloodPressure() >=80))
                        {
                            a2.add(Integer.toString(e.getPatientId()));
                        }
                        if((e.getAge() >= 41 && e.getAge() <= 80 && e.getBloodPressure() <= 65) || (e.getAge() >= 41 && e.getAge() <= 80 && e.getBloodPressure() >=75))
                        {
                            a3.add(Integer.toString(e.getPatientId()));
                        }
                        if((e.getAge() >= 81 && e.getBloodPressure() <= 67) || (e.getAge() >= 81 && e.getBloodPressure() >=77))
                        {
                            a4.add(Integer.toString(e.getPatientId()));
                        }
                }
                
                
            }
           
           HashSet<String> h1 = new HashSet<String>(a1);
           String ag1=Integer.toString(h1.size());
           HashSet<String> h2 = new HashSet<String>(a2);
           String ag2=(Integer.toString(h2.size()));
           HashSet<String> h3 = new HashSet<String>(a3);
           String ag3=(Integer.toString(h3.size()));
           HashSet<String> h4 = new HashSet<String>(a4);
           String ag4=(Integer.toString(h4.size()));
  
           DefaultTableModel model = (DefaultTableModel) tblComm1.getModel();
            model.setRowCount(0);
            String total=Integer.toString(h1.size()+h2.size()+h3.size()+h4.size());
        //int i=0;
        
        String[] row1 = {"0 - 20",ag1};
        String[] row2 = {"21 - 40",ag2};
        String[] row3 = {"41 - 80",ag3};
        String[] row4 = {"80 +",ag4};
        String[] row5 = {"Total",total};
        System.out.println("Total:"+total);
    

            model.addRow(row1);
            model.addRow(row2);
            model.addRow(row3);
            model.addRow(row4);
            model.addRow(row5);
        
  
                       
        }
        
              private void populateAbnormalitiesC2(String community)
        {
           ArrayList<String> a11 = new ArrayList<String>(); 
           ArrayList<String> a12 = new ArrayList<String>();
           ArrayList<String> a13 = new ArrayList<String>();
           ArrayList<String> a14 = new ArrayList<String>();
           
           for(Encounter e : encounterHistory.getEncounterHistory())
            {
                if(e.community.equals(community))
                {
                    //c2Panel.setVisible(true);
                        if((e.getAge() <= 20 && e.getBloodPressure() <= 60) || (e.getAge() <= 20 && e.getBloodPressure() >= 60))
                        {                           
                            a11.add(Integer.toString(e.getPatientId()));
                        }
                        if((e.getAge() >= 21 && e.getAge() <= 40 && e.getBloodPressure() <= 70) || (e.getAge() >= 21 && e.getAge() <= 40 && e.getBloodPressure() >=80))
                        {
                            a12.add(Integer.toString(e.getPatientId()));
                        }
                        if((e.getAge() >= 41 && e.getAge() <= 80 && e.getBloodPressure() <= 65) || (e.getAge() >= 41 && e.getAge() <= 80 && e.getBloodPressure() >=75))
                        {
                            a13.add(Integer.toString(e.getPatientId()));
                        }
                        if((e.getAge() >= 81 && e.getBloodPressure() <= 67) || (e.getAge() >= 81 && e.getBloodPressure() >=77))
                        {
                            a14.add(Integer.toString(e.getPatientId()));
                        }
                }
                              
            }
           
           HashSet<String> h11 = new HashSet<String>(a11);
           String ag11 = (Integer.toString(h11.size()));
           HashSet<String> h12 = new HashSet<String>(a12);
           String ag12 = (Integer.toString(h12.size()));
           HashSet<String> h13 = new HashSet<String>(a13);
           String ag13 = (Integer.toString(h13.size()));
           HashSet<String> h14 = new HashSet<String>(a14);
           String ag14 = (Integer.toString(h14.size()));
  
                  DefaultTableModel model = (DefaultTableModel) tblComm2.getModel();
            model.setRowCount(0);
        //int i=0;
            String total=Integer.toString(h11.size()+h12.size()+h13.size()+h14.size());
        
        String[] row1 = {"0 - 20",ag11};
        String[] row2 = {"21 - 40",ag12};
        String[] row3 = {"41 - 80",ag13};
        String[] row4 = {"80 +",ag14};
        String[] row5 = {"Total",total};
        System.out.println("Total:"+total);

            model.addRow(row1);
            model.addRow(row2);
            model.addRow(row3);
            model.addRow(row4);
            model.addRow(row5);
        
              
        }
        
 
                

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableLegend1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblComm1;
    private javax.swing.JTable tblComm2;
    private javax.swing.JTable tblPerson;
    // End of variables declaration//GEN-END:variables
}
