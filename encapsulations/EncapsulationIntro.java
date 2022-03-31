package encapsulations;

public class EncapsulationIntro {

	public static void main(String[] args) {
		
		
		Student obj = new Student();
		
//		obj.age = 56;
//		obj.name = "Tom";
		
		obj.setAge(121);
		
		System.out.println(obj.getAge());

	}

}
