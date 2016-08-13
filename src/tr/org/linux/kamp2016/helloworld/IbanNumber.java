package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

class IbanNumber {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		isValid(input.nextLine());
		
	}
	
	public static boolean isValid(String input){
		
		String bankaKodu="";
		String kontrolKodu="";
		String hesapKodu="";
		
		if (input.substring(0, 2).equals("TR")&& input.length()==28){
			for(int i=2; i<input.length(); i++){
				
				if(Character.isDigit(input.charAt(i))){
					kontrolKodu = input.substring(2,4);
					bankaKodu= input.substring(4,9);
					hesapKodu=input.substring(10,28);
					
				}
			}
			yaz(bankaKodu, kontrolKodu, hesapKodu);
			return true;
		}
		return false;
	}
	
	public static void yaz(String bankaKodu, String kontrolKodu, String hesapKodu){
		System.out.println("country code: " + "TR" + "\ncontrol code: " + kontrolKodu
				+ "\nbanka kodu: " + bankaKodu + "\nhesap numarasi: " + hesapKodu);
		
	}
}
