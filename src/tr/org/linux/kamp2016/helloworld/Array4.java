package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("kaclik dizi istiyorsunuz: ");
		int x = input.nextInt();	
	    
	    int sum = 0;
	    System.out.println("Enter the elements:");
	    
	    int[] array = new int[x];
	    
	    for (int i=0; i<x; i++){
	  	  array[i] = input.nextInt();
        }
	    
	    for( int num : array){
	      sum = sum+num;
	    }
	    
	    System.out.println("Sum of array elements is:"+sum);
	}
}