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
    private Integer numeroCPF;
    private Integer numeroRG;
    private String nome;
    private String endereco;
    private ContaBancaria contaBancaria;
    private String observacoes;
    private int valorDiaria;
    private boolean receberDinheiro;
    private ArrayList<String> diasDaSemana;

    public Diarista(Integer numeroCPF, Integer numeroRG, String nome, String endereco, ContaBancaria contaBancaria, int valorDiaria, ArrayList<String> diasDaSemana) {
        this.numeroCPF = numeroCPF;
        this.numeroRG = numeroRG;
        this.nome = nome;
        this.endereco = endereco;
        this.contaBancaria = contaBancaria;
        this.valorDiaria = valorDiaria;
        this.diasDaSemana = diasDaSemana;
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
    
    public Diarista bustaDiaristaPeloCPF (Integer cpf){
        return null;
    }
    
}
