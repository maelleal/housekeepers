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
import java.util.Collection;
import java.util.HashMap;

/**
 *
 * @author Ismael
 */
public class DiaristaDAO {
    private static DiaristaDAO instancia;
    private HashMap<Integer, Diarista> cacheDiaristas = new HashMap<>();
    private final String arquivoDiaristas = "Diarista.dat";
    
    private DiaristaDAO (){
        load();
    }
    
    public Diarista get(Integer numeroDiarista){
        return cacheDiaristas.get(numeroDiarista);
    }
    
    public void put(Diarista diarista){
        cacheDiaristas.put(diarista.getNumeroCPF(), diarista);
        this.persist();
    }
    
    public void remove(Integer numeroDiarista){
	cacheDiaristas.remove(numeroDiarista);
	persist();
    }
    
    public void persist(){
        try{
           FileOutputStream fout = new FileOutputStream(arquivoDiaristas);
           ObjectOutputStream oo = new ObjectOutputStream(fout);
           oo.writeObject(cacheDiaristas);
           
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
            FileInputStream fin = new FileInputStream(arquivoDiaristas);
            ObjectInputStream oi = new ObjectInputStream(fin);
        
            this.cacheDiaristas = (HashMap<Integer, Diarista>) oi.readObject();
            
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
    
    public static DiaristaDAO getInstancia(){
        if(instancia == null){
            instancia = new DiaristaDAO();
        }
        return instancia;
    }
    
    public Collection<Diarista> getList(){
	return cacheDiaristas.values();
    }
}
