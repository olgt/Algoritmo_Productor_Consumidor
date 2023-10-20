/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases_Sistema;

/**
 * @author olgt1
 */
public class Main{

    public static void main(String[] args) {
        Buffer b = new Buffer(10);
        Productor p = new Productor(b, 1, true);
        Consumidor c = new Consumidor(b, 1, true);
        Productor c1 = new Productor(b, 2, true);
        Productor c2 = new Productor(b, 2, true);

        p.start();
        c.start();
        c1.start();
        c2.start();
    }
}
