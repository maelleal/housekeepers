/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Controladores;

import br.UFSC.INE5608.projetoDiaristas.Entidades.CartaoDeCredito;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaCadastraCartao;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaCadastroContratante;

/**
 *
 * @author Ismael
 */
public class ControladorContratante {
    private static ControladorContratante instancia;
    
    public static ControladorContratante getInstance() {
        if(instancia == null){
            instancia = new ControladorContratante();
        }
        return instancia;
    }
    
    private ControladorContratante(){
        
    }
    
    public void abreTelaCartao(){
        ControladorCartaoCredito.getInstance().abreTelaCadastraCartao();
    }
        
    public void abreTelaInicial(){
        ControladorPrincipal.getInstance().abreTelaInicial();
    }
    
    public void abreTelaCadastroContratante(){
        TelaCadastroContratante.getInstance().setVisible(true);
    }
    
    
    
    
}
