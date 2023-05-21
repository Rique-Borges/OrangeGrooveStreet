/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ogs.view;

import com.ogs.connection.MySQL;
import com.ogs.object.Funcionario;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aluno
 */
public class Workers extends javax.swing.JFrame {

    MySQL connection = new MySQL();
    int currentRf = 0;
    
    /**
     * Creates new form Workers
     */
    public Workers() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkers = new javax.swing.JTable();
        txtNome = new javax.swing.JTextField();
        txtCargo = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxStatus = new javax.swing.JComboBox<>();
        txtCPF = new javax.swing.JFormattedTextField();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblWorkers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Cargo", "CPF", "RF", "Status"
            }
        ));
        tblWorkers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWorkersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblWorkers);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Cargo");

        jLabel3.setText("CPF");

        jLabel4.setText("Status");

        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Afastado", "Desligado" }));

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.setEnabled(false);
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 129, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCargo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbxStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCPF)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(5, 5, 5)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemover)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearValues()
    {
        txtNome.setText("");
        txtCargo.setText("");
        txtCPF.setText("");
        cbxStatus.setSelectedIndex(0);
        btnAlterar.setEnabled(false);
        btnRemover.setEnabled(false);
        currentRf = 0;
    }
    
    private void reloadTable()
    {   
        this.connection.conectaBanco();
        
        Funcionario funcionario = new Funcionario();
                
        DefaultTableModel dtm = (DefaultTableModel) tblWorkers.getModel();
     
        dtm.setRowCount(0);
        
        try {
            this.connection.executarSQL(
                   "SELECT "
                    + "nome,"                    
                    + "cargo,"
                    + "cpf,"
                    + "rf,"
                    + "stat"
                 + " FROM "
                     + "Funcionario"
                 + ";"
            );
            
            while(this.connection.getResultSet().next()){
                funcionario.setNome(this.connection.getResultSet().getString(1));
                funcionario.setCargo(this.connection.getResultSet().getString(2));
                funcionario.setCpf(this.connection.getResultSet().getString(3));
                funcionario.setRf(this.connection.getResultSet().getInt(4));
                funcionario.setStat(this.connection.getResultSet().getInt(5));
                
                String status = "";
                
                switch (funcionario.getStat())
                {
                    case 0:
                        status = "Ativo";
                        break;
                    case 1:
                        status = "Afastado";
                        break;
                    case 2:
                        status = "Desligado";
                        break;
                }
                
                Object[] row = { funcionario.getNome(), funcionario.getCargo(), funcionario.getCpf(), funcionario.getRf(), status };
                
                dtm.addRow(row);
           }
        } catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
        }
    }
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        this.connection.conectaBanco();
        
        String cpf = txtCPF.getText();
        if(cpf != null) cpf = cpf.replaceAll("\\.|-","");
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(txtNome.getText());
        funcionario.setCargo(txtCargo.getText());
        funcionario.setCpf(cpf);
        funcionario.setStat(cbxStatus.getSelectedIndex());
        
        this.connection.insertSQL("INSERT INTO Funcionario(nome, cargo, cpf, stat) VALUES ("
                + "'" + funcionario.getNome() + "',"
                + "'" + funcionario.getCargo() + "',"
                + "'" + funcionario.getCpf() + "',"
                + funcionario.getStat()
                + ")");
        
        reloadTable();
        clearValues();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        reloadTable();
    }//GEN-LAST:event_formWindowOpened

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        this.connection.conectaBanco();
        
        String cpf = txtCPF.getText();
        if(cpf != null) cpf = cpf.replaceAll("\\.|-","");
        
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(txtNome.getText());
        funcionario.setCargo(txtCargo.getText());
        funcionario.setCpf(cpf);
        funcionario.setStat(cbxStatus.getSelectedIndex());
        
        this.connection.insertSQL("UPDATE Funcionario SET "
                + "nome='" + funcionario.getNome() + "',"
                + "cargo='" + funcionario.getCargo() + "',"
                + "cpf='" + funcionario.getCpf() + "',"
                + "stat=" + funcionario.getStat()
                + " WHERE "
                + "rf=" + currentRf
                + ";");
        
        reloadTable();
        clearValues();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        this.connection.conectaBanco();
        this.connection.insertSQL("DELETE FROM Funcionario WHERE "
                + "rf=" + currentRf + ";");
        
        reloadTable();
        clearValues();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void tblWorkersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWorkersMouseClicked
        JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        
        String s = source.getModel().getValueAt(row, 3)+"";
        
        Funcionario funcionario = new Funcionario();
        funcionario.setRf(Integer.parseInt(s));
        
        try {
            this.connection.executarSQL(
                   "SELECT "
                    + "nome,"                    
                    + "cargo,"
                    + "cpf,"
                    + "stat"
                 + " FROM "
                     + "Funcionario"
                 + " WHERE "
                     + "rf="
                     + funcionario.getRf()
                 + ";"
            );
            
            while(this.connection.getResultSet().next()){
                funcionario.setNome(this.connection.getResultSet().getString(1));
                funcionario.setCargo(this.connection.getResultSet().getString(2));
                funcionario.setCpf(this.connection.getResultSet().getString(3));
                funcionario.setStat(this.connection.getResultSet().getInt(4));
            }
        }
        catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
        }
        finally {
            txtNome.setText(funcionario.getNome());
            txtCargo.setText(funcionario.getCargo());
            txtCPF.setText(funcionario.getCpf());
            cbxStatus.setSelectedIndex(funcionario.getStat());
            currentRf = funcionario.getRf();
            btnAlterar.setEnabled(true);
            btnRemover.setEnabled(true);
        }
    }//GEN-LAST:event_tblWorkersMouseClicked

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
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Workers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Workers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cbxStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkers;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}