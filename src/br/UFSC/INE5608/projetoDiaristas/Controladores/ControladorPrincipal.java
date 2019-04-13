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
import javax.swing.JOptionPane;

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
    
    public void abreTelaCadastroContratante (){
        ControladorContratante.getInstance().abreTelaCadastroContratante();
    }
    
    public void abreTelaCadastroDiarista (){
        ControladorDiarista.getInstance().abreTelaCadastroDiarista();
    }
      
    public void abreTelaInicial (){
        TelaInicial.getInstance().setVisible(true);
    }
    
    public void abreTelaLogin (){
        TelaLogin.getInstance().setVisible(true);
    }
    
    public int validaUsuario (Long cpf){
        if(ControladorContratante.getInstance().verificaCadastro(cpf)){
            System.out.println("Entrando na opcao 2");
            return 2;
        } else if(ControladorDiarista.getInstance().verificaCadastro(cpf)){
            return 3;
        } else {  
            return -1;
        }
    }
    public boolean validaSenhaDiarista(Long cpf, String senha){
        return ControladorDiarista.getInstance().verificaLogin(cpf, senha);
    }
    public boolean validaSenhaContratante(Long cpf, String senha){
        return ControladorContratante.getInstance().verificaLogin(cpf, senha);
    }
    
    public void realizaLogin(Long cpf, String senha){
        switch (validaUsuario(cpf)) {
            case 2:
                if(validaSenhaContratante(cpf, senha)){
                    TelaLogin.getInstance().dispose();
                    ControladorContratante.getInstance().abreTelaPrincipalContratante(cpf);
                } else {
                    JOptionPane.showMessageDialog(null, "Senha não confere", "Senha não confere", JOptionPane.DEFAULT_OPTION);
                }  
                break;
            case 3:
                if(validaSenhaDiarista(cpf, senha)){
                    ControladorDiarista.getInstance().abreTelaPrincipalDiarista(cpf);
                    TelaInicial.getInstance().dispose();
                }   else {
                    JOptionPane.showMessageDialog(null, "Senha não confere", "Senha não confere", JOptionPane.DEFAULT_OPTION);
                }   
                break;
            case -1:
                JOptionPane.showMessageDialog(null, "Usuário não cadastrado", "Cadastro de usuário", JOptionPane.DEFAULT_OPTION);
                break;
            default:
                break;
        }
    }
    
    
}
