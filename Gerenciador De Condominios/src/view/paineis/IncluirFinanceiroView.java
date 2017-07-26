/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.paineis;

import control.domain.impl.ControlImpl;
import control.domain.*;
import control.exceptions.CpfInvalidoException;
import control.exceptions.DataInvalidaException;
import control.exceptions.Validacoes;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.domain.Financeiro;

/**
 *
 * @author Aline
 */
public class IncluirFinanceiroView extends javax.swing.JPanel {

    /**
     * Creates new form IncluirLancamentoView
     */
    public IncluirFinanceiroView(String permissao) {
        initComponents();
       
        RecDesjComboBox.removeAllItems();
        RecDesjComboBox.addItem("Receita");
        RecDesjComboBox.addItem("Despesa");
       
        TipoPgtojComboBox.removeAllItems();
        TipoPgtojComboBox.addItem("Boleto");
        TipoPgtojComboBox.addItem("Cheque");
        TipoPgtojComboBox.addItem("Depósito em Conta");
        TipoPgtojComboBox.addItem("Dinheiro");
        TipoPgtojComboBox.addItem("Outro");
        
        TipoLancjComboBox.removeAllItems();
        TipoLancjComboBox.addItem("Multas");
        TipoLancjComboBox.addItem("Taxa de condomínio");
        TipoLancjComboBox.addItem("Taxa de locação de área");
        TipoLancjComboBox.addItem("Pagamento à fornecedor");
        TipoLancjComboBox.addItem("Outro");
        
        limpaTela();
        
    }
    
    private void limpaTela(){
        nomejTextField.setText("");
        cpfjTextField.setText("");
        NroDocjTextField.setText("");
        emissaojFormattedTextField.setText("dd/mm/aaaa");
        vencimentojFormattedTextField.setText("dd/mm/aaaa");
        valorjTextField.setText("");
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
        nomejLabel = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        cpfjLabel = new javax.swing.JLabel();
        cpfjTextField = new javax.swing.JTextField();
        DtEmissaojLabel = new javax.swing.JLabel();
        DtVencimentojLabel = new javax.swing.JLabel();
        NroDocjLabel = new javax.swing.JLabel();
        NroDocjTextField = new javax.swing.JTextField();
        RecDesjLabel = new javax.swing.JLabel();
        RecDesjComboBox = new javax.swing.JComboBox<>();
        TipoPgtojLabel = new javax.swing.JLabel();
        TipoPgtojComboBox = new javax.swing.JComboBox<>();
        TipoLancjLabel = new javax.swing.JLabel();
        TipoLancjComboBox = new javax.swing.JComboBox<>();
        salvarjButton = new javax.swing.JButton();
        emissaojFormattedTextField = new javax.swing.JFormattedTextField();
        vencimentojFormattedTextField = new javax.swing.JFormattedTextField();
        valorjLabel = new javax.swing.JLabel();
        valorjTextField = new javax.swing.JTextField();

        nomejLabel.setText("Nome:");

        cpfjLabel.setText("CPF/CNPJ:");

        DtEmissaojLabel.setText("Data emissão:");

        DtVencimentojLabel.setText("Data vencimento:");

        NroDocjLabel.setText("Nro. Documento:");

        RecDesjLabel.setText("Receita/Despesa:");

        RecDesjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        RecDesjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecDesjComboBoxActionPerformed(evt);
            }
        });

        TipoPgtojLabel.setText("Tipo Pagamento:");

        TipoPgtojComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TipoPgtojComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoPgtojComboBoxActionPerformed(evt);
            }
        });

        TipoLancjLabel.setText("Tipo de Lançamento:");

        TipoLancjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TipoLancjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoLancjComboBoxActionPerformed(evt);
            }
        });

        salvarjButton.setText("Salvar");
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
            }
        });

        emissaojFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        emissaojFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emissaojFormattedTextFieldFocusGained(evt);
            }
        });

        vencimentojFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        vencimentojFormattedTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                vencimentojFormattedTextFieldFocusGained(evt);
            }
        });
        vencimentojFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vencimentojFormattedTextFieldActionPerformed(evt);
            }
        });

        valorjLabel.setText("Valor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomejTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoPgtojLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TipoPgtojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TipoLancjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TipoLancjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(valorjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salvarjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RecDesjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RecDesjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cpfjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpfjTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DtEmissaojLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emissaojFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DtVencimentojLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NroDocjLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NroDocjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(vencimentojFormattedTextField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RecDesjLabel)
                    .addComponent(RecDesjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomejLabel)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfjLabel)
                    .addComponent(cpfjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NroDocjLabel)
                    .addComponent(NroDocjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DtEmissaojLabel)
                    .addComponent(DtVencimentojLabel)
                    .addComponent(emissaojFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vencimentojFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoPgtojLabel)
                    .addComponent(TipoPgtojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TipoLancjLabel)
                    .addComponent(TipoLancjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarjButton)
                    .addComponent(valorjLabel)
                    .addComponent(valorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RecDesjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecDesjComboBoxActionPerformed
        
    }//GEN-LAST:event_RecDesjComboBoxActionPerformed

    private void TipoPgtojComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoPgtojComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoPgtojComboBoxActionPerformed

    private void TipoLancjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoLancjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoLancjComboBoxActionPerformed

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        Control control = ControlFactory.getFinanceiroControl();
        Financeiro financeiro = new Financeiro();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        try {
            date = sdf.parse(emissaojFormattedTextField.getText());
            financeiro.setEmissao(date); 
        } catch (ParseException ex) {
            Logger.getLogger(CadastroFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            financeiro.setEmissao(Validacoes.isData(vencimentojFormattedTextField.getText())); 
            financeiro.setTipoFinanceiro(this.RecDesjComboBox.getSelectedItem().toString());
            financeiro.setNome(this.nomejTextField.getText());
            financeiro.setCpf(Validacoes.isCPF(this.cpfjTextField.getText()));
            financeiro.setNroDocumento(this.NroDocjTextField.getText());
            financeiro.setTipoPagamento(this.TipoPgtojComboBox.getSelectedItem().toString());
            financeiro.setTipoLancamento(this.TipoLancjComboBox.getSelectedItem().toString());
            financeiro.setValor(Double.parseDouble(this.valorjTextField.getText().replace(",", ".")));
        } catch (DataInvalidaException | CpfInvalidoException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        
        control.salvar(financeiro);
        limpaTela();
    }//GEN-LAST:event_salvarjButtonActionPerformed

    private void vencimentojFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vencimentojFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vencimentojFormattedTextFieldActionPerformed

    private void emissaojFormattedTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emissaojFormattedTextFieldFocusGained
        emissaojFormattedTextField.setText("");
    }//GEN-LAST:event_emissaojFormattedTextFieldFocusGained

    private void vencimentojFormattedTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_vencimentojFormattedTextFieldFocusGained
        vencimentojFormattedTextField.setText("");
    }//GEN-LAST:event_vencimentojFormattedTextFieldFocusGained

 private ControlImpl financeiroControl;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DtEmissaojLabel;
    private javax.swing.JLabel DtVencimentojLabel;
    private javax.swing.JLabel NroDocjLabel;
    private javax.swing.JTextField NroDocjTextField;
    private javax.swing.JComboBox<String> RecDesjComboBox;
    private javax.swing.JLabel RecDesjLabel;
    private javax.swing.JComboBox<String> TipoLancjComboBox;
    private javax.swing.JLabel TipoLancjLabel;
    private javax.swing.JComboBox<String> TipoPgtojComboBox;
    private javax.swing.JLabel TipoPgtojLabel;
    private javax.swing.JLabel cpfjLabel;
    private javax.swing.JTextField cpfjTextField;
    private javax.swing.JFormattedTextField emissaojFormattedTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JLabel valorjLabel;
    private javax.swing.JTextField valorjTextField;
    private javax.swing.JFormattedTextField vencimentojFormattedTextField;
    // End of variables declaration//GEN-END:variables
}
