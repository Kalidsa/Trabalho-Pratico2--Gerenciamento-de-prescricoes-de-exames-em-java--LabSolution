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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class jFramePrescricaoMedica extends javax.swing.JFrame {

    DefaultTableModel tabelaPrescricao;
    ArrayList<Exame> listaExame = new ArrayList<>();
    Exame exame;
   private double valorTotal=0;
   

    public jFramePrescricaoMedica() {
        initComponents();
        tabelaPrescricao = (DefaultTableModel) jTablePrescri.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanelEndereco = new javax.swing.JPanel();
        jLabelRua = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jFdata = new javax.swing.JFormattedTextField();
        jComboPaciente = new javax.swing.JComboBox<>();
        jComboMedico = new javax.swing.JComboBox<>();
        jPanelEndereco1 = new javax.swing.JPanel();
        jLabelBairro1 = new javax.swing.JLabel();
        jComboExame = new javax.swing.JComboBox<>();
        jButtonAdc = new javax.swing.JButton();
        jButtonRemov = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelValorEx = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePrescri = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabelValTotal = new javax.swing.JLabel();
        jButtonPresc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/prescricao-medica.png"))); // NOI18N

        jPanelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Prescrição"));
        jPanelEndereco.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N

        jLabelRua.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabelRua.setText("Data:");

        jLabelBairro.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabelBairro.setText("Paciente:");

        jLabelCidade.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabelCidade.setText("Médico Solicitante:");

        try {
            jFdata.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFdata.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jComboPaciente.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        jComboMedico.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelEnderecoLayout = new javax.swing.GroupLayout(jPanelEndereco);
        jPanelEndereco.setLayout(jPanelEnderecoLayout);
        jPanelEnderecoLayout.setHorizontalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addComponent(jLabelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelBairro)
                            .addComponent(jLabelRua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFdata, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEnderecoLayout.setVerticalGroup(
            jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEnderecoLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRua)
                    .addComponent(jFdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(jComboPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jComboMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanelEndereco1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exames Prescritos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 14))); // NOI18N

        jLabelBairro1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabelBairro1.setText("Exame Solicitado:");

        jComboExame.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jComboExame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboExameActionPerformed(evt);
            }
        });

        jButtonAdc.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jButtonAdc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-adicionar-16.png"))); // NOI18N
        jButtonAdc.setText("Adicionar");
        jButtonAdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdcActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel1.setText("Valor Exame:");

        jLabelValorEx.setFont(new java.awt.Font("Calibri Light", 1, 12)); // NOI18N
        jLabelValorEx.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelValorEx.setEnabled(false);

        jTablePrescri.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTablePrescri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Exame", "Valor do Exame"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePrescri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePrescriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePrescri);

        javax.swing.GroupLayout jPanelEndereco1Layout = new javax.swing.GroupLayout(jPanelEndereco1);
        jPanelEndereco1.setLayout(jPanelEndereco1Layout);
        jPanelEndereco1Layout.setHorizontalGroup(
            jPanelEndereco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEndereco1Layout.createSequentialGroup()
                .addGroup(jPanelEndereco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEndereco1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButtonAdc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jButtonRemov, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEndereco1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabelBairro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboExame, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEndereco1Layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelValorEx, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanelEndereco1Layout.setVerticalGroup(
            jPanelEndereco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEndereco1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelEndereco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro1)
                    .addComponent(jComboExame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEndereco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabelValorEx, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanelEndereco1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdc)
                    .addComponent(jButtonRemov))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Valor Total:");

        jLabelValTotal.setFont(new java.awt.Font("Calibri Light", 1, 14)); // NOI18N
        jLabelValTotal.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelValTotal.setEnabled(false);

        jButtonPresc.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jButtonPresc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/salve-.png"))); // NOI18N
        jButtonPresc.setText("Finalizar Prescrição");
        jButtonPresc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrescActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(19, 19, 19))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabelValTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButtonPresc)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPanelEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jPanelEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonPresc)
                    .addComponent(jLabelValTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdcActionPerformed
       String valorExText = jLabelValorEx.getText().replaceAll(",", ".");
        double total = Double.parseDouble(valorExText);
        if (jFdata.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Informação", JOptionPane.INFORMATION_MESSAGE);

        } else {
                valorTotal += total;
            
            tabelaPrescricao.addRow(new String[]{jComboExame.getSelectedItem().toString(),jLabelValorEx.getText()});
            jLabelValTotal.setText(new DecimalFormat ("#,##0.00").format(valorTotal));
            //new DecimalFormat ("#.00").format(valorTotal)

        }

    }//GEN-LAST:event_jButtonAdcActionPerformed

    private void jTablePrescriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePrescriMouseClicked
        int linha = jTablePrescri.getSelectedRow();
      
        if (jTablePrescri.getSelectedRow() >= 0) {
            jButtonRemov.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jTablePrescriMouseClicked

    private void jButtonRemovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovActionPerformed
        String valorTotalExames = jLabelValTotal.getText().replaceAll(",", "."); // Remove a vírgula
        double total = Double.parseDouble(valorTotalExames);
        int linha = jTablePrescri.getSelectedRow();
        String valorExcluidoStr = (String) tabelaPrescricao.getValueAt(jTablePrescri.getSelectedRow(), 1);
        valorExcluidoStr = valorExcluidoStr.replaceAll(",", "."); // Remove a vírgula
        double valorExcluido = Double.parseDouble(valorExcluidoStr);
        if (jTablePrescri.getSelectedRow() >= 0) {
            tabelaPrescricao.removeRow(linha);
            valorTotal -= valorExcluido;
            jLabelValTotal.setText(new DecimalFormat ("#,##0.00").format(valorTotal));
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
         jButtonRemov.setEnabled(false);
    }//GEN-LAST:event_jButtonRemovActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        DefaultComboBoxModel<String> comboModelE = (DefaultComboBoxModel<String>) jComboExame.getModel();
        try {
            FileReader arq = new FileReader("Exames.txt");
            BufferedReader arqDados = new BufferedReader(arq);
            String line;
            String[] exameLista;
            do { //enquanto tiver linhas
                line = arqDados.readLine();
                if (line != null) {
                    exameLista = line.split(";");
                    String nome = exameLista[1];
                    double valorEx = Double.parseDouble(exameLista[4]);
                    exame = new Exame(nome, valorEx);
                    listaExame.add(exame);
                    comboModelE.addElement(exame.getDescricao());

                }

            } while (line != null);

            arq.close();
            arqDados.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível ler o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        DefaultComboBoxModel<String> comboModelP = (DefaultComboBoxModel<String>) jComboPaciente.getModel();
        try {
            FileReader arq2 = new FileReader("Pacientes.txt");
            BufferedReader arqDados2 = new BufferedReader(arq2);
            String line;
            String[] pacienteLista;
            do { //enquanto tiver linhas
                line = arqDados2.readLine();
                if (line != null) {
                    pacienteLista = line.split(";");
                    comboModelP.addElement(pacienteLista[0]);
                }

            } while (line != null);
            arq2.close();
            arqDados2.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível ler o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        DefaultComboBoxModel<String> comboModelM = (DefaultComboBoxModel<String>) jComboMedico.getModel();
        try {
            FileReader arq3 = new FileReader("Medicos.txt");
            BufferedReader arqDados3 = new BufferedReader(arq3);
            String line;
            String[] medicosLista;
            do { //enquanto tiver linhas
                line = arqDados3.readLine();
                if (line != null) {
                    medicosLista = line.split(";");
                    comboModelM.addElement(medicosLista[0]);
                }

            } while (line != null);
            arq3.close();
            arqDados3.close();

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível ler o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_formWindowOpened

    private void jButtonPrescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrescActionPerformed
        int i = 0, quant = jTablePrescri.getRowCount();
        
        if (quant == 0) {
            JOptionPane.showMessageDialog(this, "Não há exames para salvar na prescrição!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String nomePaciente = jComboPaciente.getSelectedItem().toString();
                String nomeMedico = jComboMedico.getSelectedItem().toString();
                
                Paciente paciente = new Paciente(nomePaciente);
                Medico medico = new Medico(nomeMedico);
                
                PrescricaoExames presc = new PrescricaoExames(jFdata.getText(), paciente, medico, valorTotal);
                FileWriter arquivo = new FileWriter("PrescricaoPaciente" + paciente.getNome()+ ".txt", false);
                PrintWriter arq = new PrintWriter(arquivo);
                arq.append("------------- Prescrição de Exames -------------\n");
                arq.append("Data: " + presc.getData()+"\n");
                arq.append("Paciente: " + paciente.getNome()+"\n");
                arq.append("Médico: " + medico.getNome()+"\n");
                arq.append("--- Exames Prescritos ---\n");

                do {
                   
                    arq.println("Exame: " + tabelaPrescricao.getValueAt(i, 0) + " " + tabelaPrescricao.getValueAt(i, 1)+"\n");
                    i++;

                } while (i != quant);
                arq.append("-------------\n");
                arq.append("Valor total do(s) exame(s): " + presc.getValorTotal()+"\n");

                arq.close();
                arquivo.close();
         JOptionPane.showMessageDialog(this, "Prescrição salva com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar!\nTente novamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonPrescActionPerformed

    private void jComboExameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboExameActionPerformed
        if (jComboExame.getSelectedIndex() >= 0) {
            Exame exameSelecionado = listaExame.get(jComboExame.getSelectedIndex());
            String valorExame = new DecimalFormat ("#,##0.00").format(exameSelecionado.getValor());

            jLabelValorEx.setText(String.valueOf(valorExame));

        }
    }//GEN-LAST:event_jComboExameActionPerformed

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
            java.util.logging.Logger.getLogger(jFramePrescricaoMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFramePrescricaoMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFramePrescricaoMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFramePrescricaoMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFramePrescricaoMedica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdc;
    private javax.swing.JButton jButtonPresc;
    private javax.swing.JButton jButtonRemov;
    private javax.swing.JComboBox<String> jComboExame;
    private javax.swing.JComboBox<String> jComboMedico;
    private javax.swing.JComboBox<String> jComboPaciente;
    private javax.swing.JFormattedTextField jFdata;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelBairro1;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelValTotal;
    private javax.swing.JLabel jLabelValorEx;
    private javax.swing.JPanel jPanelEndereco;
    private javax.swing.JPanel jPanelEndereco1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePrescri;
    // End of variables declaration//GEN-END:variables
}
