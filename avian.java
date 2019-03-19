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
public class avian {
    
    int age;
    int size;
    String sex;
    String species;
    String color;
    
    
    public avian(int age, int size, String color, String species, String sex){
        
        this.age = age;
        this.color = color;
        this.size = size;
        this.species = species;
        this.sex = sex;
        
    }
    
    public void avianStats(){
    
        System.out.println("Age " + age);
        System.out.println("size " + size);
        System.out.println("species " + species);
        System.out.println("color " + color);
        System.out.println("sex " + sex);
        System.out.println("");
        
    }
    
    
}
