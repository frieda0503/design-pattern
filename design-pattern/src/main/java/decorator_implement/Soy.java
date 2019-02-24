package decorator_implement;

/**
 * Soy是一個裝飾者(透過繼承)
 * 
 * @author Frieda
 *
 */
public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + "add Soy";
	}

	@Override
	public int cost() {
		return 15 + beverage.cost();
	}

}
