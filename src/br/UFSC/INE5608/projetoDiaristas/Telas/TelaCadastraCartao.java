/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Telas;

import br.UFSC.INE5608.projetoDiaristas.Controladores.ControladorCartaoCredito;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismael
 */
public class TelaCadastraCartao extends javax.swing.JFrame {

    private static TelaCadastraCartao instancia;

    public static TelaCadastraCartao getInstance() {
        if (instancia == null) {
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

        txtNumeroCartao = new javax.swing.JLabel();
        txtNomeCartao = new javax.swing.JLabel();
        txtValidade = new javax.swing.JLabel();
        txtCVV = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        botaoCancelar = new javax.swing.JButton();
        campoNumeroCartao = new javax.swing.JFormattedTextField();
        campoValidade = new javax.swing.JFormattedTextField();
        campoCVV = new javax.swing.JFormattedTextField();
        campoNomeCartao = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNumeroCartao.setText("Numero do cartão de crédito");

        txtNomeCartao.setText("Nome impresso no cartão");

        txtValidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtValidade.setText("Validade");

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

        try {
            campoNumeroCartao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoNumeroCartao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoNumeroCartao.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        try {
            campoValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoValidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoValidadeActionPerformed(evt);
            }
        });

        try {
            campoCVV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCVV.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoNomeCartao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeCartao)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoCVV, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(txtCVV, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                                .addGap(66, 66, 66)
                                .addComponent(botaoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoNomeCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(txtNumeroCartao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNomeCartao)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNomeCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValidade)
                            .addComponent(txtCVV))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void botaoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelarActionPerformed
        ControladorCartaoCredito.getInstance().abreTelaCadastroContratante();
        dispose();
    }//GEN-LAST:event_botaoCancelarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed

        System.out.println(campoNumeroCartao.getText());
        String numeroCartao = campoNumeroCartao.getText().replaceAll(" ", "");
        String nomeCartao = campoNomeCartao.getText().trim();
        String validade = campoValidade.getText().replaceAll("/", "");
        validade = validade.replaceAll(" ", "");
        String cvv = campoCVV.getText().replaceAll(" ", "");
        System.out.println(numeroCartao);

        if (numeroCartao.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha os números do cartão", "Dados inválidos", JOptionPane.DEFAULT_OPTION);
        } else if (nomeCartao.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o nome impresso no cartão", "Dados inválidos", JOptionPane.DEFAULT_OPTION);
        } else if (nomeCartao.length() < 3) {
            JOptionPane.showMessageDialog(null, "Preencha o nome válido, com mais que 3 caracteres", "Dados inválidos", JOptionPane.DEFAULT_OPTION);
        } else if (validade.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha a data de validade", "Dados inválidos", JOptionPane.DEFAULT_OPTION);
        } else if (cvv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o código CVV", "Dados inválidos", JOptionPane.DEFAULT_OPTION);
        } else if (Character.getNumericValue(validade.charAt(0)) > 1) {
            JOptionPane.showMessageDialog(null, "Data de validade inválida", "Cartao inválido", JOptionPane.DEFAULT_OPTION);
        } else if (Character.getNumericValue(validade.charAt(0)) == 1 && Character.getNumericValue(validade.charAt(1)) > 2) {
            JOptionPane.showMessageDialog(null, "Data de validade inválida", "Cartao inválido", JOptionPane.DEFAULT_OPTION);
        } else if (Character.getNumericValue(validade.charAt(2)) <= 1 && Character.getNumericValue(validade.charAt(3)) <= 9) {
            JOptionPane.showMessageDialog(null, "Data de validade inválida", "Cartao inválido", JOptionPane.DEFAULT_OPTION);
        } else {

            try {
                ControladorCartaoCredito.getInstance().setDadosCartao(numeroCartao, nomeCartao, validade, cvv);
                dispose();
                JOptionPane.showMessageDialog(null, "Cartão cadastrado com sucesso", "Cartao cadastrado", JOptionPane.DEFAULT_OPTION);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Preencha os campos corretamente", "Dados inválidos", JOptionPane.DEFAULT_OPTION);
            }
        }

    }//GEN-LAST:event_botaoCadastrarActionPerformed


    private void campoValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoValidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoCancelar;
    private javax.swing.JFormattedTextField campoCVV;
    private javax.swing.JFormattedTextField campoNomeCartao;
    private javax.swing.JFormattedTextField campoNumeroCartao;
    private javax.swing.JFormattedTextField campoValidade;
    private javax.swing.JLabel txtCVV;
    private javax.swing.JLabel txtNomeCartao;
    private javax.swing.JLabel txtNumeroCartao;
    private javax.swing.JLabel txtValidade;
    // End of variables declaration//GEN-END:variables
}
