package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new LinkedList<>();   //ArrayList<String> fruits = new ArrayList();
		List<String> vegetables = new ArrayList<>();
		
		fruits.add("Apple");
		boolean bo = false; 
		fruits.add("orage");
		fruits.add("hi");
		
		fruits.set(1, "Banana");
		
		fruits.remove(2);
		
		List<String> toRemove = new ArrayList<>();
		toRemove.add("Apple");
		toRemove.add("hi");
		
		fruits.removeAll(toRemove);
		
//		fruits.clear();
	    
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Carrot");
		
		fruits.addAll(vegetables);
		
		System.out.println(fruits.size());
		System.out.println(fruits.contains("Gwava"));
		System.out.println(fruits.contains("Carrot"));
		System.out.println(fruits.isEmpty());
		System.out.println(fruits);
		System.out.println(fruits.get(1));
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
		
		for(String e : temp) {
			System.out.println(e);
		}
		
//		
//		ArrayList<Integer> marks = new ArrayList();
//		
//		Pair<String , Integer> p1 = new Pair("Anuj", 457);
//		Pair<Boolean , String> p2 = new Pair(true , "hello");
//		
//		p1.getDescription();
//		p2.getDescription();

	}

}
