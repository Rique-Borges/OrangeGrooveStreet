/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.ogs.view;
import com.ogs.connection.MySQL;
import com.ogs.object.Disco;
import com.ogs.object.Fornecedor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author regis
 */
public class CadastroProdutoFrame extends javax.swing.JFrame {

    MySQL connection = new MySQL();
    int currentId = 0;
    
    /**
     * Creates new form CadastroProdutoFrame
     */
    public CadastroProdutoFrame() {
        initComponents();
    }

    private void clearValues()
    {
        txtArtista.setText("");
        txtTitulo.setText("");
        txtGenero.setText("");
        cbxFornecedor.setSelectedIndex(0);
        btnAlterar.setEnabled(false);
        btnRemover.setEnabled(false);
        currentId = 0;
    }
    
    private void reloadTable()
    {   
        this.connection.conectaBanco();
        
        Disco disco = new Disco();
                
        DefaultTableModel dtm = (DefaultTableModel) tblDiscos.getModel();
     
        dtm.setRowCount(0);
        
        try {
            this.connection.executarSQL(
                "SELECT d.id, d.artista, d.titulo, d.genero, d.fornecedor, f.nome FROM Disco AS d INNER JOIN Fornecedor AS f ON d.fornecedor = f.id;"
            );
            
            while(this.connection.getResultSet().next()){
                disco.setId(this.connection.getResultSet().getInt(1));
                disco.setArtista(this.connection.getResultSet().getString(2));
                disco.setTitulo(this.connection.getResultSet().getString(3));
                disco.setGenero(this.connection.getResultSet().getString(4));
                disco.setFornecedor(this.connection.getResultSet().getInt(5));
                String fornecedorNome = this.connection.getResultSet().getString(6);
                
                String status = "";
                
                Object[] row = { disco.getId(), disco.getArtista(), disco.getTitulo(), disco.getGenero(), fornecedorNome };
                
                dtm.addRow(row);
           }
        } catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
        }
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
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtArtista = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        txtGenero = new javax.swing.JTextField();
        cbxFornecedor = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDiscos = new javax.swing.JTable();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Discos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("Titulo:");

        jLabel3.setText("Fornecedor:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel8.setText("Artista:");

        txtArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtArtistaActionPerformed(evt);
            }
        });

        jLabel9.setText("Genero:");

        jLabel1.setText("Cadastro de Discos:");

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

        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        cbxFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item pica", "item not pica" }));

        tblDiscos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Artista", "Titulo", "Genero", "Fornecedor"
            }
        ));
        tblDiscos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiscosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblDiscos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(320, 320, 320))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtArtista)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtGenero)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cbxFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArtista)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemover))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        this.connection.conectaBanco();
        
        Disco disco = new Disco();
        disco.setArtista((txtArtista.getText()));
        disco.setTitulo((txtTitulo.getText()));
        disco.setGenero((txtGenero.getText()));
        Fornecedor f = Fornecedor.class.cast(cbxFornecedor.getSelectedItem());
        disco.setFornecedor(f.getId());
        
        System.out.println(disco.getFornecedor());
        this.connection.insertSQL("INSERT INTO Disco(artista, titulo, genero, fornecedor) VALUES ("
                + "'" + disco.getArtista() + "',"
                + "'" + disco.getTitulo() + "',"
                + "'" + disco.getGenero() + "',"
                + disco.getFornecedor()
                + ")");
        
        reloadTable();
        clearValues();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tblWorkersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWorkersMouseClicked

    }//GEN-LAST:event_tblWorkersMouseClicked

    private void txtArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtArtistaActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        this.connection.conectaBanco();
        
        Disco disco = new Disco();
        disco.setArtista(txtArtista.getText());
        disco.setTitulo(txtTitulo.getText());
        disco.setGenero(txtGenero.getText());
        Fornecedor f = Fornecedor.class.cast(cbxFornecedor.getSelectedItem());
        disco.setFornecedor(f.getId());
        
        this.connection.insertSQL("UPDATE Disco SET "
                + "artista='" + disco.getArtista() + "',"
                + "titulo='" + disco.getTitulo() + "',"
                + "genero='" + disco.getGenero() + "',"
                + "fornecedor=" + disco.getFornecedor()
                + " WHERE "
                + "id=" + currentId
                + ";");
        
        reloadTable();
        clearValues();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        reloadTable();
        
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        
        try {
            this.connection.executarSQL(
                "SELECT id, nome FROM Fornecedor;"
            );
            
            while(this.connection.getResultSet().next()){
                Fornecedor fornecedor = new Fornecedor();
                fornecedor.setId(this.connection.getResultSet().getInt(1));
                fornecedor.setNome(this.connection.getResultSet().getString(2));
                model.addElement(fornecedor);
           }
           cbxFornecedor.setModel(model);
        } catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        EscolhaFrame fr = new EscolhaFrame();
        fr.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void tblDiscosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiscosMouseClicked
        JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        
        String s = source.getModel().getValueAt(row, 0)+"";
        
        Disco disco = new Disco();
        disco.setId(Integer.parseInt(s));
        
        Fornecedor fornecedor = new Fornecedor();
        
        try {
            this.connection.executarSQL(
                   "SELECT d.artista, d.titulo, d.genero, d.fornecedor, f.nome  FROM Disco AS d INNER JOIN Fornecedor AS f ON d.fornecedor = f.id"
                 + " WHERE "
                     + "d.id="
                     + disco.getId()
                 + ";"
            );
            
            while(this.connection.getResultSet().next()){
                disco.setArtista(this.connection.getResultSet().getString(1));
                disco.setTitulo(this.connection.getResultSet().getString(2));
                disco.setGenero(this.connection.getResultSet().getString(3));
                disco.setFornecedor(this.connection.getResultSet().getInt(4));
                fornecedor.setId(this.connection.getResultSet().getInt(4));
                fornecedor.setNome(this.connection.getResultSet().getString(5));
            }
        }
        catch (Exception e) {            
            System.out.println("Erro ao consultar cliente " +  e.getMessage());
        }
        finally {
            txtArtista.setText(disco.getArtista());
            txtTitulo.setText(disco.getTitulo());
            txtGenero.setText(disco.getGenero());
            cbxFornecedor.setSelectedIndex(fornecedor.getId() - 1);
            currentId = disco.getId();
            btnAlterar.setEnabled(true);
            btnRemover.setEnabled(true);
        }
    }//GEN-LAST:event_tblDiscosMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        this.connection.conectaBanco();
        int status = this.connection.insertSQL("DELETE FROM Disco WHERE "
                + "id=" + currentId + ";");
        if (status == -1)
            JOptionPane.showMessageDialog(null, "Disco não pode ser deletado pois há compras registradas com ele.");
        reloadTable();
        clearValues();
    }//GEN-LAST:event_btnRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProdutoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProdutoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JComboBox<String> cbxFornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblDiscos;
    private javax.swing.JTable tblWorkers;
    private javax.swing.JTextField txtArtista;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}