package oop;

public class Calculation {

	protected int z;

	public void toplama(int x, int y) {
		z = x + y;
		System.out.println("sayilarin toplami: " + z);
	}

	public void cikarma(int x, int y) {
		z = x - y;
		System.out.println("cikarma sonucu: " + z);
	}

}
