/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Telas;

import br.UFSC.INE5608.projetoDiaristas.Controladores.ControladorCartaoCredito;
import com.sun.xml.internal.ws.util.StringUtils;

/**
 *
 * @author Ismael
 */
public class TelaCadastraCartao extends javax.swing.JFrame {
    private static TelaCadastraCartao instancia;
    public static TelaCadastraCartao getInstance() {
        if(instancia == null){
            instancia = new TelaCadastraCartao();
        }
        return instancia;
    }
    /**
     * Creates new form TelaCadastraCartão
     */
    private TelaCadastraCartao() {
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

        campoNumeroCartao = new javax.swing.JTextField();
        txtNumeroCartao = new javax.swing.JLabel();
        txtNomeCartao = new javax.swing.JLabel();
        campoNomeCartao = new javax.swing.JTextField();
        txtValidade = new javax.swing.JLabel();
        campoValidade = new javax.swing.JTextField();
        campoCVV = new javax.swing.JTextField();
        txtCVV = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoNumeroCartao.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        campoNumeroCartao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoNumeroCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNumeroCartaoActionPerformed(evt);
            }
        });

        txtNumeroCartao.setText("Numero do cartão de crédito");

        txtNomeCartao.setText("Nome impresso no cartão");

        campoNomeCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNomeCartaoActionPerformed(evt);
            }
        });

        txtValidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtValidade.setText("Validade");

        campoValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValidadeActionPerformed(evt);
            }
        });

        txtCVV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCVV.setText("CVV");

        botaoCadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botaoCancelar.setForeground(new java.awt.Color(153, 0, 51));
        botaoCancelar.setText("Cancelar");
        botaoCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeCartao)
                                    .addComponent(txtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(campoValidade)
                                            .addComponent(txtValidade, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(campoCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoNomeCartao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNumeroCartao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                        .addContainerGap(105, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(txtNumeroCartao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNomeCartao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNomeCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValidade)
                            .addComponent(txtCVV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoNumeroCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNumeroCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNumeroCartaoActionPerformed

    private void campoValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValidadeActionPerformed

    private void campoNomeCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNomeCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNomeCartaoActionPerformed

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        ControladorCartaoCredito.getInstance().abreTelaCadastroContratante();
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        String numeroCartao = campoNumeroCartao.getText();   
        String nomeCartao = campoNomeCartao.getText();
        String validade = campoValidade.getText(); 
        String cvv = campoCVV.getText();
        
        if(!cvv.isEmpty() && !nomeCartao.isEmpty() && !numeroCartao.isEmpty() && !validade.isEmpty()){
            ControladorCartaoCredito.getInstance().setDadosCartao(numeroCartao, nomeCartao, validade, cvv);
        }
        dispose();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JTextField campoCVV;
    private javax.swing.JTextField campoNomeCartao;
    private javax.swing.JTextField campoNumeroCartao;
    private javax.swing.JTextField campoValidade;
    private javax.swing.JLabel txtCVV;
    private javax.swing.JLabel txtNomeCartao;
    private javax.swing.JLabel txtNumeroCartao;
    private javax.swing.JLabel txtValidade;
    // End of variables declaration//GEN-END:variables
}
