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
public class CartaoDeCreditoDAO {
    private static CartaoDeCreditoDAO instancia;
    private HashMap<Integer, CartaoDeCredito> cacheCartaoDeCredito = new HashMap<>();
    private final String arquivoCartaoDeCredito = "CartaoDeCredito.dat";
    
    private CartaoDeCreditoDAO (){
        load();
    }
    
    public CartaoDeCredito get(Integer cpfPropiretario){
        return cacheCartaoDeCredito.get(cpfPropiretario);
    }
    
    public void put(CartaoDeCredito cartaoDeCredito){
        cacheCartaoDeCredito.put(cartaoDeCredito.getCpfProprietario(), cartaoDeCredito);
        this.persist();
    }
    
    public void remove(Integer cpfPropiretario){
	cacheCartaoDeCredito.remove(cpfPropiretario);
	persist();
    }
    
    public void persist(){
        try{
           FileOutputStream fout = new FileOutputStream(arquivoCartaoDeCredito);
           ObjectOutputStream oo = new ObjectOutputStream(fout);
           oo.writeObject(cacheCartaoDeCredito);
           
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
            FileInputStream fin = new FileInputStream(arquivoCartaoDeCredito);
            ObjectInputStream oi = new ObjectInputStream(fin);
        
            this.cacheCartaoDeCredito = (HashMap<Integer, CartaoDeCredito>) oi.readObject();
            
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
    
    public static CartaoDeCreditoDAO getInstancia(){
        if(instancia == null){
            instancia = new CartaoDeCreditoDAO();
        }
        return instancia;
    }
    
    public Collection<CartaoDeCredito> getList(){
	return cacheCartaoDeCredito.values();
    }
}
