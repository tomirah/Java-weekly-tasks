/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko3t5;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
public class BottleDispenser {
    private int bottles;
    // The array for the Bottle-objects
    ArrayList<Bottle> bottle_array = new ArrayList<Bottle>();
    private double money;
    private String name;
   
    
    public BottleDispenser() {
        bottles = 5;
        money = 0.0;

        bottle_array.add(new Bottle("Pepsi Max",1.8,0.5));
        bottle_array.add(new Bottle("Pepsi Max",2.2,1.5));
        bottle_array.add(new Bottle("Coca-Cola Zero",2.0,0.5));
        bottle_array.add(new Bottle("Coca-Cola Zero",2.5,1.5));
        bottle_array.add(new Bottle("Fanta Zero",1.95,0.5));

             
    }
    
    public void addMoney() {
        money += 1.0;
        System.out.println("Klink! Added more money!");
    }
    
    public void buyBottle() {
        int choice;
        bottleList();
        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        choice=sc.nextInt();
        if (bottles>0 && money>=bottle_array.get(choice-1).getPrice()){
            System.out.println("KACHUNK! "+bottle_array.get(choice-1).getName()+" came out of the dispenser!");
            money-=bottle_array.get((choice-1)).getPrice();
            bottle_array.remove(choice-1);
            money = Math.round(money*100.0)/100.0;
        }
        else if (money<bottle_array.get((choice-1)).getPrice()){
            System.out.println("Add money first!");
        }
        else  {
            System.out.println("Klink klink. Money came out! You got "+money+"€ back"); 
        }
    }
    
    public void returnMoney() {
        DecimalFormat format = (DecimalFormat)NumberFormat.getInstance(new Locale("fi"));
        format.setMinimumFractionDigits(2);
        String formatted = format.format(money);
        System.out.println("Klink klink. Money came out! You got "+formatted+"€ back");
        money = 0.0;
    }
    
    public void bottleList() {
        for(int i = 0; i<bottle_array.size(); i++) {
            System.out.println(i+1+". Name: "+bottle_array.get(i).getName());
            System.out.println("	Size: "+bottle_array.get(i).getSize()+"	Price: "+bottle_array.get(i).getPrice());
        }
    }
    
   
    
    
}
