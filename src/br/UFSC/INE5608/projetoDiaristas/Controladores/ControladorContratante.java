/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Controladores;

import br.UFSC.INE5608.projetoDiaristas.Entidades.Contratante;
import br.UFSC.INE5608.projetoDiaristas.Entidades.ContratanteDAO;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaCadastroContratante;
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

    public void cadastrarContratante(
            Long numeroCPF, Long numeroRG, String nome, String endereco,
                String observacoes, int numeroComodos, boolean possuiQuintal, boolean possuiSacada, 
                    boolean possuiAnimal, boolean outraCoisa) {
        
        if (verificaCadastro(numeroCPF)) {
            JOptionPane.showMessageDialog(null, "Usuário já cadastrado", "Cadastro de usuário", JOptionPane.DEFAULT_OPTION);
        } else {

            Contratante contratante = new Contratante(numeroCPF, numeroRG, nome, endereco, numeroComodos,
                    ControladorCartaoCredito.getInstance().cadastraCartao(numeroCPF));

            contratante.setObservacoes(observacoes);
            contratante.setPossuiQuintal(possuiQuintal);
            contratante.setPossuiSacada(possuiSacada);
            contratante.setPossuiAnimal(possuiAnimal);
            contratante.setOutraCoisa(possuiSacada);
            // serializa
            ContratanteDAO.getInstancia().put(contratante);
            ControladorPrincipal.getInstance().abreTelaInicial();
            TelaCadastroContratante.getInstance().dispose();
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
    
    private boolean verificaCadastro(Long cpf){
        try {
            if(ContratanteDAO.getInstancia().get(cpf) != null){
            return true;
        }
        } catch (Exception e) {
            
        }
        
        return false;
    }
}
