/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.View.Tela;
import java.awt.Color;
import javax.swing.BorderFactory;

/**
 *
 * @author Aline
 */
public class MenuPrincipal extends javax.swing.JPanel {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal(String t) {
        initComponents();

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        if(t.equals("Porteiro")){
            this.financeiroMenuButton.setVisible(false);
            this.moradoresMenuButton.setVisible(false);
            this.reservasMenuButton.setVisible(false);
            this.funcionarioMenuButton.setVisible(false);
        }else if(t.equals("Morador")){
            this.moradoresMenuButton.setVisible(false);
            this.financeiroMenuButton.setVisible(false);
            this.entradaSaidaMenuButton.setVisible(false);
            this.encomendasMenuButton.setVisible(false);
            this.funcionarioMenuButton.setVisible(false);
        }else if(t.equals("MoradorMestre")){
            this.entradaSaidaMenuButton.setVisible(false);
            this.encomendasMenuButton.setVisible(false);
            this.funcionarioMenuButton.setVisible(false);
        }else if(t.equals("Sindico")){

        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moradoresMenuButton = new javax.swing.JButton();
        funcionarioMenuButton = new javax.swing.JButton();
        financeiroMenuButton = new javax.swing.JButton();
        entradaSaidaMenuButton = new javax.swing.JButton();
        encomendasMenuButton = new javax.swing.JButton();
        reservasMenuButton = new javax.swing.JButton();
        infoPessoaisMenuButton = new javax.swing.JButton();
        reclamacoesMenuButton = new javax.swing.JButton();
        logoutMenuButton = new javax.swing.JButton();
        veiculosMenuButton = new javax.swing.JButton();

        moradoresMenuButton.setText("Moradores");
        moradoresMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moradoresMenuButtonActionPerformed(evt);
            }
        });

        funcionarioMenuButton.setText("Funcionários");
        funcionarioMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcionarioMenuButtonActionPerformed(evt);
            }
        });

        financeiroMenuButton.setText("Financeiro");
        financeiroMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financeiroMenuButtonActionPerformed(evt);
            }
        });

        entradaSaidaMenuButton.setText("Entrada/Saída");
        entradaSaidaMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaSaidaMenuButtonActionPerformed(evt);
            }
        });

        encomendasMenuButton.setText("Encomendas");
        encomendasMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encomendasMenuButtonActionPerformed(evt);
            }
        });

        reservasMenuButton.setText("Reservas");
        reservasMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservasMenuButtonActionPerformed(evt);
            }
        });

        infoPessoaisMenuButton.setText("Inf. Pessoais");
        infoPessoaisMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoPessoaisMenuButtonActionPerformed(evt);
            }
        });

        reclamacoesMenuButton.setText("Reclamações");
        reclamacoesMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reclamacoesMenuButtonActionPerformed(evt);
            }
        });

        logoutMenuButton.setText("Logout");
        logoutMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuButtonActionPerformed(evt);
            }
        });

        veiculosMenuButton.setText("Veículos");
        veiculosMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculosMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(veiculosMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(moradoresMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(funcionarioMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(financeiroMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(entradaSaidaMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(encomendasMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reservasMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoPessoaisMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reclamacoesMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(moradoresMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(funcionarioMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(financeiroMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entradaSaidaMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encomendasMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reservasMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoPessoaisMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reclamacoesMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(veiculosMenuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutMenuButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void moradoresMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moradoresMenuButtonActionPerformed
       Tela.atualizaTela("Morador");
    }//GEN-LAST:event_moradoresMenuButtonActionPerformed

    private void funcionarioMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcionarioMenuButtonActionPerformed
       Tela.atualizaTela("Funcionario");
    }//GEN-LAST:event_funcionarioMenuButtonActionPerformed

    private void financeiroMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financeiroMenuButtonActionPerformed
       Tela.atualizaTela("Financeiro");
    }//GEN-LAST:event_financeiroMenuButtonActionPerformed

    private void entradaSaidaMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaSaidaMenuButtonActionPerformed
       Tela.atualizaTela("Visitante");
    }//GEN-LAST:event_entradaSaidaMenuButtonActionPerformed

    private void encomendasMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encomendasMenuButtonActionPerformed
       Tela.atualizaTela("Encomenda");
    }//GEN-LAST:event_encomendasMenuButtonActionPerformed

    private void reservasMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservasMenuButtonActionPerformed
       Tela.atualizaTela("Area");
    }//GEN-LAST:event_reservasMenuButtonActionPerformed

    private void infoPessoaisMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoPessoaisMenuButtonActionPerformed
       Tela.atualizaTela("InformacaoPessoal");
    }//GEN-LAST:event_infoPessoaisMenuButtonActionPerformed

    private void reclamacoesMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reclamacoesMenuButtonActionPerformed
       Tela.atualizaTela("Reclamacao");
    }//GEN-LAST:event_reclamacoesMenuButtonActionPerformed

    private void logoutMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuButtonActionPerformed
        Tela.end();
        Tela.start();
    }//GEN-LAST:event_logoutMenuButtonActionPerformed

    private void veiculosMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculosMenuButtonActionPerformed
        Tela.atualizaTela("Veiculo");
    }//GEN-LAST:event_veiculosMenuButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton encomendasMenuButton;
    private javax.swing.JButton entradaSaidaMenuButton;
    private javax.swing.JButton financeiroMenuButton;
    private javax.swing.JButton funcionarioMenuButton;
    private javax.swing.JButton infoPessoaisMenuButton;
    private javax.swing.JButton logoutMenuButton;
    private javax.swing.JButton moradoresMenuButton;
    private javax.swing.JButton reclamacoesMenuButton;
    private javax.swing.JButton reservasMenuButton;
    private javax.swing.JButton veiculosMenuButton;
    // End of variables declaration//GEN-END:variables
}
