package viikko2;


public class Dog {
	private String name;
	private String sentence;
	public void setName(String s) {
		name = s;
		System.out.println("Hey, my name is "+name+"!");
	}
	public void speak(String x) {
		sentence = x;
				System.out.println(x);
	}
}
