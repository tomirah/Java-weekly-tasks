/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vko2t3;

import java.util.Scanner;
public class Mainclass
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Give a name to the dog:");
		
		Dog dog = new Dog();
		dog.setName(sc.nextLine());
		/*Dog dog2 = new Dog();
		dog1.setName("Rekku");
		dog2.setName("Musti");
		dog1.speak("Hau!");*/
		System.out.print("What does the dog say:");
		dog.speak(sc.nextLine());
	}
}
