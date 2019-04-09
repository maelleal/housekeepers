/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Entidades;

/**
 *
 * @author Ismael
 */
class CartaoDeCredito {
    private String nomeCartao;
    private String numeroCartao;
    private int validade;
    private int codigoCVV;
    private Integer cpfProprietario;

    public CartaoDeCredito(String nomeCartao, String numeroCartao, int validade, int codigoCVV, Integer cpfProprietario) {
        this.nomeCartao = nomeCartao;
        this.numeroCartao = numeroCartao;
        this.validade = validade;
        this.codigoCVV = codigoCVV;
        this.cpfProprietario = cpfProprietario;
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

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public int getCodigoCVV() {
        return codigoCVV;
    }

    public void setCodigoCVV(int codigoCVV) {
        this.codigoCVV = codigoCVV;
    }

    public Integer getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(Integer cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
    }
    
    
}
