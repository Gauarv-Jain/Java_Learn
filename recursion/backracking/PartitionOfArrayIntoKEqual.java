package recursion.backracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PartitionOfArrayIntoKEqual {

	public static void main(String[] args) {
		
		int a[] = {2, 1, 7, 5, 6};
		int k = 3;
		int sum = 0;
		
		for(int i=0 ; i<a.length; i++) {
			sum += a[i];
		}
		
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		
		boolean isPossible = sum%k ==0 && partition(a, k, sum/k, map) ;
		
		if(isPossible) {
			for(int i = 0 ; i<k ; i++) {
				System.out.println(map.get(i));
			}
		}else {
			System.out.println("Not Possible");
		}
		
	}
	
	public static boolean partition(int a[], int k, int sum, Map<Integer, ArrayList<Integer>> map) {
		
		
		boolean taken[] = new boolean[a.length];
		
		for(int j=0 ; j<k ; j++) {
			map.put(j, new ArrayList<Integer>());
		}
		
		return partition(a, k, 0, sum, sum, map, taken);
	}
	
	public static boolean partition(int a[], int k, int WhichKey, int sum, int initialSum, Map<Integer, ArrayList<Integer>> map, boolean taken[]) {
		
		if(sum<0)return false;
		
		if(sum==0) {
			WhichKey += 1;
			sum = initialSum;
		}
		
		if(WhichKey == k) return true;
		
		for(int i=0 ; i<a.length ; i++) {
			
			if(taken[i] == false) {
				map.get(WhichKey).add(a[i]);
				taken[i] = true ;
				if(partition(a, k, WhichKey, sum-a[i], initialSum, map, taken)) {
					return true;
				}else {
					map.get(WhichKey).remove(map.get(WhichKey).size()-1);
					taken[i] = false;
				}
				
			}
		}
		return false;
	}
	

}
