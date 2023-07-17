/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package labsolution;

import javax.swing.JOptionPane;

/**
 *
 * @author Visitante1
 */
public class jFrameTelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jFrameTelaPrincipal
     */
    public jFrameTelaPrincipal() {
        initComponents();
    }
    void infoSistema(){
        JOptionPane.showMessageDialog(this, "Trabalho Final da cadeira de Programação Comercial 1!", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        jButtonMedic = new javax.swing.JButton();
        jButtonPac = new javax.swing.JButton();
        jButtonEx = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonPresc = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabeluser = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemMedic = new javax.swing.JMenuItem();
        jMenuItemPac = new javax.swing.JMenuItem();
        jMenuItemEx = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemPresc = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButtonMedic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-médico-32.png"))); // NOI18N
        jButtonMedic.setToolTipText("Cadastro Médicos");
        jButtonMedic.setFocusable(false);
        jButtonMedic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonMedic.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMedicActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonMedic);

        jButtonPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-paciente-32.png"))); // NOI18N
        jButtonPac.setToolTipText("Cadastro Clientes");
        jButtonPac.setFocusable(false);
        jButtonPac.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPac.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPacActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonPac);

        jButtonEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-laboratório-32.png"))); // NOI18N
        jButtonEx.setToolTipText("Cadastro Exames");
        jButtonEx.setFocusable(false);
        jButtonEx.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEx.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonEx);
        jToolBar1.add(jSeparator1);

        jButtonPresc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-prescrição-32.png"))); // NOI18N
        jButtonPresc.setToolTipText("Prescrição Médica");
        jButtonPresc.setFocusable(false);
        jButtonPresc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonPresc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonPresc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrescActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonPresc);
        jToolBar1.add(jSeparator2);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-x-32.png"))); // NOI18N
        jButtonSair.setToolTipText("Sair");
        jButtonSair.setFocusable(false);
        jButtonSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jToolBar1.add(jButtonSair);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jLabel1.setText("Usuário:");

        jLabeluser.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jMenu2.setMnemonic('C');
        jMenu2.setText("Cadastros");
        jMenu2.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jMenuItemMedic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemMedic.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jMenuItemMedic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-médico-32.png"))); // NOI18N
        jMenuItemMedic.setText("Médicos");
        jMenuItemMedic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMedicActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemMedic);

        jMenuItemPac.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemPac.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jMenuItemPac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-paciente-32.png"))); // NOI18N
        jMenuItemPac.setText("Pacientes");
        jMenuItemPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPacActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemPac);

        jMenuItemEx.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemEx.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jMenuItemEx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-laboratório-32.png"))); // NOI18N
        jMenuItemEx.setText("Exames");
        jMenuItemEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemExActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemEx);

        jMenuBar1.add(jMenu2);

        jMenu3.setMnemonic('P');
        jMenu3.setText("Prescrição");
        jMenu3.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jMenuItemPresc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemPresc.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jMenuItemPresc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-prescrição-32.png"))); // NOI18N
        jMenuItemPresc.setText("Prescrição de Exames");
        jMenu3.add(jMenuItemPresc);

        jMenuBar1.add(jMenu3);

        jMenu4.setMnemonic('S');
        jMenu4.setText("Sobre");
        jMenu4.setToolTipText("");
        jMenu4.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N

        jMenuItemSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItemSobre.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jMenuItemSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-sobre-32.png"))); // NOI18N
        jMenuItemSobre.setText("Infos do Sistema");
        jMenuItemSobre.setToolTipText("");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItemSobre);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabeluser)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabeluser))
                .addGap(0, 406, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPacActionPerformed
        jFrameCadastroPacientes formcadPaciente = new jFrameCadastroPacientes();
        formcadPaciente.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemPacActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jMenuItemMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMedicActionPerformed
        jFrameCadastroMedicos formcadMedicos = new jFrameCadastroMedicos();
        formcadMedicos.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemMedicActionPerformed

    private void jButtonMedicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMedicActionPerformed
        jFrameCadastroMedicos formcadMedicos = new jFrameCadastroMedicos();
        formcadMedicos.setVisible(true);
        
    }//GEN-LAST:event_jButtonMedicActionPerformed

    private void jMenuItemExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemExActionPerformed
        jFrameCadastroExames formcadExames = new jFrameCadastroExames();
        formcadExames.setVisible(true);
        
    }//GEN-LAST:event_jMenuItemExActionPerformed

    private void jButtonPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPacActionPerformed
        jFrameCadastroPacientes formcadPaciente = new jFrameCadastroPacientes();
        formcadPaciente.setVisible(true);
        
    }//GEN-LAST:event_jButtonPacActionPerformed

    private void jButtonExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExActionPerformed
        jFrameCadastroExames formcadExames = new jFrameCadastroExames();
        formcadExames.setVisible(true);
        
    }//GEN-LAST:event_jButtonExActionPerformed

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed
       infoSistema();
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jButtonPrescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrescActionPerformed
         jFramePrescricaoMedica prescricao = new jFramePrescricaoMedica();
        prescricao.setVisible(true);
        
    }//GEN-LAST:event_jButtonPrescActionPerformed

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
            java.util.logging.Logger.getLogger(jFrameTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEx;
    private javax.swing.JButton jButtonMedic;
    private javax.swing.JButton jButtonPac;
    private javax.swing.JButton jButtonPresc;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabeluser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemEx;
    private javax.swing.JMenuItem jMenuItemMedic;
    private javax.swing.JMenuItem jMenuItemPac;
    private javax.swing.JMenuItem jMenuItemPresc;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
