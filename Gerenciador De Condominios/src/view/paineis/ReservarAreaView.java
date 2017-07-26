/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.paineis;

import control.View.Tela;
import control.domain.Control;
import control.domain.ControlFactory;
import control.exceptions.DataInvalidaException;
import control.exceptions.HoraInvalidaException;
import control.exceptions.Validacoes;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import model.domain.AreaComum;
import model.domain.Reserva;
import model.domain.pessoas.Funcionario;
import model.domain.pessoas.Morador;
import model.domain.pessoas.PessoaVinculada;
import model.domain.pessoas.Usuario;

/**
 *
 * @author Aline
 */
public class ReservarAreaView extends javax.swing.JPanel {

    /**
     * Creates new form ReservarAreaView
     */
    Control control;
            
    public ReservarAreaView(String permissao) {
        initComponents();
        
        this.areajComboBox.removeAllItems();
        control = ControlFactory.getAreaComumControl();
        String array[]= control.pesquisar(new AreaComum());
        for(String a : array){
            this.areajComboBox.addItem(a);
        }
        
        iniciojFormattedTextField.setText("dd/MM/yyyy hh:mm");
        fimjFormattedTextField.setText("hh:mm");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areajLabel = new javax.swing.JLabel();
        areajComboBox = new javax.swing.JComboBox<>();
        horariojLabel = new javax.swing.JLabel();
        iniciojFormattedTextField = new javax.swing.JFormattedTextField();
        valorjLabel = new javax.swing.JLabel();
        valorjFormattedTextField = new javax.swing.JFormattedTextField();
        horariojLabel1 = new javax.swing.JLabel();
        fimjFormattedTextField = new javax.swing.JFormattedTextField();
        diaTodojCheckBox = new javax.swing.JCheckBox();
        salvarjButton = new javax.swing.JButton();

        areajLabel.setText("Escolha a área:");

        areajComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        areajComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areajComboBoxActionPerformed(evt);
            }
        });

        horariojLabel.setText("Início:");

        iniciojFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciojFormattedTextFieldActionPerformed(evt);
            }
        });

        valorjLabel.setText("Valor da reserva:");

        valorjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        valorjFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorjFormattedTextFieldActionPerformed(evt);
            }
        });
        valorjFormattedTextField.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                valorjFormattedTextFieldPropertyChange(evt);
            }
        });

        horariojLabel1.setText("Fim:");

        diaTodojCheckBox.setText("Dia todo");
        diaTodojCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaTodojCheckBoxActionPerformed(evt);
            }
        });

        salvarjButton.setText("Salvar");
        salvarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarjButtonActionPerformed(evt);
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
                        .addComponent(areajLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(areajComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(valorjLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valorjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salvarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(horariojLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(iniciojFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(horariojLabel1)
                                    .addGap(5, 5, 5)
                                    .addComponent(fimjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(diaTodojCheckBox))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areajLabel)
                    .addComponent(areajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diaTodojCheckBox)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(horariojLabel)
                    .addComponent(iniciojFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horariojLabel1)
                    .addComponent(fimjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorjLabel)
                    .addComponent(valorjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salvarjButton))
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void valorjFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorjFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorjFormattedTextFieldActionPerformed

    private void valorjFormattedTextFieldPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_valorjFormattedTextFieldPropertyChange
        
    }//GEN-LAST:event_valorjFormattedTextFieldPropertyChange

    private void areajComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areajComboBoxActionPerformed
        if(this.areajComboBox.getItemAt(this.areajComboBox.getSelectedIndex()) != null){
            AreaComum a = new AreaComum();
            Control<AreaComum> areaComumControl= ControlFactory.getAreaComumControl();
            a.setNomeArea(this.areajComboBox.getItemAt(this.areajComboBox.getSelectedIndex()));
            a = areaComumControl.bucarPorChave(a);
            System.out.println(a.getNomeArea());
            this.valorjFormattedTextField.setText(""+a.getValor());
        }
    }//GEN-LAST:event_areajComboBoxActionPerformed

    private void diaTodojCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaTodojCheckBoxActionPerformed
        if(diaTodojCheckBox.isSelected()){
            iniciojFormattedTextField.setText("dd/MM/yyyy");
            fimjFormattedTextField.setText("");
            fimjFormattedTextField.setEnabled(false);
        }else{
            fimjFormattedTextField.setEnabled(true);
            iniciojFormattedTextField.setText("dd/MM/yyyy hh:mm");
            fimjFormattedTextField.setText("hh:mm");
        }
    }//GEN-LAST:event_diaTodojCheckBoxActionPerformed

    private void iniciojFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciojFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iniciojFormattedTextFieldActionPerformed

    private void salvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarjButtonActionPerformed
        Usuario user = Tela.getUser();
        Reserva reserva= new Reserva();
        Control control = ControlFactory.getReservaControl();
        
        Date date;
        if(diaTodojCheckBox.isSelected()){
            try {
                date = Validacoes.isData(iniciojFormattedTextField.getText());
                reserva.setHorarioInicio(date); 
            } catch (DataInvalidaException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            
            try {
                date = Validacoes.isHora("23:59");
                reserva.setHorarioFim(date); 
            } catch (HoraInvalidaException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }else{
            try {
                date = Validacoes.isDataCompleta(iniciojFormattedTextField.getText());
                reserva.setHorarioInicio(date); 
            } catch (DataInvalidaException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            
             try {
                date = Validacoes.isHora(fimjFormattedTextField.getText());
                reserva.setHorarioFim(date); 
            } catch (HoraInvalidaException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }
        
        AreaComum a = new AreaComum();
        Control<AreaComum> areaComumControl= ControlFactory.getAreaComumControl();
        a.setNomeArea(this.areajComboBox.getItemAt(this.areajComboBox.getSelectedIndex()));
        a = areaComumControl.bucarPorChave(a);
        
        reserva.setArea(a);
        reserva.setUsuario(user);
        reserva.setDiaTodo(diaTodojCheckBox.isSelected());
        control.salvar(reserva);
        showMessageDialog(this, "Reserva cadastrada com sucesso!");
    }//GEN-LAST:event_salvarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> areajComboBox;
    private javax.swing.JLabel areajLabel;
    private javax.swing.JCheckBox diaTodojCheckBox;
    private javax.swing.JFormattedTextField fimjFormattedTextField;
    private javax.swing.JLabel horariojLabel;
    private javax.swing.JLabel horariojLabel1;
    private javax.swing.JFormattedTextField iniciojFormattedTextField;
    private javax.swing.JButton salvarjButton;
    private javax.swing.JFormattedTextField valorjFormattedTextField;
    private javax.swing.JLabel valorjLabel;
    // End of variables declaration//GEN-END:variables
}
