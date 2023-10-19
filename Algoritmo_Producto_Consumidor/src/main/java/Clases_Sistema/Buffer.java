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
public class Buffer {
   private char [] buffer;
   private int siguiente;
   private boolean EstaVacia, EstaLlena;
 
   
   
   public Buffer (int tamanio){
       this.buffer = new char [tamanio];
       this.siguiente = 0;
       this.EstaVacia = true;
       this.EstaLlena = false;
       
   }
   
   
   public synchronized void producir ( char c){
       while (this.EstaLlena){
           try {
               wait ();
           } catch (InterruptedException ex) {
               Logger.getLogger(Buffer.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       buffer [siguiente] = c;
       siguiente++;
       this.EstaVacia = false;
       if (siguiente ==  this.buffer.length){
           this.EstaLlena = true;
       }
       notifyAll();
   }

}

