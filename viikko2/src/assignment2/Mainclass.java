package assignment2;

import viikko2.Dog;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		dog1.setName("Rekku");
		dog2.setName("Musti");
		dog1.speak("Hau!");
		System.out.println(dog2.getName());
				

	}

}