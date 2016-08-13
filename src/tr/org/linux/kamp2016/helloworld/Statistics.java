package tr.org.linux.kamp2016.helloworld;

import java.util.HashMap;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
		System.out.println("please enter student number: ");
		int size = input.nextInt();
		generateRandomValues(table, size);
		printTable(table);
		System.out.println("mean =  " + mean(table));

	}
	
	public static void generateRandomValues(HashMap<Integer, Integer> map, int size){
		
		
		for(int i=0; i<size; i++){
			int random = RandomTest.randomIntegerMath(0, 100); //RandomTest sınıfında vardı yoksa olmazdı.
			map.put(i+1 , random);
		}
		
	}
	
	public static double mean(HashMap<Integer, Integer> map){
		
		double answer = 0;
		
		double sum = 0;
		
//		for(Integer i : map.keySet()){
//			sum += map.get(i);		
//		}
		
		// üstteki for'un yerine aşağıdaki for'u da kullanabiliriz.
		
		for(Integer value: map.values()){
			sum += value;
		}
		
		answer = sum / map.size();
		
		return answer;
		
	}
	
	public static void printTable(HashMap<Integer,Integer> map){
		for(Integer i : map.keySet()){
			System.out.println("student: " + i + "score: " + map.get(i));
		}
	} 

}
