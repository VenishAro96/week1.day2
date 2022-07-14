package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * Pseudo Code

		 * a) Declare A String value as"madam"

		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 

		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		String str ="madam";
		String rev="";
		char[] charArray = str.toCharArray();
		for (int i =charArray.length-1; i >=0; i--) {
			rev=rev+charArray[i];

		}

		if( str.equals(rev)) {

			System.out.println("palindrome");

		}
		else
			System.out.println("not palindrome");

	}
}
