package tr.org.linux.kamp2016.helloworld;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

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
		// static konusunda Math.random()*6 kısmı yerine
		// RandomTest.randomIntegerMath(1, 6) bunu da yazabiliriz.
	    facevalue = 1 + (int)(Math.random()*6);
		return facevalue;
	}
	
//	public void roll(){
//		facevalue=RandomTest.randomIntegerMath(1, 6)
//	}
    
}
