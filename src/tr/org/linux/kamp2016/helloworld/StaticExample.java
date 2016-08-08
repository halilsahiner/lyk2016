package tr.org.linux.kamp2016.helloworld;

public class StaticExample {
	
	static{
		System.out.println("ilk statik blok");
		setTestString("1.static blogu stringi");
		setTestValue(2);
		
	}
	
	static{
		System.out.println("ikinci statik blok");
	}
	
	private static int testValue;
	
	public static int getTestValue(){
		
		return testValue;
	}
	
	public static void setTestValue(int testValue){
		if(testValue > 0){
			StaticExample.testValue = testValue;
		}
		
		System.out.println("setTestValue method: " + testValue);
	}
	
	public static String testString;
	
	public static String getTestString(){
		
		return testString;
	}
	
	public static void setTestString(String testString){
		
		StaticExample.testString = testString;
		System.out.println("setTestString: " +testString);
	}

}
