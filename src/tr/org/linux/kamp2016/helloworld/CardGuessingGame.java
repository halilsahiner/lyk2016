package tr.org.linux.kamp2016.helloworld;

import java.util.Arrays;

public class CardGuessingGame {
	
	private String cardType;
	private String[] cards = new String[]{"sprade", "club", "diamond", "heart"};
	private int value;
	
	public CardGuessingGame(String cardType, int value){
		if(Arrays.asList(cards).contains(cardType.toLowerCase()) && value>0 && value<14){
			this.cardType = cardType;
			this.value = value;
		}	
	}
	
	public String getCardType(){
		
		return this.cardType;
	}
	
	public int getValue(){
		
		return this.value;
	}
	
	public boolean equals(CardGuessingGame other){
		if(other.getCardType().equals(this.getCardType()) && other.getValue() == this.getValue())
			return true;
		
		return false;
	}

}
