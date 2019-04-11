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
public class ContratanteDAO implements Serializable {
    private static ContratanteDAO instancia;
    private HashMap<Integer, Contratante> cacheContratantes = new HashMap<>();
    private final String arquivoContratantes = "Contratantes.dat";
    
    private ContratanteDAO (){
        load();
    }
    
    public Contratante get(Integer numeroContratante){
        return cacheContratantes.get(numeroContratante);
    }
    
    public void put(Contratante contratante){
        cacheContratantes.put(contratante.getNumeroCPF(), contratante);
        this.persist();
    }
    
    public void remove(Integer numeroContratante){
	cacheContratantes.remove(numeroContratante);
	persist();
    }
    
    public void persist(){
        try{
           FileOutputStream fout = new FileOutputStream(arquivoContratantes);
           ObjectOutputStream oo = new ObjectOutputStream(fout);
           oo.writeObject(cacheContratantes);
           
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
            FileInputStream fin = new FileInputStream(arquivoContratantes);
            ObjectInputStream oi = new ObjectInputStream(fin);
        
            this.cacheContratantes = (HashMap<Integer, Contratante>) oi.readObject();
            
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
    
    public static ContratanteDAO getInstancia(){
        if(instancia == null){
            instancia = new ContratanteDAO();
        }
        return instancia;
    }
    
    public Collection<Contratante> getList(){
	return cacheContratantes.values();
    }
}
