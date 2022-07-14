package week1.day2;

import java.util.Arrays;

public class FindDupli {
	public static void main(String[] args) {
	int[] vals = {10,11,10,11,12,13,14,15};
	int len = vals.length;
	System.out.println(len);
	int n=0;
	Arrays.sort(vals);
	
	for (int i = 1; i < len-1; i++) {
		System.out.println(vals[i-1]);
		if(vals[i]==vals[i-1])
			System.out.println("the num"+vals[i]+"is duplicate");
			
			
			
	}
	
}
}

