package oop;

public class Owl extends Bird implements Herbivore{
	
	public Owl(String name){
		super(name);
	
	}
	
	public void rotateHead270Degree(){
		System.out.println(this.name + " rotateHead270Degree");
	}
	
	@Override
	public void fly(){
		System.out.println(this.name + " fly");
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
	public void investigatePlants() {
		System.out.println(this.name + " investigatePlants");
		
	}

}