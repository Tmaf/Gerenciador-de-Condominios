/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.paineis;

import control.domain.Control;
import control.domain.ControlFactory;
import static javax.swing.JOptionPane.showMessageDialog;
import model.domain.AreaComum;
import model.domain.Reserva;
import model.domain.Veiculo;

/**
 *
 * @author Aline
 */
public class ConsultarReservaView extends javax.swing.JPanel {

    /**
     * Creates new form ReservarAreaView
     */
    Control control;
    Control<Reserva> controlReserva; 
    
    public ConsultarReservaView(String permissao) {
        initComponents();
        controlReserva = ControlFactory.getReservaControl();
        
        this.areajComboBox.removeAllItems();
        this.areajComboBox.addItem("");
        control = ControlFactory.getAreaComumControl();
        String array[]= control.pesquisar(new AreaComum());
        for(String a : array){
            this.areajComboBox.addItem(a);
        }
        
        controlReserva = ControlFactory.getReservaControl();
        this.jList1.setListData(controlReserva.pesquisar(new Reserva()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        areajLabel = new javax.swing.JLabel();
        cancelarReservajButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        areajComboBox = new javax.swing.JComboBox<>();
        buscarjButton = new javax.swing.JButton();

        areajLabel.setText("Escolha a área:");

        cancelarReservajButton.setText("Cancelar Reserva");
        cancelarReservajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarReservajButtonActionPerformed(evt);
            }
        });

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        areajComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        areajComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areajComboBoxActionPerformed(evt);
            }
        });

        buscarjButton.setText("Buscar");
        buscarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarjButtonActionPerformed(evt);
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
                        .addGap(0, 148, Short.MAX_VALUE)
                        .addComponent(buscarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cancelarReservajButton))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(areajLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(areajComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areajLabel)
                    .addComponent(areajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarjButton)
                    .addComponent(cancelarReservajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buscarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarjButtonActionPerformed
        AreaComum a = new AreaComum();
        Control<AreaComum> areaComumControl= ControlFactory.getAreaComumControl();
        a.setNomeArea(this.areajComboBox.getItemAt(this.areajComboBox.getSelectedIndex()));
        a = areaComumControl.bucarPorChave(a);
        
        Reserva e;
        e= new Reserva();
        e.setArea(a);
        this.jList1.removeAll();
        this.jList1.setListData(controlReserva.pesquisar(e));

    }//GEN-LAST:event_buscarjButtonActionPerformed

    private void cancelarReservajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarReservajButtonActionPerformed
        Reserva reserva = controlReserva.getBufferIndex(this.jList1.getSelectedIndex());
        controlReserva.excluir(reserva);
        buscarjButtonActionPerformed(evt);
        showMessageDialog(this, "Excluido!");
    }//GEN-LAST:event_cancelarReservajButtonActionPerformed

    private void areajComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areajComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areajComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> areajComboBox;
    private javax.swing.JLabel areajLabel;
    private javax.swing.JButton buscarjButton;
    private javax.swing.JButton cancelarReservajButton;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
