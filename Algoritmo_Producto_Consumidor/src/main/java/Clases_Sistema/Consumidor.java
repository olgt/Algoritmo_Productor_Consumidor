/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Sistema;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author olgt1
 */
public class Consumidor extends Thread {

    private Buffer buffer;
    private int numeroConsumidor;
    private boolean continuar;

    public Consumidor(Buffer b, int numeroConsumidor, boolean continar) {
        this.buffer = b;
        this.numeroConsumidor = numeroConsumidor;
        this.continuar  = continuar;

    }

    public void run() {
        while (true) {
            try {
                char c = this.buffer.consumir();
                System.out.println("Consumidor " + numeroConsumidor + " Recogido el caracter: " + c + " del buffer");

                sleep((int) (Math.random() * 4000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
