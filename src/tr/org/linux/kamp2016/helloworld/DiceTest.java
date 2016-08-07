package tr.org.linux.kamp2016.helloworld;

public class DiceTest {

	public static void main(String[] args) {
		
		Dice player1 = new Dice();
		Dice player2 = new Dice();
		
		player1.roll();
		player2.roll();
		
		if(player1.getFacevalue() > player2.getFacevalue()){
			System.out.println("first player has " + player1.getFacevalue() + 
					"\nsecond player has " + player2.getFacevalue() +
					"\nfirst player wins with " + player1.getFacevalue());
		}
		
		else if(player2.getFacevalue() > player1.getFacevalue()){
			System.out.println("first player has " + player1.getFacevalue() + 
					"\nsecond player has " + player2.getFacevalue() +
					"\nsecond player wins with " + player2.getFacevalue());
		}
		
		else{
			System.out.println("first player has " + player1.getFacevalue() + 
					"\nsecond player has " + player2.getFacevalue() +
					"\ntie! both player has " + player2.getFacevalue());
		}

	}

}
