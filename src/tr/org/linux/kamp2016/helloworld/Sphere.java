package tr.org.linux.kamp2016.helloworld;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("kurenin yaricapini giriniz: ");

		try {

			double yaricap = input.nextDouble();

			System.out.println("hacim: " + kureHacmi(yaricap));
		}
		
		// e burada isimlendirme önemli değil.
		catch (InputMismatchException e) {
			System.out.println("baska bir sey degil, sayi giriniz.");
		}
	}

	public static double kureHacmi(double yaricap) {

		double hacim = (4.0 / 3.0) * Math.PI * Math.pow(yaricap, 3);

		return hacim;
	}

}
