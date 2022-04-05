package inTerface;

public class Personn implements Student, YouTuber{

	public static void main(String[] args) {
		
		Personn obj = new Personn();
		obj.study();
		obj.makeVideo();
		
		YouTuber obj2 = obj;
		obj2.makeVideo();

	}

	@Override
	public void study() {
		System.out.println("person is studing");
		
	}

	@Override
	public void makeVideo() {
		System.out.println("person is making videoss");
		
	}

}
