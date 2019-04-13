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
public class ContaBancariaDAO implements Serializable {
    private static ContaBancariaDAO instancia;
    private HashMap<Integer, ContaBancaria> cacheContaBancaria = new HashMap<>();
    private final String arquivoContaBancaria = "ContaBancaria.txt";
    
    private ContaBancariaDAO (){
        load();
    }
    
    public ContaBancaria get(Integer cpfProprietario){
        return cacheContaBancaria.get(cpfProprietario);
    }
    
    public void put(ContaBancaria contaBancaria){
        cacheContaBancaria.put(contaBancaria.getCpfProprietario(), contaBancaria);
        this.persist();
    }
    
    public void remove(Integer cpfProprietario){
	cacheContaBancaria.remove(cpfProprietario);
	persist();
    }
    
    public void persist(){
        try{
           FileOutputStream fout = new FileOutputStream(arquivoContaBancaria);
           ObjectOutputStream oo = new ObjectOutputStream(fout);
           oo.writeObject(cacheContaBancaria);
           
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
            FileInputStream fin = new FileInputStream(arquivoContaBancaria);
            ObjectInputStream oi = new ObjectInputStream(fin);
        
            this.cacheContaBancaria = (HashMap<Integer, ContaBancaria>) oi.readObject();
            
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
    
    public static ContaBancariaDAO getInstancia(){
        if(instancia == null){
            instancia = new ContaBancariaDAO();
        }
        return instancia;
    }
    
    public Collection<ContaBancaria> getList(){
	return cacheContaBancaria.values();
    }
}
