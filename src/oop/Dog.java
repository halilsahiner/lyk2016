package oop;

public class Dog extends Mammal implements Curnivore{
	
	public Dog(String name){
		super(name);
	
	}
	
	public void bark(){
		System.out.println(this.name + " barks");
	}
	
	public void sniff(){
		System.out.println(this.name + " sniff");
	}
	
	@Override
	public void giveBirth(){
		System.out.println(this.name + " giveBirth");
	}
	
	@Override
	public void breath(){
		System.out.println(this.name + " breath");
	}
	
	@Override
	public void eat(){
		System.out.println(this.name + " eat");
	}
	
	@Override
	public void sleep(){
		System.out.println(this.name + " sleep");
	}
	
	@Override
	public void hunt(){
		System.out.println(this.name + " hunt");
	}

}
