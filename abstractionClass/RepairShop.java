package abstractionClass;

public class RepairShop {
	
	public static void repairCar(Car car) {
		System.out.println("car is repaired");
	}

	public static void main(String[] args) {
		
		Wagonr wagonr = new Wagonr();
		Audi audi = new Audi();
		
		repairCar(wagonr);
		repairCar(audi);

	}

}
