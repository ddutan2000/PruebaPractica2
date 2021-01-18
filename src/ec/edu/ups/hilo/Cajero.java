/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.hilo;

import ec.edu.ups.test.Interfaz;
import ec.edu.ups.test.Test;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;

/**
 *
 * @author Dutan2000
 */
public class Cajero implements Runnable {

    private FilaDeClientes fila;
    private boolean bancoAbierto;
    private int id;
    private Random randomico = new Random();
    private JList listaInterfaz;
    private DefaultListModel<String> modeloLista;

    public Cajero(FilaDeClientes fc, int n, JList lista, DefaultListModel modelo) {
        fila = fc;
        bancoAbierto = true;
        id = n;
        listaInterfaz = lista;
        modeloLista = modelo;
    }

    public static void esperar(int max) {
        Random randomico = new Random();
        int dormir = (1 + randomico.nextInt(max)) * 1000;

        try {
            Thread.currentThread().sleep(dormir);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }

    }

    public void cerrarBanco() {
        bancoAbierto = false;
    }

    /*private void mensajeIngresar(int id, int cliente, int monto, int opcion) {
        synchronized (modeloLista) {
            if (opcion == 1) {
                modeloLista.addElement("el cajero " + id + " esta ocupado por el cliente #:" + cliente + " esta depositando " + monto);
                listaInterfaz.setModel(modeloLista);
            } else {
                modeloLista.addElement("el cajero " + id + " esta ocupado por el cliente #:" + cliente + " esta retirando " + monto);
                listaInterfaz.setModel(modeloLista);
            }

        }
    }*/

 /*private void mensajeSalir(int id) {
        synchronized (modeloLista) {

            modeloLista.addElement("el cajero " + id + " esta desocupado");
            listaInterfaz.setModel(modeloLista);

        }
    }*/
    @Override
    public void run() {
        while (bancoAbierto) {
            int posClienteSinAtender;
            posClienteSinAtender = fila.siguienteCliente();

            if (posClienteSinAtender == -1) {
                esperar(3);
            } else {
                int opcion = randomico.nextInt(1)+1;
                int deposito = randomico.nextInt(2)+1;
                int monto = 0;
                if (opcion == 1) {
                    switch (deposito) {
                        case 1:
                            monto = 100;
                            break;
                        case 2:
                            monto = 50;
                            break;
                        case 3:
                            monto = 20;
                            break;
                        default:
                            break;
                    }
                    //mensajeIngresar(id, posClienteSinAtender, monto, opcion);\modeloLista.addElement("el cajero " + id + " esta ocupado por el cliente #:" + cliente + " esta depositando " + monto);
                    /*c1=interfaz.getCliente1().getLocation().x;
                    if(c1<interfaz.getCajero1().getLocation().x){
                        interfaz.getCliente1().setLocation(interfaz.getCliente1().getLocation().x+10,interfaz.getCliente1().getLocation().y );
                    }*/
                    //System.out.println("el cajero " + id + " esta ocupado por el cliente #:" + posClienteSinAtender + " esta depositando " + monto);
                    modeloLista.addElement("el cajero " + id + " esta ocupado por el cliente #:" + posClienteSinAtender + " esta depositando " + monto);
                    listaInterfaz.setModel(modeloLista);
                    esperar(3);
                    fila.salirDeFila(posClienteSinAtender);
                    //System.out.println("el cajero " + id + " esta desocupado");

                    //mensajeSalir(id);
                    modeloLista.addElement("el cajero " + id + " esta desocupado");
                    listaInterfaz.setModel(modeloLista);
                } else {
                    switch (deposito) {
                        case 1:
                            monto = 100;
                            break;
                        case 2:
                            monto = 50;
                            break;
                        case 3:
                            monto = 20;
                            break;
                        default:
                            break;
                    }
                    //mensajeIngresar(id, posClienteSinAtender, monto, opcion);
                    //System.out.println("el cajero " + id + " esta ocupado por el cliente #:" + posClienteSinAtender + " esta retirando " + monto);
                    modeloLista.addElement("el cajero " + id + " esta ocupado por el cliente #:" + posClienteSinAtender + " esta retirando " + monto);
                    listaInterfaz.setModel(modeloLista);
                    esperar(3);
                    fila.salirDeFila(posClienteSinAtender);
                    //mensajeSalir(id);
                    //System.out.println("el cajero " + id + " esta desocupado");
                    modeloLista.addElement("el cajero " + id + " esta desocupado");
                    listaInterfaz.setModel(modeloLista);
                }

            }
        }
    }

}
