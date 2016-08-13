package gasStation;

public class Plane extends Vehicle implements Driveable{

	private int maximumFeet;
	private String flightCode;
	private boolean isAutoPilotActive;
	
	public Plane(String brand, String model, int speed, int capacity, int numberOfWheels, boolean hasAerofoil,
			boolean hasAutoPilot, int maximumFeet, String flightCode, boolean isAutoPilotActive) {
		
		super(brand, model, speed, capacity, numberOfWheels, hasAerofoil, hasAutoPilot);
		
		this.maximumFeet = maximumFeet;
		this.flightCode = flightCode;
		this.isAutoPilotActive = isAutoPilotActive;
		
		
	}
	
	public enum liftOffType{
		LIFTOFF_HORIZONTAL, LISTOFF_VERTICAL;
	}

	@Override
	public void executeMotor() {
		System.out.println("ucagin motor calisiyor.");
		
	}

	@Override
	public void processGas() {
		System.out.println("ucagin motor calisiyor.");
		
	}

	@Override
	public void enableSteeringWheelControls() {
		System.out.println("ucagi kullanirken ellerinizi direksiyonda tutunuz.");
		
	}

	@Override
	public String toString() {
		return "Plane " +"\n maximumFeet=" + maximumFeet + "\n flightCode=" + flightCode + "\n isAutoPilotActive="
				+ isAutoPilotActive + "\n Brand()=" + getBrand() + "\n Model()=" + getModel() + "\n Speed()="
				+ getSpeed() + "\n Capacity()=" + getCapacity() + "\n NumberOfWheels()=" + getNumberOfWheels()
				+ "\n isHasAerofoil()=" + isHasAerofoil() + "\n isHasAutoPilot()=" + isHasAutoPilot() + "\n";
	}

	

	
	

}
