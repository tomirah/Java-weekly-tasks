package assignment1;

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
