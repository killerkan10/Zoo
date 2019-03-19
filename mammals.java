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
public class mammals {
         
        int age;
        int weight;
        String type;
        String color;
        String sex;
        
        public mammals(int age, int weight, String color, String sex, String type){
            this.age = age;
            this.color = color;
            this.sex = sex;
            this.type = type;
            this.weight = weight;
    
            
        }
          
        
     public void Stats(){
    
        System.out.println("Age " + age);
        System.out.println("weight " + weight);
        System.out.println("breed " + type);
        System.out.println("color " + color);
        System.out.println("sex " + sex);
        System.out.println("");
    }
    
       
    
}
