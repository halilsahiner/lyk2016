package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;

import java.util.Collections;

public class CollectionsArrayList {
	
	public static void main(String args[]){
	
	ArrayList <Integer> arrayList = new ArrayList <Integer>();
	arrayList.add(0);
	arrayList.add(1);
	arrayList.add(2);
	arrayList.add(3);
	arrayList.add(4);
	
	System.out.println("forward: " + arrayList.toString());
	
	Collections.reverse(arrayList);
	
    System.out.println("reverse: " + arrayList.toString());
    System.out.println("max: " + Collections.max(arrayList));
    System.out.println("min: " + Collections.min(arrayList));
    
    ArrayList<Integer> arrayList2 = new ArrayList <Integer>();
    arrayList2.add(2);
	arrayList2.add(4);
	arrayList2.add(3);
	arrayList2.add(5);
	
	System.out.println("Unordered: " + arrayList2.toString());
	Collections.sort(arrayList2);
	System.out.println("Ordered: " + arrayList2.toString());
	
	}
}
