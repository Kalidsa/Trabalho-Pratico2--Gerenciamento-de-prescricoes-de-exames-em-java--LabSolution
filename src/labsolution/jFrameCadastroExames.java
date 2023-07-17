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
public class jFrameCadastroExames extends javax.swing.JFrame {

    DefaultTableModel tabelaExames;
    boolean codigoExiste = false;

    public jFrameCadastroExames() {
        initComponents();
        tabelaExames = (DefaultTableModel) jTableExames.getModel();
    }

    private void lerExames() throws IOException {
        String exame;
        try {
            FileReader arqLe = new FileReader("Exames.txt");
            BufferedReader br = new BufferedReader(arqLe);

            while ((exame = br.readLine()) != null) {
                String campos[] = exame.split(";");
                tabelaExames.addRow(campos);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Erro ao ler o arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextHorasJejum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextValorEx = new javax.swing.JTextField();
        jButtonAdc = new javax.swing.JButton();
        jButtonAlt = new javax.swing.JButton();
        jButtonRemov = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableExames = new javax.swing.JTable();
        jTextDesc = new javax.swing.JTextField();
        jComboBoxColeta = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

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
        jLabel1.setText("Código:");

        jTextCodigo.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel2.setText("Descrição:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teste-de-sangue.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel5.setText("Horas de jejum:");

        jTextHorasJejum.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel6.setText("Valor do Exame:");

        jLabel7.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        jLabel7.setText("Material de Coleta:");

        jTextValorEx.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N

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

        jTableExames.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jTableExames.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Material de Coleta", "Horas de Jejum", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableExames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableExamesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableExames);

        jTextDesc.setFont(new java.awt.Font("Calibri Light", 0, 12)); // NOI18N

        jComboBoxColeta.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jComboBoxColeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sangue", "Fezes", "Urina", "" }));
        jComboBoxColeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxColetaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri Light", 1, 36)); // NOI18N
        jLabel3.setText("Cadastro de Exames");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdc, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemov, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxColeta, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addComponent(jTextValorEx)
                        .addGap(134, 134, 134))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextDesc)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextHorasJejum, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(191, 191, 191)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextHorasJejum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxColeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jTextValorEx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdc)
                    .addComponent(jButtonAlt)
                    .addComponent(jButtonRemov))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdcActionPerformed
        int linha = tabelaExames.getRowCount();
        String codigo = jTextCodigo.getText();
        
        if (jTextCodigo.getText().equals("")
                || jTextValorEx.getText().equals("")
                || jTextHorasJejum.getText().equals("")
                || jTextDesc.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Informação", JOptionPane.INFORMATION_MESSAGE);

        } else {
               for (int i = 0; i <linha; i++){
                String codigoTabela = (String) tabelaExames.getValueAt(i, 0);
                if (codigoTabela.equals(codigo)) {
                    codigoExiste = true;
                }else{
                    codigoExiste = false;
                }
               
            }
            if (codigoExiste) {
                JOptionPane.showMessageDialog(this, "O código digitado já existe, insira outro código!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                jTextCodigo.setText("");
            }else {
                double ValExame = Double.parseDouble(jTextValorEx.getText());
                String ValorExame = String.valueOf(ValExame);
                Exame exame = new Exame(jTextCodigo.getText(), jTextDesc.getText(), jComboBoxColeta.getSelectedItem().toString(), jTextHorasJejum.getText(), ValExame);
                tabelaExames.addRow(new String[]{exame.getCodigo(), exame.getDescricao(), exame.getMaterialColeta(), exame.getHorasJejum(), ValorExame});
                jTextCodigo.setText("");
                jTextValorEx.setText("");
                jTextHorasJejum.setText("");
                jTextDesc.setText("");
            }

        }

    }//GEN-LAST:event_jButtonAdcActionPerformed

    private void jTableExamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableExamesMouseClicked
        int linha = jTableExames.getSelectedRow();
        jButtonAlt.setEnabled(true);
        jButtonRemov.setEnabled(true);
        jTextCodigo.setText((String) tabelaExames.getValueAt(linha, 0));
        jTextDesc.setText((String) tabelaExames.getValueAt(linha, 1));
        jTextHorasJejum.setText((String) tabelaExames.getValueAt(linha, 3));
        jComboBoxColeta.setSelectedItem((String) tabelaExames.getValueAt(linha, 2));
        jTextValorEx.setText((String) tabelaExames.getValueAt(linha, 4));


    }//GEN-LAST:event_jTableExamesMouseClicked

    private void jButtonAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltActionPerformed
        int linha = jTableExames.getSelectedRow();
        String codigo = jTextCodigo.getText();
        if (jTextCodigo.getText().equals("")
                || jTextValorEx.getText().equals("")
                || jTextHorasJejum.getText().equals("")
                || jTextDesc.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Informação", JOptionPane.INFORMATION_MESSAGE);

        } else {
             for (int i = 0; i < tabelaExames.getRowCount(); i++) {
               if (i != linha) {
                String codigoTabela = (String) tabelaExames.getValueAt(i, 0);
                if (codigoTabela.equals(codigo)) {
                    codigoExiste = true;
                }else{
                    codigoExiste=false;
                }
                
               }
            }
            if (codigoExiste) {
                JOptionPane.showMessageDialog(this, "O código digitado já existe, insira outro código!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                jTextCodigo.setText("");
            }else{
            jTableExames.setValueAt(jTextCodigo.getText(), linha, 0);
            jTableExames.setValueAt(jTextDesc.getText(), linha, 1);
            jTableExames.setValueAt(jComboBoxColeta.getSelectedItem(), linha, 2);
            jTableExames.setValueAt(jTextHorasJejum.getText(), linha, 3);
            jTableExames.setValueAt(jTextValorEx.getText(), linha, 4);
            jButtonRemov.setEnabled(false);
            jButtonAlt.setEnabled(false);
            jTextCodigo.setText("");
            jTextValorEx.setText("");
            jTextHorasJejum.setText("");
            jTextDesc.setText("");
            }
           

        }
    }//GEN-LAST:event_jButtonAltActionPerformed

    private void jButtonRemovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovActionPerformed
        int linha;
        linha = jTableExames.getSelectedRow();
        if (jTableExames.getSelectedRow() >= 0) {
            tabelaExames.removeRow(linha);
            jButtonRemov.setEnabled(false);
            jButtonAlt.setEnabled(false);
            jTextCodigo.setText("");
            jTextValorEx.setText("");
            jTextHorasJejum.setText("");
            jTextDesc.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButtonRemovActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int i = 0, quant = jTableExames.getRowCount();
        if (quant == 0) {
            JOptionPane.showMessageDialog(this, "Não há exames para salvar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                FileWriter arquivo = new FileWriter("Exames.txt", false);
                PrintWriter arq = new PrintWriter(arquivo);
                do {
                    arq.println(tabelaExames.getValueAt(i, 0) + ";" + tabelaExames.getValueAt(i, 1) + ";" + tabelaExames.getValueAt(i, 2)
                            + ";" + tabelaExames.getValueAt(i, 3) + ";" + tabelaExames.getValueAt(i, 4));
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
            this.lerExames();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao ler arquivo!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jComboBoxColetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxColetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxColetaActionPerformed

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
            java.util.logging.Logger.getLogger(jFrameCadastroExames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroExames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroExames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastroExames.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameCadastroExames().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdc;
    private javax.swing.JButton jButtonAlt;
    private javax.swing.JButton jButtonRemov;
    private javax.swing.JComboBox<String> jComboBoxColeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableExames;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextDesc;
    private javax.swing.JTextField jTextHorasJejum;
    private javax.swing.JTextField jTextValorEx;
    // End of variables declaration//GEN-END:variables
}
