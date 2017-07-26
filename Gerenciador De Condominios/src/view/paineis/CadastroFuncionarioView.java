/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.paineis;

import control.domain.*;
import control.exceptions.CpfInvalidoException;
import control.exceptions.DataInvalidaException;
import control.exceptions.EmailInvalidoException;
import control.exceptions.HoraInvalidaException;
import control.exceptions.TelefoneInvalidoException;
import control.exceptions.Validacoes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import model.domain.pessoas.Funcionario;
import model.domain.pessoas.Usuario;

/**
 *
 * @author Aline
 */
public class CadastroFuncionarioView extends javax.swing.JPanel {

    /**
     * Creates new form InformacoesPessoaisView
     */
    public CadastroFuncionarioView(String permissao) {
        initComponents();
        setorjComboBox.removeAllItems();
        setorjComboBox.addItem("Portaria");
        setorjComboBox.addItem("Administrativo");
        setorjComboBox.addItem("Limpeza");
        setorjComboBox.addItem("Manutenção");
        setorjComboBox.addItem("Segurança");
      
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
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        enderecojTextField = new javax.swing.JTextField();

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
        setorjComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                setorjComboBoxItemStateChanged(evt);
            }
        });
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

        jLabel3.setText("Senha:");

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Endereço:");

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
                                    .addGap(156, 156, 156))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saidajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPasswordField1))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomejTextField))
                    .addComponent(SalvarjButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(setorjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(CPFjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CPFjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(telefonejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enderecojTextField)))
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
                    .addComponent(setorjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(entradajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saidajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(enderecojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailjLabel)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SalvarjButton)
                .addGap(62, 62, 62))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarjButtonActionPerformed
        Control control = ControlFactory.getFuncionarioControl();
        Funcionario f= new Funcionario();
        
        try {
            f.setHorarioEntrada(Validacoes.isHora(entradajFormattedTextField.getText()));
            f.setHorarioSaida(Validacoes.isHora(saidajFormattedTextField.getText()));
            
            f.setCpf(this.CPFjTextField.getText());
            f.setEmail(Validacoes.isEmail(this.emailjTextField.getText()));
            f.setNome(this.nomejTextField.getText());
            f.setSetorDeServico(this.setorjComboBox.getItemAt(this.setorjComboBox.getSelectedIndex()));
            f.setTelefone(Validacoes.isTelefone(this.telefonejTextField.getText()));
            f.setEndereco(this.enderecojTextField.getText());
        } catch (HoraInvalidaException | EmailInvalidoException | TelefoneInvalidoException ex) {
            showMessageDialog(this, ex.getMessage());
        }
  
     
        if(f.getSetorDeServico().equals("Portaria")){
            Control usuarioControl = ControlFactory.getUsuarioControl();
            Usuario user = new Usuario();
            try{
                user.setNome(this.nomejTextField.getText());
                user.setCpf(Validacoes.isCPF(this.CPFjTextField.getText()));
                user.setPermissao("Porteiro");
                user.setSenha(String.copyValueOf(this.jPasswordField1.getPassword()));
            } catch (CpfInvalidoException ex) {
                showMessageDialog(this, ex.getMessage());
            }
            
            usuarioControl.salvar(user);
        }
        control.salvar(f);
        showMessageDialog(this, "Funcionario cadastrado com sucesso!");
        
    }//GEN-LAST:event_SalvarjButtonActionPerformed

    private void setorjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setorjComboBoxActionPerformed
      if(this.setorjComboBox.getSelectedItem()==("Portaria")){
          this.jPasswordField1.setVisible(true);
          this.jLabel3.setVisible(true);
      }
      else{
          this.jPasswordField1.setVisible(false);
          this.jLabel3.setVisible(false);
      }
    }//GEN-LAST:event_setorjComboBoxActionPerformed

    private void entradajFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradajFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradajFormattedTextFieldActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed

    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void setorjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_setorjComboBoxItemStateChanged
      
    }//GEN-LAST:event_setorjComboBoxItemStateChanged

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        this.jPasswordField1.setText("");
    }//GEN-LAST:event_jPasswordField1FocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPFjLabel;
    private javax.swing.JTextField CPFjTextField;
    private javax.swing.JButton SalvarjButton;
    private javax.swing.JLabel emailjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JTextField enderecojTextField;
    private javax.swing.JFormattedTextField entradajFormattedTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel nomejLabel;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JFormattedTextField saidajFormattedTextField;
    private javax.swing.JComboBox<String> setorjComboBox;
    private javax.swing.JLabel setorjLabel;
    private javax.swing.JLabel telefonejLabel;
    private javax.swing.JTextField telefonejTextField;
    // End of variables declaration//GEN-END:variables
}
