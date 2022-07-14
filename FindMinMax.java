package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
int[] vals = {10,11,12,13,14,15,20,25,30,42,
		54,12,13,45,65,78,87,56,45,34,43,9,87,67,};
Arrays.sort(vals);
int len= vals.length;
System.out.println(len);
System.out.println(vals[0]);
System.out.println(vals[len-1]);

	}

}
