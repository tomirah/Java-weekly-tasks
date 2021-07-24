/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko3t4;
import java.util.ArrayList;
public class Bottle {
    private String name="Pepsi Max";
    private String manufacturer="Pepsi";
    private double  total_energy=0.3;
    private double price=1.80;
    private double size=0.5;
    
    public Bottle(){}
    public Bottle(String name, double price, double size){}
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