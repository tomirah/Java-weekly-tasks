/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko3t5;

import java.util.ArrayList;
import java.util.Scanner;
public class Mainclass
{
	public static void main(String[] args) {
		
		BottleDispenser bottledispenser = new BottleDispenser();
		Scanner sc = new Scanner(System.in);
		boolean mainLoop = true;
		int choice;
		while(true){
		    System.out.println();
		    System.out.println("*** BOTTLE DISPENSER ***");
		    System.out.println("1) Add money to the machine");
		    System.out.println("2) Buy a bottle");
		    System.out.println("3) Take money out");
		    System.out.println("4) List bottles in the dispenser");
		    System.out.println("0) End");
		    System.out.print("Your choice: ");
		    
		    choice = sc.nextInt();
		  
		  
		  switch(choice){
		      case 1:
		          bottledispenser.addMoney();
		          break;
		          
		          
		      case 2:
		          bottledispenser.buyBottle();
		          break;
		          
		      case 3:
		          bottledispenser.returnMoney();
		          break;
		      
		      case 4:
		          bottledispenser.bottleList();
		          break;
		      case 0:
		          System.exit(0);
		          break;
		          
		          
		      default:
		          System.out.println("This is not a valid Menu option! Please select Another");
		          break;
		  
		  }
		
		  }   
		          
		  
		
		
	
		
		
		
		
		/*bottledispenser.addMoney();
		bottledispenser.buyBottle();
		bottledispenser.buyBottle();
		bottledispenser.addMoney();
		bottledispenser.addMoney();
		bottledispenser.buyBottle();
		bottledispenser.returnMoney();*/

	}
}