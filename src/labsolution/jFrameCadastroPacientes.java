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
public class jFrameCadastroPacientes extends javax.swing.JFrame {

    DefaultTableModel tabelaPacientes;

    public jFrameCadastroPacientes() {
        initComponents();
        tabelaPacientes = (DefaultTableModel) jTablePac.getModel();
    }

    private void lerMedicos() throws IOException {
        String paciente;
        try {
            FileReader arqLe = new FileReader("Pacientes.txt");
            BufferedReader br = new BufferedReader(arqLe);

            while ((paciente = br.readLine()) != null) {
                String campos[] = paciente.split(";");
                tabelaPacientes.addRow(campos);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Erro ao ler o arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextNomePac = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextEnderecoPac = new javax.swing.JTextField();
        jFCPFPac = new javax.swing.JFormattedTextField();
        jFTelefonePac = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextPlanodeSaude = new javax.swing.JTextField();
        jButtonAdc = new javax.swing.JButton();
        jButtonAlt = new javax.swing.JButton();
        jButtonRemov = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePac = new javax.swing.JTable();
        jFNascPac = new javax.swing.JFormattedTextField();
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

        jTextNomePac.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("CPF:");

        jLabel3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/paciente_1.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel5.setText("Endereço:");

        jTextEnderecoPac.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        try {
            jFCPFPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFCPFPac.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        try {
            jFTelefonePac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTelefonePac.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel6.setText("Data de Nascimento:");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel7.setText("Plano de Saúde:");

        jTextPlanodeSaude.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

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

        jTablePac.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTablePac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Endereço", "Telefone", "Data Nascimento", "Plano de Saúde"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePac);

        try {
            jFNascPac.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFNascPac.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel8.setText("Cadastro de Pacientes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonAdc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemov, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextEnderecoPac, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNomePac, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel5)
                                            .addComponent(jFCPFPac, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3)
                                            .addComponent(jFTelefonePac, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jFNascPac, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jTextPlanodeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNomePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFCPFPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTelefonePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextEnderecoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPlanodeSaude, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFNascPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdc)
                    .addComponent(jButtonAlt)
                    .addComponent(jButtonRemov))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdcActionPerformed
        String cpf = jFCPFPac.getText();
        int linha = tabelaPacientes.getRowCount();
        boolean cpfExiste = false;
        if (jTextNomePac.getText().equals("")
                || jTextPlanodeSaude.getText().equals("")
                || jTextEnderecoPac.getText().equals("")
                || jFCPFPac.getText().trim().length() == 9
                || jFTelefonePac.getText().trim().length() == 11
                || jFNascPac.getText().trim().length() == 4) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Informação", JOptionPane.INFORMATION_MESSAGE);

        } else {
            for (int i = 0; i < linha; i++) {
                String cpfTabela = (String) tabelaPacientes.getValueAt(i, 1);
            
                if (cpfTabela.equals(cpf)) {
                    cpfExiste = true;

                }
            }
            if (cpfExiste) {

                JOptionPane.showMessageDialog(this, "O CPF digitado já existe, insira outro código!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                jFCPFPac.setText("");
            }else {
                Paciente paciente = new Paciente(jTextNomePac.getText(), jFCPFPac.getText(), jTextEnderecoPac.getText(), jFTelefonePac.getText(), jFNascPac.getText(), jTextPlanodeSaude.getText());

                tabelaPacientes.addRow(new String[]{paciente.getNome(), paciente.getCpf(), paciente.getEndereco(), paciente.getTelefone(), paciente.getDataDeNascimento(), paciente.getPlanoDeSaude()});
                jTextNomePac.setText("");
                jTextPlanodeSaude.setText("");
                jTextEnderecoPac.setText("");
                jFCPFPac.setText("");
                jFTelefonePac.setText("");
                jFNascPac.setText("");
            }
        }

    }//GEN-LAST:event_jButtonAdcActionPerformed

    private void jTablePacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacMouseClicked
        int linha = jTablePac.getSelectedRow();
        jButtonAlt.setEnabled(true);
        jButtonRemov.setEnabled(true);
        jTextNomePac.setText((String) tabelaPacientes.getValueAt(linha, 0));
        jFCPFPac.setText((String) tabelaPacientes.getValueAt(linha, 1));
        jTextEnderecoPac.setText((String) tabelaPacientes.getValueAt(linha, 2));
        jFTelefonePac.setText((String) tabelaPacientes.getValueAt(linha, 3));
        jFNascPac.setText((String) tabelaPacientes.getValueAt(linha, 4));
        jTextPlanodeSaude.setText((String) tabelaPacientes.getValueAt(linha, 5));

    }//GEN-LAST:event_jTablePacMouseClicked

    private void jButtonAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltActionPerformed
        int linha = jTablePac.getSelectedRow();  
        String cpf = jFCPFPac.getText();
        boolean cpfExiste = false;
        
        if (jTextNomePac.getText().equals("")
                || jFNascPac.getText().equals("")
                || jTextEnderecoPac.getText().equals("")
                || jTextPlanodeSaude.getText().equals("")
                || jFCPFPac.getText().trim().length() < 9
                || jFTelefonePac.getText().trim().length() < 15) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Informação", JOptionPane.INFORMATION_MESSAGE);

        } else {
            for (int i = 0; i < tabelaPacientes.getRowCount(); i++) {
                if(i!=linha){
                String cpfTabela = (String) tabelaPacientes.getValueAt(i, 1);
            
                if (cpfTabela.equals(cpf)) {
                    cpfExiste = true;

                }
              }
            }
            if (cpfExiste) {

                JOptionPane.showMessageDialog(this, "O CPF digitado já existe, insira outro código!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                jFCPFPac.setText("");
            }else {
            jTablePac.setValueAt(jTextNomePac.getText(), linha, 0);
            jTablePac.setValueAt(jFCPFPac.getText(), linha, 1);
            jTablePac.setValueAt(jTextEnderecoPac.getText(), linha, 2);
            jTablePac.setValueAt(jFTelefonePac.getText(), linha, 3);
            jTablePac.setValueAt(jFNascPac.getText(), linha, 4);
            jTablePac.setValueAt(jTextPlanodeSaude.getText(), linha, 5);
            jButtonRemov.setEnabled(false);
            jButtonAlt.setEnabled(false);
            jTextNomePac.setText("");
            jFNascPac.setText("");
            jTextEnderecoPac.setText("");
            jFCPFPac.setText("");
            jFTelefonePac.setText("");
            jTextPlanodeSaude.setText("");
            }

        }
    }//GEN-LAST:event_jButtonAltActionPerformed

    private void jButtonRemovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovActionPerformed
        int linha;
        linha = jTablePac.getSelectedRow();
        if (jTablePac.getSelectedRow() >= 0) {
            tabelaPacientes.removeRow(linha);
            jButtonRemov.setEnabled(false);
            jButtonAlt.setEnabled(false);
            jTextNomePac.setText("");
            jFNascPac.setText("");
            jTextEnderecoPac.setText("");
            jFCPFPac.setText("");
            jFTelefonePac.setText("");
            jTextPlanodeSaude.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonRemovActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int i = 0, quant = jTablePac.getRowCount();
        if (quant == 0) {
            JOptionPane.showMessageDialog(this, "Não há pacientes para salvar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                FileWriter arquivo = new FileWriter("Pacientes.txt", false);
                PrintWriter arq = new PrintWriter(arquivo);
                do {
                    arq.println(tabelaPacientes.getValueAt(i, 0) + ";" + tabelaPacientes.getValueAt(i, 1) + ";" + tabelaPacientes.getValueAt(i, 2)
                            + ";" + tabelaPacientes.getValueAt(i, 3) + ";" + tabelaPacientes.getValueAt(i, 4) + ";" + tabelaPacientes.getValueAt(i, 5));
                    i++;

                } while (i != quant);

                arq.close();
                arquivo.close();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar!\nTente novamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            this.lerMedicos();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao ler arquivo!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(jFrameCadastroPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameCadastroPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdc;
    private javax.swing.JButton jButtonAlt;
    private javax.swing.JButton jButtonRemov;
    private javax.swing.JFormattedTextField jFCPFPac;
    private javax.swing.JFormattedTextField jFNascPac;
    private javax.swing.JFormattedTextField jFTelefonePac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePac;
    private javax.swing.JTextField jTextEnderecoPac;
    private javax.swing.JTextField jTextNomePac;
    private javax.swing.JTextField jTextPlanodeSaude;
    // End of variables declaration//GEN-END:variables
}
