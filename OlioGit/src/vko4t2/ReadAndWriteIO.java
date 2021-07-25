/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko4t2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadAndWriteIO{
    
    private String file;
    
    
    public void readFile(){
       /*File file = new File("testi.txt");
       Scanner sc = null;
       try {
           sc = new Scanner(file);
       } catch (FileNotFoundException e1) {
            e1.printStackTrace();
       }
        System.out.println(sc.nextLine());*/

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
    
    
    public void readAndWrite(){
        try {

            BufferedReader in = new BufferedReader(new FileReader("testi.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
            String inputLine;
            while ((inputLine = in.readLine()) != null){
                out.write(inputLine);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            
        } catch (IOException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    
    
}