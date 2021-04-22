package p05.decorator;

public abstract class BeverageDecorator extends Beverage {

	protected Beverage beverage;

	public BeverageDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}
	
}
