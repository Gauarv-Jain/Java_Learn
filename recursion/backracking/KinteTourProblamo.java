package recursion.backracking;

public class KinteTourProblamo {

	public static void main(String[] args) {
		
		int n =7;
		int a[][] = new int[8][8];
		
		if(isPossible(n, a)) {
			for(int i =0 ; i<n ; i++) {
				for(int j =0 ; j<n ; j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}else {
			System.out.println("not possible");
		}
		

	}

	static boolean isValid(int n, int x, int y, boolean vis[][]) {
		return x>=0 && y>=0 && x<n && y<n && vis[x][y]==false ;  
	}
	
	static boolean isPossible(int n, int a[][]) {
		
		boolean vis[][] = new boolean[8][8];
		
		return isPossible(n, 0, 0, a, vis, 0);
	}
	
	static boolean isPossible(int n, int x, int y, 
			                  int a[][], boolean vis[][], int i) {
		if(!isValid(n, x, y, vis)) {
			return false;
		}
		
		if(i==n*n-1) {
			a[x][y] = i;
			return true;
		}
		
		a[x][y] = i;
		
		vis[x][y] = true;
		if(isPossible(n, x+1, y+2, a, vis, i+1)) return true ;
		if(isPossible(n, x-1, y+2, a, vis, i+1)) return true ;
		if(isPossible(n, x+1, y-2, a, vis, i+1)) return true ;
		if(isPossible(n, x-1, y-2, a, vis, i+1)) return true ;
		if(isPossible(n, x-2, y+1, a, vis, i+1)) return true ;
		if(isPossible(n, x-2, y-1, a, vis, i+1)) return true ;
		if(isPossible(n, x+2, y+1, a, vis, i+1)) return true ;
		if(isPossible(n, x+2, y-1, a, vis, i+1)) return true ;
		vis[x][y] = false;
		
		return false;
	}
} 
