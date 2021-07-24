/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko3t1;

public class BottleDispenser {
    private int bottles;
    private int money;
    
    public BottleDispenser() {
        bottles = 1;
        money = 0;
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Money was added into the machine!");
    }
    
    public void buyBottle() {
        if (bottles>0 && money>0){
            System.out.println("KACHUNK! Bottle appeared from the machine!");
            bottles-=1;
            money-=1;
        }
        else if (money==0){
            System.out.println("Add money first!");
        }
    }
    
    public void returnMoney() {
        money = 0;
        System.out.println("Klink klink!! All money gone!");
    }
}
