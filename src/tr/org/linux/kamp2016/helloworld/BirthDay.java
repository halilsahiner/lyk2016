package tr.org.linux.kamp2016.helloworld;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class BirthDay {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int gun, ay, yil;
		
		System.out.println("gun: ");
		gun = input.nextInt();
		System.out.println("ay: ");
		ay = input.nextInt();
		System.out.println("yil: ");
		yil = input.nextInt();
		
		LocalDate birthDay = LocalDate.of(yil, ay, gun);
		
		LocalDate currentTime = LocalDate.now();

		long daysAlive = ChronoUnit.DAYS.between(birthDay, currentTime);
		
		long monthAlive = ChronoUnit.MONTHS.between(birthDay, currentTime);
		
		long yearAlive = ChronoUnit.YEARS.between(birthDay, currentTime);
		
		System.out.println("yasadigin gun: " + daysAlive);
		System.out.println("yasadigin gun: " + monthAlive);
		System.out.println("yasadigin gun: " + yearAlive);
	}

}
