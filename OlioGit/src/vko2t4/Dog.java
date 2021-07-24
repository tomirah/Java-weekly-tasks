/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko2t4;
import java.util.Scanner;
public class Dog {
    private String name;
    private String sentence;
    private static Scanner sc = new Scanner(System.in);
    
    public void setName () {
        name = sc.nextLine();
        if (name.trim().isEmpty()){
            name = "Doge";
        }
        System.out.println("Hey, my name is " + name+"!");
    

    }
    public void speak() {
        sentence = sc.nextLine();
        if (sentence.trim().isEmpty()){
            sentence = "Much wow!";
        }
        /*while (sc.hasNext()) {
            int s = sc.nextInt();
            String s = sc.nextString();
        }
        sentence = s;
        if (sentence.trim().isEmpty()){
            sentence = "Much Wow!";
        }*/
        System.out.print(name+": "+sentence);
        
    }/*
    public String getName() {
        return name;
        System.out.println(name);
    }*/
}

