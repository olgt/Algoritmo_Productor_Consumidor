/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Sistema;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ender
 */
public class Productor extends Thread {

    private Buffer buffer;
    private final String Letras = "abcdefghijklmnopqrstuvwxyz";
    private int numeroProductor;
    private boolean continuar;

    public Productor(Buffer b, int numeroProductor, boolean continuar) {
        this.buffer = b;
        this.numeroProductor = numeroProductor;
        this.continuar = continuar;
    }

    public void run() {
        while (continuar == true) {
            char c = Letras.charAt((int) (Math.random() * Letras.length()));
            buffer.producir(c);
            System.out.println("Productor " + numeroProductor + " Depositado exitosamente el caracter " + c + " del buffer");

            try {
                sleep((int) (Math.random() * 4000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    public void setContinuar(boolean continuarStatus){
        this.continuar = continuarStatus;
    }
}
