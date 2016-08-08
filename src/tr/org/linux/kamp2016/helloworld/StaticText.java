package tr.org.linux.kamp2016.helloworld;

public class StaticText {

	public static void main(String[] args) {
		
		//static olmasaydı obje üretmek gerekirdi.
		StaticExample.setTestValue(5);
		StaticExample.testString = "hebele";
		System.out.println(StaticExample.getTestString());
		System.out.println("testValue : "+ StaticExample.getTestValue());
		

	}

}
