package assignment5;
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
        System.out.println("Hey, my name is " + name);
    

    }
    public void speak() {
        while (sc.hasNext()) {
            if (sc.hasNextBoolean()) {
                sentence = sc.next();
                System.out.println("Such boolean: "+sentence);
            }
            else if (sc.hasNextInt()) {
                sentence=sc.next();
                System.out.println("Such integer: "+sentence);
            }
            else {
                System.out.println(sc.next());

            }
                
            }
            /*else if (sentence.trim().isEmpty());{
                sc.close();
            }
            else {  
                sc.close();*/
            }
            
            
        }
        
    
    /*
    public String getName() {
        return name;
        System.out.println(name);
    }*/