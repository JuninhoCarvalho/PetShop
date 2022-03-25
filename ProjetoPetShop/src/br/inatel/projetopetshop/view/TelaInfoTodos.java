/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projetopetshop.view;
import br.inatel.projetopetshop.DAO.AtendenteDAO;
import br.inatel.projetopetshop.DAO.AuxiliarDAO;
import br.inatel.projetopetshop.DAO.DonoAnimalDAO;
import br.inatel.projetopetshop.DAO.VeterinarioDAO;
import br.inatel.projetopetshop.model.Atendente;
import br.inatel.projetopetshop.model.Auxiliar;
import br.inatel.projetopetshop.model.DonoAnimal;
import br.inatel.projetopetshop.model.Veterinario;
import java.util.ArrayList;

/**
 *
 * @author Juninho
 */
public class TelaInfoTodos extends javax.swing.JFrame {
    
    private static String cpf;
    private static String func;

    /**
     * Creates new form TelaInfoTodos
     */
    public TelaInfoTodos() {
        initComponents();
        listarAtendente();
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAtendente = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        listAuxiliar = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        listVeterinario = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        listCliente = new javax.swing.JList<>();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 204), 2, true), "Cadastros PetShop", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(0, 153, 153))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        listAtendente.setBackground(new java.awt.Color(255, 255, 255));
        listAtendente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atendente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        listAtendente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listAtendente.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(listAtendente);

        listAuxiliar.setBackground(new java.awt.Color(255, 255, 255));
        listAuxiliar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Auxiliar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        listAuxiliar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listAuxiliar.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(listAuxiliar);

        listVeterinario.setBackground(new java.awt.Color(255, 255, 255));
        listVeterinario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Veterinário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        listVeterinario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listVeterinario.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(listVeterinario);

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));

        listCliente.setBackground(new java.awt.Color(255, 255, 255));
        listCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 102, 102))); // NOI18N
        listCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        listCliente.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(listCliente);

        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(0, 0, 0));
        btnSair.setText("Voltar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        sair();
    }//GEN-LAST:event_btnSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInfoTodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInfoTodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInfoTodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInfoTodos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInfoTodos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> listAtendente;
    private javax.swing.JList<String> listAuxiliar;
    private javax.swing.JList<String> listCliente;
    private javax.swing.JList<String> listVeterinario;
    // End of variables declaration//GEN-END:variables

    public void passagem(String func, String cpf){
        this.func = func;
        this.cpf = cpf;
    }
    
    private void sair() {
       if(func.equals("Atendente")){
            TelaInfoAtendente t = new TelaInfoAtendente();
            t.passagem(cpf);
            t.setVisible(true);
            this.dispose();
       }else if(func.equals("Veterinario")){
            TelaInfoVeterinario t = new TelaInfoVeterinario();
            t.passagem(cpf);
            t.setVisible(true);
            this.dispose();
       }
    }

    private void listarAtendente() {
        AtendenteDAO atDao = new AtendenteDAO();
        ArrayList<Atendente> listaAtendentes = atDao.buscaAtendentes();
        
        String[] nomes = new String[listaAtendentes.size()];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = listaAtendentes.get(i).getNome();
        }
        listarAuxiliar();
        listAtendente.setListData(nomes);
    }

    private void listarAuxiliar() {
        AuxiliarDAO auxDao = new AuxiliarDAO();
        ArrayList<Auxiliar> listaAuxiliares = auxDao.buscaAuxiliares();
        
        String[] nomes = new String[listaAuxiliares.size()];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = listaAuxiliares.get(i).getNome();
        }
        listarClientes();
        listAuxiliar.setListData(nomes);
    }

    private void listarClientes() {
        DonoAnimalDAO donoDao = new DonoAnimalDAO();
        ArrayList<DonoAnimal> listaClientes = donoDao.buscaClientes();
        
        String[] nomes = new String[listaClientes.size()];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = listaClientes.get(i).getNome();
        }
        listarVeterinarios();
        listCliente.setListData(nomes);
    }

    private void listarVeterinarios() {
        VeterinarioDAO vetDao = new VeterinarioDAO();
        ArrayList<Veterinario> listaVets = vetDao.buscaVeterinarios();
        
        String[] nomes = new String[listaVets.size()];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = listaVets.get(i).getNome();
        }
        
        listVeterinario.setListData(nomes);
    }
}
