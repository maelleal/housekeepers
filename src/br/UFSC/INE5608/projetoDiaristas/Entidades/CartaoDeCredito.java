package br.UFSC.INE5608.projetoDiaristas.Entidades;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ismael
 */
public class CartaoDeCredito implements Serializable{
    private String nomeCartao;
    private String numeroCartao;
    private String validade;
    private String codigoCVV;
    private Integer cpfProprietario;

    public CartaoDeCredito(String nomeCartao, String numeroCartao, String validade, String codigoCVV, Integer cpfProprietario) {
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

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public String getCodigoCVV() {
        return codigoCVV;
    }

    public void setCodigoCVV(String codigoCVV) {
        this.codigoCVV = codigoCVV;
    }

    public Integer getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(Integer cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
    }
    
}
