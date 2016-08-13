package football;

public class SimulateMatch extends Football{

	private String homeTeamName, guestTeamName;
	private int scoresOfHomeTeam, scoresOfGuestTeam;
	private FootballClub o, o2;
	
	
	@Override
	public void hasOpponent() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void hasWinner() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void rollTheBall() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void anOpponentScores() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void hasHoliganism() {
		// TODO Auto-generated method stub
		
	}
	
	public void setAsHomeTeam(FootballClub o) {
		
		this.o = o;
		System.out.println("ev sahibi: " + o.getClubName());
		
	}
	
	public void setAsGuestTeam(FootballClub o2){
		
		this.o2 = o2;
		
		System.out.println("deplasman takimi: " + o2.getClubName());
	}
	
	public void homeTeamScoresAGoal(){
		
		scoresOfHomeTeam = scoresOfHomeTeam + 1;
//		return scoresOfHomeTeam;
	}
	
	public void guestTeamScoresAGoal(){
		
		scoresOfGuestTeam = scoresOfGuestTeam + 1;
//		return scoresOfGuestTeam;
	}
	
	public void endOfFirstHall(){
		
		System.out.println("\nilk yari sonucu:  ");
		System.out.println(o.getClubName() + ": " +  scoresOfHomeTeam);
		System.out.println(o2.getClubName() + ": " + scoresOfGuestTeam);

	}
		
	public void endOfGame(){
		
		System.out.println("\nmac sonucu:  ");
		System.out.println(o.getClubName() + ": " +  scoresOfHomeTeam);
		System.out.println(o2.getClubName() + ": " + scoresOfGuestTeam);

	}

//	public void announceWinner(Object o, Object o2){
//		
//		if(scoresOfHomeTeam > scoresOfGuestTeam)
//			System.out.println("kazanan: " + o);
//		else if(scoresOfHomeTeam < scoresOfGuestTeam)
//			System.out.println("kazanan " + o2);
//		else System.out.println("Beraberlik");
//		
//	}
	
	public void announceWinner(){
	
	if(scoresOfHomeTeam > scoresOfGuestTeam)
		System.out.println("\nkazanan: " + o.getClubName());
	else if(scoresOfHomeTeam < scoresOfGuestTeam)
		System.out.println("\nkazanan " + o2.getClubName());
	else System.out.println("\nBeraberlik");
	
}

	
}
