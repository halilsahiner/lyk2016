package tr.org.linux.kamp2016.helloworld;

public class ImMutable {
	
	private final int value;

	public ImMutable(int value) {
		
		this.value = value;

	}
	
	public int getValue(){
		
		return value;
	}
}
