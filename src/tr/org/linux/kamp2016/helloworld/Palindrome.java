package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    System.out.println("ifade giriniz: ");
	    String str = input.nextLine();
	    System.out.println("palindrom mu?" + isPalindrome(str));
	   
	}
	
	public static boolean isPalindrome(String str){
		boolean answer = false;
		String reverse = "";
		for(int i = str.length()-1; i>= 0; i--){
			reverse += str.charAt(i);
		}
		if(str.equals(reverse)){
			answer = true;
		}
		return answer;
	}
}
