package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {

	public static void main(String[] args) {
		int sum = 0;
		while(true){
			ArrayList <Integer> list = new ArrayList<Integer>();
			Scanner input = new Scanner (System.in);
			
			while(true){
				System.out.println("sayi giriniz: ");
				int sayi = input.nextInt();
				if(sayi==0)
					break;
				list.add(sayi);
				
			}
			
			for(int i=0; i<list.size(); i++)
				sum += list.get(i);
			
			System.out.println(sum);
		}
	}
}
