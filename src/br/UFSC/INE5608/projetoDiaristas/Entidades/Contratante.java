/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Entidades;

import java.io.Serializable;

/**
 *
 * @author Ismael
 */
public class Contratante implements Serializable{
    private Long numeroCPF;
    private Long numeroRG;
    private String nome;
    private String endereco;
    private String senha;
    private CartaoDeCredito cartaoDeCredito;
    private String email;
    private String numeroCelular;
    private String observacoes;
    private int numeroComodos;
    private boolean possuiQuintal;
    private boolean possuiSacada;
    private boolean possuiAnimal;
    private boolean outraCoisa;

    public Contratante(String senha, Long numeroCPF, Long numeroRG, String nome, 
            String endereco, int numeroComodos, CartaoDeCredito cartaoDeCredito,
                String numeroCelular, String email) {
        this.senha = senha;
        this.numeroCPF = numeroCPF;
        this.numeroRG = numeroRG;
        this.nome = nome;
        this.endereco = endereco;
        this.numeroComodos = numeroComodos;
        this.cartaoDeCredito = cartaoDeCredito;
        this.email = email;
        this.numeroCelular = numeroCelular;
    }

    
    public Long getNumeroCPF() {
        return numeroCPF;
    }

    public void setNumeroCPF(Long numeroCPF) {
        this.numeroCPF = numeroCPF;
    }

    public Long getNumeroRG() {
        return numeroRG;
    }

    public void setNumeroRG(Long numeroRG) {
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
}
