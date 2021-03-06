/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.paineis;

import control.domain.*;
import static javax.swing.JOptionPane.showMessageDialog;
import model.domain.Encomenda;

/**
 *
 * @author Aline
 */
public class CadastroEncomendasView extends javax.swing.JPanel {

    /**
     * Creates new form CadastroEncomendasView
     */
    public CadastroEncomendasView(String permissao) {
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

        DestinatariojLabel = new javax.swing.JLabel();
        EnderecojLabel = new javax.swing.JLabel();
        DestinatariojTextField = new javax.swing.JTextField();
        EnderecojTextField = new javax.swing.JTextField();
        CodigoCorrespondenciajTextField = new javax.swing.JTextField();
        CodigoCorrespondenciajLabel = new javax.swing.JLabel();
        SalvarjButton = new javax.swing.JButton();
        EntreguejCheckBox = new javax.swing.JCheckBox();

        DestinatariojLabel.setText("Destinatário:");

        EnderecojLabel.setText("Endereço:");

        DestinatariojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DestinatariojTextFieldActionPerformed(evt);
            }
        });

        EnderecojTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnderecojTextFieldActionPerformed(evt);
            }
        });

        CodigoCorrespondenciajTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoCorrespondenciajTextFieldActionPerformed(evt);
            }
        });

        CodigoCorrespondenciajLabel.setText("Código correspondência:");

        SalvarjButton.setText("Salvar");
        SalvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarjButtonActionPerformed(evt);
            }
        });

        EntreguejCheckBox.setText("Entregue");
        EntreguejCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntreguejCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(SalvarjButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(EnderecojLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EnderecojTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DestinatariojLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DestinatariojTextField))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CodigoCorrespondenciajLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CodigoCorrespondenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EntreguejCheckBox)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DestinatariojLabel)
                    .addComponent(DestinatariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnderecojLabel)
                    .addComponent(EnderecojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoCorrespondenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodigoCorrespondenciajLabel))
                .addGap(18, 18, 18)
                .addComponent(EntreguejCheckBox)
                .addGap(7, 7, 7)
                .addComponent(SalvarjButton)
                .addContainerGap(125, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DestinatariojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DestinatariojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DestinatariojTextFieldActionPerformed

    private void EnderecojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnderecojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnderecojTextFieldActionPerformed

    private void CodigoCorrespondenciajTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoCorrespondenciajTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoCorrespondenciajTextFieldActionPerformed

    private void SalvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarjButtonActionPerformed
        Control control = ControlFactory.getEncomendaControl();
        
        Encomenda encomenda= new Encomenda();
        encomenda.setCodCorreio(this.CodigoCorrespondenciajTextField.getText());
        encomenda.setDestinatario(this.DestinatariojTextField.getText());
        encomenda.setEndereco(this.EnderecojTextField.getText());
        encomenda.setEntregue(this.EntreguejCheckBox.isSelected());
        control.salvar(encomenda);
        showMessageDialog(this, "Encomenda cadastrada com sucesso!");
        
    }//GEN-LAST:event_SalvarjButtonActionPerformed

    private void EntreguejCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntreguejCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntreguejCheckBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CodigoCorrespondenciajLabel;
    private javax.swing.JTextField CodigoCorrespondenciajTextField;
    private javax.swing.JLabel DestinatariojLabel;
    private javax.swing.JTextField DestinatariojTextField;
    private javax.swing.JLabel EnderecojLabel;
    private javax.swing.JTextField EnderecojTextField;
    private javax.swing.JCheckBox EntreguejCheckBox;
    private javax.swing.JButton SalvarjButton;
    // End of variables declaration//GEN-END:variables
}
