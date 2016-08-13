package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Palindrome2 {
	public static void main(String[] args) {

		String original, reverse = "";
		System.out.println("enter a word");

		Scanner input = new Scanner(System.in);
		original = input.nextLine();

		// for(int i=original.length()-1;i>=0;i--)
		// reverse = reverse+original.charAt(i);
		//
		//
		// if(original.equals(reverse))
		// System.out.println("yes it is palindrome");
		// else
		// System.out.println("not palindrome");

		checker(original);

	}

	public static void checker(String string) {

		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--)
			reverse = reverse + string.charAt(i);

		if (string.equals(reverse))
			System.out.println("yes it is palindrome");
		else
			System.out.println("not palindrome");

	}

}
