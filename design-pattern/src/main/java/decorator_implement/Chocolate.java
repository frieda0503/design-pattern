package decorator_implement;

/**
 * Chocolate是一個裝飾者(透過繼承)
 * 
 * @author Frieda
 *
 */
public class Chocolate extends CondimentDecorator {
	Beverage beverage;
	
	public Chocolate(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "add Chocolate";
	}

	@Override
	public int cost() {
		return 20 + beverage.cost();
	}

}
