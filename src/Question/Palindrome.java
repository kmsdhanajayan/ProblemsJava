package Question;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {
		String str,
		rev = "";
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a string:");
			str = sc.nextLine();
		}

		int length = str.length();
		
		for(int i=0 ; i< length/2 ; i++) {
			if(str.charAt(i)!= str.charAt(length-i-1)) {
				System.out.println(str +" is not plaindrome");
				return;
			}
		}
		System.out.println(str + " is a palindrome");

		/*
		 * for (int i = length - 1; i >= 0; i--)
		 * 
		 * rev = rev + str.charAt(i);
		 * 
		 * if (str.equals(rev)) System.out.println(str + " is a palindrome"); else
		 * System.out.println(str + " is not a palindrome");
		 */

	}

}
