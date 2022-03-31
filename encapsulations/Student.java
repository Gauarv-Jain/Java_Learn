package encapsulations;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge (int age) {
		if (age > 20) {
			System.out.println("you are too old to be in this nursery sclool");
		}else {
			this.age = age;
		}
	}

}
