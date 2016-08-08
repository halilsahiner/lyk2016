package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class FactoTest {

	public static void main(String[] args) {
		
		Facto factObj = new Facto();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("faktoriyeli alinacak sayiyi giriniz: ");
		
		int inputValue = input.nextInt();
		
		System.out.println("faktoriyeli: " +factObj.facto(inputValue));

	}

}
