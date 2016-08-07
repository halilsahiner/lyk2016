package tr.org.linux.kamp2016.helloworld;

public class MutableTest {

public static void main(String[] args) {
		
		Mutable mut = new Mutable(30);
		ImMutable immut = new ImMutable(55);
		
		System.out.println(mut.getValue());
		
		mut.setValue(20);
		
		System.out.println(mut.getValue());
		System.out.println(immut.getValue());
		
		immut = new ImMutable(11);
		
		System.out.println(immut.getValue());
		
	}

}
