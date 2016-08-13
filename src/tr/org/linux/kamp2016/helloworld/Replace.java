package tr.org.linux.kamp2016.helloworld;

public class Replace {
	
	public static void main(String[] args){
	
	String str = "Grapon GrKagitlari";
	System.out.println(str.replace("Gr","Ka"));
	System.out.println(str.replaceFirst("Gr", "Grr"));
	System.out.println(str.replaceAll("Gr", "Ha"));
	}

}
