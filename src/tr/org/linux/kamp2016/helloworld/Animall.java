package tr.org.linux.kamp2016.helloworld;

public class Animall {
	
	private String name;
	private int age;
	private String type;
	
	public Animall(String name, int age, String type){
		
		this.name = name;
		
		if(age > 0 && age < 100)
			this.age = age;		
		
		this.type = type;
	}
	
	public String getName(){
		
		return name;
		
	}
	
	public double getAge(){
		
		return age;
		
	}

	public String getType(){
	
		return type;
	
	}
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public void setAge(Integer newAge){
		
		this.age = newAge;
		
	}

	public void setType(String newType){
	
		this.type = newType;
	
	}

}
