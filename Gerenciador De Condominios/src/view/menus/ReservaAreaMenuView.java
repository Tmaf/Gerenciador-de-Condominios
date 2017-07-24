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
public class ReservaAreaMenuView extends javax.swing.JPanel {

    /**
     * Creates new form ReservaAreaMenuView
     */
    public ReservaAreaMenuView(String permissao) {
        initComponents();
        if(permissao.equals("Sindico")){
            inserirArea.setVisible(false);
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

        ReservarAreajButton = new javax.swing.JButton();
        ConsultarReservajButton = new javax.swing.JButton();
        inserirArea = new javax.swing.JButton();

        ReservarAreajButton.setText("Reservar Área");
        ReservarAreajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReservarAreajButtonActionPerformed(evt);
            }
        });

        ConsultarReservajButton.setText("Consultar Reserva");
        ConsultarReservajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarReservajButtonActionPerformed(evt);
            }
        });

        inserirArea.setText("Inserir Área");
        inserirArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(ReservarAreajButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConsultarReservajButton)
                .addGap(18, 18, 18)
                .addComponent(inserirArea)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ReservarAreajButton)
                    .addComponent(ConsultarReservajButton)
                    .addComponent(inserirArea))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ReservarAreajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReservarAreajButtonActionPerformed
        Tela.atualizaTela("ReservarArea");
    }//GEN-LAST:event_ReservarAreajButtonActionPerformed

    private void ConsultarReservajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarReservajButtonActionPerformed
        Tela.atualizaTela("ConsultarReserva");

    }//GEN-LAST:event_ConsultarReservajButtonActionPerformed

    private void inserirAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inserirAreaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConsultarReservajButton;
    private javax.swing.JButton ReservarAreajButton;
    private javax.swing.JButton inserirArea;
    // End of variables declaration//GEN-END:variables
}
