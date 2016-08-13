package football;

public class TestGame {

	public static void main(String[] args) {
		
		SimulateMatch futbol = new SimulateMatch();
		FootballClub genclerbirligi = new FootballClub("Gençlerbirliği", "Kara kızıl", "19 Mayıs", 300000, 22500 );
		FootballClub ankaragucu = new FootballClub("Ankaragücü", "Sarı lacivert", "19 Mayıs",15000, 22500 );
		
		futbol.setAsHomeTeam(genclerbirligi);
		futbol.setAsGuestTeam(ankaragucu);
		
		futbol.homeTeamScoresAGoal();
		futbol.homeTeamScoresAGoal();
		futbol.homeTeamScoresAGoal();
		futbol.guestTeamScoresAGoal();
		
		futbol.endOfFirstHall();
		
		futbol.homeTeamScoresAGoal();
		futbol.guestTeamScoresAGoal();
		
		futbol.endOfGame();
				
		futbol.announceWinner();
	}

}
