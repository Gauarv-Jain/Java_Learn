package recursion.backracking;

class Sudoku {

	public static void main(String[] args) {
		
		int[][] a ={ 
		            { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, 
		            { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, 
		            { 0, 8, 7, 0, 0, 0, 0, 3, 1 }, 
		            { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, 
		            { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, 
		            { 0, 5, 0, 0, 9, 0, 6, 0, 0 }, 
		            { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, 
		            { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, 
		            { 0, 0, 5, 2, 0, 6, 3, 0, 0 } 
                   }; 
         
  
        if (isPossible(a)) { 
            
            print(a); 
        } 
        else { 
            System.out.println("No solution"); 
        }

	}
	
	public static boolean isSafe(int a[][], int k, int x, int y) {
		
		for(int i=0; i<9 ; i++) {
			if(a[x][i]==k)return false;
		}
		
		for(int i=0; i<9 ; i++) {
			if(a[i][y]==k)return false;
		}
		
		for(int i=(x-(x%3)) ; i<(x-(x%3)) + 3 ; i++) {
			for(int j=(y-(y%3)) ; j<(y-(y%3)) + 3 ; j++) {
				if(a[i][j]==k) return false;
			}
		}
		
		return true;
	}
	
	public static boolean isPossible(int a[][]) {
		
		int x = -1;
		int y = -1;
		boolean isEmpty = true;
		for(int i =0 ; i<9 ; i++) {
			for(int j =0 ; j<9 ; j++) {
				if(a[i][j]==0) {
					x=i;
					y=j;
					
					isEmpty = false;
					break;
				}
			}
			if(!isEmpty) {
				break;
			}
		}
		if(isEmpty) {
			return true;
		}
		
		for(int k=1 ; k<=9 ; k++) {
			if(isSafe(a, k, x, y)) {
				a[x][y] = k;
				if(isPossible(a)) {
					return true;
				}else {
					a[x][y] = 0;
				}
				
			}
		}
		return false;
	}
	
	public static void print(int[][] a) {
		
	        for (int r = 0; r < 9; r++) { 
	            for (int d = 0; d < 9; d++) { 
	                System.out.print(a[r][d]); 
	                System.out.print(" "); 
	            } 
	            System.out.print("\n"); 
	  
	            if ((r + 1) % 3 == 0) { 
	                System.out.print(""); 
	            } 
	        } 
	} 

}
