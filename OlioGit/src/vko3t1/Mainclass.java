/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko3t1;

public class Mainclass
{
	public static void main(String[] args) {
		
		BottleDispenser bottledispenser = new BottleDispenser();
		
	
		bottledispenser.addMoney();
		bottledispenser.buyBottle();
		bottledispenser.buyBottle();
		bottledispenser.addMoney();
		bottledispenser.addMoney();
		bottledispenser.buyBottle();
		bottledispenser.returnMoney();

	}
}
