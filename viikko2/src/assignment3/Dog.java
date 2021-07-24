package assignment3;
public class Dog {
    private String name;
    private String sentence;
    
    public void setName (String s) {
        name = s;
        System.out.println("Hey, my name is " + name+"!");
    

    }
    public void speak(String s) {
        sentence = s;
        System.out.print(name+": "+sentence);
        
    }/*
    public String getName() {
        return name;
        System.out.println(name);
    }*/
}
