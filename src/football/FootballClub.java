package football;

public class FootballClub extends Football{

	private String clubName, colors, stadiumName;
	private int clubValue, stadiumCapacity;
	
	public FootballClub(String clubName, String colors, String stadiumName, int clubValue, int stadiumCapacity) {
		super();
		this.clubName = clubName;
		this.colors = colors;
		this.stadiumName = stadiumName;
		this.clubValue = clubValue;
		this.stadiumCapacity = stadiumCapacity;
	}
	
	
	
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



	public String getClubName() {
		return clubName;
	}



	public void setClubName(String clubName) {
		this.clubName = clubName;
	}



	public String getColors() {
		return colors;
	}



	public void setColors(String colors) {
		this.colors = colors;
	}



	public String getStadiumName() {
		return stadiumName;
	}



	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}



	public int getClubValue() {
		return clubValue;
	}



	public void setClubValue(int clubValue) {
		this.clubValue = clubValue;
	}



	public int getStadiumCapacity() {
		return stadiumCapacity;
	}



	public void setStadiumCapacity(int stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}



	@Override
	public String toString() {
		return "FootballClub [clubName=" + clubName + ", colors=" + colors + ", stadiumName=" + stadiumName
				+ ", clubValue=" + clubValue + ", stadiumCapacity=" + stadiumCapacity + "]";
	}
	

}
