/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko3t4;
import java.util.ArrayList;
public class BottleDispenser {
    private int bottles;
    // The array for the Bottle-objects
    ArrayList<Bottle> bottle_array = new ArrayList<Bottle>();
    private int money;
    private String name;
    public BottleDispenser() {
        bottles = 6;
        money = 0;
        
        // Initialize the array
       
        // Add Bottle-objects to the array
        for(int i = 0; i<bottles; i++) {
            // Use the default constructor to create new Bottles
            bottle_array.add(new Bottle());
        }
            /*System.out.println(bottle_array.get(1).getPrice());
            System.out.println(bottle_array);*/
            
            /*bottle_array.remove(1);*/
             
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
        if (bottles>0 && money>=bottle_array.get(1).getPrice()){
            System.out.println("KACHUNK! "+bottle_array.get(1).getName()+" came out of the dispenser!");
            bottles-=1;
            money-=1;
        }
        else if (money<bottle_array.get(1).getPrice()){
            System.out.println("Add money first!");
        }
        else  {
            System.out.println("Klink Klink. Money came out!"); 
        }
    }
    
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink. Money came out!");
    }
    
    public void bottleList() {
        for(int i = 1; i<bottles; i++) {
            System.out.println(i+". Name: "+bottle_array.get(i).getName());
            System.out.println("    Size: "+bottle_array.get(i).getSize()+" Price: "+bottle_array.get(i).getPrice());
        }
    }
    
   
    
    
}

