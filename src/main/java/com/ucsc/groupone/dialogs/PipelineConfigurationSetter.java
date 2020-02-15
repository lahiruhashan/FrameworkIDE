/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucsc.groupone.dialogs;

import com.ucsc.groupone.models.PipelineConfigurationModel;
import com.ucsc.groupone.utils.FileChooserOptions;
import com.ucsc.groupone.utils.SystemVariables;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author hashan
 */
public class PipelineConfigurationSetter extends javax.swing.JDialog {

    PipelineConfigurationModel pipelineModel = new PipelineConfigurationModel();
    public PipelineConfigurationSetter(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        classCount = new javax.swing.JTextField();
        testDataCount = new javax.swing.JTextField();
        batchSize = new javax.swing.JTextField();
        currentModelDirectory = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelMap = new javax.swing.JTextField();
        trainDataset = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        testDataset = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        modelDirectoryFC = new javax.swing.JButton();
        labelMapFC = new javax.swing.JButton();
        trainDatasetFC = new javax.swing.JButton();
        testDatasetFC = new javax.swing.JButton();
        createLabelMapButton = new javax.swing.JButton();
        createTrainDatasetButton = new javax.swing.JButton();
        createTestDatasetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pipeline Configuration Setter");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Fira Code", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Updating Pipeline Configuration File");

        jLabel2.setText("Number of Classes");

        jLabel3.setText("Test Data Count");

        jLabel4.setText("Batch Size");

        jLabel5.setText("Current Model Directory");

        jLabel6.setText("Label Map File");

        jLabel7.setText("Train Dataset File");

        jLabel8.setText("Test Dataset File");

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("CANCEL");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        modelDirectoryFC.setText("...");
        modelDirectoryFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelDirectoryFCActionPerformed(evt);
            }
        });

        labelMapFC.setText("...");
        labelMapFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelMapFCActionPerformed(evt);
            }
        });

        trainDatasetFC.setText("...");
        trainDatasetFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainDatasetFCActionPerformed(evt);
            }
        });

        testDatasetFC.setText("...");
        testDatasetFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testDatasetFCActionPerformed(evt);
            }
        });

        createLabelMapButton.setText("Create");
        createLabelMapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createLabelMapButtonActionPerformed(evt);
            }
        });

        createTrainDatasetButton.setText("Create");
        createTrainDatasetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTrainDatasetButtonActionPerformed(evt);
            }
        });

        createTestDatasetButton.setText("Create");
        createTestDatasetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTestDatasetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(classCount, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testDataCount, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batchSize, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(currentModelDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMap, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(trainDataset, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testDataset, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelDirectoryFC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelMapFC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(trainDatasetFC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(testDatasetFC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(createLabelMapButton)
                                    .addComponent(createTrainDatasetButton))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(createTestDatasetButton))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(classCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(testDataCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(batchSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(currentModelDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelDirectoryFC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labelMap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelMapFC)
                    .addComponent(createLabelMapButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(trainDataset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trainDatasetFC)
                    .addComponent(createTrainDatasetButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(testDataset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testDatasetFC)
                    .addComponent(createTestDatasetButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.pipelineModel = null;
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (classCount.getText().isEmpty() || batchSize.getText().isEmpty() || 
                testDataCount.getText().isEmpty() || currentModelDirectory.getText().isEmpty() || 
                labelMap.getText().isEmpty() || trainDataset.getText().isEmpty() || 
                testDataset.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fill All The Fields", "Empty Fields", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        this.pipelineModel.setClassCount(Integer.parseInt(classCount.getText()));                                  
        this.pipelineModel.setBatchSize(Integer.parseInt(batchSize.getText()));                                  
        this.pipelineModel.setTestDataCount(Integer.parseInt(testDataCount.getText()));                                  
        this.pipelineModel.setModelDirectory(currentModelDirectory.getText());                                  
        this.pipelineModel.setLabelMapFile(labelMap.getText());                                  
        this.pipelineModel.setTrainDatasetFile(trainDataset.getText());                                  
        this.pipelineModel.setTestDatasetFile(testDataset.getText());
       
        this.dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    private void modelDirectoryFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelDirectoryFCActionPerformed
        FileChooserOptions.chooseFilePath("Choose Model Directory", JFileChooser.DIRECTORIES_ONLY,
                currentModelDirectory, SystemVariables.OBJECT_DETECTION_FOLDER, 
                "/model.ckpt", SystemVariables.OBJECT_DETECTION_FOLDER+"/");
    }//GEN-LAST:event_modelDirectoryFCActionPerformed

    private void createLabelMapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createLabelMapButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createLabelMapButtonActionPerformed

    private void createTrainDatasetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTrainDatasetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createTrainDatasetButtonActionPerformed

    private void createTestDatasetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTestDatasetButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createTestDatasetButtonActionPerformed

    private void labelMapFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelMapFCActionPerformed
        FileChooserOptions.chooseFilePath("Choose Label Map File", JFileChooser.FILES_ONLY,
                labelMap, SystemVariables.TRAINING_FOLDER, 
                "", SystemVariables.OBJECT_DETECTION_FOLDER+"/");
    }//GEN-LAST:event_labelMapFCActionPerformed

    private void trainDatasetFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainDatasetFCActionPerformed
        FileChooserOptions.chooseFilePath("Choose Train Dataset File", JFileChooser.FILES_ONLY,
                trainDataset, SystemVariables.DATA_FOLDER, 
                "", SystemVariables.OBJECT_DETECTION_FOLDER+"/");
    }//GEN-LAST:event_trainDatasetFCActionPerformed

    private void testDatasetFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testDatasetFCActionPerformed
        FileChooserOptions.chooseFilePath("Choose Test Dataset File", JFileChooser.FILES_ONLY,
                testDataset, SystemVariables.DATA_FOLDER, 
                "", SystemVariables.OBJECT_DETECTION_FOLDER+"/");
    }//GEN-LAST:event_testDatasetFCActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PipelineConfigurationSetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PipelineConfigurationSetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PipelineConfigurationSetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PipelineConfigurationSetter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PipelineConfigurationSetter dialog = new PipelineConfigurationSetter(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batchSize;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField classCount;
    private javax.swing.JButton createLabelMapButton;
    private javax.swing.JButton createTestDatasetButton;
    private javax.swing.JButton createTrainDatasetButton;
    private javax.swing.JTextField currentModelDirectory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField labelMap;
    private javax.swing.JButton labelMapFC;
    private javax.swing.JButton modelDirectoryFC;
    private javax.swing.JButton okButton;
    private javax.swing.JTextField testDataCount;
    private javax.swing.JTextField testDataset;
    private javax.swing.JButton testDatasetFC;
    private javax.swing.JTextField trainDataset;
    private javax.swing.JButton trainDatasetFC;
    // End of variables declaration//GEN-END:variables

    public PipelineConfigurationModel showDialog(PipelineConfigurationModel pipelineModelConfig) {
        populateDialogBox(pipelineModelConfig);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        return this.pipelineModel;
    }

    private void populateDialogBox(PipelineConfigurationModel pipelineModelConfig) {
        classCount.setText(String.valueOf(pipelineModelConfig.getClassCount()));
        testDataCount.setText(String.valueOf(pipelineModelConfig.getTestDataCount()));
        batchSize.setText(String.valueOf(pipelineModelConfig.getBatchSize()));
        currentModelDirectory.setText(pipelineModelConfig.getModelDirectory());
        labelMap.setText(pipelineModelConfig.getLabelMapFile());
        trainDataset.setText(pipelineModelConfig.getTrainDatasetFile());
        testDataset.setText(pipelineModelConfig.getTestDatasetFile());
    }
}

