package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("bir deger girin. ");
		int inputNumber = input.nextInt();
		
		ArrayList erreyList5=new ArrayList();
		
		int counter = 0;
		
		while (inputNumber != -1) {
			System.out.println("bir deger girin. ");
			
			if (inputNumber != -1) {
				erreyList5.add(inputNumber);
			}
			inputNumber = input.nextInt();
		
			counter++;
		}

		for (int i = 0; i < erreyList5.size(); i++) {
			System.out.println("Arrayin Listin" + i + ".elemani: " + erreyList5.get(i));
		}

	}

}
