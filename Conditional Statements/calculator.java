package ConditionalStatement;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number ");
		int a = sc.nextInt();
		
		System.out.println("enter secont nu");
		int b = sc.nextInt();
		
		System.out.println("enter operatio");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		int n = 0;
		
		switch(operation) {
		case '+':
			n = a+b;
			break;
		case '-':
			n = a-b;
			break;
		case '*':
			n = a*b;
			break;
		case '/':
			n = a/b;
			break;
			default:
				System.out.println("invaled operation");
		
		}
		System.out.println("the ans is "+ n);

	}

}
