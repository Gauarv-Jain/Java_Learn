package ConditionalStatement;

public class nestedIdElse {

	public static void main(String[] args) {
		int a=199, b=18, c=100, n=0;
		
		n = (a>b)? (a>c)? a : c : (b>c) ? b : c ;
		System.out.println(n);
	}

}
