package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class FindCharCount {

	public static void main(String[] args) {
String str ="cognizant";
int count=0;
char[] chars = str.toCharArray();
System.out.println(chars);
for (int i = 0; i < chars.length-1; i++) {
	if(chars[i]=='n')
	{
		count++;
	}
}
System.out.println(count);

	}

}
