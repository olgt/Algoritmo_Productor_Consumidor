/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Sistema;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author olgt1
 */
public class Buffer {

    private char[] buffer;
    private int siguiente;
    private boolean estaVacia;
    private boolean estaLlena;

    public Buffer(int tamanio) {
        this.buffer = new char[tamanio];
        this.siguiente = 0;
        this.estaVacia = true;
        this.estaLlena = false;
    }

    public synchronized char consumir() {
        while (this.estaVacia) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (!this.estaLlena) {
            buffer[siguiente] = ' ';
        }
        siguiente--;

        this.estaLlena = false;
        if (siguiente == 0) {
            this.estaVacia = true;
        }

        notifyAll();

        char c = this.buffer[this.siguiente];
        buffer[siguiente] = ' ';
        return c;

    }

    public synchronized void producir(char c) {
        while (this.estaLlena) {
            try {
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        buffer[siguiente] = c;
        siguiente++;

        this.estaVacia = false;
        if (siguiente == this.buffer.length) {
            this.estaLlena = true;
        }

        notifyAll();
    }

    public String getBuffer() {
        String bufferTexto = "";

        for (int i = 0; i < buffer.length; i++) {
            bufferTexto = bufferTexto + buffer[i];
        }

        return bufferTexto;
    }
}
