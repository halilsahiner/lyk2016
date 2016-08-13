package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class IBAN {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String iban = "iban";
		
		while(!iban.isEmpty()){
			System.out.println("bir iban giriniz: ");
			iban = input.nextLine();
			if(!iban.isEmpty()){
				String countryCode = iban.substring(0,2);
				String controlCode = iban.substring(2,4);
				String bankCode = iban.substring(4,9);
				String accountNumber = iban.substring(10,26);
				System.out.println("Country Code: " + countryCode + "\nControl Code: " + controlCode
						+ "\nBank Code: " + bankCode + "\nAccount Number: " + accountNumber);
				
				if(iban.length() != 28){
					System.out.println("IBAN length is not valid.");
				}
				if(!countryCode.equals("TR")){
					System.out.println("This is not a TR IBAN");
				}
				if(!digitControl(controlCode)){
					System.out.println("This control code is not valid ");
				}
				if(!digitControl(bankCode)){
					System.out.println("This bank code is not valid ");
				}
				if(!digitControl(accountNumber)){
					System.out.println("This account number is not valid ");
				}
			}
		}
	}
	
	public static boolean digitControl(String str){
		
		for(int i=0; i< str.length(); i++){
			if(!Character.isDigit(str.charAt(i))){
				return false;
			}
		}
	
		return true;

	}
}
