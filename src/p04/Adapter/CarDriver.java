package p04.Adapter;

public class CarDriver {

	// the driver has a car
	private Car car;

	public CarDriver(Car car) {
		super();
		this.car = car;
	}
	
	public void driveCar(int speed, int distance, String direction) {
		this.car.drive(speed, distance, direction);
	}
}
