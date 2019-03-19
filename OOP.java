/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author adam.evans
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        mammals tiger = new mammals(10,200,"orange and black stripes","male","Tiger");
        avian hawk = new avian(3,20,"brown","hawk","female");
        Actions action = new Actions();
        
        tiger.Stats();
        hawk.avianStats();
        action.feed();
        
        
    }
    
}
