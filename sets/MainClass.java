package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
//		Set<String> fruits = new HashSet<>();
//		
//		fruits.add("Apple");
//		fruits.add("Banana");
//		System.out.println(fruits.add("Kivi"));
//		
//		System.out.println(fruits.add("Banana"));
//		
//		System.out.println(fruits);

//---------------------------------------------------------------------------
//		Set<String> fruits = new LinkedHashSet<>(); 
		
//		//the order is maintained in linkedHashSet
//		
//		fruits.add("Banana");
//		fruits.add("Apple");
//		System.out.println(fruits.add("Kivi"));
//		
//		System.out.println(fruits.add("Banana"));
//		
//		System.out.println(fruits);
		
//---------------------------------------------------------------------------
		

//		Set<String> fruits = new TreeSet<>();
//		
//		//Puts everything in a sorted manner 
//		
//		fruits.add("Banana");
//		fruits.add("Apple");
//		System.out.println(fruits.add("Kivi"));
//		
//		System.out.println(fruits.add("Banana"));
//		
//		System.out.println(fruits);
		
//-------------------------------------------------------------------------
		
		Set<Integer> x = new HashSet<>();
		
		x.add(23);
		x.add(1);
		x.add(6);
		
		Set<Integer> y = new HashSet<>();
		
		y.add(3);
		y.add(1);
		y.add(16);
		
//		x.addAll(y);  //union
		
//		x.retainAll(y); //intersection
		
		System.out.println(x.containsAll(y)); //used to see if y is a subset of x
		
		System.out.println(x);
		
	}

}
