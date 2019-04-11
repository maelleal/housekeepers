/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Controladores;

import br.UFSC.INE5608.projetoDiaristas.Telas.TelaCadastraCartao;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaCadastroContaBancaria;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaCadastroContratante;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaCadastroDiarista;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaInicial;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaLogin;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaPrincipalContratante;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaPrincipalDiarista;

/**
 *
 * @author Ismael
 */
public class ControladorPrincipal {
    private static ControladorPrincipal instancia;
    
    public static ControladorPrincipal getInstance() {
        if(instancia == null){
            instancia = new ControladorPrincipal();
        }
        return instancia;
    }
    public void abreTelaCadastraCartao(){
       TelaCadastraCartao.getInstance().setVisible(true);
    }
    
    public void abreTelaCadastroContaBancaria(){
        TelaCadastroContaBancaria.getInstance().setVisible(true);
    }
    
    public void abreTelaCadastroContratante (){
        TelaCadastroContratante.getInstance().setVisible(true);
    }
    
    public void abreTelaCadastroDiarista (){
        TelaCadastroDiarista.getInstance().setVisible(true);
    }
    
    public void abreTelaInicial (){
        TelaInicial.getInstance().setVisible(true);
    }
    
    public void abreTelaLogin (){
        TelaLogin.getInstance().setVisible(true);
    }
    
    public void abreTelaPrincipalContratante (){
        TelaPrincipalContratante.getInstance().setVisible(true);
    }
    
    public void abreTelaPrincipalDiarista (){
        TelaPrincipalDiarista.getInstance().setVisible(true);
    }
    
}
