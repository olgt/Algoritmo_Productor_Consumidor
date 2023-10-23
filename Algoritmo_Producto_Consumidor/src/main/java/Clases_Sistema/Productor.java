/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Sistema;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author Ender
 */
public class Productor extends Thread {

    private Buffer buffer;
    private final String Letras = "abcdefghijklmnopqrstuvwxyz";
    private int numeroProductor;
    private boolean continuar;
    JTextArea textAreaConsola;
    JTextArea textAreaBuffer;

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
            this.textAreaConsola.setText(this.textAreaConsola.getText()
                    + "\n"
                    + "Productor " + numeroProductor + " Depositado exitosamente el caracter " + c + " del buffer");
            this.textAreaBuffer.setText(this.buffer.getBuffer());
            try {
                sleep((int) (Math.random() * 4000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void setContinuar(boolean continuarStatus) {
        this.continuar = continuarStatus;
    }

    public boolean getContinuar() {
        return this.continuar;
    }

    public void setTextAreaConsola(JTextArea textArea) {
        this.textAreaConsola = textArea;
    }

    public void setTextAreaBuffer(JTextArea textArea) {
        this.textAreaBuffer = textArea;
    }
}
