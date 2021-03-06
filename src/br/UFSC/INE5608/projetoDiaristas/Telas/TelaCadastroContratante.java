/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Telas;

import br.UFSC.INE5608.projetoDiaristas.Controladores.ControladorContratante;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismael
 */
public class TelaCadastroContratante extends javax.swing.JFrame {

    Long cpf;
    Long rg;
    String cpfTemp;
    String rgTemp;
    String celTemp;

    private static TelaCadastroContratante instancia;

    public static TelaCadastroContratante getInstance() {
        if (instancia == null) {
            instancia = new TelaCadastroContratante();
        }
        return instancia;
    }

    /**
     * Creates new form TelaCadastroContratante
     */
    private TelaCadastroContratante() {
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

        painelContratante = new javax.swing.JPanel();
        txtNome = new javax.swing.JLabel();
        txtCPF = new javax.swing.JLabel();
        txtRG = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JLabel();
        botaoCadastraCartao = new javax.swing.JButton();
        txtHasCartaCadastrado = new javax.swing.JLabel();
        campoObservacoes = new javax.swing.JTextField();
        txtObservacoes = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        painelDadosImovel = new javax.swing.JPanel();
        txtNumeroComodos = new javax.swing.JLabel();
        comboNumeroComodos = new javax.swing.JComboBox<>();
        checkSacada = new javax.swing.JCheckBox();
        checkQuintal = new javax.swing.JCheckBox();
        checkAnivalEstimacao = new javax.swing.JCheckBox();
        checkOutraCoisa = new javax.swing.JCheckBox();
        txtCartaoObrigatorio = new javax.swing.JLabel();
        botaoCadastraUsuario = new javax.swing.JButton();
        txtCamposObrigatorios = new javax.swing.JLabel();
        botaoCancela = new javax.swing.JButton();
        campoCPF = new javax.swing.JFormattedTextField();
        txtDigiteSenha = new javax.swing.JLabel();
        txtRepitaSenha = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        campoRepeteSenha = new javax.swing.JPasswordField();
        campoEmail = new javax.swing.JTextField();
        campoCelular = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JLabel();
        txtCelular = new javax.swing.JLabel();
        campoRG = new javax.swing.JFormattedTextField();
        txtDigiteSenha1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelContratante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de usuário contratante de serviço", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtNome.setText("Nome completo *");

        txtCPF.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtCPF.setText("CPF *");

        txtRG.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtRG.setText("RG *");

        txtEndereco.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtEndereco.setText("Endereço *");

        botaoCadastraCartao.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        botaoCadastraCartao.setText("Cadastrar cartão *");
        botaoCadastraCartao.setBorder(new javax.swing.border.MatteBorder(null));
        botaoCadastraCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraCartaoActionPerformed(evt);
            }
        });

        txtHasCartaCadastrado.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        txtHasCartaCadastrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtHasCartaCadastrado.setText("Sem cartão cadastrado");

        campoObservacoes.setAutoscrolls(false);

        txtObservacoes.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtObservacoes.setText("Observações");

        campoEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        campoNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        painelDadosImovel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Dados do imóvel"));

        txtNumeroComodos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNumeroComodos.setText("* Numero de cômodos:");

        comboNumeroComodos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2 cômodos", "3 cômodos", "4 cômodos", "5 cômodos", "6 cômodos", "7 cômodos", "8 ou mais cômodos" }));
        comboNumeroComodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNumeroComodosActionPerformed(evt);
            }
        });

        checkSacada.setText("Possui sacada");

        checkQuintal.setText("Possui quintal / jardim");
        checkQuintal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkQuintalActionPerformed(evt);
            }
        });

        checkAnivalEstimacao.setText("Possui animal de estimação");
        checkAnivalEstimacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAnivalEstimacaoActionPerformed(evt);
            }
        });

        checkOutraCoisa.setText("Mais alguma coisa");
        checkOutraCoisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutraCoisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelDadosImovelLayout = new javax.swing.GroupLayout(painelDadosImovel);
        painelDadosImovel.setLayout(painelDadosImovelLayout);
        painelDadosImovelLayout.setHorizontalGroup(
            painelDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosImovelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(painelDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkQuintal)
                    .addComponent(checkSacada)
                    .addComponent(checkAnivalEstimacao)
                    .addComponent(checkOutraCoisa))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(painelDadosImovelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNumeroComodos, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(comboNumeroComodos, 0, 1, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelDadosImovelLayout.setVerticalGroup(
            painelDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelDadosImovelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelDadosImovelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroComodos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboNumeroComodos))
                .addGap(18, 18, 18)
                .addComponent(checkSacada)
                .addGap(18, 18, 18)
                .addComponent(checkQuintal)
                .addGap(18, 18, 18)
                .addComponent(checkAnivalEstimacao)
                .addGap(18, 18, 18)
                .addComponent(checkOutraCoisa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtCartaoObrigatorio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCartaoObrigatorio.setText("É obrigatório o cadastro de cartão de crédito em nome do usuário.");

        botaoCadastraUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoCadastraUsuario.setText("Cadastrar Usuário");
        botaoCadastraUsuario.setBorder(new javax.swing.border.MatteBorder(null));
        botaoCadastraUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastraUsuarioActionPerformed(evt);
            }
        });

        txtCamposObrigatorios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCamposObrigatorios.setText("* Estes campos são de preenchimento obrigatório.");

        botaoCancela.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoCancela.setForeground(new java.awt.Color(153, 0, 51));
        botaoCancela.setText("Cancelar");
        botaoCancela.setBorder(new javax.swing.border.MatteBorder(null));
        botaoCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCancelaActionPerformed(evt);
            }
        });

        try {
            campoCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCPF.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtDigiteSenha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtDigiteSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDigiteSenha.setText("Escolha uma senha de 8 dígitos,");

        txtRepitaSenha.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtRepitaSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRepitaSenha.setText("Repita a senha: *");

        campoSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoSenha.setText("jPasswordField1");
        campoSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoSenhaFocusGained(evt);
            }
        });

        campoRepeteSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoRepeteSenha.setText("jPasswordField1");
        campoRepeteSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoRepeteSenhaFocusGained(evt);
            }
        });

        campoEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            campoCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCelular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoCelular.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCelularActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtEmail.setText("E-mail *");

        txtCelular.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtCelular.setText("Celular *");

        campoRG.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        campoRG.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRGActionPerformed(evt);
            }
        });

        txtDigiteSenha1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtDigiteSenha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDigiteSenha1.setText("com letras e números: *");

        javax.swing.GroupLayout painelContratanteLayout = new javax.swing.GroupLayout(painelContratante);
        painelContratante.setLayout(painelContratanteLayout);
        painelContratanteLayout.setHorizontalGroup(
            painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContratanteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelContratanteLayout.createSequentialGroup()
                        .addComponent(txtCamposObrigatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelContratanteLayout.createSequentialGroup()
                        .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoObservacoes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRG)
                            .addComponent(txtCPF)
                            .addComponent(txtNome)
                            .addComponent(txtHasCartaCadastrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoCadastraCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEndereco)
                            .addComponent(txtCartaoObrigatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoCPF)
                            .addComponent(txtObservacoes)
                            .addGroup(painelContratanteLayout.createSequentialGroup()
                                .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail))
                                .addGap(18, 18, 18)
                                .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCelular)
                                    .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(campoNome)
                            .addComponent(campoRG))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelContratanteLayout.createSequentialGroup()
                                .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(painelDadosImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelContratanteLayout.createSequentialGroup()
                                        .addComponent(botaoCancela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botaoCadastraUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelContratanteLayout.createSequentialGroup()
                                .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDigiteSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(campoSenha)
                                        .addComponent(campoRepeteSenha)
                                        .addComponent(txtDigiteSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                        .addComponent(txtRepitaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(80, 80, 80))))))
        );
        painelContratanteLayout.setVerticalGroup(
            painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelContratanteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelContratanteLayout.createSequentialGroup()
                        .addComponent(txtNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCPF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoRG, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelContratanteLayout.createSequentialGroup()
                        .addComponent(painelDadosImovel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(txtDigiteSenha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelContratanteLayout.createSequentialGroup()
                        .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail)
                            .addComponent(txtCelular))
                        .addGap(12, 12, 12)
                        .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObservacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoObservacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHasCartaCadastrado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(painelContratanteLayout.createSequentialGroup()
                        .addComponent(txtDigiteSenha1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRepitaSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoRepeteSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)))
                .addGroup(painelContratanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCadastraUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelContratanteLayout.createSequentialGroup()
                        .addComponent(botaoCadastraCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(botaoCancela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCartaoObrigatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCamposObrigatorios))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelContratante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelContratante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCelularActionPerformed

    private void botaoCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCancelaActionPerformed
        ControladorContratante.getInstance().abreTelaInicial();
        dispose();
    }//GEN-LAST:event_botaoCancelaActionPerformed

    private void botaoCadastraUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraUsuarioActionPerformed
        //colocar codigo para cadastrar usuário
        if (verificaDados()) {
            cpf = Long.parseLong(cpfTemp);
            System.out.println(cpf);
            rg = Long.parseLong(rgTemp);
            System.out.println(rg);
            String numComodosTemp = comboNumeroComodos.getSelectedItem().toString().trim();
            int numComodos = Integer.parseInt(numComodosTemp, 0);
            
            String senha = new String(campoSenha.getPassword());
            ControladorContratante.getInstance().cadastrarContratante(
                senha,
                cpf,
                rg,
                campoNome.getText().trim(),
                campoEndereco.getText().trim(),
                campoObservacoes.getText().trim(),
                numComodos,
                checkQuintal.isSelected(),
                checkSacada.isSelected(),
                checkAnivalEstimacao.isSelected(),
                checkOutraCoisa.isSelected(),
                rgTemp,
                campoEmail.getText().trim()
            );
        }

    }//GEN-LAST:event_botaoCadastraUsuarioActionPerformed

    private void checkOutraCoisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutraCoisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkOutraCoisaActionPerformed

    private void checkAnivalEstimacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAnivalEstimacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAnivalEstimacaoActionPerformed

    private void checkQuintalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkQuintalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkQuintalActionPerformed

    private void comboNumeroComodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNumeroComodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboNumeroComodosActionPerformed

    private void botaoCadastraCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastraCartaoActionPerformed
        ControladorContratante.getInstance().abreTelaCartao();
    }//GEN-LAST:event_botaoCadastraCartaoActionPerformed

    private void campoSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoSenhaFocusGained
        campoSenha.setText("");
    }//GEN-LAST:event_campoSenhaFocusGained

    private void campoRepeteSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoRepeteSenhaFocusGained
        campoRepeteSenha.setText("");
    }//GEN-LAST:event_campoRepeteSenhaFocusGained

    private void campoRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoRGActionPerformed

    public void cartaoCadastrado() {
        txtHasCartaCadastrado.setText("Cartão cadastrado");
        botaoCadastraCartao.setText("Atualizar cartão");
    }

    private boolean verificaDados() {
        cpfTemp = campoCPF.getText().trim().replaceAll("\\.|-", "");
        celTemp = campoCelular.getText().trim().replaceAll(" ", "");
            System.out.println(celTemp);
        rgTemp = campoRG.getText().trim().substring(0, 11);
        
        if (campoNome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatorio cadastrar o seu nome", "Campo Obrigatório", JOptionPane.DEFAULT_OPTION);
            return false;
        } else if (cpfTemp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatorio cadastrar CPF", "Campo Obrigatório", JOptionPane.DEFAULT_OPTION);
            return false;
        } else if (!ControladorContratante.getInstance().validaCPF(cpfTemp)) {
            JOptionPane.showMessageDialog(null, "É obrigatorio cadastrar CPF válido", "CPF inválido", JOptionPane.DEFAULT_OPTION);
            return false;
        } else if (rgTemp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatorio cadastrar RG", "Campo Obrigatório", JOptionPane.DEFAULT_OPTION);
            return false;
        } else if (campoEndereco.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatorio cadastrar o seu endereço", "Campo Obrigatório", JOptionPane.DEFAULT_OPTION);
            return false;
        } else if (celTemp.isEmpty()){
            JOptionPane.showMessageDialog(null, "É obrigatorio cadastrar um número de celular válido", "Campo Obrigatório", JOptionPane.DEFAULT_OPTION);
            return false;
        } else if (celTemp.length() != 14){    
            JOptionPane.showMessageDialog(null, "É obrigatorio cadastrar um número de celular válido", "Celular inválido", JOptionPane.DEFAULT_OPTION);
            return false;
        } else if (campoEmail.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "É obrigatorio cadastrar o seu e-mail", "Campo Obrigatório", JOptionPane.DEFAULT_OPTION);
            return false;
        } else if (!campoEmail.getText().trim().contains("@")){    
            JOptionPane.showMessageDialog(null, "É obrigatorio cadastrar um e-mail válido", "E-mail inválido", JOptionPane.DEFAULT_OPTION);
            return false;    
        } else if (!txtHasCartaCadastrado.getText().equals("Cartão cadastrado")) {
            JOptionPane.showMessageDialog(null, "É obrigatorio cadastrar um cartão", "Cartão Obrigatório", JOptionPane.DEFAULT_OPTION);
            return false;
        } else if (campoSenha.getPassword().length != 8 || campoRepeteSenha.getPassword().length != 8) {
            JOptionPane.showMessageDialog(null, "A senha precisa ter 8 dígitos com numeros e letras", "Senha não confere", JOptionPane.DEFAULT_OPTION);
            return false;
        } else if (!verificaRepeteSenha(campoSenha.getPassword(), campoRepeteSenha.getPassword())) {
            JOptionPane.showMessageDialog(null, "Senha não confere", "Senha não confere", JOptionPane.DEFAULT_OPTION);
            return false;
        } else if (!verificaCompexidadeSenha(campoSenha.getPassword())) {
            JOptionPane.showMessageDialog(null, "A senha precisa ter 8 dígitos com numeros e letras", "Senha não confere", JOptionPane.DEFAULT_OPTION);
            return false;
        }

        return true;
    }

    private boolean verificaRepeteSenha(char[] senha, char[] confereSenha) {
        String senhaTemp = new String(senha);
        String senhaConfereTemp = new String(confereSenha);
        return senhaTemp.equals(senhaConfereTemp);
    }

    private boolean verificaCompexidadeSenha(char[] senha) {
        String senhaTemp = new String(senha);
        return senhaTemp.replaceAll("1^9", "").length() == senhaTemp.length()
                && senhaTemp.replaceAll("a^Z", "").length() == senhaTemp.length();
    }

    public void limpaDados() {
        botaoCadastraCartao.setText("Cadastrar cartão *");
        txtCartaoObrigatorio.setText("Sem cartão cadastrado");
        campoCPF.setValue(null);
        campoCelular.setValue(null);
        campoEmail.setText("");
        campoEndereco.setText("");
        campoNome.setText("");
        campoObservacoes.setText("");
        campoRG.setText("");
        campoRepeteSenha.removeAll();
        campoSenha.repaint();
        checkAnivalEstimacao.setSelected(false);
        checkQuintal.setSelected(false);
        checkSacada.setSelected(false);
        comboNumeroComodos.setSelectedIndex(0);
        checkOutraCoisa.setSelected(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastraCartao;
    private javax.swing.JButton botaoCadastraUsuario;
    private javax.swing.JButton botaoCancela;
    private javax.swing.JFormattedTextField campoCPF;
    private javax.swing.JFormattedTextField campoCelular;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoObservacoes;
    private javax.swing.JFormattedTextField campoRG;
    private javax.swing.JPasswordField campoRepeteSenha;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JCheckBox checkAnivalEstimacao;
    private javax.swing.JCheckBox checkOutraCoisa;
    private javax.swing.JCheckBox checkQuintal;
    private javax.swing.JCheckBox checkSacada;
    private javax.swing.JComboBox<String> comboNumeroComodos;
    private javax.swing.JPanel painelContratante;
    private javax.swing.JPanel painelDadosImovel;
    private javax.swing.JLabel txtCPF;
    private javax.swing.JLabel txtCamposObrigatorios;
    private javax.swing.JLabel txtCartaoObrigatorio;
    private javax.swing.JLabel txtCelular;
    private javax.swing.JLabel txtDigiteSenha;
    private javax.swing.JLabel txtDigiteSenha1;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtEndereco;
    private javax.swing.JLabel txtHasCartaCadastrado;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtNumeroComodos;
    private javax.swing.JLabel txtObservacoes;
    private javax.swing.JLabel txtRG;
    private javax.swing.JLabel txtRepitaSenha;
    // End of variables declaration//GEN-END:variables
}
