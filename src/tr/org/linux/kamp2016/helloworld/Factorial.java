package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("faktoriyeli alinacak sayiyi giriniz: ");
		
		int x = input.nextInt();
		
		int y=1; 
		
		for(int i=1; i<=x; i++){
			
			y=y*i;
		}
		
		// Syso yaz. ctrl+space'e bas. enter'a bas. System.out.println yazar. kısa hali gibin.
		System.out.println("faktoriyel: " + y);

	}

}
