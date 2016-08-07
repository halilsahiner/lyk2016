package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class AccountTest {
	
	// test sınıfı olduğundan main metodunu yazıyoruz.
	
	public static void main(String args[]) {

		Account account1 = new Account("Ali Veli", 50.00);

		System.out.println(account1.getName() + "'nin bakiyesi: " + account1.getBalance());
		
		// scanner java içinde tanımlı bir sınıf olup, input isminde bulunan bir obje yaratıyoruz, ve bunun 
		// parametre olarak system sınıfının içindeki input'ları alacağını söylüyoruz.
		// kod ağlıyor. ctrl+shift+o yaparak util kütüphanesini scanner sınıfını import ediyoruz.
		// yeni bir değer almamızı sağlıyor kısacası.
	
		Scanner input = new Scanner(System.in);

		System.out.println("yatirmak istediginiz para miktarini giriniz: ");

		double depositAmount = input.nextDouble(); // program senden istiyorsa yeni bir double almana yarar.
		// ama biz bir kere aldıktan sonra yeni bir değer istemediğimizden 19.satırda ünlem çıktı. tasarım hatası gibi.

		System.out.println(depositAmount + " TL " + account1.getName() + " kisisinin hesabina ekleniyor...");

		account1.deposit(depositAmount);

		System.out.println(account1.getName() + " 'nin bakiyesi: " + account1.getBalance());
		
		// ctrl+shift+f kodu düzenler.

	}

}

