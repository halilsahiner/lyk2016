package tr.org.linux.kamp2016.helloworld;

import java.util.Arrays;

public class intArrayToString {

	public static void main(String[] args) {
		
		int[] intNumbers = new int[]{1,2,3,4,5};
		
		StringBuffer sBuffer = new StringBuffer(); //mutable. değişebilir.
		String strSeperator = " ";
		
		if(intNumbers.length > 0){
			sBuffer.append(intNumbers[0]);
			
			for(int i=1; i<intNumbers.length; i++){
				sBuffer.append(strSeperator).append(intNumbers[i]);
			}
			
		}
		System.out.println("int arrayi stringe donusturuluyor");
		
		System.out.println(sBuffer.toString());
		
		String strNumbers = Arrays.toString(intNumbers);
		
		System.out.println("string, arrays.toString metodu ile olusturuldu" +strNumbers);
		
		strNumbers = strNumbers.replaceAll("  ,  ", strSeperator).replace("[", "").replace("]", "");
		
		System.out.println("final string " + strNumbers);
	}

}
