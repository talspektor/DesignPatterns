package p04.Adapter;

import p04.Adapter.Automobil.Location;

// 1. implement the interface to which we want to adapt
public class CarToAutomobilAdapter implements Car {

	// 2. define field for the target
	private Automobil automobil;
	
	// 3. CTOR
	public CarToAutomobilAdapter(Automobil automobil) {
		super();
		this.automobil = automobil;
	}

	// this method applies cars
	@Override
	public void drive(int speed, int distance, String direction) {
		Location location = null;
		
		try {
			location = Location.valueOf(direction);
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			location = automobil.getLocation();
		}
		// invoke go method the right way 
		automobil.go(distance, speed, location);
	}

	@Override
	public String toString() {
		return automobil.toString();
	}

	
}
