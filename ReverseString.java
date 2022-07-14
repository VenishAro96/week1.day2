package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
String str ="language";
System.out.println(str);

char[] chars = str.toCharArray();
for (int i = chars.length-1; i >=0 ; i--) {
	System.out.print(chars[i]);
}
	}

}
