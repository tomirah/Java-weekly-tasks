package assignment2;

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
