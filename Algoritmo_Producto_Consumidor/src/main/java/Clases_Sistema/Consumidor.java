/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Sistema;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author olgt1
 */
public class Consumidor extends Thread {

    private Buffer buffer;
    private int numeroConsumidor;
    private boolean continuar;
    JTextArea textAreaConsola;
    JTextArea textAreaBuffer;

    public Consumidor(Buffer b, int numeroConsumidor, boolean continuar) {
        this.buffer = b;
        this.numeroConsumidor = numeroConsumidor;
        this.continuar = continuar;
    }

    public void run() {
        while (continuar == true) {

            char c = this.buffer.consumir();
            System.out.println("Consumidor " + numeroConsumidor + " Recogido el caracter: " + c + " del buffer");
            this.textAreaConsola.setText(this.textAreaConsola.getText()
                    + "\n"
                    + "Consumidor " + numeroConsumidor + " Recogido el caracter: " + c + " del buffer");
            this.textAreaBuffer.setText(this.buffer.getBuffer());
            try {
                sleep((int) (Math.random() * 4000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void setContinuar(boolean continuarStatus) {
        this.continuar = continuarStatus;
    }

    public void setTextAreaConsola(JTextArea textArea) {
        this.textAreaConsola = textArea;
    }

    public void setTextAreaBuffer(JTextArea textArea) {
        this.textAreaBuffer = textArea;
    }

}
