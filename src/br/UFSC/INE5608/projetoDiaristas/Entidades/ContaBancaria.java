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
class ContaBancaria {
    private String nomeBanco;
    private String tipoConta;
    private int numeroAgencia;
    private int numeroConta;
    private Integer cpfProprietario;
    

    public ContaBancaria(String nomeBanco, String tipoConta, int numeroAgencia, int numeroConta, Integer cpfProprietario) {
        this.nomeBanco = nomeBanco;
        this.tipoConta = tipoConta;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.cpfProprietario = cpfProprietario;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Integer getCpfProprietario() {
        return cpfProprietario;
    }

    public void setCpfProprietario(Integer cpfProprietario) {
        this.cpfProprietario = cpfProprietario;
    }
    
    
}
