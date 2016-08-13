package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class EmailValidation {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		while (loop) {
			System.out.println("Bir email adresi giriniz...");
			String email = input.nextLine();
			if (isValidEmail(email))
				System.out.println("'" + email + "' geçerli bir emaildir.\n");
			else if (email.isEmpty())
				loop = false;
			else
				System.out.println("'" + email + "' geçerli bir email değildir.\n");
		}

	}

	public static boolean isValidEmail(String input) {
		if (!input.contains(" ") && input.contains("@") && input.contains(".") && !input.startsWith("@")
				&& !input.startsWith(".")) {
			if (input.indexOf(".") > input.indexOf("@") && (input.indexOf(".") - input.indexOf("@") != 1)
					&& input.length() - 2 != input.lastIndexOf('.'))
				return true;
		}
		return false;
	}
}
