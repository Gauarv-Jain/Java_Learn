package oopsExam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"C:\\Users\\jaing\\OneDrive - MNNIT Allahabad, Prayagraj, India\\Pictures\\file1.txt"));
			String line = reader.readLine();
			ArrayList<String> arr = new ArrayList<>();
			while (line != null) {
				//System.out.println(line);
				// read next line
				arr.add(line);
				line = reader.readLine();
			}
			
			for(int i=arr.size()-1; i>=0; i--) {
				System.out.println(arr.get(i));
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
