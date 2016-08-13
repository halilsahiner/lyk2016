package tr.org.linux.kamp2016.helloworld;

import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.println("please enter a string to count letters: ");
			String str = input.nextLine();
			
			if(str.isEmpty()) break;
			HashMap <Character, Integer> map = new HashMap <Character, Integer>();
			String str2=str.toLowerCase(); //mutable olmadığı için str2'ye atadık.
			
			for(int i=0; i<str2.length(); i++){
				if(Character.isLetter(str2.charAt(i))){
					if(map.containsKey(str2.charAt(i))){
					
						map.put(str2.charAt(i), map.get(str2.charAt(i))+1);
					}
					else{
					map.put(str2.charAt(i), 1);
					}
				}
			}
			System.out.println(map.toString());
		}

	}

}
