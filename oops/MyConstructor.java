package oops;

class Vehical{
	
	int wheels;
	int headLights;
	String color;
	
    public Vehical(){
		
	}
	
	Vehical(int wheells) {
		this.wheels = wheells;
		headLights = 2;
	}
	Vehical(int wheels, String color){
		this.wheels = wheels;
		headLights = 2;
		this.color=color;
	}
}

public class MyConstructor {

	 MyConstructor() {
		System.out.println("object is now created");
	}
	
	public static void main(String[] args) {
		
		Vehical car = new Vehical(4);
		Vehical car2 = new Vehical(2);
		
		Vehical eRiksha = new Vehical(3,"Yellow");
		
		Vehical random = new Vehical();
		
		System.out.println(car.wheels + " wheels");
		System.out.println(car2.wheels + " wheels");
		System.out.println(eRiksha.wheels + " wheels and color is " + eRiksha.color);		

	}

}
