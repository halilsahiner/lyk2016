package encapsulation;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account1 = new Account(1497);
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("yatirmak istediginiz para miktarini giriniz: ");

		double depositAmount = input.nextDouble();
		
		System.out.println(depositAmount + " TL " + account1.getid() + " kisisinin hesabina yatiriliyor...");

        account1.deposit(depositAmount);

		System.out.println("\ncekmek istediginiz para miktarini giriniz: ");

		double amount = input.nextDouble();
		
		System.out.println(amount + " TL " + account1.getid() + " kisisinin hesabindan cekiliyor...\n");

        account1.withDraw(amount);

		System.out.println(account1.getid() + " 'nin bakiyesi: " + account1.getBalance());

	}

}
