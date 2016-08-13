package oop;

public class Snake extends Reptile implements Curnivore{
	
	public Snake(String name){
		super(name);
	
	}
	
	public void poison(){
		System.out.println(this.name + " poison");
	}
	
	@Override
	public void clawl(){
		System.out.println(this.name + " clawl");
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
