package tr.org.linux.kamp2016.helloworld;

public class MinNumber {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 10;
		
		int c = minFunction(a, b);
		
		System.out.println("en kucuk sayi: " + c);

	}
	
	public static int minFunction(int num1, int num2){
		
		int min;
		
		if(num1 > num2)
			min = num2;
		else
			min = num1;
		
		return min;
	}

}
