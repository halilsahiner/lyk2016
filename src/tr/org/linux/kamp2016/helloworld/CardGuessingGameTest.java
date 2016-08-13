package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardGuessingGameTest {

	public static void main(String[] args) {
		
		CardGuessingGame playerCard = null;
		CardGuessingGame randomCard = null;
		
		ArrayList<CardGuessingGame> cards = generateCardDeck();
		System.out.println("welcome to the card guessing game\n");
		Scanner input = new Scanner(System.in);
		String cardType = "";
		int value=0;
		
		randomCard = cards.get(randomReturn(0, cards.size()));
		
		while (true) {
			System.out.println(randomCard.getCardType() + randomCard.getValue());
			System.out.println("Enter the card type: ");
			cardType = input.next();
			System.out.println("Enter the value of card: ");
			value = input.nextInt();
			playerCard = new CardGuessingGame(cardType, value);

			if (playerCard.equals(randomCard)) {
				System.out.println("Your guess is correct");
			} else
				System.out.println("Your guess is wrong");
		}
	}
	
	public static ArrayList<CardGuessingGame> generateCardDeck() {
		ArrayList<CardGuessingGame> cards = new ArrayList<CardGuessingGame>();
		String[] cardTypes = { "sprade", "club", "heart", "diamond" };
		CardGuessingGame card = null;

		for (int i = 0; i < cardTypes.length; i++) {
			for (int j = 1; j < 14; j++) {
				card = new CardGuessingGame(cardTypes[i], j);
				cards.add(card);

			}

		}
		return cards;

	}

	public static int randomReturn(int min, int max) {
		Random rgen = new Random();
		int random = min + rgen.nextInt(Math.abs(max - min + 1));
		return random;
	}

}
