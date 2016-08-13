package oop;

public abstract class Mammal extends Animal{
	
	public Mammal(){
		super();
	}
	
	public Mammal(String name){
		super(name);
	
	}
	
	public abstract void giveBirth();
	
}
