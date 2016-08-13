package tr.org.linux.kamp2016.helloworld;

public class CompareArrayss {

	public static void main(String[] args) {
		
		String str = "Pulbiber Mahallesi";
		String str2 = "pulbiber mahallesi";
		
		System.out.println(str.compareTo(str2)); // büyük küçük hrfi göz ardı etmez.
		System.out.println(str.compareToIgnoreCase(str2)); //büyük küçük harfi göz ardı eder.
		
		

	}

}
