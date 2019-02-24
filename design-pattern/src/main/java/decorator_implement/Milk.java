package decorator_implement;

/**
 * Milk是一個裝飾者(透過繼承)
 * 
 * @author Frieda
 *
 */
public class Milk extends CondimentDecorator {
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "add Milk ";
	}

	@Override
	public int cost() {
		return 10 + beverage.cost();
	}

}
