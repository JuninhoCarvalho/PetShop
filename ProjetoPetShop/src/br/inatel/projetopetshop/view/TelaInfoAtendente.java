/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetopetshop.view;

import br.inatel.projetopetshop.model.Atendente;
import br.inatel.projetopetshop.DAO.AtendenteDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Juninho
 */
public class TelaInfoAtendente extends javax.swing.JFrame {
    private static String senhaAt;
    private static String cpf;
    private static boolean sai;
    
    public TelaInfoAtendente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        labEndereco = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labTelefone = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTodos = new javax.swing.JButton();
        labNome = new javax.swing.JLabel();
        btnMarcarConsulta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnDesmarcar = new javax.swing.JButton();
        labCpf = new javax.swing.JLabel();
        btnExcluirConta = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        labEmail = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labSenha = new javax.swing.JLabel();
        mostrarSenha = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfAttEnd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfAttSenha = new javax.swing.JPasswordField();
        bntAtt = new javax.swing.JButton();
        btnCancelarAtt = new javax.swing.JButton();
        tfAttTel = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        tfSenhaAtual = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 153));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true), "Atendente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N

        labEndereco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labEndereco.setForeground(new java.awt.Color(0, 0, 0));
        labEndereco.setText("?");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Telefone:");

        labTelefone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labTelefone.setForeground(new java.awt.Color(0, 0, 0));
        labTelefone.setText("?");

        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nome:");

        btnTodos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTodos.setForeground(new java.awt.Color(0, 0, 0));
        btnTodos.setText("Mostrar Cadastros");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });

        labNome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labNome.setForeground(new java.awt.Color(0, 0, 0));
        labNome.setText("?");

        btnMarcarConsulta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMarcarConsulta.setForeground(new java.awt.Color(0, 0, 0));
        btnMarcarConsulta.setText("Marcar Consulta");
        btnMarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarConsultaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("CPF:");

        btnDesmarcar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDesmarcar.setForeground(new java.awt.Color(0, 0, 0));
        btnDesmarcar.setText("Desmarcar Consulta");
        btnDesmarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesmarcarActionPerformed(evt);
            }
        });

        labCpf.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labCpf.setForeground(new java.awt.Color(0, 0, 0));
        labCpf.setText("?");

        btnExcluirConta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExcluirConta.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluirConta.setText("Excluir Minha Conta");
        btnExcluirConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirContaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("E-mail:");

        labEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labEmail.setForeground(new java.awt.Color(0, 0, 0));
        labEmail.setText("?");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Endere??o:");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Senha:");

        labSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labSenha.setForeground(new java.awt.Color(0, 0, 0));
        labSenha.setText("?");

        mostrarSenha.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostrarSenha.setForeground(new java.awt.Color(0, 0, 0));
        mostrarSenha.setText("Mostrar");
        mostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDesmarcar, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(btnMarcarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnExcluirConta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                                .addComponent(btnSair))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labNome)
                    .addComponent(labCpf)
                    .addComponent(labEmail)
                    .addComponent(labEndereco)
                    .addComponent(labTelefone)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarSenha)))
                .addGap(0, 336, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(labCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(labEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(labEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(labTelefone))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labSenha)
                    .addComponent(mostrarSenha))
                .addGap(18, 18, 18)
                .addComponent(btnMarcarConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDesmarcar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTodos)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirConta)
                    .addComponent(btnSair))
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Informa????es", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 153), 2, true), "Atendente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Atualizar Endere??o:");

        tfAttEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAttEndActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Atualizar Telefone:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Atualizar Senha:");

        bntAtt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bntAtt.setForeground(new java.awt.Color(0, 0, 0));
        bntAtt.setText("Atualizar");
        bntAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAttActionPerformed(evt);
            }
        });

        btnCancelarAtt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCancelarAtt.setForeground(new java.awt.Color(0, 0, 0));
        btnCancelarAtt.setText("Limpar");
        btnCancelarAtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAttActionPerformed(evt);
            }
        });

        try {
            tfAttTel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Senha Atual:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfAttEnd)
                    .addComponent(tfAttSenha)
                    .addComponent(tfAttTel, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntAtt)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelarAtt))
                    .addComponent(tfSenhaAtual))
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfAttEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfAttTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfAttSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntAtt)
                    .addComponent(btnCancelarAtt))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Atualiza????es", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfAttEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAttEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAttEndActionPerformed

    private void bntAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAttActionPerformed
        atualizar();
    }//GEN-LAST:event_bntAttActionPerformed

    private void btnMarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarConsultaActionPerformed
        telaConsulta();
    }//GEN-LAST:event_btnMarcarConsultaActionPerformed

    private void btnDesmarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesmarcarActionPerformed
        desmarcarConsulta();
    }//GEN-LAST:event_btnDesmarcarActionPerformed

    private void btnCancelarAttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAttActionPerformed
        tfAttEnd.setText("");
        tfAttTel.setText("");
        tfAttSenha.setText("");
        tfSenhaAtual.setText("");
    }//GEN-LAST:event_btnCancelarAttActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        listarTodos();
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnExcluirContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirContaActionPerformed
        excluirConta();
    }//GEN-LAST:event_btnExcluirContaActionPerformed

    private void mostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarSenhaActionPerformed
        if(mostrarSenha.isSelected()){
            mostrarSenha.setText("Esconder");
            labSenha.setText(senhaAt);
        }else{
            mostrarSenha.setText("Mostrar");
            labSenha.setText("********");
        }
    }//GEN-LAST:event_mostrarSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInfoAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInfoAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInfoAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInfoAtendente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInfoAtendente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAtt;
    private javax.swing.JButton btnCancelarAtt;
    private javax.swing.JButton btnDesmarcar;
    private javax.swing.JButton btnExcluirConta;
    private javax.swing.JButton btnMarcarConsulta;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnTodos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labCpf;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labEndereco;
    private javax.swing.JLabel labNome;
    private javax.swing.JLabel labSenha;
    private javax.swing.JLabel labTelefone;
    private javax.swing.JCheckBox mostrarSenha;
    private javax.swing.JTextField tfAttEnd;
    private javax.swing.JPasswordField tfAttSenha;
    private javax.swing.JFormattedTextField tfAttTel;
    private javax.swing.JPasswordField tfSenhaAtual;
    // End of variables declaration//GEN-END:variables
    
    protected void passagem(String cpf){
        
        AtendenteDAO atDao = new AtendenteDAO();
        Atendente at = atDao.buscarAtendentePorCpf(cpf);
        
        labNome.setText(at.getNome());
        labCpf.setText(at.getCpf());
        labEmail.setText(at.getEmail());
        labEndereco.setText(at.getEndereco());
        labTelefone.setText(at.getTelefone());
        labSenha.setText("********");
        senhaAt = at.getSenha();
        this.cpf = cpf;
    }

    private void sair(){
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
    }

    private void listarTodos(){
        TelaInfoTodos t = new TelaInfoTodos();
        t.passagem("Atendente", cpf);
        t.setVisible(true);
        this.dispose();
    }

    private void telaConsulta(){
        TelaMarcarConsulta t = new TelaMarcarConsulta();
        TelaMarcarConsulta.setCpfAtendente(labCpf.getText());
        t.setVisible(true);
        this.dispose();
    }

    private void desmarcarConsulta(){
        TelaDesmarcarConsulta t = new TelaDesmarcarConsulta();
        t.passagemSenha(senhaAt, cpf);
        t.setVisible(true);
        this.dispose();
    }

    private void excluirConta(){
        TelaExcluirConta t = new TelaExcluirConta();
        t.passagemExcluir("Atendente");
        t.passagemAtendente(senhaAt, labCpf.getText());
        t.setVisible(true);
        this.dispose();
    }

    private void attEndereco() {
        AtendenteDAO atDao = new AtendenteDAO();
        atDao.atualizarEndereco(labCpf.getText(), tfAttEnd.getText());
    }

    private void attTelefone() {
        AtendenteDAO atDao = new AtendenteDAO();
        atDao.atualizarTelefone(labCpf.getText(), tfAttTel.getText());
    }

    private void attSenha() {
        AtendenteDAO atDao = new AtendenteDAO();
        atDao.atualizarSenha(labCpf.getText(), tfAttSenha.getText());
    }

    private void atualizar() {
        if(!(tfSenhaAtual.getText().equals(senhaAt))){
            JOptionPane.showMessageDialog(rootPane, "Senha Atual Incorreta!");
        }else if("".equals(tfAttEnd.getText()) && ("(  )     -    ".equals(tfAttTel.getText())) && ("".equals(tfAttSenha.getText()))){
            JOptionPane.showMessageDialog(rootPane, "Insira alguma atualiza????o!");
        }else{
            if(!("".equals(tfAttEnd.getText())))
                attEndereco();
            if(!("(  )     -    ".equals(tfAttTel.getText())))
                attTelefone();
            if(!("".equals(tfAttSenha.getText())))
                attSenha();
            sair();
        }    
    }
    
}
