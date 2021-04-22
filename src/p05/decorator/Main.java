package p05.decorator;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Beverage b1 = new Tea();
		Beverage b2 = new MilkDecorator(new Tea());
		Beverage b3 = new MilkDecorator(new CaramelDecorator(new Coffee()));
		Beverage b4 = new MilkDecorator(new MilkDecorator(new Tea()));
		
		List<Beverage> beverages = new ArrayList<Beverage>();
		beverages.add(b1);
		beverages.add(b2);
		beverages.add(b3);
		beverages.add(b4);
		
		for (Beverage beverage : beverages) {
			System.out.println(beverage.getDescription() + " cost: " + beverage.getCost());
		}
		
	}

}
