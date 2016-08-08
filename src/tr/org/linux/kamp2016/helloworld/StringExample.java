package tr.org.linux.kamp2016.helloworld;

public class StringExample {

	public static void main(String[] args) {
		
		String s1 = new String("ofis ciftcinin kara gun dostudur.");
		
        if(s1.equals("ofis ciftcinin kara gun dostudur."))  	
        System.out.println("esit");
        else
        	System.out.println("esit degil");
        
        if(s1.contains("kara"))
        	System.out.println("iceriyor");
        else
        	System.out.println("icermiyor");
        
        String s2 = new String ("A");
        String s3 = new String ("a");
        String s4 = new String ("b");
        String s5 = new String ("A");
        
        System.out.println(s2.compareTo(s3));
        System.out.println(s3.compareTo(s2));
        System.out.println(s2.compareTo(s5));
        System.out.println(s2.compareTo(s4));

	}

}
