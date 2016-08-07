package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("bir deger girin. ");
		String inputString = input.next();
		
		String[] errey5 = new String[4];
		int counter = 0;
		
		while (!inputString.equals("cikis")) {
			System.out.println("bir deger girin. ");
			if (!inputString.equals("cikis")) {
				errey5[counter] = inputString;
			}
			inputString = input.next();

			counter++;
		}

		for (int i = 0; i < errey5.length; i++) {
			System.out.println("Arrayin " + i + ".elemani: " + errey5[i]);
		}

	}

}
