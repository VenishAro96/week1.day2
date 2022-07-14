package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		int[] vals = {10,11,12,13,14,15,20,25,30,42,54,12,13,45,65,78,87,56,45,34,43,9,87,
				67,10,11,12,13,14,15,20,25,30,42,54,12,13,45,65,78,87,56,45,34,43,9,
				87,67,10,11,12,13,14,15,20,25,30,42,54,12,13,45,65,78,87,56,45,34,43,9,87,67};
		int len = vals.length;
		System.out.println(len);
		int n=0;
		Arrays.sort(vals);
		
		for (int i = 1; i < len-1; i++) {
			
			if(vals[i]==vals[i-1])
				System.out.println(vals[i-1]);
				
				
				
				
		}
		
	}

}
