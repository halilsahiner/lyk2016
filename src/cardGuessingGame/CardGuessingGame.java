package cardGuessingGame;

import java.util.ArrayList;
import java.util.Scanner;

import tr.org.linux.kamp2016.helloworld.RandomTest;

public class CardGuessingGame {
	
	public static void main(String args[]) {

		System.out.println("Welcome to the card guessing game!\n");

		ArrayList <Card> deck = generateCardDeck();
		
		Card randomCard = deck.get(RandomTest.randomIntegerRandom(0, 51));
		
		System.out.println(randomCard.getCardType() + " " + randomCard.getValue());
		
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("Guess card type: ");
			String guessType = input.next();
			System.out.println("Guess card value: ");
			int guessValue = input.nextInt();
			
			Card guessCard = new Card(guessType, guessValue);
			
			if(guessCard.equals(randomCard)){
				System.out.println("You win!");
				break;
			}
			
			else{
				System.out.println("Try again...");
			}

		}

	}

	public static ArrayList<Card> generateCardDeck() {

		ArrayList<Card> deck = new ArrayList<Card>();

		String[] types = new String[] { "heart", "diamond", "club", "spade" };

		for (String str : types) {
			for (int i = 1; i <= 13; i++) {
				Card card = new Card(str, i);
				deck.add(card);
			}
		}
		
		return deck;
	}
}