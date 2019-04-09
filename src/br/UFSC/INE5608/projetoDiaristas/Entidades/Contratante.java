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
public class Contratante {
    private Integer numeroCPF;
    private Integer numeroRG;
    private String nome;
    private String endereco;
    private CartaoDeCredito cartaoDeCredito;
    private String observacoes;
    private int numeroComodos;
    private boolean possuiQuintal;
    private boolean possuiSacada;
    private boolean possuiAnimal;
    private boolean outraCoisa;

    public Contratante(Integer numeroCPF, Integer numeroRG, String nome, String endereco, 
            CartaoDeCredito cartaoDeCredito, int numeroComodos) {
        this.numeroCPF = numeroCPF;
        this.numeroRG = numeroRG;
        this.nome = nome;
        this.endereco = endereco;
        this.cartaoDeCredito = cartaoDeCredito;
        this.numeroComodos = numeroComodos;
    }

    
    public Integer getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(Integer numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public Integer getNumeroRG() {
        return numeroRG;
    }

    public void setNumeroRG(Integer numeroRG) {
        this.numeroRG = numeroRG;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public CartaoDeCredito getCartaoDeCredito() {
        return cartaoDeCredito;
    }

    public void setCartaoDeCredito(CartaoDeCredito cartaoDeCredito) {
        this.cartaoDeCredito = cartaoDeCredito;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getNumeroComodos() {
        return numeroComodos;
    }

    public void setNumeroComodos(int numeroComodos) {
        this.numeroComodos = numeroComodos;
    }

    public boolean isPossuiQuintal() {
        return possuiQuintal;
    }

    public void setPossuiQuintal(boolean possuiQuintal) {
        this.possuiQuintal = possuiQuintal;
    }

    public boolean isPossuiSacada() {
        return possuiSacada;
    }

    public void setPossuiSacada(boolean possuiSacada) {
        this.possuiSacada = possuiSacada;
    }

    public boolean isPossuiAnimal() {
        return possuiAnimal;
    }

    public void setPossuiAnimal(boolean possuiAnimal) {
        this.possuiAnimal = possuiAnimal;
    }

    public boolean isOutraCoisa() {
        return outraCoisa;
    }

    public void setOutraCoisa(boolean outraCoisa) {
        this.outraCoisa = outraCoisa;
    }
    
    public Contratante bustaContratantePeloCPF (Integer cpf){
        return null;
    }
}
