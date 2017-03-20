/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo
 */
public class Simples extends javax.swing.JInternalFrame {

    /**
     * Creates new form Simples
     */
        PreparedStatement pst = null;
        ResultSet rs = null;
        Connection conexao = null;
        conexao c = new conexao();
        
        
        
        
    public void data(){
         
        try {
            conexao = c.getConexao();
            String pegarid = "select id from cartas order by id desc";
            pst = conexao.prepareStatement(pegarid);
            
            String sql = "insert into cartas (remetente, destinatario, carta, data, CEP, situação) values ('"+this.txtde.getText()+"','"+this.txtpara.getText()+"', 'Simples', '"+this.txtdata.getText()+"', '"+this.txtcep.getText()+"', 'Enviado')";
            pst = conexao.prepareStatement(sql);
            
            if(this.txtpara.getText().isEmpty() || this.txtde.getText().isEmpty() || this.txtdata.getText().isEmpty() || this.txtcep.getText().isEmpty()){
                
            JOptionPane.showMessageDialog(null, "Preencher Todos os Campos");
                
                
            } else{
                
                pst.executeUpdate();
                rs = pst.executeQuery(pegarid);
                if(rs.next()){
                pegarid = rs.getString("id");
                JOptionPane.showMessageDialog(null, "Inclusão Realizada com sucesso, sua id é: "+pegarid);
                conexao.close();
                txtpara.setText(null);
                txtde.setText(null);
                txtdata.setText(null);
                txtcep.setText(null);
                 }
                
            
                
            }
            
            
            
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
    }
    
    public Simples() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtpara = new javax.swing.JTextField();
        lblde = new javax.swing.JLabel();
        txtde = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtdata = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcep = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Carta Simples");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Destinatário");

        txtpara.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblde.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        lblde.setForeground(new java.awt.Color(204, 0, 0));
        lblde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblde.setText("Remetente");

        txtde.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data");
        jLabel2.setToolTipText("dd/mm/aaa");

        txtdata.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CEP");
        jLabel3.setToolTipText("dd/mm/aaa");

        txtcep.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcep, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(txtpara, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtde, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdata)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblde)
                .addGap(18, 18, 18)
                .addComponent(txtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtpara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        data();
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtcepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblde;
    private javax.swing.JTextField txtcep;
    private javax.swing.JTextField txtdata;
    private javax.swing.JTextField txtde;
    private javax.swing.JTextField txtpara;
    // End of variables declaration//GEN-END:variables
}
