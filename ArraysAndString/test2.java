package ArraysAndString;

import java.util.ArrayList;

class test2{
	public static void main(String args[]) {
		System.out.println(genIp("11211"));
		
		String snew = "2162573671";
		
		snew 
        = snew.substring(0, 5) + "."
          + snew.substring(5); 
		System.out.println(snew);
		
		String a[] = snew.split("6");
		
		for(int i=0 ; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
	}
	
	static public ArrayList<String> genIp(String s) {
        
		ArrayList<String> ans = new ArrayList<>();
		char a[] = s.toCharArray();
		int leng = a.length;
		ArrayList<Character> temp = new ArrayList<>();
		temp.add(a[0]);
		
		genIp(ans, a, temp, leng, 3, 1, true);
		
		return ans;
    }
	static public void genIp(ArrayList<String> ans, char a[], ArrayList<Character> temp, int leng, int dots, int index, boolean what){
		
		if(dots==0 && index == leng) {
			char[] temp2 = new char[temp.size()];
			for(int i=0 ; i<temp.size(); i++) {
				temp2[i] = temp.get(i);
			}
			ans.add(String.valueOf(temp2));
			return;
		}
		
		if(index == leng) {
			return;
		}
		
		if(what) {
			if(dots>0) {
				temp.add('.');
				genIp(ans, a, temp, leng, dots-1, index, false);
				temp.remove(temp.size()-1);
			}

			temp.add(a[index]);
			genIp(ans, a, temp, leng, dots, index+1, true);
			temp.remove(temp.size()-1);
			
		}else {
			temp.add(a[index]);
			genIp(ans, a, temp, leng, dots, index+1, true);
			temp.remove(temp.size()-1);
		}
		
	}
}

