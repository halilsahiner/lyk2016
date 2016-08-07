package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean ctn = true;
		
		while(ctn){
			System.out.println("bir sayi giriniz: ");
			double inputNumber1 = input.nextDouble();
			
			System.out.println("bir islem giriniz: ");
			String inputFunction = input.next();
			
			double result = 0;
			double inputNumber2 = 0;
			
			switch(inputFunction){
			case "+":
				System.out.println("bir sayi daha giriniz: ");
				inputNumber2 = input.nextDouble();
				result = inputNumber1+inputNumber2;
				System.out.println(inputNumber1 + "+" + inputNumber2 + "=" + result);
				break;
			
			default:
				System.out.println("bu islem gecersizdir.");
				break;
			}
			
			System.out.println("devam etmek istiyor musunuz?(E/H)");
			
			String ctnString = input.next();
			
			if(ctnString.equals("H") || ctnString.equals("h"))
				ctn = false;
			
		}
		
		System.out.println("bitti.");
	}

}
