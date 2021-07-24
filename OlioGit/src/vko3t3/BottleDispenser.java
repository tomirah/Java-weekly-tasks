/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko3t3;

public class BottleDispenser {
    private int bottles;
    // The array for the Bottle-objects
    private Bottle[] bottle_array;
    private int money;
    private String name;
    
    public BottleDispenser() {
        bottles = 50;
        money = 0;
        
        // Initialize the array
        bottle_array = new Bottle[bottles];
        // Add Bottle-objects to the array
        for(int i = 0; i<bottles; i++) {
            // Use the default constructor to create new Bottles
            bottle_array[i] = new Bottle();
        }
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
        if (bottles>0 && money>=bottle_array[1].getPrice()){
            System.out.println("KACHUNK! "+bottle_array[1].getName()+" came out of the dispenser!");
            bottles-=1;
            money-=1;
        }
        else if (money<bottle_array[1].getPrice()){
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
}