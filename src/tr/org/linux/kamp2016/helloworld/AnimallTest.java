package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;

public class AnimallTest {

	public static void main(String[] args) {
		
		
		Animall animal1 = new Animall("comar", 50, "kopek");
		
		System.out.println("ismi: " + animal1.getName() + " yasi: " + animal1.getAge() +
				" turu: " + animal1.getType());
		
		Animall animal2 = new Animall("comar", 50, "kopek");
		
		animal2.setName("karakus");
		animal2.setAge(15);
		animal2.setType("kus");
		
		System.out.println("ismi: " + animal2.getName() + " yasi: " + animal2.getAge() +
				" turu: " + animal2.getType());
		
		/*
		ArrayList erreyList = new  ArrayList();
		erreyList.add(animal1);
		erreyList.add(animal2);
		
		for(int i=0; i < erreyList.size(); i++){
			System.out.println(erreyList.get(i));
		}
		*/
	}

}
