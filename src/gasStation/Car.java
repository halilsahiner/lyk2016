package gasStation;

public class Car extends Vehicle implements Driveable{

	private String id;
	
	public Car(int speed, String brand, String model, String id) {
		
		super(speed, brand, model);
		this.id = id;
		
	}

	@Override
	public void executeMotor() {
		System.out.println("arabanin motor calisiyor.");
		
	}

	@Override
	public void processGas() {
		System.out.println("arabanin yakit kullanimi basladi.");
		
	}

	@Override
	public void enableSteeringWheelControls() {
		System.out.println("arabayi kullanirken ellerinizi direksiyonda tutunuz.");
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Car" + "\n id=" + id + "\n Brand()=" + getBrand() + "\n Model()=" + getModel() + "\n Speed()="
				+ getSpeed() + "\n";
	}
	
	public void PrintCar(){
		System.out.println("plaka: " + id);
	}
	
		
}
