/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Controladores;

import br.UFSC.INE5608.projetoDiaristas.Entidades.Contratante;
import br.UFSC.INE5608.projetoDiaristas.Entidades.ContratanteDAO;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaCadastroContratante;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaPrincipalContratante;
import javax.swing.JOptionPane;

/**
 *
 * @author Ismael
 */
public class ControladorContratante {

    private static ControladorContratante instancia;

    public static ControladorContratante getInstance() {
        if (instancia == null) {
            instancia = new ControladorContratante();
        }
        return instancia;
    }

    private ControladorContratante() {

    }

    public void abreTelaCartao() {
        ControladorCartaoCredito.getInstance().abreTelaCadastraCartao();
    }

    public void abreTelaInicial() {
        ControladorPrincipal.getInstance().abreTelaInicial();
    }

    public void abreTelaCadastroContratante() {
        TelaCadastroContratante.getInstance().setVisible(true);
    }

    public void cadastrarContratante(String senha,
            Long numeroCPF, Long numeroRG, String nome, String endereco,
                String observacoes, int numeroComodos, boolean possuiQuintal, boolean possuiSacada, 
                    boolean possuiAnimal, boolean outraCoisa, String celular, String email) {
        
        if (verificaCadastro(numeroCPF)) {
            JOptionPane.showMessageDialog(null, "Usuário já cadastrado", "Cadastro de usuário", JOptionPane.DEFAULT_OPTION);
        } else {

            Contratante contratante = new Contratante(senha, numeroCPF, numeroRG, nome, endereco, numeroComodos,
                    ControladorCartaoCredito.getInstance().cadastraCartao(numeroCPF), celular, email);

            contratante.setObservacoes(observacoes);
            contratante.setPossuiQuintal(possuiQuintal);
            contratante.setPossuiSacada(possuiSacada);
            contratante.setPossuiAnimal(possuiAnimal);
            contratante.setOutraCoisa(possuiSacada);
            // serializa
            ContratanteDAO.getInstancia().put(contratante);
            ControladorPrincipal.getInstance().abreTelaInicial();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso", "Cadastro de usuário", JOptionPane.DEFAULT_OPTION);
            TelaCadastroContratante.getInstance().dispose();
            TelaCadastroContratante.getInstance().limpaDados();
        }
    }

    public boolean validaCPF(String cpf) {
        return ValidaCPF.getInstance().isCPF(cpf);
    }

    void cartaoCadastrado() {
        TelaCadastroContratante.getInstance().cartaoCadastrado();

    }
    
    public boolean verificaCartao(){
        //if(ControladorCartaoCredito.getInstance().buscaCartaoPeloCPF)
        return true;
    }
    
    public boolean verificaCadastro(Long cpf){
        try {
            if(ContratanteDAO.getInstancia().get(cpf) != null){
            return true;
        }
        } catch (Exception e) {
            
        }
        return false;
    }
    public boolean verificaLogin (Long cpf, String senha){
        if (ContratanteDAO.getInstancia().get(cpf).getSenha().equals(senha)) {
            return true;
        }
        return false;
    }

    void abreTelaPrincipalContratante(Long cpf) {
        //TelaPrincipalContratante.getInstance().setDados();
        TelaPrincipalContratante.getInstance().setVisible(true);
    }

    
}
