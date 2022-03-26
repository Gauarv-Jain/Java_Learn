package Arrays;

import java.util.Scanner;

public class avarageMarks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter nu of student");
		
		int n = sc.nextInt();
		
		int marks[]=new int[n];
		
		for(int i =0; i<n ; i++) {
			marks[i]=sc.nextInt();
		}
		
		int ave=0;
		
		for(int i = 0 ; i<n; i++) {
			ave += marks[i];
		}
		
		ave /= n;
		
		System.out.println("average marks is "+ ave);

	}

}
