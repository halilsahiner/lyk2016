package gasStation;

import gasStation.Plane.liftOffType;
import gasStation.Vehicle.GasType;

public class Test {

	public static void main(String[] args) {
		
		Car car1 = new Car(250, "audi", "a5", "34 EA 4263");
		Plane plane1 = new Plane("airbus", "a320", 1000, 300, 8, true, true, 3000, "21312312", true);
		
		car1.PrintCar();
		
		System.out.println();
		
		System.out.println(car1);
		
		System.out.println("arabanin yakit tipi: " + Vehicle.GasType.DIESEL_FUEL + "\n");
		
		System.out.println(plane1);
		
		System.out.println("ucagin yakit tipi: " + Plane.GasType.JET_FUEL +"\n");
		System.out.println("lift off type: " + Plane.liftOffType.LISTOFF_VERTICAL + "\n"); 
		
		
		
		car1.processGas();
		car1.executeMotor();
		car1.enableSteeringWheelControls();
		System.out.println("");
		plane1.processGas();
		plane1.executeMotor();
		plane1.enableSteeringWheelControls();
		
		
		
	}
	

}
