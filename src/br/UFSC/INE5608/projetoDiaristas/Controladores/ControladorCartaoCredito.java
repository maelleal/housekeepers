/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Controladores;

import br.UFSC.INE5608.projetoDiaristas.Entidades.CartaoDeCredito;
import br.UFSC.INE5608.projetoDiaristas.Entidades.CartaoDeCreditoDAO;
import br.UFSC.INE5608.projetoDiaristas.Telas.TelaCadastraCartao;

/**
 *
 * @author Ismael
 */
public class ControladorCartaoCredito {
    private static ControladorCartaoCredito instancia;
    private String nomeCartao;
    private String numeroCartao;
    private String dataValidade;
    private String codigoCvv;
    
    public static ControladorCartaoCredito getInstance() {
        if(instancia == null){
            instancia = new ControladorCartaoCredito();
        }
        return instancia;
    }

    public ControladorCartaoCredito() {
        
    }

    public String getNomeCartao() {
        return nomeCartao;
    }

    public void setNomeCartao(String nomeCartao) {
        this.nomeCartao = nomeCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCodigoCvv() {
        return codigoCvv;
    }

    public void setCodigoCvv(String codigoCvv) {
        this.codigoCvv = codigoCvv;
    }
    
    //TELAS
    public void abreTelaCartao(){
        TelaCadastraCartao.getInstance().setVisible(true);
    }
    
    public void abreTelaCadastraCartao() {
        TelaCadastraCartao.getInstance().setVisible(true);
    }
    
    public void abreTelaCadastroContratante(){
        ControladorContratante.getInstance().abreTelaCadastroContratante();
    } 
    
    //CADASTRO CARTAO
    public void setDadosCartao(String numero, String nome, String val, String CodigoCvv){
        this.nomeCartao = numero;
        this.numeroCartao = nome;
        this.dataValidade = val;
        this.codigoCvv = CodigoCvv;
        ControladorContratante.getInstance().cartaoCadastrado();
    }
    
    public CartaoDeCredito cadastraCartao(Long cpfProprietario){
        
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(nomeCartao, numeroCartao, dataValidade, 
                codigoCvv, cpfProprietario);
        CartaoDeCreditoDAO.getInstancia().put(cartaoDeCredito);
        System.out.println("Cartao Cadastrado"); //tirar daqui
        limpaDadosCartao();
        return cartaoDeCredito;
    }
    
    private void limpaDadosCartao(){
        this.nomeCartao = "";
        this.numeroCartao = "";
        this.dataValidade = "";
        this.codigoCvv = "";
    }
}
