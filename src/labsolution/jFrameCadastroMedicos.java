/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labsolution;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class jFrameCadastroMedicos extends javax.swing.JFrame {

    DefaultTableModel tabelaMedico;

    public jFrameCadastroMedicos() {
        initComponents();
        tabelaMedico = (DefaultTableModel) jTableMedicos.getModel();

    }

    private void lerMedicos() throws IOException {
        String medico;
        try {
            FileReader arqLe = new FileReader("Medicos.txt");
            BufferedReader br = new BufferedReader(arqLe);

            while ((medico = br.readLine()) != null) {
                String campos[] = medico.split(";");
                tabelaMedico.addRow(campos);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Erro ao ler o arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextNomeMedico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextEndereco = new javax.swing.JTextField();
        jFCPF = new javax.swing.JFormattedTextField();
        jFTelefone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextCRM = new javax.swing.JTextField();
        jTextEspecialidade = new javax.swing.JTextField();
        jButtonAdc = new javax.swing.JButton();
        jButtonAlt = new javax.swing.JButton();
        jButtonRemov = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedicos = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        jTextNomeMedico.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/equipe-medica.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel5.setText("Endereço:");

        jTextEndereco.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        try {
            jFCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCPF.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        try {
            jFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTelefone.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel6.setText("CRM:");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel7.setText("Especialidade:");

        jTextCRM.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jTextEspecialidade.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jButtonAdc.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jButtonAdc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-16.png"))); // NOI18N
        jButtonAdc.setText("Adicionar");
        jButtonAdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdcActionPerformed(evt);
            }
        });

        jButtonAlt.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jButtonAlt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-lápis-16.png"))); // NOI18N
        jButtonAlt.setText("Alterar");
        jButtonAlt.setEnabled(false);
        jButtonAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltActionPerformed(evt);
            }
        });

        jButtonRemov.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jButtonRemov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-remover-16.png"))); // NOI18N
        jButtonRemov.setText("Remover");
        jButtonRemov.setEnabled(false);
        jButtonRemov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemovActionPerformed(evt);
            }
        });

        jTableMedicos.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Endereço", "Telefone", "CRM", "Especialidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMedicosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedicos);

        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel8.setText("Cadastro de Médicos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButtonAdc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemov, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextCRM, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextEspecialidade))
                            .addComponent(jTextEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNomeMedico, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5)
                                    .addComponent(jFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel7))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNomeMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel4))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCRM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdc)
                    .addComponent(jButtonAlt)
                    .addComponent(jButtonRemov))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdcActionPerformed
      int linha = jTableMedicos.getRowCount();
        String crm = jTextCRM.getText();
        String cpf = jFCPF.getText();
         boolean crmExiste=false,cpfExiste=false; 
            
        if (jTextNomeMedico.getText().equals("")
                || jTextCRM.getText().equals("")
                || jTextEndereco.getText().equals("")
                || jTextEspecialidade.getText().equals("")
                || jFCPF.getText().trim().length() <9
                || jFTelefone.getText().trim().length() < 15) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Informação", JOptionPane.INFORMATION_MESSAGE);

        } else {
            for (int i = 0; i < linha; i++) {
                String crmTabela = (String) tabelaMedico.getValueAt(i, 4);
                String cpfTabela = (String) tabelaMedico.getValueAt(i, 1);
                if (crmTabela.equals(crm)) {
                    crmExiste = true;

                }
                if (cpfTabela.equals(cpf)) {
                    cpfExiste = true;

                }
            }
            if (crmExiste ) {
                JOptionPane.showMessageDialog(this, "O CRM digitado já existe, insira outro código!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                jTextCRM.setText("");
            }else if (cpfExiste ) {

                JOptionPane.showMessageDialog(this, "O CPF digitado já existe, insira outro código!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                jFCPF.setText("");
            }else{
                Medico medico = new Medico(jTextNomeMedico.getText(), jFCPF.getText(), jTextEndereco.getText(), jFTelefone.getText(), jTextCRM.getText(), jTextEspecialidade.getText());

                tabelaMedico.addRow(new String[]{medico.getNome(), medico.getCpf(), medico.getEndereco(), medico.getTelefone(), medico.getCrm(), medico.getEspecialidade()});
                jTextNomeMedico.setText("");
                jTextCRM.setText("");
                jTextEndereco.setText("");
                jFCPF.setText("");
                jFTelefone.setText("");
                jTextEspecialidade.setText("");
            }
        }

    }//GEN-LAST:event_jButtonAdcActionPerformed

    private void jTableMedicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicosMouseClicked
        int linha = jTableMedicos.getSelectedRow();
        jButtonAlt.setEnabled(true);
        jButtonRemov.setEnabled(true);
        jTextNomeMedico.setText((String) tabelaMedico.getValueAt(linha, 0));
        jFCPF.setText((String) tabelaMedico.getValueAt(linha, 1));
        jTextEndereco.setText((String) tabelaMedico.getValueAt(linha, 2));
        jFTelefone.setText((String) tabelaMedico.getValueAt(linha, 3));
        jTextCRM.setText((String) tabelaMedico.getValueAt(linha, 4));
        jTextEspecialidade.setText((String) tabelaMedico.getValueAt(linha, 5));

    }//GEN-LAST:event_jTableMedicosMouseClicked

    private void jButtonAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltActionPerformed
        int linha = jTableMedicos.getSelectedRow();
        String crm = jTextCRM.getText();
        String cpf = jFCPF.getText();
         boolean crmExiste=false,cpfExiste=false; 
        if (jTextNomeMedico.getText().equals("")
                || jTextCRM.getText().equals("")
                || jTextEndereco.getText().equals("")
                || jTextEspecialidade.getText().equals("")
                || jFCPF.getText().trim().length() < 9
                || jFTelefone.getText().trim().length() < 15) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Informação", JOptionPane.INFORMATION_MESSAGE);

        } else {
           for (int i = 0; i < tabelaMedico.getRowCount(); i++) {
               if (i != linha) {
                String crmTabela = (String) tabelaMedico.getValueAt(i, 4);
                String cpfTabela = (String) tabelaMedico.getValueAt(i, 1);
                if (crmTabela.equals(crm)) {
                    crmExiste = true;

                }
                if (cpfTabela.equals(cpf)) {
                    cpfExiste = true;

                }
              }
            }
            if (crmExiste ) {
                JOptionPane.showMessageDialog(this, "O CRM digitado já existe, insira outro código!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                jTextCRM.setText("");
            }else if (cpfExiste ) {
                JOptionPane.showMessageDialog(this, "O CPF digitado já existe, insira outro código!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                jFCPF.setText("");
            }else{
            jTableMedicos.setValueAt(jTextNomeMedico.getText(), linha, 0);
            jTableMedicos.setValueAt(jFCPF.getText(), linha, 1);
            jTableMedicos.setValueAt(jTextEndereco.getText(), linha, 2);
            jTableMedicos.setValueAt(jFTelefone.getText(), linha, 3);
            jTableMedicos.setValueAt(jTextCRM.getText(), linha, 4);
            jTableMedicos.setValueAt(jTextEspecialidade.getText(), linha, 5);
            jButtonRemov.setEnabled(false);
            jButtonAlt.setEnabled(false);
            jTextNomeMedico.setText("");
            jTextCRM.setText("");
            jTextEndereco.setText("");
            jFCPF.setText("");
            jFTelefone.setText("");
            jTextEspecialidade.setText("");

        }
       }
    }//GEN-LAST:event_jButtonAltActionPerformed

    private void jButtonRemovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovActionPerformed
        int linha;
        linha = jTableMedicos.getSelectedRow();
        if (jTableMedicos.getSelectedRow() >= 0) {
            tabelaMedico.removeRow(linha);
            jButtonRemov.setEnabled(false);
            jButtonAlt.setEnabled(false);
            jTextNomeMedico.setText("");
            jTextCRM.setText("");
            jTextEndereco.setText("");
            jFCPF.setText("");
            jFTelefone.setText("");
            jTextEspecialidade.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonRemovActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            this.lerMedicos();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao ler arquivo!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int i = 0, linha = jTableMedicos.getRowCount();
        if (linha == 0) {
            JOptionPane.showMessageDialog(this, "Não há médicos para salvar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                FileWriter arquivo = new FileWriter("Medicos.txt", false);
                PrintWriter arq = new PrintWriter(arquivo);
                do {
                    arq.println(tabelaMedico.getValueAt(i, 0) + ";" + tabelaMedico.getValueAt(i, 1) + ";" + tabelaMedico.getValueAt(i, 2)
                            + ";" + tabelaMedico.getValueAt(i, 3) + ";" + tabelaMedico.getValueAt(i, 4) + ";" + tabelaMedico.getValueAt(i, 5));
                    i++;

                } while (i != linha);

                arq.close();
                arquivo.close();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar!\nTente novamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_formWindowClosing

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroMedicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameCadastroMedicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdc;
    private javax.swing.JButton jButtonAlt;
    private javax.swing.JButton jButtonRemov;
    private javax.swing.JFormattedTextField jFCPF;
    private javax.swing.JFormattedTextField jFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMedicos;
    private javax.swing.JTextField jTextCRM;
    private javax.swing.JTextField jTextEndereco;
    private javax.swing.JTextField jTextEspecialidade;
    private javax.swing.JTextField jTextNomeMedico;
    // End of variables declaration//GEN-END:variables
}
