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
public class FilaDeClientes {

    private int FILA_MAX;
    private boolean[] espacioDisponible;
    private boolean[] clienteAtendido;
    private int siguienteClienteEnFila = 0;

    public FilaDeClientes(int n) {
        FILA_MAX = n;
        espacioDisponible = new boolean[FILA_MAX];
        clienteAtendido = new boolean[FILA_MAX];
        for (int i = 0; i < FILA_MAX; i++) {
            espacioDisponible[i] = true;
            clienteAtendido[i] = false;
        }
    }

    public synchronized int posicionDeFilaLibre() {
        int pos = -1;
        for (int i = 0; i < FILA_MAX; i++) {
            if (espacioDisponible[i] == true) {
                espacioDisponible[i] = false;
                return i;
            }
        }
        return pos;
    }

    public void salirDeFila(int n) {
        espacioDisponible[n] = true;
        clienteAtendido[n] = false;

    }

    public synchronized int siguienteCliente() {
        int pos = -1;
        boolean salir;
        int i;
        salir = false;
        i = siguienteClienteEnFila;
        while (!salir) {
            if (espacioDisponible[i] == false && clienteAtendido[i] == false) {
                clienteAtendido[i] = true;
                siguienteClienteEnFila = (i + 1) % FILA_MAX;
                return i;
            }
            i++;
            if (i == FILA_MAX) {
                i = 0;
            }
            if (i == siguienteClienteEnFila) {
                salir=true;
            }
        }
        return pos;
    }

}
