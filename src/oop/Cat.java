package oop;

public class Cat extends Mammal implements Curnivore{
	
	String eyeColor;
	int yas;
	
	public Cat(){
		super();
	}
	
	public Cat(String name, String eyeColor, int yas){
		super(name);
		this.eyeColor = eyeColor;
		this.yas = yas;
	}
	
	public void eyeColor(){
		System.out.println(this.name + " " + eyeColor + " " + yas);
	}
	
	public void meow(){
		System.out.println(this.name + " meow");
	}
	
	public void claw(){
		System.out.println(this.name + " claw");
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