/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko3t5;

import java.util.ArrayList;
public class Bottle {
    private String name;
    private double price;
    private double size;
    
    public Bottle(String n, double p, double s){
        name=n;
        price=p;
        size=s;
    }
    
  
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public double getSize(){
        return size;
    }
}