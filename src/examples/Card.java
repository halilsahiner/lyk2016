package examples;

import java.util.Scanner;

public class Card {

	private String cardType = "spade";
	private int value = 1;

	public Card(String cardType, int value) {

		if ((cardType.equals("spade") || cardType.equals("club") || cardType.equals("heart")
				|| cardType.equals("diamond")) && (value > 0 && value < 14)) {

			this.cardType = cardType;
			this.value = value;
		}

	}

	public String getCardType() {

		return cardType;
	}

	public int getValue() {

		return value;
	}

	public boolean equals(Card other) {
		
		return(other.getCardType().equals(this.getCardType()) && other.getValue() == this.getValue());
	}

}
