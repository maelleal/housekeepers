/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Controladores;

import br.UFSC.INE5608.projetoDiaristas.Entidades.DiaristaDAO;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaCadastroDiarista;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaPrincipalDiarista;

/**
 *
 * @author Ismael
 */
public class ControladorDiarista {
    private static ControladorDiarista instancia;
    
    public static ControladorDiarista getInstance() {
        if(instancia == null){
            instancia = new ControladorDiarista();
        }
        return instancia;
    }
    
    
    
    public void abreTelaCadastroDiarista(){
        TelaCadastroDiarista.getInstance().setVisible(true);
    }
    public boolean verificaCadastro(Long cpf){
        try {
            if(DiaristaDAO.getInstancia().get(cpf) != null){
            return true;
        }
        } catch (Exception e) {
            
        }
        return false;
    }
    public boolean verificaLogin (Long cpf, String senha){
        if (DiaristaDAO.getInstancia().get(cpf).getSenha().equals(senha)) {
            return true;
        }
        return false;
    }

    void abreTelaPrincipalDiarista(Long cpf) {
        //TelaPrincipalDiarista.getInstance().setDadosDiarista();
        TelaPrincipalDiarista.getInstance().setVisible(true);
    }

    public void abreTelaInicial() {
        ControladorPrincipal.getInstance().abreTelaInicial();
    }
}
