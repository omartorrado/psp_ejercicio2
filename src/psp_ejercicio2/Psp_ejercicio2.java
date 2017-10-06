/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp_ejercicio2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author otorradomiguez
 */
public class Psp_ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Thread1 t1=new Thread1("Miguel");
            Thread1 t2=new Thread1("Juan");
            Thread1 t3=new Thread1("Pepe");
            Thread1 t4=new Thread1("Oscar");
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            while(t1.isAlive()||t2.isAlive()||t3.isAlive()||t4.isAlive()){
            //Aqui no haga nada mas que esperar
            }
            System.out.println("Ahora ya espero a que terminen mis hilos");        
    }    
}
