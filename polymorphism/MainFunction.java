package polymorphism;

public class MainFunction {

	public static void main(String[] args) {
		Dog d = new Dog();
		
		Pet p =d;
		Animal a = d;
		
		System.out.println(d.name);
		System.out.println(p.name);
//		greetings();
//		greetings("good morning");

	}
	
	public static void greetings() {
		System.out.println("hi there");
	}
	
	public static void greetings(String s) {
		System.out.println(s);
	}
	

}
