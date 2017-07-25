/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.paineis;

import control.domain.Control;
import control.domain.ControlFactory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.domain.Financeiro;

/**
 *
 * @author Aline
 */
public class ConsultarFinanceiroView extends javax.swing.JPanel {

    /**
     * Creates new form ConsultarFinanceiroView
     */
    private final Control<Financeiro> control;
    
    public ConsultarFinanceiroView(String permissao) {
        initComponents();
        control = ControlFactory.getFinanceiroControl();
        this.jList1.setListData(control.pesquisar(new Financeiro()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FornMorjLabel = new javax.swing.JLabel();
        FornMorjTextField = new javax.swing.JTextField();
        CPFCNPJjLabel = new javax.swing.JLabel();
        CPFCNPJjTextField = new javax.swing.JTextField();
        pesquisarjButton = new javax.swing.JButton();
        consultaMultasjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        ExcluirjButton = new javax.swing.JButton();
        BaixajButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        vencimentojTextField = new javax.swing.JTextField();

        FornMorjLabel.setText("Nome:");

        CPFCNPJjLabel.setText("CPF/CNPJ:");

        pesquisarjButton.setText("Pesquisar");
        pesquisarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarjButtonActionPerformed(evt);
            }
        });

        consultaMultasjButton.setText("Consultar Multas");
        consultaMultasjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaMultasjButtonActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        ExcluirjButton.setText("Excluir");
        ExcluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirjButtonActionPerformed(evt);
            }
        });

        BaixajButton.setText("Realizar Baixa");
        BaixajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaixajButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Vencimento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FornMorjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FornMorjTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BaixajButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CPFCNPJjLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CPFCNPJjTextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(0, 6, Short.MAX_VALUE)
                                .addComponent(pesquisarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(consultaMultasjButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vencimentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ExcluirjButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FornMorjLabel)
                    .addComponent(FornMorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPFCNPJjLabel)
                    .addComponent(CPFCNPJjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(vencimentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaMultasjButton)
                    .addComponent(pesquisarjButton)
                    .addComponent(ExcluirjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BaixajButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarjButtonActionPerformed
        Financeiro financeiro = new Financeiro();
        financeiro.setNome(this.FornMorjTextField.getText());
        financeiro.setCpf(this.CPFCNPJjTextField.getText());
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        try {
            date = formato.parse(vencimentojTextField.getText());
            financeiro.setVencimento(date); 
        } catch (ParseException ex) {
            Logger.getLogger(CadastroFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.jList1.removeAll();
        this.jList1.setListData(control.pesquisar(financeiro));
    }//GEN-LAST:event_pesquisarjButtonActionPerformed

    private void ExcluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirjButtonActionPerformed
         Financeiro financeiro = control.getBufferIndex(this.jList1.getSelectedIndex());
         control.excluir(financeiro);
         pesquisarjButtonActionPerformed(evt);
    }//GEN-LAST:event_ExcluirjButtonActionPerformed

    private void consultaMultasjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaMultasjButtonActionPerformed
       Financeiro financeiro = new Financeiro();
       financeiro.setTipoLancamento("Multas");
       this.jList1.removeAll();
       this.jList1.setListData(control.pesquisar(financeiro));
    }//GEN-LAST:event_consultaMultasjButtonActionPerformed

    private void BaixajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaixajButtonActionPerformed
        Financeiro financeiro = control.getBufferIndex(this.jList1.getSelectedIndex());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data = sdf.format(new Date());
        System.out.println(data);
        Date date;
        try {
            date = sdf.parse(data);
            financeiro.setBaixa(new Date()); 
            System.out.println(date);
        } catch (ParseException ex) {
            Logger.getLogger(CadastroFuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        control.salvar(financeiro);
        
        pesquisarjButtonActionPerformed(evt);
        
    }//GEN-LAST:event_BaixajButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BaixajButton;
    private javax.swing.JLabel CPFCNPJjLabel;
    private javax.swing.JTextField CPFCNPJjTextField;
    private javax.swing.JButton ExcluirjButton;
    private javax.swing.JLabel FornMorjLabel;
    private javax.swing.JTextField FornMorjTextField;
    private javax.swing.JButton consultaMultasjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pesquisarjButton;
    private javax.swing.JTextField vencimentojTextField;
    // End of variables declaration//GEN-END:variables
}
