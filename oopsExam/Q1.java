package oopsExam;

import java.util.*;


public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char to split at ");
		String split = sc.nextLine();
		System.out.println("Enter the string to work on ");
		String work = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(work,split);  
		
		ArrayList<String> arr = new ArrayList<>();
		System.out.println("these are the tokens formed");
		System.out.println();
	     while (st.hasMoreTokens()) {  
	    	 System.out.println(st.nextToken());
	         arr.add(st.nextToken());
	     }
	     
	     System.out.println();
	     System.out.println();
	     
	     System.out.println("this is 2nd part of the question ");
	     System.out.println("printing all the encrypted tokens ");
	     System.out.println();
	     
	     int asZ = 'Z';
	     int asA = 'A';
	     int sumupper = asZ+asA;
	     
	     int asz = 'z';
	     int asa = 'a';
	     int sumlower = asz+asa;
	     
	     for(int j=0; j<arr.size(); j++) {
	    	 String toRec = arr.get(j);
	    	 int rec;
		     for(int i=0; i<toRec.length(); i++) {
		    	 int character = toRec.charAt(i);
		    	 if(character>98 && character<123) {
		    		 rec = sumlower - character;
		    	 }else {
		    		 rec = sumupper - character;
		    	 }
		    	 
		    	 
		    	 System.out.print((char)rec);
		     }
		     System.out.println();
	     }
	     
	     
	     System.out.println();
	     sc.close();

	}

}
