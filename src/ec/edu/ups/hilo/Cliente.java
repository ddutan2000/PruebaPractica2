/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.hilo;

/**
 *
 * @author Dutan2000
 */
public class Cliente {
    private FilaDeClientes fila;

    public Cliente(FilaDeClientes n) {
        fila=n;
    }
    
    public void entrarABanco() {
        int posFilaLibra=fila.posicionDeFilaLibre();
        if(posFilaLibra==-1){
            //System.out.println("no habia espacio en la fila");
        }else{
          //System.out.println("Espera en la fila #"+posFilaLibra);  
        }
        
    }
    
    
}
