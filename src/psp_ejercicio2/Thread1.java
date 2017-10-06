/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ejercicio2;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author otorradomiguez
 */
public class Thread1 extends Thread{
    
    public Thread1(String nombre){
        super(nombre);
    }

    @Override
    public void run() {
        for(int i=1;i<6;i++){
            System.out.println("Iteracion:"+i+" Nombre: "+this.getName());
            try {
                Thread1.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }    
}
