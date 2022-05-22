package recursion;

public class MatrixPath {

	public static void main(String[] args) {
		
		System.out.println(path(2000,1));

	}
	
	static int path(int n , int m) {
		if(n==1 || m==1) return 1;
		
		return path(n , m-1) + path(n-1 , m);
	}

}
