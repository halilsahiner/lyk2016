package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		// ctrl+shift+7 seçtiğin kısmı yorum satırı yapar.

		// int[] erey = new int[3];
		// int[] erey2 = new int[] {1,5,6};
		// int total2 = erey2[0]+erey2[1]+erey[2];
		// System.out.println("total2: " + total2);
		//
		// int total3=0;
		//
		// for(int i=0; i<erey2.length; i++)
		// total3 += erey2[i];
		//
		// System.out.println("total3: " + total3);

		Scanner input = new Scanner(System.in);
		
		System.out.println("bir deger girin. ");
		int inputNumber = input.nextInt();
		
		int[] errey5 = new int[4];
		int counter = 0;
		
		while (inputNumber != -1) {
			System.out.println("bir deger girin. ");
			if (inputNumber != -1) {
				errey5[counter] = inputNumber;
			}
			inputNumber = input.nextInt();

			counter++;
		}

		for (int i = 0; i < errey5.length; i++) {
			System.out.println("Arrayin " + i + ".elemani: " + errey5[i]);
		}
	}
}
