/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Controladores;

/**
 *
 * @author Ismael
 */
public class ControladorContaBancaria {
    private static ControladorContaBancaria instancia;
    
    public static ControladorContaBancaria getInstance() {
        if(instancia == null){
            instancia = new ControladorContaBancaria();
        }
        return instancia;
    }
    
    private ControladorContaBancaria(){
        
    }
}
