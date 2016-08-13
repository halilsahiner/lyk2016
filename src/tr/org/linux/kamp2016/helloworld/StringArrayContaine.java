package tr.org.linux.kamp2016.helloworld;

import java.util.Arrays;

public class StringArrayContaine {

	public static void main(String[] args) {
		
		String[] strMonths = new String[]{"January","February","March","August"};
		
		String strFind1 = "March";
		String strFind2 = "December";
		
		boolean contains = false;
		
//		for(int i=0; i<strMonths.length; i++){
//			if(strMonths[i].equals(strFind1)){
//				contains = true;
//				break;
//			}
//		}
//		if(contains){
//			System.out.println("String array Stringi iceriyor." + strFind1);
//			
//		}
//		else System.out.println("icermiyor." + strFind1);
		
		contains = Arrays.asList(strMonths).contains(strFind1);
		System.out.println("Array string'i iceriyor mu? " + strFind1 + " " + contains);
		contains = Arrays.asList(strMonths).contains(strFind2);
		System.out.println("Array string'i iceriyor mu? " + strFind2 + " " + contains);
	}

}
