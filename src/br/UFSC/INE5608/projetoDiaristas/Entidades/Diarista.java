/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Entidades;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Ismael
 */
public class Diarista implements Serializable {
    private String senha;
    private Long numeroCPF;
    private Long numeroRG;
    private String nome;
    private String endereco;
    private ContaBancaria contaBancaria;
    private String email;
    private String numeroCelular;
    private String observacoes;
    private int valorDiaria;
    private boolean receberDinheiro;
    private ArrayList<String> diasDaSemana;

    public Diarista(String senha, Long numeroCPF, Long numeroRG, String nome, String endereco, 
            ContaBancaria contaBancaria, int valorDiaria, ArrayList<String> diasDaSemana, 
                String numeroCelular, String email) {
        this.senha = senha;
        this.numeroCPF = numeroCPF;
        this.numeroRG = numeroRG;
        this.nome = nome;
        this.endereco = endereco;
        this.contaBancaria = contaBancaria;
        this.valorDiaria = valorDiaria;
        this.diasDaSemana = diasDaSemana;
        this.email = email;
        this.numeroCelular = numeroCelular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(int valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public boolean isReceberDinheiro() {
        return receberDinheiro;
    }

    public void setReceberDinheiro(boolean receberDinheiro) {
        this.receberDinheiro = receberDinheiro;
    }

    public ArrayList<String> getDiasDaSemana() {
        return diasDaSemana;
    }

    public void setDiasDaSemana(ArrayList<String> diasDaSemana) {
        this.diasDaSemana = diasDaSemana;
    }

    public String getEmail() {
        return email;
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
