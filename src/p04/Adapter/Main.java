package p04.Adapter;

public class Main {

	public static void main(String[] args) {
		
		Car car = new FamilyCar();
		CarDriver driver = new CarDriver(car);
		System.out.println(car);
		driver.driveCar(100, 50, "NORTH");
		System.out.println(car);
		
		System.out.println("================");
		
		Automobil automobil = new Automobil();
		// driver cannt drive an automobil
//		CarDriver driver2 = new CarDriver(automobil);
		
		CarToAutomobilAdapter adapter = new CarToAutomobilAdapter(automobil);
		
		CarDriver aoutDriver = new CarDriver(adapter);
		System.out.println(adapter);
		aoutDriver.driveCar(200, 25, "WEST");
		System.out.println(adapter);
		System.out.println("================");
		aoutDriver.driveCar(50, 3, "WESTaaa");
		System.out.println(adapter);
	}

}
