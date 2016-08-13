package oop;

public class AnimalsTest {

	public static void main(String[] args) {
		
		Cat cat = new Cat("pittik","yesil", 5);
		Dog dog = new Dog("kont");
		Snake snake = new Snake("niyazi");
		Owl owl = new Owl("baykus");
		Cat cat2 = new Cat();
		
		cat2.eat();
		cat.eatt();
		cat.eyeColor();
		cat.giveBirth();
		cat.eat();
		cat.claw();
		cat.meow();
		dog.giveBirth();
		dog.bark();
		dog.sniff();
		snake.clawl();
		snake.poison();
		owl.fly();
		owl.rotateHead270Degree();
		
//		Animal an = cat;
//		Curnivore car = cat;
//		Object o = cat;
		
		System.out.println("\ncat memeli mi " + isMammal(cat));
		System.out.println("cat memeli mi " + isMammal(owl));
		System.out.println("\ncat memeli mi " + issMammal(cat));
		System.out.println("cat memeli mi " + issMammal(owl));
	}
	
	static boolean isMammal(Object obj){
		
		if(obj instanceof Mammal){
			return true;
		}
		return false;
	}
	
	static boolean issMammal(Object obj){
		
		return obj instanceof Mammal ? true:false;
	}
	
}
