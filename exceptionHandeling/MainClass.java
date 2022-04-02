package exceptionHandeling;

public class MainClass {

	public static void main(String[] args) {
		
//		try {
//			int a = 5;
//			int b = 0;
//			
//			int c = a/b;
//			
//			int q[] = new int[5];
//			
//			System.out.println( q[6]);
//
//		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage() +" occured, pleze check your code");
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("index should be between 0 and length of array");
//		} catch(IllegalArgumentException e) {
//			System.out.println("lol dumb boy");
//		}finally {
//			System.out.println("sorry for the inconvenience.");
//		}
//		
//		System.out.println("very imp code");
		
		fun1();

	}
	
	static void fun1() {
		
		int a = 5;
		int b = 2;
		
		int c = a/b;
		System.out.println(c);
		
		try {
			fun2();
		}catch(Exception e) {
			System.out.println(e.getMessage() + " occured");
		}
	
	}
	
	static void fun2() throws ArrayIndexOutOfBoundsException{
		boolean winter = true;
		if(winter) {
			throw new ArrayIndexOutOfBoundsException("winter is comming");
		}
	}

}
