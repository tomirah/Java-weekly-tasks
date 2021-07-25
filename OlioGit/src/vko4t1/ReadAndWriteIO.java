/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko4t1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileReader;

public class ReadAndWriteIO{
    private String file;
    
    
    public void readFile(){
       //Scanner sc = new Scanner("testi.txt");
        //System.out.println(sc.nextLine());
        try {
            BufferedReader br = new BufferedReader(new FileReader("testi.txt"));
            String s="";
            while ((s= br.readLine()) != null)
                System.out.println(s);
        }
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        } catch (IOException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
   
    }
    
    
    public void writeFile(){
        
    }
    
    
    
}
