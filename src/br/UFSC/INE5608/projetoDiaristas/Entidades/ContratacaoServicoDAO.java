/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.UFSC.INE5608.projetoDiaristas.Entidades;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Ismael
 */
public class ContratacaoServicoDAO implements Serializable {
    private static ContratacaoServicoDAO instancia;
    private HashMap<Integer, ContratacaoServico> cacheContratacaoServico = new HashMap<>();
    private final String arquivoContratacaoServico = "Diarista.txt";
    
    private ContratacaoServicoDAO (){
        load();
    }
    
    public ContratacaoServico get(Integer codigoContratacaoServico){
        return cacheContratacaoServico.get(codigoContratacaoServico);
    }
    
    public void put(ContratacaoServico contratacao){
        cacheContratacaoServico.put(contratacao.getCodigoContratacaoServico(), contratacao);
        this.persist();
    }
    
    public void remove(Integer codigoContratacaoServico){
	cacheContratacaoServico.remove(codigoContratacaoServico);
	persist();
    }
    
    public void persist(){
        try{
           FileOutputStream fout = new FileOutputStream(arquivoContratacaoServico);
           ObjectOutputStream oo = new ObjectOutputStream(fout);
           oo.writeObject(cacheContratacaoServico);
           
           oo.flush();
           fout.flush();
            
           oo.close();
           fout.close();
           
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            persist();
        }catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void load () {
        try {
            FileInputStream fin = new FileInputStream(arquivoContratacaoServico);
            ObjectInputStream oi = new ObjectInputStream(fin);
        
            this.cacheContratacaoServico = (HashMap<Integer, ContratacaoServico>) oi.readObject();
            
            oi.close();
            fin.close();
        
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            persist();
        
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public static ContratacaoServicoDAO getInstancia(){
        if(instancia == null){
            instancia = new ContratacaoServicoDAO();
        }
        return instancia;
    }
    
    public Collection<ContratacaoServico> getList(){
        load();
	return cacheContratacaoServico.values();
    }
}
