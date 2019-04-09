/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Telas;

/**
 *
 * @author Ismael
 */
public class TelaCadastroContaBancaria extends javax.swing.JFrame {
    private static TelaCadastroContaBancaria instancia;
    public static TelaCadastroContaBancaria getInstance() {
        if(instancia == null){
            instancia = new TelaCadastroContaBancaria();
        }
        return instancia;
    }
    /**
     * Creates new form TelaCadastroContaBancaria
     */
    private TelaCadastroContaBancaria() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        campoNumeroAgencia = new javax.swing.JTextField();
        txtNumeroConta = new javax.swing.JLabel();
        campoNumeroConta = new javax.swing.JTextField();
        campoNomeBanco = new javax.swing.JTextField();
        txtNomeBanco = new javax.swing.JLabel();
        txtNumeroAgencia = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        radioTipoDeConta = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoNumeroAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroAgenciaActionPerformed(evt);
            }
        });

        txtNumeroConta.setText("Numero da Conta");

        campoNumeroConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroContaActionPerformed(evt);
            }
        });

        campoNomeBanco.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        campoNomeBanco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoNomeBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeBancoActionPerformed(evt);
            }
        });

        txtNomeBanco.setText("Nome do Banco");

        txtNumeroAgencia.setText("Numero da Agência");

        botaoCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoCancelar.setForeground(new java.awt.Color(153, 0, 51));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        radioTipoDeConta.setText("Conta Corrente");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGroup1, org.jdesktop.beansbinding.ELProperty.create("${buttonCount}"), radioTipoDeConta, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        jRadioButton2.setText("Conta Poupança");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, buttonGroup1, org.jdesktop.beansbinding.ELProperty.create("${buttonCount}"), jRadioButton2, org.jdesktop.beansbinding.BeanProperty.create("selected"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioTipoDeConta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeBanco, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(campoNomeBanco)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoNumeroConta, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumeroConta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoNumeroAgencia, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumeroAgencia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(txtNomeBanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNumeroAgencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNumeroAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroConta)
                .addGap(8, 8, 8)
                .addComponent(campoNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioTipoDeConta)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jRadioButton2)
                    .addComponent(botaoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNumeroAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroAgenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumeroAgenciaActionPerformed

    private void campoNumeroContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroContaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumeroContaActionPerformed

    private void campoNomeBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeBancoActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campoNomeBanco;
    private javax.swing.JTextField campoNumeroAgencia;
    private javax.swing.JTextField campoNumeroConta;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton radioTipoDeConta;
    private javax.swing.JLabel txtNomeBanco;
    private javax.swing.JLabel txtNumeroAgencia;
    private javax.swing.JLabel txtNumeroConta;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
