/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;



/**
 *
 * @author Dutan2000
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("hola");
    }
        /*Cajero[] cajeros;
        Thread[] hilos;
        
        cajeros=new Cajero[3];
        hilos=new Thread[3];
        
        FilaDeClientes fila=new FilaDeClientes(100);
        
        for (int i = 0; i < 3; i++) {
            cajeros[i]=new Cajero(fila,i+1);
            hilos[i]=new Thread(cajeros[i]);
            
            hilos[i].start();
            
        }
        
        for (int i = 0; i < 100; i++) {
            Cliente c=new Cliente(fila);
            c.entrarABanco();
        }
        Cajero.esperar(30);
        
        for (int i = 0; i < 3; i++) {
            cajeros[i].cerrarBanco();
            hilos[i].join();
        }
        System.out.println("Banco Cerrado");  
        
    }*/
    
}
