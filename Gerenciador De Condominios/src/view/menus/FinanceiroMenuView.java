/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.menus;

import control.View.Tela;

/**
 *
 * @author Aline
 */
public class FinanceiroMenuView extends javax.swing.JPanel {

    /**
     * Creates new form FinanceiroMenuView
     */
    public FinanceiroMenuView(String permissao) {
        initComponents();
        
        if(permissao.equals("Porteiro") || permissao.equals("Morador") || permissao.equals("MoradorMestre")){
            this.IncluirLancamentojButton.setVisible(false);
            this.ConsultarFinanceirojButton.setVisible(false);
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

        IncluirLancamentojButton = new javax.swing.JButton();
        ConsultarFinanceirojButton = new javax.swing.JButton();

        IncluirLancamentojButton.setText("Incluir Lançamento");
        IncluirLancamentojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncluirLancamentojButtonActionPerformed(evt);
            }
        });

        ConsultarFinanceirojButton.setText("Consultar Financeiro");
        ConsultarFinanceirojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarFinanceirojButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(IncluirLancamentojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ConsultarFinanceirojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IncluirLancamentojButton)
                    .addComponent(ConsultarFinanceirojButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void IncluirLancamentojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncluirLancamentojButtonActionPerformed
         Tela.atualizaTela("IncluirFinanceiro");
    }//GEN-LAST:event_IncluirLancamentojButtonActionPerformed

    private void ConsultarFinanceirojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarFinanceirojButtonActionPerformed
         Tela.atualizaTela("ConsultarFinanceiro");
    }//GEN-LAST:event_ConsultarFinanceirojButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarFinanceirojButton;
    private javax.swing.JButton IncluirLancamentojButton;
    // End of variables declaration//GEN-END:variables
}
