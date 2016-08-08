package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class FibonacciTest {
	
	public static int fibo(int number){
		
        if(number == 1 || number == 2){
        	
            return 1;
        }
 
        return fibo(number-1) + fibo(number-2);
    }

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("kac sayi ekrana yazdirmak istiyorsunuz?");
		
		int inputValue = input.nextInt();
		
		for(int i=1; i<=inputValue; i++){
			
            System.out.print(fibo(i) +" ");
        }

	}
	

}
