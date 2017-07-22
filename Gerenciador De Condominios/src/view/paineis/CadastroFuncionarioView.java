/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.paineis;

import control.domain.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aline
 */
public class CadastroFuncionarioView extends javax.swing.JPanel {

    /**
     * Creates new form InformacoesPessoaisView
     */
    public CadastroFuncionarioView() {
        initComponents();
        funcionarioControl = ControlFactory.getFuncionarioControl();
        setorjComboBox.removeAllItems();
        setorjComboBox.addItem("Portaria");
        setorjComboBox.addItem("Administrativo");
        setorjComboBox.addItem("Limpeza");
        setorjComboBox.addItem("Manutenção");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomejLabel = new javax.swing.JLabel();
        CPFjLabel = new javax.swing.JLabel();
        telefonejLabel = new javax.swing.JLabel();
        emailjLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        CPFjTextField = new javax.swing.JTextField();
        telefonejTextField = new javax.swing.JTextField();
        emailjTextField = new javax.swing.JTextField();
        SalvarjButton = new javax.swing.JButton();
        setorjLabel = new javax.swing.JLabel();
        setorjComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        entradajFormattedTextField = new javax.swing.JFormattedTextField();
        saidajFormattedTextField = new javax.swing.JFormattedTextField();

        setPreferredSize(new java.awt.Dimension(400, 313));

        nomejLabel.setText("Nome:");

        CPFjLabel.setText("CPF:");

        telefonejLabel.setText("Telefone:");

        emailjLabel.setText("E-mail:");

        SalvarjButton.setText("Salvar");
        SalvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarjButtonActionPerformed(evt);
            }
        });

        setorjLabel.setText("Setor:");

        setorjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        setorjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setorjComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Entrada:");

        jLabel2.setText("Saída");

        entradajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        entradajFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradajFormattedTextFieldActionPerformed(evt);
            }
        });

        saidajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(entradajFormattedTextField))
                            .addComponent(emailjLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(setorjLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(setorjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saidajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomejTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CPFjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CPFjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SalvarjButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejLabel)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFjLabel)
                    .addComponent(telefonejLabel)
                    .addComponent(CPFjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setorjLabel)
                    .addComponent(setorjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(entradajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saidajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailjLabel)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(SalvarjButton)
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarjButtonActionPerformed
        DateFormat format = new SimpleDateFormat("hh:mm");
        java.sql.Date dataEntrada = null;
        try {
            System.out.println("Teste");
            dataEntrada = new java.sql.Date(format.parse(this.entradajFormattedTextField.getText()).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(InformacoesPessoaisView.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.sql.Date dataSaida = null;
        try {
            System.out.println("Teste");
            dataSaida = new java.sql.Date(format.parse(this.saidajFormattedTextField.getText()).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(InformacoesPessoaisView.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*
            funcionarioControl.salvarFuncionario(this.nomejTextField.getText(), this.CPFjTextField.getText(), 
                this.emailjTextField.getText(), this.telefonejTextField.getText(), this.setorjComboBox.getName(),
                dataEntrada, dataEntrada); */
    }//GEN-LAST:event_SalvarjButtonActionPerformed

    private void setorjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_setorjComboBoxActionPerformed

    private void entradajFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradajFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradajFormattedTextFieldActionPerformed
Control funcionarioControl;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPFjLabel;
    private javax.swing.JTextField CPFjTextField;
    private javax.swing.JButton SalvarjButton;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JFormattedTextField entradajFormattedTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JFormattedTextField saidajFormattedTextField;
    private javax.swing.JComboBox<String> setorjComboBox;
    private javax.swing.JLabel setorjLabel;
    private javax.swing.JLabel telefonejLabel;
    private javax.swing.JTextField telefonejTextField;
    // End of variables declaration//GEN-END:variables
}
