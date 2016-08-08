package tr.org.linux.kamp2016.helloworld;

public class Facto {
	
	public static int facto(int x){
		
		int fact=1;
		
		for(int i=2;i<=x;i++)
			fact*=i;
		
		return fact;
	}

}
