package string;

import java.util.HashSet;

/*
 * duplicate
 * reverse
 * occurances
 * remove white space
 * first non repeated char
 * reverse using iteration , recursion
 * check digits
 * reverse each word of string
 * count of vowels
 * string to int like
 * permutation of string
 * palindrome
 * remove duplicate char from string
 * string contins other string
 * remove char from string
 * sort string
 * most repeated word in string
 * repeated char in strin
 * no of char, string and sentance
 * 
 * */
public class All {

	public static void main(String[] args) {
		// palindrome();
		nonRepetative();
	}

	public static void palindrome() {
		String s = "nitin";
		String rev = "";
		int length = s.length();

		System.out.println(length);

		for (int i = length - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);
		if (s.equals(rev))
			System.out.println("Yes it is..");
		else
			System.out.println("No... It Not");

	}

	public static void nonRepetative() {
		String s = "hello how Eare you";

		s = s.toLowerCase();
		for (int i = 0; i < s.length() - 1; i++) {

			char c = s.charAt(i);
			int firstIndex = s.indexOf(c);

			int lastIndex = s.lastIndexOf(c);

			if (firstIndex != lastIndex) {
				System.out.println("Repeated char..." + c);
				break;
			}

		}

	}
}
