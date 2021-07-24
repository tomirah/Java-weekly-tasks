package assignment5;

public class Mainclass
{
	public static void main(String[] args) {
		
		
		System.out.print("Give a name to the dog:");
		
		Dog dog = new Dog();
		dog.setName();
		/*Dog dog2 = new Dog();
		dog1.setName("Rekku");
		dog2.setName("Musti");
		dog1.speak("Hau");*/
		System.out.print("What does a dog say: ");
		dog.speak();
	}
}
