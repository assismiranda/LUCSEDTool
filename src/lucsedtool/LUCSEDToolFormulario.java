/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucsedtool;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Marcos
 */
public class LUCSEDToolFormulario extends javax.swing.JFrame {

    /**
     * Creates new form LUCSEDTool
     */

    static File arq = null;
    public LUCSEDToolFormulario() {
        
        initComponents();
        jtUseCase.setToolTipText("Enter the use case");
        jlSituacaoGenerate.setText("");
        jbLocalDiagramaGerado.setEnabled(false);
        this.setExtendedState(MAXIMIZED_BOTH);  
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
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtUseCase = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        progressoGenerate = new javax.swing.JProgressBar();
        jButton2 = new javax.swing.JButton();
        jtDirectoryArchive = new javax.swing.JTextField();
        jbLocalDiagramaGerado = new javax.swing.JButton();
        jlSituacaoGenerate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("LUCSED Tool");

        jtUseCase.setColumns(20);
        jtUseCase.setRows(5);
        jScrollPane1.setViewportView(jtUseCase);

        jButton1.setText("Open User Case");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        progressoGenerate.setBackground(new java.awt.Color(204, 204, 204));
        progressoGenerate.setStringPainted(true);

        jButton2.setText("Generate Diagrams");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jtDirectoryArchive.setEditable(false);

        jbLocalDiagramaGerado.setText("open folder diagram");
        jbLocalDiagramaGerado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLocalDiagramaGeradoActionPerformed(evt);
            }
        });

        jlSituacaoGenerate.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtDirectoryArchive)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(387, 387, 387))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlSituacaoGenerate)
                                    .addComponent(progressoGenerate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jbLocalDiagramaGerado))
                        .addContainerGap(126, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDirectoryArchive, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(progressoGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLocalDiagramaGerado))
                .addGap(4, 4, 4)
                .addComponent(jlSituacaoGenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        jlSituacaoGenerate.setText("Gerando diagramas...");
        progressoGenerate.setValue(10);
        
        Parser parser = new Parser(arq.getAbsolutePath());
        
        progressoGenerate.setValue(100);
        
        jlSituacaoGenerate.setText("Diagrama Gerado com sucesso.");
        jbLocalDiagramaGerado.setEnabled(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        JFileChooser Arquivo = new JFileChooser(".");

        StringBuffer str = new StringBuffer();
        try {
            int res = Arquivo.showOpenDialog(this);

            if (res == JFileChooser.APPROVE_OPTION) {
                arq = Arquivo.getSelectedFile();
            }
            str.append("Parsing: " + arq.getAbsolutePath());
            jtDirectoryArchive.setText(arq.getAbsolutePath());
            String dados = new String(Files.readAllBytes(arq.toPath()));
            jtUseCase.setText(dados);
        
        }catch (Exception e ){
            
        }

        progressoGenerate.setValue(0);
        jlSituacaoGenerate.setText("");
        jbLocalDiagramaGerado.setEnabled(false);
        
        this.setExtendedState(MAXIMIZED_BOTH); 
    }//GEN-LAST:event_jButton1ActionPerformed

    public  File getArquivo(){
        return arq;
    }
    
    private void jbLocalDiagramaGeradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLocalDiagramaGeradoActionPerformed
        try {
            // TODO add your handling code here:
            Desktop.getDesktop().open(new File(arq.getParent()));
        } catch (IOException ex) {
            Logger.getLogger(LUCSEDToolFormulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbLocalDiagramaGeradoActionPerformed

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
            java.util.logging.Logger.getLogger(LUCSEDTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LUCSEDTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LUCSEDTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LUCSEDTool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LUCSEDToolFormulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbLocalDiagramaGerado;
    private javax.swing.JLabel jlSituacaoGenerate;
    private javax.swing.JTextField jtDirectoryArchive;
    private javax.swing.JTextArea jtUseCase;
    private javax.swing.JProgressBar progressoGenerate;
    // End of variables declaration//GEN-END:variables
}
