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
    
   
   
   public Productor (Buffer b){
       this.buffer = b ;
   }
   public void correr (){
       while (true){
          char c = Letras.charAt((int)(Math.random()* Letras.length()));
       buffer.producir(c);
       System.out.print("Depositado exitosamente el caracter "+ c + "del buffer");
       
           try {
               sleep ((int) (Math.random() * 4000));
           } catch (InterruptedException ex) {
               Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
   }
}
