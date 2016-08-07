package tr.org.linux.kamp2016.helloworld;

public class Dice {
	
	private int facevalue=1;
	
	public Dice(){
		
		facevalue = 1;
	}
	
	public int getFacevalue() {
		return facevalue;
	}


	public void setFacevalue(int facevalue) {
		this.facevalue = facevalue;
	}

	public int roll(){
	    facevalue = (int)(Math.random()*6+1);
		return facevalue;
	}

}
